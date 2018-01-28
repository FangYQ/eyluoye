package xin.eyluoye.common.manager;

import java.util.List;

import xin.eyluoye.common.entity.Page;
import xin.eyluoye.common.entity.Query;
import xin.eyluoye.common.entity.SysLogEntity;

/**
 * 系统日志
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月14日 下午8:43:06
 */
public interface SysLogManager {

	void saveLog(SysLogEntity log);
	
	List<SysLogEntity> listLog(Page<SysLogEntity> page, Query query);
	
	int batchRemove(Long[] id);
	
	int batchRemoveAll();
	
}
