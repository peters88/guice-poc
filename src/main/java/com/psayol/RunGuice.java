package com.psayol;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.psayol.baeldung.Communication;
import com.psayol.baeldung.binding.AOPModule;
import com.psayol.baeldung.modules.BasicModule;

import java.util.Scanner;

public class RunGuice {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule(), new AOPModule());
        Communication comms = injector.getInstance(Communication.class);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.exit(0);
            } else {
                comms.sendMessage(input);
            }

        }

    }
}
