class Solution {
    int[] daysPerMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(countDays(date1)- countDays(date2));
    }
    public int countDays(String date) {
        
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        
        int yearsFrom1971 = year - 1971;
    
        boolean isLeap = (year % 4 == 0 &&(year % 100 != 0 || year % 400 == 0));
        
        if(month > 2 && isLeap){
            day++;
        }
        for(int m = 1; m < month;m++)
            day += daysPerMonth[m-1];
        
        return day + yearsFrom1971 * 365 + countLeapYears(year);
    }
    public int countLeapYears(int year) {
        int count = 0;
        for(int y = 1971; y < year; y++) {
            if(y %4 == 0 &&(y % 100 != 0 || y % 400 == 0)){
                count++;
            }
        }
        return count;
    }
}