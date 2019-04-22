package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseCode;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.facade.portal.api.IMenuAntFacade;
import timing.ukulele.facade.portal.model.data.MenuAntTree;
import timing.ukulele.facade.portal.model.persistent.SysMenuAnt;

import java.util.List;
import java.util.Map;
@FeignClient(name = "portal-service", fallback = IMenuAntFeignFacade.MenuAntHystrixClientFallback.class)
public interface IMenuAntFeignFacade extends IMenuAntFacade {
    class MenuAntHystrixClientFallback implements IMenuAntFacade{

        @Override
        public ResponseData<SysMenuAnt> get(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<SysMenuAnt>> getDeptByParam(Map<String, Object> params) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<List<MenuAntTree>> getDeptTree() {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> add(SysMenuAnt sysMenuAnt) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> delete(Long id) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }

        @Override
        public ResponseData<Boolean> edit(SysMenuAnt sysMenuAnt) {
            return new ResponseData<>(ResponseCode.FACADE_ERROR);
        }
    }
}
