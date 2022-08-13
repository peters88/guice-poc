package com.psayol.baeldung;

import com.psayol.baeldung.constant.CommunicationModel;

public interface CommunicationMode {

    public CommunicationModel getMode();

    public boolean sendMessage(String message);

}
