package io.ennate;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorld {
    public HelloWorld(){
        System.out.println("Inside the bean factory method");
    }
    public void sayHello(){
        System.out.println("Spring Application");
    }
}
