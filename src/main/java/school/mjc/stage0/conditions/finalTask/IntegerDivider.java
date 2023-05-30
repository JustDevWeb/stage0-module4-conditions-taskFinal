package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider != 0){
            int division = dividend / divider;
            int multiplyResult = division * divider;

            if (multiplyResult == dividend){
                System.out.println("can be divided completely");
            }else {
                System.out.println("cannot be divided completely");
            }
        }else {
            System.out.println("division by zero");
        }
    }
}
