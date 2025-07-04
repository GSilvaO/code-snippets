public class PrefixSum {

    public static void main(String[] args) {
        int[] arr = { 30, 10, 10, 5, 50 };
        int[] prefixSum = findPrefixSum(arr);
        
        for(int num : prefixSum)
            System.out.print(num + " ");
    }

    public static int[] findPrefixSum(int[] arr) {
		
		if(arr == null) throw new NullPointerException();		
		
		int sum = 0;
		int[] prefixSum = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prefixSum[i] = sum;
		}

		return prefixSum;
	}
}
