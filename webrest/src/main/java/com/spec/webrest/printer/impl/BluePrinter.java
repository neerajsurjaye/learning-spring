package com.spec.webrest.printer.impl;

import com.spec.webrest.printer.Printer;
import org.springframework.stereotype.Component;

@Component
public class BluePrinter implements Printer {

    @Override
    public String print() {
        return "Blue";
    }
}
