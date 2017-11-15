package corejava;

import java.util.EnumSet;

/**
 * Created by Gowtham on 14-11-2017.
 */
// An Enumeration type
// All enums implicitly extend java.lang.Enum, and hence cannot extend anything else.
@Detail(
        author = "Gowtham",
        date = "14-11-2017",
        currentRevision = 2,
        lastModified = "15-11-2017",
        lastModifiedBy = "Gowtham",
        reviewers = {"Gowtham"}
)
public enum Day {

    // Each enum constant is declared with values for the "dayOfWeek" and "feeling" parameters.
    // These values are passed to the constructor when the constant is created (just like object creation).
    // Java requires that the constants be defined first, prior to any fields or methods.
    // Also, when there are fields and methods, the list of enum constants must end with a semicolon.
    MONDAY(1, "Not so good!"),
    TUESDAY(2, "Ok!"),
    WEDNESDAY(3, "Mid week already!"),
    THURSDAY(4, "1 more day!"),
    FRIDAY(5, "Yay, friday finally!"),
    SATURDAY(6, "Weekend starts!"),
    SUNDAY(7, "Weekend ends!");

    // Enum property variables are generally declared private.
    private int dayOfWeek;
    private String feeling;

    // The constructor for an enum type must be package-private or private access.
    // It automatically creates the constants that are defined at the beginning of the enum body.
    // We cannot invoke an enum constructor ourselves.
    Day(int dayOfWeek, String feeling) {
        this.dayOfWeek = dayOfWeek;
        this.feeling = feeling;
    }

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + "\t" + day.getDayOfWeek() + "\t" + day.getFeeling());
        }

        System.out.println();

        for (Day day : EnumSet.range(Day.MONDAY, Day.FRIDAY)) {
            System.out.println(day + "\t" + day.getDayOfWeek() + "\t" + day.getFeeling());
        }
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public String getFeeling() {
        return feeling;
    }

}
