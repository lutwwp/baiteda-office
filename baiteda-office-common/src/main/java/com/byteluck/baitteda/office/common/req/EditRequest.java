package com.byteluck.baitteda.office.common.req;

import com.byteluck.baitteda.office.common.enums.ActionEnum;
import com.byteluck.baitteda.office.common.enums.LanguageEnum;
import com.byteluck.baitteda.office.common.enums.TypeEnum;
import lombok.Data;

/**
 * @author wwp
 * @date 2022年03月29日 14:57
 */
@Data
public class EditRequest {
    /**
     * 文件Id
     */
    private String fileId;
    /**
     * 操作类型
     */
    private ActionEnum action;
    /**
     * 集成类型 桌面、移动、嵌入
     */
    private TypeEnum type;
    /**
     * 语言
     */
    private LanguageEnum lang;
    /**
     *
     */
    private String  actionLink;
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 租户Id
     */
    private String tenantId;

}
