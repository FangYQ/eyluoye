package xin.eyluoye.generator.manager;

import java.util.List;

import xin.eyluoye.common.entity.Page;
import xin.eyluoye.common.entity.Query;
import xin.eyluoye.generator.entity.ColumnEntity;
import xin.eyluoye.generator.entity.TableEntity;

/**
 * 代码生成器
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月28日 下午8:54:09
 */
public interface SysGeneratorManager {

	void listTable(Page<TableEntity> page, Query query);
	
	TableEntity getTableByName(String tableName);
	
	List<ColumnEntity> listColumn(String tableName);
	
}
