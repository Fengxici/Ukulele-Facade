package timing.ukulele.facade.user;

import org.springframework.web.bind.annotation.*;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.user.view.UserVO;

import java.util.List;
import java.util.Map;

@RequestMapping("/user")
public interface IUserFacade {
    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return
     */
    @GetMapping("/name/{userName}")
    ResponseData<UserVO> getUserByUserName(@PathVariable("userName") String userName);

    /**
     * 根据电话号码查询用户
     *
     * @param phone 手机号
     * @return
     */
    @GetMapping("/phone/{phone}")
    ResponseData<UserVO> getUserByPhone(@PathVariable("phone") String phone);

    /**
     * 根据用户名或手机号等唯一可确定身份的参数查找用户
     * @param param 用户名 或手机号等唯一可确定身份的参数
     * @return
     */
    @GetMapping("/param/{param}")
    ResponseData<UserVO> getUserByPhoneOrName(@PathVariable("param") String param);
    /**
     * 根据参数获取用户列表
     *
     * @param params 参数集合
     * @return 用户结合
     */
    @GetMapping("/getByParam")
    ResponseData<List<UserVO>> getUserByParam(@RequestParam Map<String, Object> params);


    /**
     * 通过ID查询当前用户信息
     *
     * @param id ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    ResponseData<UserVO> user(@PathVariable(value = "id") Long id);

    /**
     * 删除用户信息
     *
     * @param id ID
     * @return R
     */
    @DeleteMapping("/{id}")
    ResponseData<Boolean> userDel(@PathVariable(value = "id") Long id);

    /**
     * 添加用户
     *
     * @param user 用户信息
     * @return success/false
     */
    @PostMapping
    ResponseData<Boolean> user(@RequestBody UserVO user);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return R
     */
    @PutMapping
    ResponseData<Boolean> userUpdate(@RequestBody UserVO user);

}
