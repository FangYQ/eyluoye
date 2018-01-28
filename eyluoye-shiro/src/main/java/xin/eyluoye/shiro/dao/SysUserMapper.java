package xin.eyluoye.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import xin.eyluoye.common.dao.BaseMapper;
import xin.eyluoye.common.entity.Query;
import xin.eyluoye.common.entity.SysUserEntity;

/**
 * 系统用户dao
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月8日 下午3:26:05
 */
@MapperScan
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

	SysUserEntity getByUserName(String username);
	
	List<Long> listAllMenuId(Long userId);
	
	List<Long> listAllOrgId(Long userId);
	
	int updatePswdByUser(Query query);
	
	int updateUserStatus(Query query);
	
	int updatePswd(SysUserEntity user);
	
}
