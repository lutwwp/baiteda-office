package com.byteluck.baitteda.office.common.model;

import com.byteluck.baitteda.office.common.enums.DocumentTypeEnum;
import com.byteluck.baitteda.office.common.enums.TypeEnum;
import lombok.Data;

/**
 * @author wwp
 * @date 2022年03月29日 16:25
 */
@Data
public class FileModel {
    private Document document;  // the parameters pertaining to the document (title, url, file type, etc.)
    private DocumentTypeEnum documentType;  // the document type to be opened
    private EditorConfig editorConfig;  //  the parameters pertaining to the editor interface: opening mode (viewer or editor), interface language, additional buttons, etc.
    private String token;  // the encrypted signature added to the Document Server config
    private TypeEnum type;  // the platform type used to access the document
}
