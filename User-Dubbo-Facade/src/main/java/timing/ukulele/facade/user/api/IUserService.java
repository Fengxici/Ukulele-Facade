package timing.ukulele.facade.user.api;

import com.github.pagehelper.Page;
import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.user.model.data.UserDTO;
import timing.ukulele.facade.user.model.persistent.SysUser;
import timing.ukulele.facade.user.model.view.UserVO;

import java.util.Map;

public interface IUserService {
    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return
     */
    @RequestMapping(value = "/user/name/{userName}", method = RequestMethod.GET)
    ResponseData<SysUser> getUserByUserName(@PathVariable("userName") String userName);

    /**
     * 根据电话号码查询用户
     *
     * @param phone 手机号
     * @return
     */
    @RequestMapping(value = "/user/phone/{phone}", method = RequestMethod.GET)
    ResponseData<SysUser> getUserByPhone(@PathVariable("phone") String phone);


    /**
     * 获取当前用户信息（角色、权限）
     * 并且异步初始化用户部门信息
     *
     * @param userVo 当前用户信息
     * @return 用户名
     */
    @GetMapping("/info")
    ResponseVO user(UserVO userVo);

    /**
     * 通过ID查询当前用户信息
     *
     * @param id ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    UserVO user(@PathVariable(value="id") Integer id);

    /**
     * 删除用户信息
     *
     * @param id ID
     * @return R
     */
    @DeleteMapping("/{id}")
    ResponseVO userDel(@PathVariable(value="id") Integer id);

    /**
     * 添加用户
     *
     * @param userDto 用户信息
     * @return success/false
     */
    @PostMapping
    ResponseVO user(@RequestBody UserDTO userDto);

    /**
     * 更新用户信息
     *
     * @param userDto 用户信息
     * @return R
     */
    @PutMapping
    ResponseVO userUpdate(@RequestBody UserDTO userDto);

    /**
     * 通过用户名查询用户及其角色信息
     *
     * @param username 用户名
     * @return UseVo 对象
     */
    @GetMapping("/findUserByUsername/{username}")
    public UserVO findUserByUsername(@PathVariable(value="username") String username);

    /**
     * 通过手机号查询用户及其角色信息
     *
     * @param mobile 手机号
     * @return UseVo 对象
     */
    @GetMapping("/findUserByMobile/{mobile}")
    UserVO findUserByMobile(@PathVariable(value="mobile") String mobile);

    /**
     * 通过OpenId查询
     *
     * @param openId openid
     * @return 对象
     */
    @GetMapping("/findUserByOpenId/{openId}")
    UserVO findUserByOpenId(@PathVariable(value="openId") String openId);

    /**
     * 分页查询用户
     *
     * @param params 参数集
     * @param userVO 用户信息
     * @return 用户集合
     */
    @GetMapping("/userPage")
    Page userPage(@RequestParam Map<String, Object> params, UserVO userVO);

    /**
     * 修改个人信息
     *
     * @param userVo  登录用户信息
     * @return success/false
     */
    @PutMapping("/editInfo")
    ResponseVO editInfo(@RequestBody UserVO userVo);
}
