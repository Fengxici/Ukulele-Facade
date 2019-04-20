package timing.ukulele.facade.auth.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.auth.api.IClientFacade;
import timing.ukulele.facade.auth.model.persistent.OAuthClientDetailsModel;

import java.util.List;
import java.util.Map;

@FeignClient(name = "auth-service", fallback = IClientFeignFacade.HystrixClientFallback.class)
public interface IClientFeignFacade extends IClientFacade {
    class HystrixClientFallback implements IClientFeignFacade {

        @Override
        public ResponseData<List<OAuthClientDetailsModel>> getClientByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<OAuthClientDetailsModel> get(Integer id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(OAuthClientDetailsModel client) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(String id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(OAuthClientDetailsModel client) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
