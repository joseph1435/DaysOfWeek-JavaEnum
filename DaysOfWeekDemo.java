// Enum to represent the days of the week
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Superclass
class WeekDays {
    protected Day[] days;

    // Constructor
    public WeekDays() {
        days = Day.values(); // gets all enum constants
    }

    // Method to display all days
    public void showAllDays() {
        System.out.println("All Days of the Week:");
        for (Day day : days) {
            System.out.println(day);
        }
    }
}

// Subclass
class DisplayDays extends WeekDays {

    // Method to display specific message
    public void displayCustomMessage() {
        System.out.println("\nMessage for Each Day:");
        for (Day day : days) {
            switch(day) {
                case SUNDAY -> System.out.println(day + " - Rest and relax!");
                case MONDAY -> System.out.println(day + " - Start strong!");
                case TUESDAY -> System.out.println(day + " - Keep pushing.");
                case WEDNESDAY -> System.out.println(day + " - Midweek hustle.");
                case THURSDAY -> System.out.println(day + " - Almost there!");
                case FRIDAY -> System.out.println(day + " - Finish strong.");
                case SATURDAY -> System.out.println(day + " - Time for fun!");
            }
        }
    }
}

// Main class to run the program
public class DaysOfWeekDemo {
    public static void main(String[] args) {
        DisplayDays display = new DisplayDays();
        display.showAllDays();           // Call superclass method
        display.displayCustomMessage();  // Call subclass method
    }
}
