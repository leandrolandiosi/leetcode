public class maxSatisfiedC {

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int [] teste = new int[minutes];
        int ant = -1;
        int tot = 0;
        int antv = 0;
        for (int i = 0;i <= customers.length-minutes; i++){
            boolean existe0 = false;
            tot = 0;
            for (int ii = i; ii < i+minutes; ii++){
                if (grumpy[ii] == 1) {
                    tot += customers[ii];
                    existe0 = true;
                }
            }
            if (tot > antv && existe0){
                ant = i;
                antv = tot;
            }
        }
        tot = 0;
        for (int i = 0;i < customers.length; i++){
           if ((grumpy[i] == 0) || (i>=ant && i< ant+minutes)) {
               tot += customers[i];
        }}
        return tot;
    }

    public static void main(String[] args) {

        int[] customers = {3,8,8,7,1};
        int[] grumpy = {1,1,1,1,1};
        int minutes = 3;
        int q = maxSatisfied(customers,grumpy,minutes);
        System.out.println(q);
    }
}
