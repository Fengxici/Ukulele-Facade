package timing.ukulele.facade.portal;

import timing.ukulele.common.data.ResponseData;
import timing.ukulele.data.portal.view.AntIconVO;

import java.util.List;
import java.util.Map;

public interface IAntIconFacade {
    /**
     * 通过ID查询
     *
     * @param id ID
     * @return SysDept
     */
    ResponseData<AntIconVO> get(Long id);

    /**
     * 根据参数获取列表
     *
     * @param request 参数集合
     * @return 列表
     */
    ResponseData<List<AntIconVO>> getByParam(Map<String,Object> request);


    /**
     * 添加
     *
     * @param sysAntIcon 实体
     * @return success/false
     */
    ResponseData<Boolean> add( AntIconVO sysAntIcon);
    /**
     * 删除
     *
     * @param id ID
     * @return success/false
     */
    ResponseData<Boolean> delete( Long id);

    /**
     * 编辑
     *
     * @param sysAntIcon 实体
     * @return success/false
     */
    ResponseData<Boolean> edit( AntIconVO sysAntIcon);
}
