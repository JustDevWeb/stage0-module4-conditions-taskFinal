package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap;
        if(year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    isLeap = true;
                } else if (year % 100 != 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            } else {
                isLeap = false;
            }
        } else {
            System.out.println("invalid date");
            return;
        }

        switch (month) {
            case 1,3,5,7,8,12 -> {System.out.println(31);}
            case 2 -> {
                if(!isLeap){
                    System.out.println(28);
                }else {
                    System.out.println(29);
                }
            }
            case 4,6,9,11 -> {
                System.out.println(30);
            }
            default ->
                System.out.println("invalid date");
        }
    }
}
