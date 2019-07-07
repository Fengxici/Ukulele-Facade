package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.MenuTree;
import timing.ukulele.data.portal.view.MenuVO;

import java.util.List;
import java.util.Map;

public interface IMenuFacade {
//+++++++++++++++++++++++++++++ ROLE实体操作 +++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过ID查询菜单的详细信息
     *
     * @param id 菜单ID
     * @return 菜单详细信息
     */
    ResponseData<MenuVO> menu(Long id);

    /**
     * 新增菜单
     *
     * @param sysMenu 菜单信息
     * @return success/false
     */
    ResponseData<Boolean> menu(MenuVO sysMenu);

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return success/false
     */
    ResponseData<Boolean> menuDel(Long id);

    /**
     * 编辑菜单
     *
     * @param sysMenu menu实体
     * @return
     */
    ResponseData<Boolean> menuUpdate(MenuVO sysMenu);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    ResponseData<List<MenuTree>> getMenuTree();

    /**
     * 根据参数返回菜单集合
     *
     * @param params 参数集合
     * @return 菜单集合
     */
    ResponseData<List<MenuVO>> getByParam(Map<String, Object> params);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

//+++++++++++++++++++++++++++++++++ROLE_MENU实体操作++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过角色名称查询用户菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    ResponseData<List<MenuVO>> findMenuByRole(String role);

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
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 指定用户的菜单
     *
     * @param userId
     * @return
     */
    ResponseData<List<MenuVO>> getMenuByUserId(Long userId);

    /**
     * 根据角色名获取用户的菜单
     *
     * @param roles 角色名
     * @return
     */
    ResponseData<List<MenuTree>> getUserMenu(String roles);
}
