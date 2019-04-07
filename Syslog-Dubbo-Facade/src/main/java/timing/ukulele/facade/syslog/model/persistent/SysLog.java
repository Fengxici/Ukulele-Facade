package timing.ukulele.facade.syslog.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

/**
 * <p>
 * 日志表
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_log")
public class SysLog extends BaseModel {

    /**
     * 日志类型
     */
    @TableField("type_")
    private String type;
    /**
     * 日志标题
     */
    @TableField("title_")
    private String title;
    /**
     * 操作IP地址
     */
    private String remoteAddr;
    /**
     * 用户代理
     */
    private String userAgent;
    /**
     * 请求URI
     */
    private String requestUri;
    /**
     * 操作方式
     */
    @TableField("method_")
    private String method;
    /**
     * 操作提交的数据
     */
    @TableField("params_")
    private String params;
    /**
     * 执行时间
     */
    @TableField("time_")
    private Long time;
    /**
     * 异常信息
     */
    @TableField("exception_")
    private String exception;
    /**
     * 服务ID
     */
    private String serviceId;
}
