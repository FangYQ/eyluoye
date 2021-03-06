package xin.eyluoye.wechat.handle;

import xin.eyluoye.wechat.message.BaseMsg;
import xin.eyluoye.wechat.message.req.BaseReqMsg;

/**
 * 微信消息处理器接口
 *
 * @author peiyu
 * @since 1.1
 */
public interface MessageHandle<M extends BaseReqMsg> {
    /**
     * 处理微信消息
     *
     * @param message 微信消息
     * @return 回复用户的消息
     */
    BaseMsg handle(M message);

    /**
     * 在处理之前，判断本条消息是否符合处理的条件
     *
     * @param message 消息
     * @return 是否需要处理
     */
    boolean beforeHandle(M message);
}
