package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private int id;
    private String name;
    private int age;
    private Gender sex;

    public Client(String name, Integer age, Gender sex){
        id = ClientIDGenerator.generateID();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Client(){
        id = ClientIDGenerator.generateID();
    }

    public static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateID(){
            counter++;
            return counter;
        }
    }

}
