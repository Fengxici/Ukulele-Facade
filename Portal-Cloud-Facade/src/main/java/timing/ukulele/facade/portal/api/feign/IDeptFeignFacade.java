package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IDeptFacade;
import timing.ukulele.facade.portal.model.data.DeptTree;
import timing.ukulele.facade.portal.model.persistent.SysDept;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IDeptFeignFacade.DeptHystrixClientFallback.class)
public interface IDeptFeignFacade extends IDeptFacade {
    class DeptHystrixClientFallback implements IDeptFeignFacade {

        @Override
        public ResponseData<SysDept> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysDept>> getDeptByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<DeptTree>> getDeptTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(SysDept sysDept) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(SysDept sysDept) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
