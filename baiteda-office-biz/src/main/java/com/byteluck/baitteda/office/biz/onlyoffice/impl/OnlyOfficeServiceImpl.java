package com.byteluck.baitteda.office.biz.onlyoffice.impl;

import com.byteluck.baitteda.office.biz.onlyoffice.OnlyOfficeService;
import com.byteluck.baitteda.office.common.model.FileModel;
import com.byteluck.baitteda.office.common.req.EditRequest;
import com.byteluck.baitteda.office.common.resp.EditResponse;

/**
 * @author wwp
 * @date 2022年03月29日 15:00
 */
public class OnlyOfficeServiceImpl implements OnlyOfficeService {

    @Override
    public EditResponse edit(EditRequest request) {
        FileModel fileModel = fileModelBuilder(request);
        return null;
    }
}
