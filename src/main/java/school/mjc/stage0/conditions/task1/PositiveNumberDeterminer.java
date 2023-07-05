package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
        boolean x;
        if (numberToBeDetermined > 0) {
            x = true;
            System.out.println(x);
        }
        else{
            x= false;
            System.out.println(x);
        }
    }
}
