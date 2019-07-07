package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.RoleVO;

import java.util.List;
import java.util.Map;

public interface IRoleFacade {
    //==========================Role实体操作===============================//

    /**
     * 通过ID查询角色信息
     *
     * @param id ID
     * @return 角色信息
     */
    ResponseData<RoleVO> role(Long id);

    /**
     * 根据参数获取角色列表
     *
     * @param params 参数集合
     * @return 角色列表
     */
    ResponseData<List<RoleVO>> getRoleByParam(Map<String, Object> params);

    /**
     * 添加角色
     *
     * @param role 角色信息
     * @return success、false
     */
    ResponseData<Boolean> role(RoleVO role);

    /**
     * 修改角色
     *
     * @param role 角色信息
     * @return success/false
     */
    ResponseData<Boolean> roleUpdate(RoleVO role);

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return
     */
    ResponseData<Boolean> roleDel(Long id);

    //======================================================================//

    //============================User_Role操作==================================//

    /**
     * 获取用户角色
     *
     * @param userId 用户ID
     * @return 用户角色集合
     */
    ResponseData<List<RoleVO>> getRoleByUserId(Long userId);

    /**
     * 删除用户角色
     *
     * @param userId 用户ID
     * @param roleId 角色ID 若不传则删除用户所有角色
     * @return 成功/失败
     */
    ResponseData<Boolean> deleteUserRole(Long userId, Long roleId);

    /**
     * 添加用户角色
     *
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 成功/失败
     */
    ResponseData<Boolean> addUserRole(Long userId, Long roleId);
}
