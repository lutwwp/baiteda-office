package com.byteluck.baitteda.office.biz.callback;

import com.byteluck.baitteda.office.biz.component.CallbackComponent;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author wwp
 * @date 2022年03月31日 15:15
 */
@Component
public class EditCallbackStrategy implements CallbackStrategy{

    @Resource
    private CallbackHandler callbackHandler;
    @Resource
    private CallbackComponent callbackComponent;

    private Ca
    @Override
    public int handle(Track body, String fileName) {
        callbackComponent.commandRequest();
        return 0;
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @PostConstruct
    @Override
    public void selfRegistration(CallbackHandler callbackHandler) {
        callbackHandler.register(getStatus(),this);
    }
}
