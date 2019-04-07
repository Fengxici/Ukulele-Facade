package timing.ukulele.facade.portal.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

/**
 * <p>
 * 动态路由配置表
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("sys_zuul_route")
public class SysZuulRoute extends BaseModel {

    /**
     * 路由路径
     */
    @TableField("path_")
    private String path;
    /**
     * 服务名称
     */
    private String serviceId;
    /**
     * url代理
     */
    @TableField("url_")
    private String url;
    /**
     * 转发去掉前缀
     */
    private String stripPrefix;
    /**
     * 是否重试
     */
    @TableField("retryable_")
    private String retryable;
    /**
     * 敏感请求头
     */
    private String sensitiveHeaderList;

}
