package timing.ukulele.facade.portal.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.facade.portal.api.IDeptFacade;
import timing.ukulele.facade.portal.model.data.DeptTree;
import timing.ukulele.facade.portal.model.persistent.SysDept;

import java.util.List;

/**
 *
 */
@FeignClient(name = "portal-service", fallback = IDeptFeignFacade.DeptHystrixClientFallback.class)
public interface IDeptFeignFacade extends IDeptFacade {
    class DeptHystrixClientFallback implements IDeptFeignFacade {

        @Override
        public SysDept get(Integer id) {
            return null;
        }

        @Override
        public List<DeptTree> getDeptTree() {
            return null;
        }

        @Override
        public Boolean add(SysDept sysDept) {
            return null;
        }

        @Override
        public Boolean delete(Integer id) {
            return null;
        }

        @Override
        public Boolean edit(SysDept sysDept) {
            return null;
        }
    }
}
