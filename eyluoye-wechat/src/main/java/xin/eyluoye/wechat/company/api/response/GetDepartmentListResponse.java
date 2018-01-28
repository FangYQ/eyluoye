package xin.eyluoye.wechat.company.api.response;

import com.alibaba.fastjson.annotation.JSONField;
import xin.eyluoye.wechat.api.response.BaseResponse;
import xin.eyluoye.wechat.company.api.entity.QYDepartment;

import java.util.List;

/**
 *  
 *  ====================================================================
 *  上海聚攒软件开发有限公司
 *  --------------------------------------------------------------------
 *  @author Nottyjay
 *  @version 1.0.beta
 *  ====================================================================
 */
public class GetDepartmentListResponse extends BaseResponse {

    @JSONField(name = "department")
    private List<QYDepartment> departments;

    public List<QYDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<QYDepartment> departments) {
        this.departments = departments;
    }
}
