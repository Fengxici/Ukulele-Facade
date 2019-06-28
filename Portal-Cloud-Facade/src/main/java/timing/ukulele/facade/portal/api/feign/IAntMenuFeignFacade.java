package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IAntMenuFacade;
import timing.ukulele.facade.portal.model.data.AntMenuTree;
import timing.ukulele.facade.portal.model.data.RoleMenuTree;
import timing.ukulele.facade.portal.model.view.AntMenuVO;
import timing.ukulele.facade.portal.model.view.AntRoleMenuEditVO;
import timing.ukulele.facade.portal.model.view.RoleMenuEditVO;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IAntMenuFeignFacade.MenuAntHystrixClientFallback.class)
public interface IAntMenuFeignFacade extends IAntMenuFacade {
    class MenuAntHystrixClientFallback implements IAntMenuFacade {

        @Override
        public ResponseData<AntMenuVO> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntMenuVO>> getByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntMenuTree>> getMenuTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(AntMenuVO sysMenuAnt) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(AntMenuVO sysMenuAnt) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<RoleMenuTree>> findAllMenuWithRole(Long roleId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntMenuVO>> findMenuByRole(String role) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteRoleMenu(Long roleId, Long menuId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> editRoleMenu(@RequestBody AntRoleMenuEditVO vo) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntMenuVO>> getMenuByUserId(Long userId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<AntMenuTree>> getUserMenu(String roles) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
