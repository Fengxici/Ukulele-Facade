package timing.ukulele.facade.syslog.model.view;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志记录VO
 */
@Data
public class LogVO implements Serializable {

    private Long id;
    /**
     * 日志类型
     */
    private String type;
    /**
     * 日志标题
     */
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
    private String method;
    /**
     * 操作提交的数据
     */
    private String params;
    /**
     * 执行时间
     */
    private Long time;
    /**
     * 异常信息
     */
    private String exception;
    /**
     * 服务ID
     */
    private String serviceId;
    private String username;
    private String createBy;
    private Date createTime;
}
