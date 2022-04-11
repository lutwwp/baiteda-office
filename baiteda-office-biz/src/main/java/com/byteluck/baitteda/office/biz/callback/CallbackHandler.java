package com.byteluck.baitteda.office.biz.callback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wwp
 * @date 2022年03月31日 15:01
 */
@Service
public class CallbackHandler {

    private Logger logger = LoggerFactory.getLogger(CallbackHandler.class);

    private Map<Integer, CallbackStrategy> callbackHandlers = new HashMap<>();

    public void register(int code, Callback callbackStrategy){  // register a callback handler
        callbackHandlers.put(code, callbackStrategy);
    }

    public int handle(Track body, String fileName){  // handle a callback
        CallbackStrategy callbackStrategy = callbackHandlers.get(body.getStatus());
        if (callbackStrategy == null){
            logger.warn("Callback status "+body.getStatus()+" is not supported yet");
            return 0;
        }

        int result = callbackStrategy.handle(body, fileName);
        return result;
    }
}
