package xin.eyluoye.base.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xin.eyluoye.base.dao.SysMacroMapper;
import xin.eyluoye.base.entity.SysMacroEntity;
import xin.eyluoye.base.manager.SysMacroManager;
import xin.eyluoye.common.utils.CommonUtils;

/**
 * 通用字典
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月15日 下午12:49:26
 */
@Component("sysMacroManager")
public class SysMacroManagerImpl implements SysMacroManager {

	@Autowired
	private SysMacroMapper sysMacroMapper;
	
	@Override
	public List<SysMacroEntity> listMacro() {
		return sysMacroMapper.list();
	}

	@Override
	public List<SysMacroEntity> listNotMacro() {
		return sysMacroMapper.listNotMacro();
	}

	@Override
	public int saveMacro(SysMacroEntity macro) {
		return sysMacroMapper.save(macro);
	}

	@Override
	public SysMacroEntity getObjectById(Long id) {
		return sysMacroMapper.getObjectById(id);
	}

	@Override
	public int updateMacro(SysMacroEntity macro) {
		return sysMacroMapper.update(macro);
	}

	@Override
	public int batchRemove(Long[] id) {
		return sysMacroMapper.batchRemove(id);
	}

	@Override
	public boolean hasChildren(Long[] id) {
		for(Long typeId : id) {
			int count = sysMacroMapper.countMacroChildren(typeId);
			if(CommonUtils.isIntThanZero(count)) {
				return true;
			}
		}
		return false;
	}

}
