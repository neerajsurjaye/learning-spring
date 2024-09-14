package com.spec.webrest.config;

import com.spec.webrest.printer.impl.BluePrinter;
import com.spec.webrest.printer.impl.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

//    @Bean
    public RedPrinter printRed(){
        return new RedPrinter();
    }

//    @Bean
    public BluePrinter printBlue(){
        return new BluePrinter();
    }

}
