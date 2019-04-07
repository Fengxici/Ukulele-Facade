package timing.ukulele.facade.portal.model.view;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统角色
 */
@Data
public class RoleVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long roleId;
    private String roleName;
    private String roleCode;
    private String roleDesc;
    private Date createTime;
    private Date updateTime;
    private String enable;
}
