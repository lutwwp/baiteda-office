package com.byteluck.baitteda.office.common.config;

import java.util.Arrays;
import java.util.List;

/**
 * @author wwp
 * @date 2022年04月11日 11:51
 */
public class SupportDocument {

    /**
     * 支持的文档类型
     */
    public static final List<String> EXTS_WORD = Arrays.asList(
            ".doc", ".docx", ".docm",
            ".dot", ".dotx", ".dotm",
            ".odt", ".fodt", ".ott", ".rtf", ".txt",
            ".html", ".htm", ".mht", ".xml",
            ".pdf", ".djvu", ".fb2", ".epub", ".xps", ".oform");

    /**
     * 支持的的工作表类型
     */
    public static final List<String> EXTS_CELL = Arrays.asList(
            ".xls", ".xlsx", ".xlsm",
            ".xlt", ".xltx", ".xltm",
            ".ods", ".fods", ".ots", ".csv");

    /**
     * 支持的幻灯片类型
     */
    public static final List<String> EXTS_SLIDE = Arrays.asList(
            ".pps", ".ppsx", ".ppsm",
            ".ppt", ".pptx", ".pptm",
            ".pot", ".potx", ".potm",
            ".odp", ".fodp", ".otp");
}
