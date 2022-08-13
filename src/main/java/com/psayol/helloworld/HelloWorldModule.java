package com.psayol.helloworld;

import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(HelloWorldService.class).to(HelloWorldServiceImpl.class);
    }
}
