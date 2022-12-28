package mesh.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum HappySmile {

    HAPPY_SMILE_1(":-D"),
    HAPPY_SMILE_2("^-^"),
    HAPPY_SMILE_3(":-)"),
    HAPPY_SMILE_4(" "),
    HAPPY_SMILE_5(")"),
    HAPPY_SMILE_6("))");
//    HAPPY_SMILE_7(":winking_face:"), // подмигивающий
//    HAPPY_SMILE_8(":upside_down_face:"); // Лицо вверх ногами
    //HAPPY_SMILE_9("\uD83D\uDCA9"), // какашка
    //HAPPY_SMILE_10("\uD83D\uDE08"), // улыбающийся чёрт
    //HAPPY_SMILE_11("\uD83D\uDD25"), // огонь
    //HAPPY_SMILE_12("\uD83D\uDE0E"); // смайлик в очках



    String out;

    private static final List<HappySmile> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static HappySmile randomHappySmile() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    HappySmile(){

    }

    HappySmile(String out){
        this.out = out;
    }

    public String getOut(){

        return out;
    }

}
