package com.psayol.baeldung;

import com.google.inject.Inject;
import com.psayol.baeldung.aop.MessageSentLoggable;
import com.psayol.baeldung.constant.CommunicationModel;

import java.util.logging.Logger;

public class IMCommunicationMode  implements CommunicationMode {

    @Inject
    private Logger logger;

    @Override
    public CommunicationModel getMode() {
        return CommunicationModel.IM;
    }

    @Override
    @MessageSentLoggable
    public boolean sendMessage(String message) {
        logger.info("IM Message Sent");
        return true;
    }
}
