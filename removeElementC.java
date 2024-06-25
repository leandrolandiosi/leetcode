public class removeElementC {
    public static int removeElement(int[] nums, int val) {
        int q = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val){
                nums[q] = nums[i];
                q++;
            }
        }
        return q;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int i = removeElement(nums,3);
    }
}
