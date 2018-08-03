package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

    @ManagedProperty(value = "#{message}")
    private Message messageBean;

    private String message;

    public Message getMessageBean() {
        return messageBean;
    }

    public void setMessageBean(Message messageBean) {
        this.messageBean = messageBean;
    }

    public String getMessage() {
        if (messageBean != null) {
            message = messageBean.getMessage();
        }

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
