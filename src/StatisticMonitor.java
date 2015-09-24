import java.util.ArrayList;

/**
 * Created by Dima on 23.09.2015.
 */
public class StatisticMonitor {
    private User user;
    private int countAttempt;
    private int outOfRange=0;
    private int startRange;
    private int endRange;
    private ArrayList<Integer> archiveAttempts=new ArrayList<>();

    //setters
    public void setCountAttempt(int countAttempt) {
        this.countAttempt = this.countAttempt+countAttempt;
    }


    public void setOutOfRange(int outOfRange) {
        this.outOfRange = this.outOfRange+outOfRange;
    }

    public void setStartRange(int startRange) {
        this.startRange = startRange;
    }

    public void setEndRange(int endRange) {
        this.endRange = endRange;
    }
    public void setArchiveAttempts(int x) {
        if (x!=-1)
        archiveAttempts.add(x);
    }

    //getters
    public int getStartRange() {
        return startRange;
    }

    public int getEndRange() {
        return endRange;
    }

    //constructors
    public StatisticMonitor(User user) {
        this.user = user;
    }

    //methods
    public void viewStatistics(int key){
        System.out.print("Previous attempts");
        for (Integer attempt:archiveAttempts){
            System.out.print(" "+attempt);
        }
        System.out.println();
        System.out.println("You range"+" "+startRange+" - "+endRange);
        if (key==0) {
            System.out.println("You out of range");
        }
        if (key==1){
            System.out.println("Incorrect number type");
        }
        if (key==2){
            System.out.println("You write wrong number");
        }
    }
    public void viewAllStatistics(){
        System.out.println("This number" + " " + user.getUserNumber() + "!!!!" + "\n" + "Congratulations!!! You won!!!");
        System.out.println("You statistic");
        System.out.println("Amount attempts:" + " " + countAttempt);
        System.out.println("Incorrect numbers:"+" "+user.getIncorrectNumbers());
        System.out.println("Out of range:"+" "+outOfRange);
        System.out.println("Game Over");
    }
}
