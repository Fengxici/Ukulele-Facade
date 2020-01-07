package timing.ukulele.facade.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.user.view.ThirdPartyUserVO;
import timing.ukulele.facade.user.IThirdPartyUserFacade;

@FeignClient(name = "user-service", fallback = IThirdPartyUserFeignFacade.UserHystrixClientFallback.class)
public interface IThirdPartyUserFeignFacade extends IThirdPartyUserFacade {
    class UserHystrixClientFallback implements IThirdPartyUserFeignFacade {

        @Override
        public ResponseData<ThirdPartyUserVO> getThirdUserByAll(String platId, Long userId, Integer plat) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<ThirdPartyUserVO> getUserByThirdInfo(String platId, Integer plat) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
