package mesh.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Hello {

    HELLO_1("Привет"),
    HELLO_2("Дратути"),
    HELLO_3("Приветствую"),
    HELLO_4("Здорова");

    String out;


    private static final List<Hello> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Hello randomHello() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }


    Hello(){

    }

    Hello(String out){
        this.out = out;
    }

    public String getOut(){

        return out;
    }



}


