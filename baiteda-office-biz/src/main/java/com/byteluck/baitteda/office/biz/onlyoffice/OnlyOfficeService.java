package com.byteluck.baitteda.office.biz.onlyoffice;

import com.byteluck.baitteda.office.common.req.EditRequest;
import com.byteluck.baitteda.office.common.resp.EditResponse;

/**
 * @author wwp
 * @date 2022年03月29日 15:00
 */
public interface OnlyOfficeService {
    EditResponse edit(EditRequest request);
}
