package exe2;

public class Testa2 {
    public static void main(String[] args) {
        Person objPer = new Person("Enzo", "@enzoJR");

        Message objMsg = new Message("Hello, World", objPer);

        Forum objFor = new Forum("Forum fatec", "www.forumfatec.edu.br");
        objFor.addMessage(objMsg);

        System.out.println(objFor.toString());

    }
}
