package creational_patterns.factory_method;

import java.util.Calendar;

/**
 * Created by imKrish on 11/10/16.
 */
public class FactoryEverydayDemo {

    public static void main(String args[]) {

        Calendar cal = Calendar.getInstance(); // return java.util.GregorianCalendar

        Calendar cal2 = Calendar.getInstance(); // If inserting an argument you will get a different type of calendar

        System.out.println(cal);

        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}
