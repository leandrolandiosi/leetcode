import java.util.Arrays;

public class minMovesToSeat {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ret =0;
        for (int i = 0; i < students.length; i++) {
            ret += Math.abs(students[i]-seats[i]);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] seats = {3,1,5};//1,3,5
        int[] students = {2,7,4};//2,4,7
        int i = minMovesToSeat(seats,students);
        System.out.println(i);
    }
}
