
/**
 * Created by Dima on 23.09.2015.
 */
public class User {
    private  String userAction;
    private int userNumber;
    private int incorrectNumbers=0;


    public int getUserNumber() {
        try {
            userNumber=Integer.parseInt(userAction);
        }catch (NumberFormatException e){
            incorrectNumbers++;
            return -1;
        }
        return userNumber;
    }

    //getters
    public int getIncorrectNumbers() {
        return incorrectNumbers;
    }

    //setters
    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }


    //constructors
    public User() {
    }

}
