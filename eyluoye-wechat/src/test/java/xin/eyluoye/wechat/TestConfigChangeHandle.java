package xin.eyluoye.wechat;

import xin.eyluoye.wechat.api.config.ConfigChangeNotice;
import xin.eyluoye.wechat.handle.AbstractApiConfigChangeHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author peiyu
 */
public class TestConfigChangeHandle extends AbstractApiConfigChangeHandle {

    private static final Logger LOG = LoggerFactory.getLogger(TestConfigChangeHandle.class);

    @Override
    public void configChange(ConfigChangeNotice notice) {
        LOG.debug("收到通知.....");
        LOG.debug(notice.toJsonString());
    }
}
