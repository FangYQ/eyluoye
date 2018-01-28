package xin.eyluoye.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import xin.eyluoye.common.dao.BaseMapper;
import xin.eyluoye.shiro.entity.SysRoleMenuEntity;

/**
 * 系统角色与菜单关系
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月13日 下午8:32:26
 */
@MapperScan
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenuEntity> {

	int batchRemoveByMenuId(Long[] id);
	
	int batchRemoveByRoleId(Long[] id);
	
	List<Long> listMenuId(Long id);
	
}
