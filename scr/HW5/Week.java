package com.LogosBuh;

public enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    private String dayName;


    Week(String dayName) {
        this.dayName = dayName;

    }

        public String getDayName() {
        return dayName;
    }
}
