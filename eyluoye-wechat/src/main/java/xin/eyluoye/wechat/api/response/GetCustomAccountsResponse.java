package xin.eyluoye.wechat.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import xin.eyluoye.wechat.api.entity.CustomAccount;

import java.util.List;

/**
 * @author peiyu
 */
public class GetCustomAccountsResponse extends BaseResponse {

    @JSONField(name = "kf_list")
    private List<CustomAccount> customAccountList;

    public List<CustomAccount> getCustomAccountList() {
        return customAccountList;
    }

    public void setCustomAccountList(List<CustomAccount> customAccountList) {
        this.customAccountList = customAccountList;
    }
}
