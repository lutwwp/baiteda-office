package com.byteluck.baitteda.office.biz.callback;

import com.byteluck.baitteda.office.biz.component.CallbackComponent;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author wwp
 * @date 2022年03月31日 15:38
 */
@Component
public class ForceSaveCallbackStrategy implements CallbackStrategy{

    @Resource
    private CallbackHandler callbackHandler;
    @Resource
    private CallbackComponent callbackComponent;

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
        callbackHandler.
    }
}
