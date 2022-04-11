package com.byteluck.baitteda.office.web.controller;

import com.byteluck.baitteda.office.biz.onlyoffice.OnlyOfficeService;
import com.byteluck.baitteda.office.common.req.EditRequest;
import com.byteluck.baitteda.office.common.resp.EditResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wwp
 * @date 2022年03月29日 11:31
 */
@RestController
public class OnlyOfficeController {

    @Value("${files.docservice.url.site}")
    private String docserviceSite;

    @Value("${files.docservice.url.api}")
    private String docserviceApiUrl;

    @Resource
    private OnlyOfficeService onlyOfficeService;

    // 新建
    public String create(){

    }
    // 另存为
    public String saveAs(){

    }
    // 转换
    public String convert(){

    }
    // 追踪变化
    public String track(){

    }

    /**
     * 预览编辑
     * @param request
     * @return
     */
    public EditResponse edit(@RequestBody EditRequest request){
        return onlyOfficeService.edit(request);
    }
}
