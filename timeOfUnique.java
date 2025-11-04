public class timeOfUnique {
    public static void main(String[] args) {

        // Get the current time in milliseconds since January 1, 1970
        long uniqueTime = System.currentTimeMillis();

        System.out.println("Time calculated from 1970 to today:");
        System.out.println("Milliseconds: " + uniqueTime);

        // Convert milliseconds to seconds, minutes, hours, and days
        long totalSeconds = uniqueTime / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;
        long totalDays = totalHours / 24;

        // Find remaining hours, minutes, and seconds for the current day
        long seconds = totalSeconds % 60;
        long minutes = totalMinutes % 60;
        long hours = totalHours % 24;

        System.out.println("\nConverted Time:");
        System.out.println("Days   : " + totalDays);
        System.out.println("Hours  : " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
