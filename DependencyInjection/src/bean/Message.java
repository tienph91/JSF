package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "message", eager = true)
public class Message {

    private String message = "HelloWorld!!!";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
