package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.AntMenuTree;
import timing.ukulele.data.portal.view.AntMenuVO;

import java.util.List;
import java.util.Map;

public interface IAntMenuFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    ResponseData<AntMenuVO> get(Long id);

    /**
     * 根据参数获取列表
     *
     * @param params 参数集合
     * @return 列表
     */
    ResponseData<List<AntMenuVO>> getByParam(Map<String, Object> params);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    ResponseData<List<AntMenuTree>> getMenuTree();

    /**
     * 添加
     *
     * @param sysMenuAnt 实体
     * @return success/false
     */
    ResponseData<Boolean> add(AntMenuVO sysMenuAnt);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    ResponseData<Boolean> delete(Long id);

    /**
     * 编辑
     *
     * @param sysMenuAnt 实体
     * @return success/false
     */
    ResponseData<Boolean> edit(AntMenuVO sysMenuAnt);


    /**
     * 通过角色名称查询用户菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    ResponseData<List<AntMenuVO>> findMenuByRole(String role);

    /**
     * 删除角色菜单
     *
     * @param roleId 角色Id
     * @param menuId 菜单Id 不传则删除指定角色下的菜单
     * @return 成功/失败
     */
    ResponseData<Boolean> deleteRoleMenu(Long roleId, Long menuId);

    /**
     * 新增角色菜单
     *
     * @param roleId 角色Id
     * @param menuId 菜单ID
     * @return 成功/失败
     */
    ResponseData<Boolean> addRoleMenu(Long roleId, Long menuId);

    /**
     * 指定用户的菜单
     *
     * @param userId
     * @return
     */
    ResponseData<List<AntMenuVO>> getMenuByUserId(Long userId);

    /**
     * 根据角色名获取用户的菜单
     *
     * @param roles 角色名
     * @return
     */
    ResponseData<List<AntMenuTree>> getUserMenu(String roles);
}
