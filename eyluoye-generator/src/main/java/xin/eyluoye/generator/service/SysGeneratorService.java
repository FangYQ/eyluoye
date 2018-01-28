package xin.eyluoye.generator.service;

import java.util.Map;

import xin.eyluoye.common.entity.Page;
import xin.eyluoye.generator.entity.GeneratorParamEntity;
import xin.eyluoye.generator.entity.TableEntity;

/**
 * 代码生成器
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月28日 下午8:55:29
 */
public interface SysGeneratorService {

	Page<TableEntity> listTable(Map<String, Object> params);
	
	byte[] generator(GeneratorParamEntity params);
	
}
