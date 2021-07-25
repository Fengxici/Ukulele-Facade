package timing.ukulele.facade.portal.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.data.MenuTree;
import timing.ukulele.data.portal.view.AntRoleMenuEditVO;
import timing.ukulele.data.portal.view.MenuVO;
import timing.ukulele.facade.portal.IMenuFacade;

import java.util.List;
import java.util.Map;

@FeignClient(contextId = "menuFeignClient", name = "portal-service", fallback = IMenuFeignFacade.MenuHystrixClientFallback.class)
public interface IMenuFeignFacade extends IMenuFacade {
    class MenuHystrixClientFallback implements IMenuFeignFacade {

        @Override
        public ResponseData<MenuVO> menu(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menu(MenuVO sysMenu) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menuDel(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menuUpdate(MenuVO sysMenu) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuTree>> getMenuTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuVO>> getByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuVO>> findMenuByRole(String role) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> deleteRoleMenu(Long roleId, Long menuId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> addRoleMenu(Long roleId, Long menuId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> editRoleMenu(@RequestBody AntRoleMenuEditVO vo) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuVO>> getMenuByUserId(Long userId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuTree>> getUserMenu(String roles) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
