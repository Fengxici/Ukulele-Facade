package timing.ukulele.facade.portal.model.view;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 批量编辑角色菜单视图对象
 */
@Data
public class RoleMenuEditVO implements Serializable {
    private Long menuId;
    private List<String> abilities;
}
