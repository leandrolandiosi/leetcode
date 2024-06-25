public class removeDuplicatesC {
    public static int removeDuplicates(int[] nums) {
        int[] nArray = new int[nums.length];
        int q = 0;
        for (int i = 1; i <= nums.length; i++) {
            if ((i ==  nums.length) || (nums[i] != nums[i - 1])){
                nArray[q] = nums[i-1];
                q++;
            }
        }
        for (int i = 0; i < q; i++) {
            nums[i] = nArray[i];
        }
        return q;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);


       // System.out.println(i);
    }
}
