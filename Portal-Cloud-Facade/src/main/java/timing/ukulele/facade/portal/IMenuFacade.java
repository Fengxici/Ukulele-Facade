package timing.ukulele.facade.portal;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.MenuTree;
import timing.ukulele.data.portal.view.AntRoleMenuEditVO;
import timing.ukulele.data.portal.view.MenuVO;

import java.util.List;
import java.util.Map;

@RequestMapping("/menu")
public interface IMenuFacade {
//+++++++++++++++++++++++++++++ ROLE实体操作 +++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过ID查询菜单的详细信息
     *
     * @param id 菜单ID
     * @return 菜单详细信息
     */
    @GetMapping("/{id}")
    ResponseData<MenuVO> menu(@PathVariable(value = "id") Long id);

    /**
     * 新增菜单
     *
     * @param sysMenu 菜单信息
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> menu(@RequestBody MenuVO sysMenu);

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> menuDel(@PathVariable(value = "id") Long id);

    /**
     * 编辑菜单
     *
     * @param sysMenu menu实体
     * @return
     */
    @PutMapping()
    ResponseData<Boolean> menuUpdate(@RequestBody MenuVO sysMenu);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/allTree")
    ResponseData<List<MenuTree>> getMenuTree();

    /**
     * 根据参数返回菜单集合
     *
     * @param params 参数集合
     * @return 菜单集合
     */
    @GetMapping(value = "getByParam")
    ResponseData<List<MenuVO>> getByParam(@RequestParam Map<String, Object> params);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

//+++++++++++++++++++++++++++++++++ROLE_MENU实体操作++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 通过角色名称查询用户菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping("/findMenuByRole/{role}")
    ResponseData<List<MenuVO>> findMenuByRole(@PathVariable(value = "role") String role);

    /**
     * 删除角色菜单
     *
     * @param roleId 角色Id
     * @param menuId 菜单Id 不传则删除指定角色下的菜单
     * @return 成功/失败
     */
    @DeleteMapping("/role/{roleId}/{menuId}")
    ResponseData<Boolean> deleteRoleMenu(@PathVariable(value = "roleId") Long roleId, @PathVariable(value = "menuId", required = false) Long menuId);

    /**
     * 新增角色菜单
     *
     * @param roleId 角色Id
     * @param menuId 菜单ID
     * @return 成功/失败
     */
    @PostMapping("/role/{roleId}/{menuId}")
    ResponseData<Boolean> addRoleMenu(@PathVariable(value = "roleId") Long roleId, @PathVariable(value = "menuId") Long menuId);

    /**
     * 批量修改角色菜单
     *
     * @param vo 要修改的菜单列表
     * @return 成功/失败
     */
    @PostMapping("/role/menu/edit")
    ResponseData<Boolean> editRoleMenu(@RequestBody AntRoleMenuEditVO vo);
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//

    /**
     * 指定用户的菜单
     *
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    ResponseData<List<MenuVO>> getMenuByUserId(@PathVariable(value = "userId") Long userId);

    /**
     * 根据角色名获取用户的菜单
     *
     * @param roles 角色名
     * @return
     */
    @GetMapping("/user")
    ResponseData<List<MenuTree>> getUserMenu(String roles);
}
