package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld2 {

    public HelloWorld2() {
        System.out.println("tienph: started...123");
    }

    public String getMessage() {
        return "Hello the world 123!!!";
    }

}
