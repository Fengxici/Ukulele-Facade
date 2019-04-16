package timing.ukulele.facade.portal.api.feign;

import com.github.pagehelper.Page;
import org.springframework.cloud.openfeign.FeignClient;
import timing.ukulele.common.data.ResponseData;
import timing.ukulele.common.data.ResponseVO;
import timing.ukulele.facade.portal.api.IRoleFacade;
import timing.ukulele.facade.portal.model.data.RoleDTO;
import timing.ukulele.facade.portal.model.persistent.SysRole;

import java.util.List;
import java.util.Map;

@FeignClient(name = "portal-service", fallback = IRoleFeignFacade.RoleHystrixClientFallback.class)
public interface IRoleFeignFacade extends IRoleFacade {
    class RoleHystrixClientFallback implements IRoleFeignFacade {

        @Override
        public SysRole role(Long id) {
            return null;
        }

        @Override
        public ResponseVO role(RoleDTO roleDto) {
            return null;
        }

        @Override
        public ResponseVO roleUpdate(RoleDTO roleDto) {
            return null;
        }

        @Override
        public ResponseVO roleDel(Long id) {
            return null;
        }

        @Override
        public List<Integer> roleTree(String roleName) {
            return null;
        }

        @Override
        public List<SysRole> roleList(Long deptId) {
            return null;
        }

        @Override
        public Page rolePage(Map<String, Object> params) {
            return null;
        }

        @Override
        public ResponseVO roleMenuUpd(Map data) {
            return null;
        }

        @Override
        public ResponseData<List<SysRole>> getRoleByUserId(Long userId) {
            return null;
        }
    }
}
