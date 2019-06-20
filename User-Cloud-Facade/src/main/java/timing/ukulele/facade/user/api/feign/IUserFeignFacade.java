package timing.ukulele.facade.user.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.user.api.IUserFacade;
import timing.ukulele.facade.user.model.view.UserVO;

import java.util.List;
import java.util.Map;

@FeignClient(name = "user-service", fallback = IUserFeignFacade.UserHystrixClientFallback.class)
public interface IUserFeignFacade extends IUserFacade {
    class UserHystrixClientFallback implements IUserFeignFacade {
        @Override
        public ResponseData<UserVO> getUserByUserName(String userName) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<UserVO> getUserByPhone(String phone) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<UserVO>> getUserByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<UserVO> user(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> userDel(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> user(UserVO user) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> userUpdate(UserVO user) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
