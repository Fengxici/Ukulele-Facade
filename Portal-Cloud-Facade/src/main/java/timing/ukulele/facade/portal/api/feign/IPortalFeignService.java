//package timing.ukulele.facade.portal.api.feign;
//
//import com.github.pagehelper.Page;
//import org.springframework.cloud.openfeign.FeignClient;
//import timing.ukulele.common.data.ResponseData;
//import timing.ukulele.common.data.ResponseVO;
//import timing.ukulele.facade.portal.api.*;
//import timing.ukulele.facade.portal.model.data.DeptTree;
//import timing.ukulele.facade.portal.model.data.MenuTree;
//import timing.ukulele.facade.portal.model.data.RoleDTO;
//import timing.ukulele.facade.portal.model.persistent.*;
//import timing.ukulele.facade.portal.model.view.MenuVO;
//
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//import java.util.Map;
//
//@FeignClient(name = "portal-service", fallback = IPortalFeignService.HystrixClientFallback.class)
//public interface IPortalFeignService extends IDeptService, IDictService, IMenuService, IRoleService, IValidateCodeService, IZuulRouteService {
//    class HystrixClientFallback implements IPortalFeignService {
//
//        @Override
//        public SysDept get(Integer id) {
//            return null;
//        }
//
//        @Override
//        public List<MenuVO> findMenuByRole(String role) {
//            return null;
//        }
//
//        @Override
//        public List<MenuTree> userMenu(String roles) {
//            return null;
//        }
//
//        @Override
//        public List<MenuTree> getMenuTree() {
//            return null;
//        }
//
//        @Override
//        public List<DeptTree> getDeptTree() {
//            return null;
//        }
//
//        @Override
//        public List<Integer> roleTree(String roleName) {
//            return null;
//        }
//
//        @Override
//        public SysMenu menu(Long id) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO menu(SysMenu sysMenu) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO menuDel(Long id) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO menuUpdate(SysMenu sysMenu) {
//            return null;
//        }
//
//        @Override
//        public ResponseData<List<SysMenu>> getMenuByUserId(Long userId) {
//            return null;
//        }
//
//        @Override
//        public Boolean add(SysDept sysDept) {
//            return null;
//        }
//
//        @Override
//        public Boolean delete(Integer id) {
//            return null;
//        }
//
//        @Override
//        public Boolean edit(SysDept sysDept) {
//            return null;
//        }
//
//        @Override
//        public SysDict dict(Integer id) {
//            return null;
//        }
//
//        @Override
//        public Page dictPage(Map<String, Object> params) {
//            return null;
//        }
//
//        @Override
//        public List<SysDict> findDictByType(String type) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO dict(SysDict sysDict) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO deleteDict(Integer id, String type) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO editDict(SysDict sysDict) {
//            return null;
//        }
//
//        @Override
//        public SysRole role(Long id) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO role(RoleDTO roleDto) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO roleUpdate(RoleDTO roleDto) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO roleDel(Long id) {
//            return null;
//        }
//
//        @Override
//        public List<SysRole> roleList(Long deptId) {
//            return null;
//        }
//
//        @Override
//        public Page rolePage(Map<String, Object> params) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO roleMenuUpd(Map data) {
//            return null;
//        }
//
//        @Override
//        public ResponseData<List<SysRole>> getRoleByUserId(Long userId) {
//            return null;
//        }
//
//        @Override
//        public void createCode(String randomStr, HttpServletResponse response) throws Exception {
//
//        }
//
//        @Override
//        public SysZuulRoute get(long id) {
//            return null;
//        }
//
//        @Override
//        public Page page(Map<String, Object> params) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO add(SysZuulRoute sysZuulRoute) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO delete(long id) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO edit(SysZuulRoute sysZuulRoute) {
//            return null;
//        }
//
//        @Override
//        public ResponseVO apply() {
//            return null;
//        }
//    }
//}
