package xin.eyluoye.quartz.service;

import java.util.Map;

import xin.eyluoye.common.entity.Page;
import xin.eyluoye.common.entity.R;
import xin.eyluoye.quartz.entity.QuartzJobLogEntity;

/**
 * 定时任务日志
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月21日 上午11:17:26
 */
public interface QuartzJobLogService {

	Page<QuartzJobLogEntity> listForPage(Map<String, Object> params);
	
	R batchRemove(Long[] id);
	
	R batchRemoveAll();
	
}
