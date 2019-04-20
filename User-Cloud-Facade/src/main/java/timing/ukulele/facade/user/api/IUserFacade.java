package timing.ukulele.facade.user.api;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.user.model.data.UserDTO;
import timing.ukulele.facade.user.model.persistent.SysUser;
import timing.ukulele.facade.user.model.view.UserVO;

import java.util.List;
import java.util.Map;

public interface IUserFacade {
    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return
     */
    @GetMapping("/user/name/{userName}")
    ResponseData<SysUser> getUserByUserName(@PathVariable("userName") String userName);

    /**
     * 根据电话号码查询用户
     *
     * @param phone 手机号
     * @return
     */
    @GetMapping("/user/phone/{phone}")
    ResponseData<SysUser> getUserByPhone(@PathVariable("phone") String phone);

    /**
     * 根据参数获取用户列表
     *
     * @param params 参数集合
     * @return 用户结合
     */
    @GetMapping("/user/getByParam")
    ResponseData<List<SysUser>> getUserByParam(@RequestParam Map<String, Object> params);

    /**
     * 获取当前用户信息（角色、权限）
     * 并且异步初始化用户部门信息
     *
     * @param userVo 当前用户信息
     * @return 用户名
     */
    @GetMapping("/info")
    ResponseData<UserVO> user(UserVO userVo);

    /**
     * 通过ID查询当前用户信息
     *
     * @param id ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    ResponseData<UserVO> user(@PathVariable(value = "id") Integer id);

    /**
     * 删除用户信息
     *
     * @param id ID
     * @return R
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> userDel(@PathVariable(value = "id") Integer id);

    /**
     * 添加用户
     *
     * @param userDto 用户信息
     * @return success/false
     */
    @PostMapping
    ResponseData<Boolean> user(@RequestBody UserDTO userDto);

    /**
     * 更新用户信息
     *
     * @param userDto 用户信息
     * @return R
     */
    @PutMapping
    ResponseData<Boolean> userUpdate(@RequestBody UserDTO userDto);

}
