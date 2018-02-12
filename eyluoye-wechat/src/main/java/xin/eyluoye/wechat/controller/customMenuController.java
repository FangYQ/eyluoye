package xin.eyluoye.wechat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.eyluoye.common.entity.R;
import xin.eyluoye.common.utils.CommonUtils;
import xin.eyluoye.common.utils.RedisUtils;
import xin.eyluoye.wechat.api.MenuAPI;
import xin.eyluoye.wechat.api.UserAPI;
import xin.eyluoye.wechat.api.config.ApiConfig;
import xin.eyluoye.wechat.api.entity.Menu;
import xin.eyluoye.wechat.api.response.GetMenuResponse;
import xin.eyluoye.wechat.api.response.GetUserInfoResponse;
import xin.eyluoye.wechat.api.response.GetUsersResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义菜单
 * <p>
 * Created by FYQ on 2018/2/12.
 */
@RestController
@RequestMapping("/wechat/customMenu")
public class customMenuController {

    /**
     * 菜单列表
     *
     * @return
     */
    @RequestMapping("/list")
    public List menuList() {
        List<Menu> menuList = new ArrayList<>();
        List result = new ArrayList<>();
        GetMenuResponse response = new GetMenuResponse();
        try {
            String appid = RedisUtils.get("appid");
            String appsecret = RedisUtils.get("appsecret");

            ApiConfig config = new ApiConfig(appid, appsecret);
            MenuAPI api = new MenuAPI(config);
            response = api.getMenu();
            result.add(response.getMenu().getButton());

        }catch (Exception e){
            e.printStackTrace();
        }
        return response.getMenu().getButton();
    }
}
