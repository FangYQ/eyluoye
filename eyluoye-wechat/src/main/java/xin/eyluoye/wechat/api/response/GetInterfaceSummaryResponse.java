package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.InterfaceSummary;

import java.util.List;

/**
 * @author peiyu
 */
public class GetInterfaceSummaryResponse extends BaseResponse {

    private List<InterfaceSummary> list;

    public List<InterfaceSummary> getList() {
        return list;
    }

    public void setList(List<InterfaceSummary> list) {
        this.list = list;
    }
}
