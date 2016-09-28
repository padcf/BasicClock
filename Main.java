/**
 * This is a basic clock that runs in the terminal.
 * Created by padcf and based on an assignment from mooc.fi on 28/09/16. *
 */


public class Main {

    public static void main(String[] args) throws Exception {

        //create three BoundedCounter objects, to count hours, minutes and seconds

        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);


        //use a while loop to keep the clock ticking over. Use Thread.sleep to create a second pause between each value increase


        while(true)
        {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);

            seconds.next();

            if(seconds.getValue() == 0)
            {
                minutes.next();
            }

            if(minutes.getValue() == 0 && seconds.getValue() == 0)
            {
                hours.next();
            }

        }//end of while loop






    }//end of main
}//end of program
