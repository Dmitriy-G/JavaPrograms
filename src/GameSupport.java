import java.util.Random;

/**
 * Created by Dima on 23.09.2015.
 */
public class GameSupport {
    private int requiredNumber=-1;

    //setters
    public void setRequiredNumber(int requiredNumber) {
        this.requiredNumber = requiredNumber;
    }

    //getters
    public int getRequiredNumber() {
        return requiredNumber;
    }

    //constructors
    public GameSupport(){

    }

    //methods
    public void generatedNewNumber(){
        Random rnd = new Random(System.currentTimeMillis());
        setRequiredNumber(0 + rnd.nextInt(100 - 0 + 1));
    }
}
