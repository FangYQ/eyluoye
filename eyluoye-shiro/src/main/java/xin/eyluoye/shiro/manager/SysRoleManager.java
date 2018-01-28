package xin.eyluoye.shiro.manager;

import java.util.List;

import xin.eyluoye.common.entity.Page;
import xin.eyluoye.common.entity.Query;
import xin.eyluoye.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月12日 上午12:39:07
 */
public interface SysRoleManager {

	List<SysRoleEntity> listRole(Page<SysRoleEntity> page, Query search);
	
	int saveRole(SysRoleEntity role);
	
	SysRoleEntity getRoleById(Long id);
	
	int updateRole(SysRoleEntity role);
	
	int batchRemove(Long[] id);
	
	List<SysRoleEntity> listRole();
	
	int updateRoleOptAuthorization(SysRoleEntity role);
	
	int updateRoleDataAuthorization(SysRoleEntity role);
	
}
