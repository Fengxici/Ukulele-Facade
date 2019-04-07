package timing.ukulele.facade.syslog.model.view;

import lombok.Data;
import timing.ukulele.facade.syslog.model.persistent.SysLog;

import java.io.Serializable;

/**
 * 日志记录VO
 */
@Data
public class LogVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private SysLog sysLog;
    private String username;
}
