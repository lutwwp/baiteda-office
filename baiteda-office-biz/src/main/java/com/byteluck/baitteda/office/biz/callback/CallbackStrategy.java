package com.byteluck.baitteda.office.biz.callback;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wwp
 * @date 2022年03月31日 14:44
 */
public interface CallbackStrategy {
    int handle(Track body, String fileName);  // handle the callback
    int getStatus();  // get document status
    void selfRegistration(CallbackHandler callbackHandler);
}
