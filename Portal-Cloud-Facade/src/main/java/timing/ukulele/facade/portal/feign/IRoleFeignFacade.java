package timing.ukulele.facade.portal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.RoleVO;
import timing.ukulele.facade.portal.IRoleFacade;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IRoleFeignFacade.RoleHystrixClientFallback.class)
public interface IRoleFeignFacade extends IRoleFacade {
    class RoleHystrixClientFallback implements IRoleFeignFacade {

        @Override
        public ResponseData<RoleVO> role(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<RoleVO>> getRoleByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> role(RoleVO role) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> roleUpdate(RoleVO role) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> roleDel(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<RoleVO>> getRoleByUserId(Long userId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteUserRole(Long userId, Long roleId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> addUserRole(Long userId, Long roleId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
