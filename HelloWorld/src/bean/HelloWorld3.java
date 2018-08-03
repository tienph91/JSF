package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld3 {

    public HelloWorld3() {
        System.out.println("tienph: started 345...");
    }

    public String getMessage() {
        return "Hello the world 345!!!";
    }
}
