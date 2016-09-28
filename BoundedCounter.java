/**
 * This is the Bounded Counter class. This class represents a counter which is used to create a clock.
 * Created by padcf on 28/09/16.
 */
public class BoundedCounter {


    //declare and initialise two int variables: value and upperLimit
    private int value = 0, upperLimit = 0;


    //class constructor which takes an int parameter, upperLimit
    public BoundedCounter(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }


    //a method which increases the value by 1 if the value is greater than or equal to the upper limit
    public void next()
    {
        if(value >= upperLimit)
        {
            value = 0;
        }

        else
        {
            value++;
        }
    }

    //add a 0 if the value is less than 10

    public String toString()
    {
        if(value < 10)
        {
            return("0" + value);
        }
        else
        {
            return ("" + value);
        }

    }

    //getter method for value

    public int getValue()
    {
        return value;
    }

    //setter method for Value...not used

    public void setValue(int value)
    {
        if(value >= 0 && value <= upperLimit)
        {
            this.value = value;
        }


    }
}//end of class
