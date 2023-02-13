package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max, min;
        if(second == 0 || first == 0){
            max = second > first ? second : first;
            min = max;
        }
        else if(first > second){
            max = first;
            min = second;
        } else {
            min = first;
            max = second;
        }
        for (int i = min; i > 0; i--) {
            if(max % i == 0 && min % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
