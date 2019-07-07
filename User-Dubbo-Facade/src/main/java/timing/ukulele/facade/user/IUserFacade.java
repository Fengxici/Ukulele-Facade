package timing.ukulele.facade.user;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.user.view.UserVO;

import java.util.List;
import java.util.Map;

public interface IUserFacade {
    /**
     * 根据用户名查询用户
     *
     * @param userName 用户名
     * @return
     */
    ResponseData<UserVO> getUserByUserName(String userName);

    /**
     * 根据电话号码查询用户
     *
     * @param phone 手机号
     * @return
     */
    ResponseData<UserVO> getUserByPhone(String phone);

    /**
     * 根据参数获取用户列表
     *
     * @param params 参数集合
     * @return 用户结合
     */
    ResponseData<List<UserVO>> getUserByParam(Map<String, Object> params);

    /**
     * 通过ID查询当前用户信息
     *
     * @param id ID
     * @return 用户信息
     */
    ResponseData<UserVO> user(Long id);

    /**
     * 删除用户信息
     *
     * @param id ID
     * @return R
     */
    ResponseData<Boolean> userDel(Long id);

    /**
     * 添加用户
     *
     * @param user 用户信息
     * @return success/false
     */
    ResponseData<Boolean> user(UserVO user);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return R
     */
    ResponseData<Boolean> userUpdate(UserVO user);

}
