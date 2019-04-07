package timing.ukulele.facade.user.model.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.persistence.model.BaseModel;

/**
 * 用户表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("sys_user")
public class SysUser extends BaseModel {

    /**
     * 用户名
     */
    private String username;

    private String password;
    /**
     * 随机盐
     */
    @TableField("salt_")
    private String salt;
    /**
     * 电话
     */
    @TableField("phone_")
    private String phone;
    /**
     * 头像
     */
    @TableField("avatar_")
    private String avatar;
    /**
     * 标签
     */
    @TableField("label_")
    private String label;

    /**
     * 部门ID
     */
    private Long deptId;

}
