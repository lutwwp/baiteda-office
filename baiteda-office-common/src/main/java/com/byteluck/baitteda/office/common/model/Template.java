package com.byteluck.baitteda.office.common.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author wwp
 * @date 2022年03月29日 17:28
 */
@Getter
@Setter
@AllArgsConstructor
public class Template {
    private String image;  // the absolute URL to the image for template
    private String title;  // the template title that will be displayed in the <b>Create New...</b> menu option
    private String url;  // the absolute URL to the document where it will be created and available after creation
}
