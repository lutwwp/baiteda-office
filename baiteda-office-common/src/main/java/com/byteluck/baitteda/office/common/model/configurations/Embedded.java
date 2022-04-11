package com.byteluck.baitteda.office.common.model.configurations;

import com.byteluck.baitteda.office.common.enums.ToolbarDockedEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author wwp
 * @date 2022年03月29日 17:21
 */
@Component
@Getter
@Setter
public class Embedded {
    private String embedUrl;  // the absolute URL to the document serving as a source file for the document embedded into the web page
    private String saveUrl;  // the absolute URL that will allow the document to be saved onto the user personal computer
    private String shareUrl;  // the absolute URL that will allow other users to share this document
    private ToolbarDockedEnum toolbarDocked;  // the place for the embedded viewer toolbar, can be either top or bottom
}
