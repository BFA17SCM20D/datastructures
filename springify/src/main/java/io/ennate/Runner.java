package io.ennate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String [] args){
        //System.out.println("Spring Application");//1st method without HelloWorld.java

//        //step 2 code//HelloWorld hello1 = new HelloWorld();
//        HelloWorld hello2 = new HelloWorld();
//        hello1.sayHello();
//        hello2.sayHello();
//        System.out.println(hello1==hello2);
        System.out.println("starting main");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("after the context init");
        HelloWorld hello1 =context.getBean(HelloWorld.class);
        HelloWorld hello2 =context.getBean(HelloWorld.class);
        hello1.sayHello();
        hello2.sayHello();
        context.close();
    }
}
