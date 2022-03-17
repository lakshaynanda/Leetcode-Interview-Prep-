class Solution {
    public int dayOfYear(String date) {
        int monthsDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapYear = false;
        int countdays = 0;
        
        String[] arraydate = date.split("-");
        
        
        int year = Integer.parseInt(arraydate[0]);
        int month = Integer.parseInt(arraydate[1]);
        int day = Integer.parseInt(arraydate[2]);
        
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leapYear = true;
        }
        for(int i = 0; i < month - 1; i++) {
            countdays += monthsDays[i];
        }
        countdays += day;
        
        if (leapYear && month > 2) {
            countdays++;
        }
        return countdays;
    }
}