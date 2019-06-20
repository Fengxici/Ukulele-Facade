package timing.ukulele.facade.user.model.data;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long idl;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 电话
     */
    private String phone;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 标签
     */
    private String label;
    /**
     * 部门ID
     */
    private Long deptId;
    /**
     * 角色ID
     */
    private List<Long> role;

    /**
     * 新密码
     */
    private String newPassword1;
}
