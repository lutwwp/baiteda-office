package com.byteluck.baitteda.office.common.model;

import lombok.Data;

/**
 * @author wwp
 * @date 2022年03月29日 16:54
 */
@Data
public class Document {
    /**
     * 文档权限
     */
    private Permission permissions;  // the permission for the document to be edited and downloaded or not
    /**
     * 文档类型
     */
    private String fileType;  //  the file type for the source viewed or edited document
    /**
     * 文档唯一标识符
     */
    private String key;  // the unique document identifier used by the service to recognize the document
    private String urlUser;  // the absolute URL that will allow the document to be saved onto the user personal computer
    /**
     * 文档名称
     */
    private String title;  // the desired file name for the viewed or edited document which will also be used as file name when the document is downloaded
    /**
     * 文档下载地址
     */
    private String url;  // the absolute URL where the source viewed or edited document is stored
}
