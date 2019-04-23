package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IAntIconFacade;
import timing.ukulele.facade.portal.model.persistent.AntIcon;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IAntIconFeignFacade.AntIconHystrixClientFallback.class)
public interface IAntIconFeignFacade extends IAntIconFacade {
    class AntIconHystrixClientFallback implements IAntIconFeignFacade{

        @Override
        public ResponseData<AntIcon> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntIcon>> getByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(AntIcon sysAntIcon) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(AntIcon sysAntIcon) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
