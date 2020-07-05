package timing.ukulele.facade.portal;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.AntMenuTree;
import timing.ukulele.data.portal.data.RoleMenuTree;
import timing.ukulele.data.portal.view.AntMenuVO;
import timing.ukulele.data.portal.view.AntRoleMenuEditVO;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RequestMapping("/ant-menu")
public interface IAntMenuFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    @GetMapping("/{id}")
    ResponseData<AntMenuVO> get(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取列表
     *
     * @param params 参数集合
     * @return 列表
     */
    @GetMapping("/getByParam")
    ResponseData<List<AntMenuVO>> getByParam(@RequestParam("params") Map<String, Object> params);

    /**
     * 返回树形菜单集合
     *
     * @return 树形菜单
     */
    @GetMapping(value = "/tree")
    ResponseData<List<AntMenuTree>> getMenuTree();

    /**
     * 添加
     *
     * @param sysMenuAnt 实体
     * @return success/false
     */
    @PostMapping()
    ResponseData<Boolean> add(@RequestBody AntMenuVO sysMenuAnt);

    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> delete(@PathVariable(value = "id") Long id);

    /**
     * 编辑
     *
     * @param sysMenuAnt 实体
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> edit(@RequestBody AntMenuVO sysMenuAnt);

    /**
     * 获取所有菜单，标注角色已有的
     *
     * @param roleId
     * @return
     */
    @GetMapping("/findAllMenuWithRole/{roleId}")
    ResponseData<List<RoleMenuTree>> findAllMenuWithRole(@PathVariable(value = "roleId") Long roleId);

    /**
     * 通过角色名称查询用户菜单
     *
     * @param role 角色名称
     * @return 菜单列表
     */
    @GetMapping("/findMenuByRole/{role}")
    ResponseData<List<AntMenuVO>> findMenuByRole(@PathVariable(value = "role") String role);

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
     * 批量修改角色菜单
     *
     * @param vo 要修改的菜单列表
     * @return 成功/失败
     */
    @PostMapping("/role/menu/edit")
    ResponseData<Boolean> editRoleMenu(@RequestBody AntRoleMenuEditVO vo);

    /**
     * 指定用户的菜单
     *
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    ResponseData<List<AntMenuVO>> getMenuByUserId(@PathVariable(value = "userId") Long userId);

    /**
     * 根据角色名获取用户的菜单
     *
     * @param roles 角色名
     * @param username 用户名
     * @return
     */
    @GetMapping("/user")
    ResponseData<List<AntMenuTree>> getUserMenu(String roles,String username);

    @GetMapping("/user/abilities")
    ResponseData<Set<String>> userAbilities(Long userId, @RequestParam("router") String router);
}
