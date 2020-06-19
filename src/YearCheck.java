public class YearCheck {

    YearCheck() {

    }

    boolean isLeap(int year) {
        boolean firstCondition = year % 4 == 0 && year % 100 != 0;
        boolean secondCondition = year % 400 == 0;
        return firstCondition || secondCondition;
    }
}
