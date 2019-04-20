package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IDictFacade;
import timing.ukulele.facade.portal.model.persistent.SysDict;

import java.util.List;
@FeignClient(name = "portal-service", fallback = IDictFeignFacade.DictHystrixClientFallback.class)
public interface IDictFeignFacade extends IDictFacade {
    class DictHystrixClientFallback implements IDictFeignFacade {
        @Override
        public ResponseData<SysDict> dict(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysDict>> findDictByType(String type) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> dict(SysDict sysDict) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteDict(Long id, String type) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> editDict(SysDict sysDict) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
