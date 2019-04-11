package timing.ukulele.facade.portal.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.api.IDictService;
import timing.ukulele.facade.portal.model.persistent.SysDict;

import java.util.List;
import java.util.Map;
@FeignClient(name = "portal-service", fallback = IDictFeignService.DictHystrixClientFallback.class)
public interface IDictFeignService extends IDictService {
    class DictHystrixClientFallback implements IDictFeignService{

        @Override
        public SysDict dict(Integer id) {
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
