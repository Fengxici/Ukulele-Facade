package timing.ukulele.facade.portal.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleMenuTree extends TreeNode {
    private String text;
    private Long roleId;
    private List<String> abilities;
}
