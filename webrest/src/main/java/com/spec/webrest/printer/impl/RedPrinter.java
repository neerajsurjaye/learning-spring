package com.spec.webrest.printer.impl;

import com.spec.webrest.printer.Printer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
public class RedPrinter implements Printer {

    @Override
    public String print() {
        return "RED";
    }
}
