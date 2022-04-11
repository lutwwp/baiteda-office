package com.byteluck.baitteda.office.biz.component;

import com.byteluck.baitteda.office.common.config.SupportDocument;
import com.byteluck.baitteda.office.common.enums.DocumentTypeEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wwp
 * @date 2022年04月11日 11:10
 */
@Component
public class DefaultFileComponent implements FileComponent {

    @Value("${filesize-max}")
    private String filesizeMax;

    @Value("${files.docservice.viewed-docs}")
    private String docserviceViewedDocs;

    @Value("${files.docservice.edited-docs}")
    private String docserviceEditedDocs;

    @Value("${files.docservice.convert-docs}")
    private String docserviceConvertDocs;


    /**
     * 根据文件名获取文档类型
     *
     * @param fileName
     * @return
     */
    @Override
    public DocumentTypeEnum getDocumentTypeEnum(String fileName) {
        String ext = getFileExtension(fileName).toLowerCase();
        if (SupportDocument.EXTS_WORD.contains(ext))
            return DocumentTypeEnum.word;
        if (SupportDocument.EXTS_CELL.contains(ext))
            return DocumentTypeEnum.cell;
        if (SupportDocument.EXTS_SLIDE.contains(ext))
            return DocumentTypeEnum.slide;
        return DocumentTypeEnum.word;
    }

    /**
     * 通过文件名获取文件后缀
     * @param fileName
     * @return
     */
    @Override
    public String getFileExtension(String fileName)
    {
        if (fileName == null) return null;
        String fileExt = fileName.substring(fileName.lastIndexOf("."));
        return fileExt.toLowerCase();
    }

    /**
     * 获得一个编辑器的内部扩展
     *
     * @param type
     * @return
     */
    @Override
    public String getInternalExtension(DocumentTypeEnum type) {
        // .docx for word file type
        if (type.equals(DocumentTypeEnum.word))
            return ".docx";

        // .xlsx for cell file type
        if (type.equals(DocumentTypeEnum.cell))
            return ".xlsx";

        // .pptx for slide file type
        if (type.equals(DocumentTypeEnum.slide))
            return ".pptx";

        // the default file type is .docx
        return ".docx";
    }


    /**
     * 获取支持预览后缀类型
     *
     * @return
     */
    @Override
    public List<String> getViewedExts() {
        return Arrays.asList(docserviceViewedDocs.split("\\|"));
    }

    /**
     * 获取支持编辑的后缀类型
     *
     * @return
     */
    @Override
    public List<String> getEditedExts() {
        return Arrays.asList(docserviceEditedDocs.split("\\|"));
    }

    /**
     * 获取可被转换的后缀类型
     *
     * @return
     */
    @Override
    public List<String> getConvertExts() {
        return Arrays.asList(docserviceConvertDocs.split("\\|"));
    }

    /**
     * 获取所有支持的文件后缀类型
     *
     * @return
     */
    @Override
    public List<String> getFileExts() {
        List<String> res = new ArrayList<>();
        res.addAll(getViewedExts());
        res.addAll(getEditedExts());
        res.addAll(getConvertExts());
        return res;
    }

    /**
     * 获取最大文档尺寸，默认5M
     *
     * @return
     */
    @Override
    public long getMaxFileSize() {
        long size = Long.parseLong(filesizeMax);
        return size > 0 ? size : 5 * 1024 * 1024;
    }
}
