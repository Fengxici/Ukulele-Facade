package timing.ukulele.facade.user.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.user.api.IUserService;
import timing.ukulele.facade.user.model.data.UserDTO;
import timing.ukulele.facade.user.model.persistent.SysUser;
import timing.ukulele.facade.user.model.view.UserVO;
import timing.ukulele.web.pojo.ResponseCode;

import java.util.Map;

@FeignClient(name = "user-service", fallback = IUserFeignService.UserHystrixClientFallback.class)
public interface IUserFeignService extends IUserService {
    class UserHystrixClientFallback implements IUserFeignService {

        @Override
        public ResponseData<SysUser> getUserByUserName(String userName) {
            return new ResponseData<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMessage());
        }

        @Override
        public ResponseData<SysUser> getUserByPhone(String phone) {
            return new ResponseData<>(ResponseCode.ERROR.getCode(), ResponseCode.ERROR.getMessage());
        }

        @Override
        public ResponseVO user(UserVO userVo) {
            return null;
        }

        @Override
        public UserVO user(Integer id) {
            return null;
        }

        @Override
        public ResponseVO userDel(Integer id) {
            return null;
        }

        @Override
        public ResponseVO user(UserDTO userDto) {
            return null;
        }

        @Override
        public ResponseVO userUpdate(UserDTO userDto) {
            return null;
        }

        @Override
        public UserVO findUserByUsername(String username) {
            return null;
        }

        @Override
        public UserVO findUserByMobile(String mobile) {
            return null;
        }

        @Override
        public UserVO findUserByOpenId(String openId) {
            return null;
        }

        @Override
        public Page userPage(Map<String, Object> params, UserVO userVO) {
            return null;
        }

        @Override
        public ResponseVO editInfo(UserVO userVo) {
            return null;
        }
    }
}
