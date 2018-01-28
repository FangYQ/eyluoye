package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.UpstreamMsgDistWeek;

import java.util.List;

/**
 * @author peiyu
 */
public class GetUpstreamMsgDistWeekResponse extends BaseResponse {

    private List<UpstreamMsgDistWeek> list;

    public List<UpstreamMsgDistWeek> getList() {
        return list;
    }

    public void setList(List<UpstreamMsgDistWeek> list) {
        this.list = list;
    }
}
