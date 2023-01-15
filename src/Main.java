public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test data");
        System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }

    public static class NumberOfDaysInMonth
    {
        public static boolean isLeapYear(int year)
        {
            if(year < 1 || year > 9999) return false;
            else
            {
                if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
            }
            return false;
        }

        public static int getDaysInMonth(int month, int year)
        {
            int[] aDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if((month < 1 || month > 12) || (year < 1 || year > 9999)) return -1;
            else
            {
                if(isLeapYear(year)) aDaysInMonth[1] = 29;
                return aDaysInMonth[month -1];
            }
        }
    }
}