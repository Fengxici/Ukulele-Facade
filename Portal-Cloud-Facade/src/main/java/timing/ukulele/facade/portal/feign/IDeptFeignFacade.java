package timing.ukulele.facade.portal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.DeptTree;
import timing.ukulele.data.portal.view.SysDeptVO;
import timing.ukulele.facade.portal.IDeptFacade;

import java.util.List;
import java.util.Map;

@FeignClient(contextId = "deptFeignFacade", name = "portal-service", fallback = IDeptFeignFacade.DeptHystrixClientFallback.class)
public interface IDeptFeignFacade extends IDeptFacade {
    class DeptHystrixClientFallback implements IDeptFeignFacade {

        @Override
        public ResponseData<SysDeptVO> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysDeptVO>> getDeptByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<DeptTree>> getDeptTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(SysDeptVO sysDept) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(SysDeptVO sysDept) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
