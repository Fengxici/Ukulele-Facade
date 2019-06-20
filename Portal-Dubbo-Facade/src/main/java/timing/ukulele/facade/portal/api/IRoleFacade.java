package timing.ukulele.facade.portal.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.model.view.RoleVO;

import java.util.List;
import java.util.Map;

@RequestMapping("/role")
public interface IRoleFacade {
    //==========================Role实体操作===============================//

    /**
     * 通过ID查询角色信息
     *
     * @param id ID
     * @return 角色信息
     */
    @GetMapping("/{id}")
    ResponseData<RoleVO> role(@PathVariable(value = "id") Long id);

    /**
     * 根据参数获取角色列表
     *
     * @param params 参数集合
     * @return 角色列表
     */
    @GetMapping("getByParam")
    ResponseData<List<RoleVO>> getRoleByParam(@RequestParam Map<String, Object> params);

    /**
     * 添加角色
     *
     * @param role 角色信息
     * @return success、false
     */
    @PostMapping()
    ResponseData<Boolean> role(@RequestBody RoleVO role);

    /**
     * 修改角色
     *
     * @param role 角色信息
     * @return success/false
     */
    @PutMapping()
    ResponseData<Boolean> roleUpdate(@RequestBody RoleVO role);

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> roleDel(@PathVariable(value = "id") Long id);

    //======================================================================//

    //============================User_Role操作==================================//

    /**
     * 获取用户角色
     *
     * @param userId 用户ID
     * @return 用户角色集合
     */
    @GetMapping("/user/{userId}")
    ResponseData<List<RoleVO>> getRoleByUserId(@PathVariable(value = "userId") Long userId);

    /**
     * 删除用户角色
     *
     * @param userId 用户ID
     * @param roleId 角色ID 若不传则删除用户所有角色
     * @return 成功/失败
     */
    @DeleteMapping("/user/{userId}/{roleId}")
    ResponseData<Boolean> deleteUserRole(@PathVariable(value = "userId") Long userId, @PathVariable(value = "roleId", required = false) Long roleId);

    /**
     * 添加用户角色
     *
     * @param userId 用户ID
     * @param roleId 角色ID
     * @return 成功/失败
     */
    @PostMapping("/user/{userId}/{roleId}")
    ResponseData<Boolean> addUserRole(@PathVariable(value = "userId") Long userId, @PathVariable(value = "roleId") Long roleId);
}
