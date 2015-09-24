import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dima on 23.09.2015.
 */
public class GameProcess {

    //Action
    public static void main(String[] args) throws IOException {
        System.out.println("Start Game");
        User player=new User();
        GameSupport gameSupport =new GameSupport();
        StatisticMonitor statisticMonitor=new StatisticMonitor(player);
        statisticMonitor.setStartRange(0);
        statisticMonitor.setEndRange(100);
        int tempNumber;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        while (true){
            statisticMonitor.setCountAttempt(1);
            player.setUserAction(reader.readLine());
            tempNumber=player.getUserNumber();
            //Generated new number
            if (gameSupport.getRequiredNumber()<0){
                gameSupport.generatedNewNumber();
            }
            //Game process
            if (tempNumber!=-1) {
                if (tempNumber < statisticMonitor.getStartRange() || tempNumber > statisticMonitor.getEndRange()) {
                    statisticMonitor.viewStatistics(0);
                    statisticMonitor.setOutOfRange(1);
                    continue;
                }
                if (tempNumber == gameSupport.getRequiredNumber()) {
                    statisticMonitor.viewAllStatistics();
                    break;
                } else {
                    if (tempNumber < gameSupport.getRequiredNumber()) {
                        statisticMonitor.setStartRange(tempNumber);
                    } else {
                        statisticMonitor.setEndRange(tempNumber);
                    }
                    statisticMonitor.viewStatistics(2);
                }
            }else {
                statisticMonitor.viewStatistics(1);
            }
            statisticMonitor.setArchiveAttempts(tempNumber);
        }
    }
}
