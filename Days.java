import java.sql.SQLOutput;

public class Days {
    public static void main(String[] args) {
        int seconds = 500042;

        final int secsInaMinute = 60;
        final int secsInaHour = (60 * 60);
        final int secsInaDay = secsInaHour * 24;

        int days = seconds / secsInaDay;
        int hours = seconds % (days * secsInaDay) / secsInaHour;
        int minutes = seconds % ((days * secsInaDay) + (hours * secsInaHour)) / secsInaMinute;
        int secs = seconds % ((days * secsInaDay) + (hours * secsInaHour) + (minutes * secsInaMinute));

        System.out.println(seconds + " seconds contain: ");
        System.out.println(days + " days.");
        System.out.println(hours + " hours.");
        System.out.println(minutes + " minutes.");
        System.out.println(secs + " seconds.");
    }
}