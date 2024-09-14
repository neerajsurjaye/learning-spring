package com.spec.webrest;

import com.spec.webrest.printer.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldController {


    Printer pr;

    public HelloWorldController(Printer pr){
        this.pr = pr;
    }


    @GetMapping("hello")
    public String helloWorld(){

        StringBuilder sb = new StringBuilder();

        sb.append("Hello World\n");
        sb.append(pr.print());

        return sb.toString();
    }

}
