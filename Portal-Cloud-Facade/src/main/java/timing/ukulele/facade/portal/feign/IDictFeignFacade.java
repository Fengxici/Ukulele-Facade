package timing.ukulele.facade.portal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.DictIndexVO;
import timing.ukulele.data.portal.view.DictVO;
import timing.ukulele.facade.portal.IDictFacade;

import java.util.List;

@FeignClient(contextId = "dictFeignClient", name = "portal-service", fallback = IDictFeignFacade.DictHystrixClientFallback.class)
public interface IDictFeignFacade extends IDictFacade {
    class DictHystrixClientFallback implements IDictFeignFacade {
        @Override
        public ResponseData<DictVO> dict(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> dict(DictVO sysDict) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> editDict(DictVO sysDict) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteDict(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<DictVO>> findDictByIndex(String type) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<DictIndexVO> dictIndex(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> dictIndex(DictIndexVO sysDictIndex) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> editDictIndex(DictIndexVO sysDict) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteDictIndex(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
