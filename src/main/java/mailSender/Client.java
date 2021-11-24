package mailSender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private String name;
    private Gender sex;
    private int id;
    private String age;
    private String email;

    public Client(String name, String age, Gender sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.id = IDGenerator.generateId();
    }
    private static class IDGenerator {
        private static int counter = -1;
        public static int generateId() {
            counter ++;
            return counter;
        }
    }
}
