package exe2;

public class Message {
    private String text;
    private Person person;

    public Message() {
    }

    public Message(String text, Person person) {
        this.setText(text);
        this.setPerson(person);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Message [\ntext=" + text + ", person=" + person + "]";
    }

}
