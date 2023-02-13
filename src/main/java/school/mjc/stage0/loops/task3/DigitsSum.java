package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        t = t > 0 ? t : -t;
        int len = (t + "").length();
        int sum = 0;
        int div = t;
        int mod = 0;
        int j = 1;
        for (int i = 0; i < len; i++) {
            mod = (int) (div % Math.pow(10, j));
            div = (int) (div / Math.pow(10, j));
            sum += mod;
        }
        System.out.println(sum);
    }
}
