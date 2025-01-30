class Mydate{
    int day;
    int month;
    int year;
    Mydate(){
        day = 1;
        month = 1;
        year = 2000;
    }
    Mydate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    int getNumberOfDaysInMonth(int year, int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }    
    Mydate(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        int year = 1970;
        while (totalDays >= 365){
            if (isLeapYear(year)){
                totalDays -= 366;
            } else {
                totalDays -= 365;
            }
            year++;
        }
        int month = 1;
        while (totalDays > 0){
            totalDays -= getNumberOfDaysInMonth(year, month);
            month++;
        }
        month--;
        totalDays += getNumberOfDaysInMonth(year, month);
        int day = (int)totalDays;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    void printDate(){
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println(day + "/" + monthNames[month - 1] + "/" + year);
    } 
    public void setDate(long elapsedTime){
        long totalSeconds = elapsedTime / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        int year = 1970;
        while (totalDays >= 365){
            if (isLeapYear(year)){
                totalDays -= 366;
            } else {
                totalDays -= 365;
            }
            year++;
        }
        int month = 1;
        while (totalDays > 0){
            totalDays -= getNumberOfDaysInMonth(year, month);
            month++;
        }
        month--;
        totalDays += getNumberOfDaysInMonth(year, month);
        int day = (int)totalDays;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class Date{
    public static void main(String[] arg){
        Mydate date1 = new Mydate();
        Mydate date2 = new Mydate(25, 12, 2020);
        Mydate date3 = new Mydate(34355555133101L);
        date1.printDate();
        date2.printDate();
        date3.printDate();
        System.out.println(date1.getDay());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        date1.setDate(86400000);
        date1.printDate();



    }
}