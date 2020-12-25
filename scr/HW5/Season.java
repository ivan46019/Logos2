package com.LogosBuh;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL;
    private String _winter = "JANUARY  FEBRUARY MARCH";
    private String _spring = "APRIL MAY JUNE";
    private String _summer = "JULY AUGUST SEPTEMBER";
    private String _fall = " OCTOBER NOVEMBER DECEMBER";
    public String get_winter() {
        return _winter;
    }

    public String get_spring() {
        return _spring;
    }

    public String get_summer() {
        return _summer;
    }

    public String get_fall() {
        return _fall;
    }

    Season(String _winter, String _spring, String _summer, String _fall) {
        this._winter = _winter;
        this._spring = _spring;
        this._summer = _summer;
        this._fall = _fall;

    }

}




