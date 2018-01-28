package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.UpstreamMsgHour;

import java.util.List;

/**
 * @author peiyu
 */
public class GetUpstreamMsgHourResponse extends BaseResponse {

    private List<UpstreamMsgHour> list;

    public List<UpstreamMsgHour> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgHour> list) {
        this.list = list;
    }
}
