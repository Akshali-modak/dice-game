package dicegame;

import java.util.Random;

@org.springframework.stereotype.Service
public class DiceService {

     private static final int[] diceSide = {4,6,8,10,12};
     int sum = 0;

    public boolean isDiceSupported(int numsSides) {
        for (int diceSupported : diceSide){
            if (numsSides == diceSupported){
                return true;
            }
        }
        return false;
    }
    public int rollDice(int number, int side) {
        for(int i = 0; i<number; i++){
            Random random = new Random();
            int roll = random.nextInt(side);
            sum += roll;
        }
        return sum;
    }
}
