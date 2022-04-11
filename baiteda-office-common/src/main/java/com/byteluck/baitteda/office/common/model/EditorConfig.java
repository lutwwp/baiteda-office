package com.byteluck.baitteda.office.common.model;

import com.byteluck.baitteda.office.common.enums.LanguageEnum;
import com.byteluck.baitteda.office.common.enums.ModeEnum;
import com.byteluck.baitteda.office.common.model.configurations.Customization;
import com.byteluck.baitteda.office.common.model.configurations.Embedded;

import java.util.HashMap;
import java.util.List;

/**
 * @author wwp
 * @date 2022年03月29日 16:56
 */
public class EditorConfig {
    private HashMap<String, Object> actionLink = null;  // the data which contains the information about the action in the document that will be scrolled to
    private String callbackUrl;  // the absolute URL to the document storage service
    private String createUrl;  // the absolute URL of the document where it will be created and available after creation
    private Customization customization;  // the parameters which allow to customize the editor interface so that it looked like your other products (if there are any) and change the presence or absence of the additional buttons, links, change logos and editor owner details
    private Embedded embedded;  // the parameters which allow to change the settings which define the behavior of the buttons in the embedded mode
    private LanguageEnum lang;  // the editor interface language
    private ModeEnum mode;  // the editor opening mode
    private User user;  // the user currently viewing or editing the document
    // 新建文件时 模板
    private List<Template> templates;  // the presence or absence of the templates in the <b>Create New...</b> menu option
}
