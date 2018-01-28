package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.ArticleSummary;

import java.util.List;

/**
 * @author peiyu
 */
public class GetArticleSummaryResponse extends BaseResponse {

    private List<ArticleSummary> list;

    public List<ArticleSummary> getList() {
        return list;
    }

    public void setList(List<ArticleSummary> list) {
        this.list = list;
    }
}
