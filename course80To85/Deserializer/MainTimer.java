package Deserializer;
// project name: Timer Task with the help of Bro Code YouTube channel
/*
    Timer = a facility for threads to schedule tasks for future execution in a background thread
    TimerTask = A task that can be scheduled for one-time or repeated execution by a Timer
 */

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainTimer {

    public static void main(String[] args) {
        
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;

            @Override
            public void run() {
                
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else{
                    System.out.println("It's time to start your scheduled meeting now.");
                    timer.cancel();
                }
            }
            
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2024);
        date.set(Calendar.MONTH, Calendar.JANUARY);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 9);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);


        //timer.schedule(task, 3000);
        //timer.schedule(task,date.getTime());
        //timer.scheduleAtFixedRate(task, 0, 1000);
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);


    }
    
}
