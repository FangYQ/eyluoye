package xin.eyluoye.wechat.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xin.eyluoye.common.entity.R;
import xin.eyluoye.common.utils.CommonUtils;
import xin.eyluoye.common.utils.RedisUtils;
import xin.eyluoye.wechat.api.UserAPI;
import xin.eyluoye.wechat.api.config.ApiConfig;
import xin.eyluoye.wechat.api.response.GetUserInfoResponse;
import xin.eyluoye.wechat.api.response.GetUsersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户管理
 * <p>
 * Created by FYQ on 2018/1/28.
 */
@RestController
@RequestMapping("/userManager")
public class UserManagerController {


    /**
     * 获取用户列表
     *
     * @return
     */
    @RequestMapping("/userList")
    public R userList() {
        List<GetUserInfoResponse> result = new ArrayList<>();
        try {
            String appid = RedisUtils.get("appid");
            String appsecret = RedisUtils.get("appsecret");

            ApiConfig config = new ApiConfig(appid, appsecret);
            UserAPI userAPI = new UserAPI(config);

            int count = 0;
            String nextOpenid = null;
            do {
                GetUsersResponse usersResponse = userAPI.getUsers(nextOpenid);
                nextOpenid = usersResponse.getNextOpenid();
                count = usersResponse.getCount();
                for (String openid : usersResponse.getData().getOpenid()) {
                    result.add(userAPI.getUserInfo(openid));
                }
            } while (count >= 10000);

        }catch (Exception e){
            e.printStackTrace();
        }
        return CommonUtils.msg(result);
    }


    /**
     * 重置公众号信息
     *
     * @return
     */
    @RequestMapping("/resetAppInfo")
    public R resetAppInfo(@RequestBody Map<String, Object> params){
        String MSG = "";
        try{
            /*String appid = apiConfig.getAppid();
            String secret = apiConfig.getSecret();*/
            Object oppid = params.get("appid");
            Object secret = params.get("secret");
            RedisUtils.set("appid", oppid.toString());
            RedisUtils.set("appsecret", secret.toString());
            MSG = "重置成功";
        }catch (Exception e){
            MSG = "重置失败";
            e.printStackTrace();
        }
        return CommonUtils.msg(MSG);
    }

    /**
     * 获取公众号信息
     * @return
     */
    @RequestMapping("/getAppInfo")
    public R getAppInfo(){
        Map<String, String> result = new HashMap<>();

        result.put("appid", RedisUtils.get("appid"));
        result.put("appsecret", RedisUtils.get("appsecret"));

        return CommonUtils.msg(result);
    }

}
