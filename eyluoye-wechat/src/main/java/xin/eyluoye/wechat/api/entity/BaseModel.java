package xin.eyluoye.wechat.api.entity;

import xin.eyluoye.wechat.util.JSONUtil;

/**
 * 抽象实体类
 *
 * @author peiyu
 */
public abstract class BaseModel implements Model {
    @Override
    public String toJsonString() {
        return JSONUtil.toJson(this);
    }
}
