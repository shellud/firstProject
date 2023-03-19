package com.ua.robot.homework17;

public enum DaysOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int index;

    DaysOfWeek(int index) {
        this.index = index;
    }

    public static String getDay(int i) {
        String dayName = "";
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            if (daysOfWeek.index == i) {
                dayName = daysOfWeek.name();
            }
        }
        return dayName;
    }
}
