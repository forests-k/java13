import java.time.LocalDate;
import java.time.DayOfWeek;

public class Tester_01 {
    public static void main(String... args) {
        LocalDate today = LocalDate.now();

        System.out.println(beforeJava11(today.getDayOfWeek()));
        System.out.println(java12(today.getDayOfWeek()));
        System.out.println(java13(today.getDayOfWeek()));
    }

    private static int beforeJava11(DayOfWeek today){
        int numLetters;
        switch (today) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                numLetters = 8;
                break;
            case WEDNESDAY:
                numLetters = 9;
                break;
            default:
                throw new IllegalStateException("Wat: " + today);
        }
        return numLetters;
    }

    private static int java12(DayOfWeek today) {
        int numLetters =  switch (today) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("Wat: " + today);
        };
        return numLetters;
    }

        private static int java13(DayOfWeek today) {
        int numLetters =  switch (today) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            default                     -> {
                int k = today.toString().length();
                yield k;
            }
        };
        return numLetters;
    }
}