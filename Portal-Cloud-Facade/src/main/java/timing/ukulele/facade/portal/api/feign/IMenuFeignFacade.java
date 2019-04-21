package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IMenuFacade;
import timing.ukulele.facade.portal.model.data.MenuTree;
import timing.ukulele.facade.portal.model.persistent.SysMenu;
import timing.ukulele.facade.portal.model.view.MenuVO;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IMenuFeignFacade.MenuHystrixClientFallback.class)
public interface IMenuFeignFacade extends IMenuFacade {
    class MenuHystrixClientFallback implements IMenuFeignFacade {

        @Override
        public ResponseData<SysMenu> menu(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menu(SysMenu sysMenu) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menuDel(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> menuUpdate(SysMenu sysMenu) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuTree>> getMenuTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysMenu>> getByParam(Map<String, Object> params) {
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
        public ResponseData<List<SysMenu>> getMenuByUserId(Long userId) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuTree>> getUserMenu(String roles) {
            return null;
        }
    }
}
