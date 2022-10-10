package part2;

import java.io.IOException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.concurrent.TimeUnit;

public class ProcessPart2 {
    String name;

    public  ProcessPart2(String name){
        this.name = name;
    }
    public  void run(){
        ProcessBuilder processCreator = new ProcessBuilder("date", "sleep 0.5", "date");
        try {
            System.out.println("Starting process "
                    + this.name
                    + " at: "
                    + getCurrentTime("%tl:%tM"));
            Process pro = processCreator.start();
            boolean hasEnded = pro.waitFor(500, TimeUnit.MILLISECONDS);

            if (hasEnded){
                System.out.println("Ending process "
                    + this.name
                    + " at: "
                    + getCurrentTime("%tl:%tM"));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private  String getCurrentTime (String formatDateTimeString) {
        Calendar calendar = Calendar.getInstance();
        Formatter format = new Formatter().format(formatDateTimeString, calendar, calendar);
        return format.toString();
        }
}
