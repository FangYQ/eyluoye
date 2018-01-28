package xin.eyluoye.shiro.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import xin.eyluoye.common.dao.BaseMapper;
import xin.eyluoye.shiro.entity.SysRoleEntity;

/**
 * 系统角色
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月12日 上午12:35:51
 */
@MapperScan
public interface SysRoleMapper extends BaseMapper<SysRoleEntity> {
	
	List<String> listUserRoles(Long userId);
	
}
