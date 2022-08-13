package com.psayol.helloworld;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Main {
    @Inject
    private HelloWorldService service;//hello service

    public static void main(String[] args) {

        Main main = new Main();

        HelloWorldModule module = new HelloWorldModule();
        Injector injector = Guice.createInjector(module);
        injector.injectMembers(main);//injects the implementation of the service

        main.testGuice();
    }

    public void testGuice()
    {
        service.sayHello();//usage of the service
    }
}
