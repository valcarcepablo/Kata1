package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Jose ", new Date(88,5,2));
        System.out.println(person.getName()+"tiene " + person.getAge());
    }
    
}
