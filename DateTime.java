import java.util.Calendar;
import java.util.GregorianCalendar;
public class DateTime {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;

    private Calendar today = Calendar.getInstance();
    private GregorianCalendar toDay = (GregorianCalendar) today;
    public DateTime(int day, int month, int year, int hour, int minute) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
    }

    public DateTime(int hour, int minute) {
        this.year = toDay.get(Calendar.YEAR);
        this.month = toDay.get(Calendar.MONTH) + 1;
        this.day = toDay.get(Calendar.DAY_OF_MONTH);
        this.hour = hour;
        this.minute = minute;
    }

    public DateTime() {
        this.year = toDay.get(Calendar.YEAR);
        this.month = toDay.get(Calendar.MONTH) + 1;
        this.day = toDay.get(Calendar.DAY_OF_MONTH);
        this.minute = 0;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof DateTime))
            return false;
        DateTime date = (DateTime) obj;
        Calendar thisDate = new GregorianCalendar(this.year, this.month+1, this.day);
        Calendar paramDate = new GregorianCalendar(date.year, date.month, date.day);
        return thisDate.equals(paramDate);
    }

    @Override
    public String toString() {
        String mon=" ";
        switch (month) {
            case 1: mon = "янв"; break;
            case 2: mon = "фев"; break;
            case 3: mon = "мар"; break;
            case 4: mon = "апр"; break;
            case 5: mon = "май"; break;
            case 6: mon = "июн"; break;
            case 7: mon = "июл"; break;
            case 8: mon = "авг"; break;
            case 9: mon = "сен"; break;
            case 10: mon = "окт"; break;
            case 11: mon = "ноя"; break;
            case 12: mon = "дек";
        }
        String dd = (day < 10)? "0" + day : "" + day;
        String hh = (hour < 10)? "0"+hour : "" + hour;
        String mm = (minute < 10)? "0"+minute : "" + minute;
        return String.format("%s %s %d  %s:%s", dd, mon, year, hh,mm);
    }
}

