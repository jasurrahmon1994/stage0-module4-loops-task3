package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 0;
        int second = 1;
        int temp;
        for (int i = 1; i <= lastFibonacci; i++) {
            if(i >= 3){
            System.out.println(first + second);
            temp = second;
            second = first + second;
            first = temp;
            }
            if(i == 1) System.out.println(0);
            if(i == 2) System.out.println(1);
        }
    }
}
