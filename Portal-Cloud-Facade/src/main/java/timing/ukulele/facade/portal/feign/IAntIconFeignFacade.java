package timing.ukulele.facade.portal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.AntIconVO;
import timing.ukulele.facade.portal.IAntIconFacade;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@FeignClient(contextId = "antIconFeignClient", name = "portal-service", fallback = IAntIconFeignFacade.AntIconHystrixClientFallback.class)
public interface IAntIconFeignFacade extends IAntIconFacade {
    class AntIconHystrixClientFallback implements IAntIconFeignFacade {

        @Override
        public ResponseData<AntIconVO> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntIconVO>> getByParam(HttpServletRequest request) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(AntIconVO sysAntIcon) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(AntIconVO sysAntIcon) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
