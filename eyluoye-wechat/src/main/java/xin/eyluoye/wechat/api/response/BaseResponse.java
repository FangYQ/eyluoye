package xin.eyluoye.wechat.api.response;

import xin.eyluoye.wechat.api.entity.BaseModel;
import xin.eyluoye.wechat.api.enums.ResultType;
import xin.eyluoye.wechat.util.BeanUtil;
import xin.eyluoye.wechat.util.StrUtil;

/**
 * 微信API响应报文对象基类
 *
 * @author peiyu
 */
public class BaseResponse extends BaseModel {

    private String errcode;
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        String result = this.errmsg;
        //将接口返回的错误信息转换成中文，方便提示用户出错原因
        if (StrUtil.isNotBlank(this.errcode) && !ResultType.SUCCESS.getCode().toString().equals(this.errcode)) {
            ResultType resultType = ResultType.get(this.errcode);
            if(BeanUtil.nonNull(resultType)) {
                result = resultType.getDescription();
            }
        }
        return result;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
