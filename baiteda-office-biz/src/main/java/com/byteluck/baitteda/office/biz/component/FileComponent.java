package com.byteluck.baitteda.office.biz.component;

import com.byteluck.baitteda.office.common.enums.DocumentTypeEnum;

import java.util.List;

/**
 * @author wwp
 * @date 2022年04月11日 11:10
 */
public interface FileComponent {

    /**
     * get the document type
     *
     * @param fileName
     * @return
     */
    DocumentTypeEnum getDocumentTypeEnum(String fileName);

    /**
     * get file extension from URL
     *
     * @param fileName
     * @return
     */
    String getFileExtension(String fileName);

    /**
     * get an editor internal extension
     *
     * @param type
     * @return
     */
    String getInternalExtension(DocumentTypeEnum type);

    /**
     * get all the supported file extensions
     *
     * @return
     */
    List<String> getFileExts();

    /**
     * get file extensions that can be viewed
     *
     * @return
     */
    List<String> getViewedExts();

    /**
     * get file extensions that can be edited
     *
     * @return
     */
    List<String> getEditedExts();

    /**
     * get file extensions that can be converted
     *
     * @return
     */
    List<String> getConvertExts();

    /**
     * get maximum file size
     *
     * @return
     */
    long getMaxFileSize();
}
