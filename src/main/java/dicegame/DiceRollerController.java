package dicegame;


public class DiceRollerController {
    private DiceService service;

    public DiceRollerController(DiceService service) {
        this.service = service;
    }


    public int rollDice(int number , int side){
        return service.rollDice(number,side);
    }

    public boolean isDiceSupported(int numsSides){
        return service.isDiceSupported(numsSides);
    }
}
