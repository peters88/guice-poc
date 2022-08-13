package com.psayol.baeldung.binding;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import com.psayol.baeldung.aop.MessageLogger;
import com.psayol.baeldung.aop.MessageSentLoggable;

public class AOPModule  extends AbstractModule {

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(),
                Matchers.annotatedWith(MessageSentLoggable.class),
                new MessageLogger()
        );
    }
}
