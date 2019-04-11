package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.api.IMenuService;
import timing.ukulele.facade.portal.model.data.MenuTree;
import timing.ukulele.facade.portal.model.persistent.SysMenu;
import timing.ukulele.facade.portal.model.view.MenuVO;

import java.util.List;

@FeignClient(name = "portal-service", fallback = IMenuFeignService.MenuHystrixClientFallback.class)
public interface IMenuFeignService extends IMenuService {
    class MenuHystrixClientFallback implements IMenuFeignService{

        @Override
        public List<MenuVO> findMenuByRole(String role) {
            return null;
        }

        @Override
        public List<MenuTree> userMenu(String roles) {
            return null;
        }

        @Override
        public List<MenuTree> getMenuTree() {
            return null;
        }

        @Override
        public List<Integer> roleTree(String roleName) {
            return null;
        }

        @Override
        public SysMenu menu(Long id) {
            return null;
        }

        @Override
        public ResponseVO menu(SysMenu sysMenu) {
            return null;
        }

        @Override
        public ResponseVO menuDel(Long id) {
            return null;
        }

        @Override
        public ResponseVO menuUpdate(SysMenu sysMenu) {
            return null;
        }

        @Override
        public ResponseData<List<SysMenu>> getMenuByUserId(Long userId) {
            return null;
        }
    }
}
