package com.psayol.baeldung;

import com.psayol.baeldung.aop.MessageSentLoggable;
import com.psayol.baeldung.constant.CommunicationModel;

public class EmailCommunicationMode  implements CommunicationMode {

    @Override
    public CommunicationModel getMode() {
        return CommunicationModel.EMAIL;
    }

    @Override
    @MessageSentLoggable
    public boolean sendMessage(String Message) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
