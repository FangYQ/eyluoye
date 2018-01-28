package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.ArticleTotal;

import java.util.List;

/**
 * @author peiyu
 */
public class GetArticleTotalResponse extends BaseResponse {

    private List<ArticleTotal> list;

    public List<ArticleTotal> getList() {
        return list;
    }

    public void setList(List<ArticleTotal> list) {
        this.list = list;
    }
}
