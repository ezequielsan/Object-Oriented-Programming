import java.time.DayOfWeek;
import java.util.*;

import java.util.Calendar;
import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.LONG;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import java.util.Locale;

public class Months {
  public static void main(String[] args) {
    // getting the instance of calendar class using getinstance() method.
    Calendar cal2 = Calendar.getInstance(Locale.US);

    // for loop starting from Sunday and running till Saturday
    for (int i = SUNDAY; i <= SATURDAY; i++) {
      cal1.set(DAY_OF_WEEK, i);

      String c1 = cal1.getDisplayName(DAY_OF_WEEK, LONG, Locale.US);
      System.out.println(c1);
    }
  }
}
