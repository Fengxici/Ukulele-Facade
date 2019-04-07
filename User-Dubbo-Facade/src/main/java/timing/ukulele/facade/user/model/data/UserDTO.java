package timing.ukulele.facade.user.model.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.facade.user.model.persistent.SysUser;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends SysUser {
    /**
     * 角色ID
     */
    private List<Long> role;

    /**
     * 新密码
     */
    private String newPassword1;
}
