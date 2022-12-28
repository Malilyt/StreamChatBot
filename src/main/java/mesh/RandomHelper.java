package mesh;

import java.util.List;
import java.util.Random;


public class RandomHelper {
    Random randomizer = new Random();

    public int randomNumbers(int min, int max){
        int num = (int) ((Math.random()*((max-min)+1))+min);
        return num;

    }

    public String randomList(List a){

        String out = (String) a.get(randomizer.nextInt(a.size()));
        return out;
    }
}
