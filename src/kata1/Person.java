
package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;   
    private final int MS_PER_SEC = 1000;
    private final int SEC_PER_MIN = 60;
    private final int MIN_PER_HOUR = 60;
    private final int HOUR_PER_DAY = 24;     
    private final double DAY_PER_YEAR = 365;       

    public Person (String name,Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public String getName(){
        return name;
    }
    
    public Date getBirthday(){
        return birthday;
    }
    
    public int getAge(){
        long ms = new Date().getTime() - birthday.getTime();
        return (int) (ms/toYear());
    }
    private double toYear(){
        return MS_PER_SEC*
                SEC_PER_MIN*
                MIN_PER_HOUR*
                HOUR_PER_DAY*
                DAY_PER_YEAR;
    }
}
