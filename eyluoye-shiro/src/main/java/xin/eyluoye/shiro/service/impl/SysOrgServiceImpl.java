package xin.eyluoye.shiro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xin.eyluoye.common.constant.MsgConstant;
import xin.eyluoye.common.entity.R;
import xin.eyluoye.common.utils.CommonUtils;
import xin.eyluoye.shiro.entity.SysOrgEntity;
import xin.eyluoye.shiro.manager.SysOrgManager;
import xin.eyluoye.shiro.service.SysOrgService;

/**
 * 组织机构
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月17日 上午11:33:28
 */
@Service("sysOrgService")
public class SysOrgServiceImpl implements SysOrgService {

	@Autowired
	private SysOrgManager sysOrgManager;
	
	@Override
	public List<SysOrgEntity> listOrg() {
		return sysOrgManager.listOrg();
	}

	@Override
	public List<SysOrgEntity> listOrgTree() {
		List<SysOrgEntity> orgList = sysOrgManager.listOrg();
		SysOrgEntity org = new SysOrgEntity();
		org.setOrgId(0L);
		org.setName("一级机构");
		org.setParentId(-1L);
		org.setOpen(true);
		orgList.add(org);
		return orgList;
	}

	@Override
	public R saveOrg(SysOrgEntity org) {
		int count = sysOrgManager.saveOrg(org);
		return CommonUtils.msg(count);
	}

	@Override
	public R getOrg(Long orgId) {
		SysOrgEntity org = sysOrgManager.getOrg(orgId);
		return CommonUtils.msg(org);
	}

	@Override
	public R updateOrg(SysOrgEntity org) {
		int count = sysOrgManager.updateOrg(org);
		return CommonUtils.msg(count);
	}

	@Override
	public R bactchRemoveOrg(Long[] id) {
		boolean children = sysOrgManager.hasChildren(id);
		if(children) {
			return R.error(MsgConstant.MSG_HAS_CHILD);
		}
		int count = sysOrgManager.bactchRemoveOrg(id);
		return CommonUtils.msg(id, count);
	}

}
