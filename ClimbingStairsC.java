public class ClimbingStairsC {

    public static int climbStairs(int n) {
        int ant = 1;
        int ant2 = 0;
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x = ant2 + ant;
            ant2 = ant;
            ant = x;
        }
        return x;
    }

    public static void main(String[] args) {
        int i = climbStairs(7);
        System.out.println(i);
    }
}
