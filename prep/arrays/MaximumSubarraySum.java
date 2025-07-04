package prep.arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        int[] arr = { -2,1,-3,4,-1,2,1,-5,4 };
        int result = execute(arr);
        System.out.println(result);
    }
    
    static int execute(int[] array) {
        if(array.length == 2) {
            if(array[0] > array[1]) return array[0];

            return array[1];
        }

        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
            if ((array[i] < 0) && (array[i] * -1 > sum)) {
                sum = 0;
            }
        }

        return sum;
    }
}
