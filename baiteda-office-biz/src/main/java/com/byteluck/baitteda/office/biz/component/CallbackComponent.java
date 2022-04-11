package com.byteluck.baitteda.office.biz.component;

/**
 * @author wwp
 * @date 2022年04月01日 10:47
 */
public interface CallbackComponent {
    void processSave(Track body, String fileName);  // file saving process
    void commandRequest(String method, String key);  // create a command request
    void processForceSave(Track body, String fileName);  // file force saving process
}
