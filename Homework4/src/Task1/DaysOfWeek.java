package Task1;

public enum DaysOfWeek {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    private DaysOfWeek daysOfWeek;

    public DaysOfWeek setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;

        return(daysOfWeek);

    }


    @Override
    public String toString() {
        return super.toString();
    }


    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }
}

