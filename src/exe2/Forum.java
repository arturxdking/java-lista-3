package exe2;

import java.util.ArrayList;


public class Forum {
    private String name;
    private String url;
    private ArrayList<Message> message;

    public Forum() {
        this.message = new ArrayList<Message>();
    }

    public Forum(String name, String url) {
        this.name = name;
        this.url = url;
        message = new ArrayList<Message>();
    }

    public Forum(String name, String url, ArrayList<Message> message) {
        this.name = name;
        this.url = url;
        this.message = message;
    }

        // Adiciona um carTiem no vetor 
    public void addMessage(Message message){
        this.message.add(message);
    }

    // Remove um item do carrinho
    public boolean removeCarItem(Message message){
        return this.message.remove(message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getMessage() {
        return message;
    }

    public void setMessage(ArrayList<Message> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Forum [name=" + name + ", url=" + url + ", message=" + message + "]";
    }

}
