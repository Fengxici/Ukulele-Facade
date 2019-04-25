package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IAntIconFacade;
import timing.ukulele.facade.portal.model.persistent.AntIcon;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@FeignClient(name = "portal-service", fallback = IAntIconFeignFacade.AntIconHystrixClientFallback.class)
public interface IAntIconFeignFacade extends IAntIconFacade {
    class AntIconHystrixClientFallback implements IAntIconFeignFacade {

        @Override
        public ResponseData<AntIcon> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntIcon>> getByParam(HttpServletRequest request) {
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
