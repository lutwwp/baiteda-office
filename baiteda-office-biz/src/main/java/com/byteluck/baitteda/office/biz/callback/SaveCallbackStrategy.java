package com.byteluck.baitteda.office.biz.callback;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wwp
 * @date 2022年03月31日 15:37
 */
@Component
public class SaveCallbackStrategy implements CallbackStrategy{

    @Resource
    private CallbackHandler callbackHandler;

    @Override
    public int handle(Track body, String fileName) {
        return 0;
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public void selfRegistration(CallbackHandler callbackHandler) {
        callbackHandler.re
    }
}
