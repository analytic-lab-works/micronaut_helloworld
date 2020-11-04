package hello_world.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get("/{name*}")
    public String helloWorld(String name) {
        return "Hello " + name;
    }
}
