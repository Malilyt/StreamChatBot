package mesh.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Game {

    GAME_1(" CS GO"),
    GAME_2(" NFS"),
    GAME_3(" Кобру"),
    GAME_4(" Доту"),
    GAME_5(" Танки"),
    GAME_6(" WT");

    String out;
    private static final List<Game> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Game randomGame() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    Game(){

    }

    Game(String out){
        this.out = out;
    }

    public String getOut(){

        return out;
    }
}
