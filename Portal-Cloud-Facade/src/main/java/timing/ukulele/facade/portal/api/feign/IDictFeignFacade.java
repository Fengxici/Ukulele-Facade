package timing.ukulele.facade.portal.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.api.IDictFacade;
import timing.ukulele.facade.portal.model.persistent.SysDict;

import java.util.List;
import java.util.Map;
@FeignClient(name = "portal-service", fallback = IDictFeignFacade.DictHystrixClientFallback.class)
public interface IDictFeignFacade extends IDictFacade {
    class DictHystrixClientFallback implements IDictFeignFacade {

        @Override
        public SysDict dict(Long id) {
            return null;
        }

        @Override
        public Page dictPage(Map<String, Object> params) {
            return null;
        }

        @Override
        public List<SysDict> findDictByType(String type) {
            return null;
        }

        @Override
        public ResponseVO dict(SysDict sysDict) {
            return null;
        }

        @Override
        public ResponseVO deleteDict(Integer id, String type) {
            return null;
        }

        @Override
        public ResponseVO editDict(SysDict sysDict) {
            return null;
        }
    }
}
