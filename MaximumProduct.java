package company;

public class MaximumProduct {
	static int maximumProduct(int[] array, int n) {
		if (n < 3)
			return -1;
		int maximum_product = Integer.MIN_VALUE;
		for (int i = 0; i < n - 2; i++)
			for (int j = i + 1; j < n - 1; j++)
				for (int k = j + 1; k < n; k++)
					maximum_product = Math.max(maximum_product, array[i] * array[j] * array[k]);
		return maximum_product;
	}

	public static void main(String[] args) {
		int[] array = { -1, -2, -3 };
		int n = array.length;
		int maximum = maximumProduct(array, n);
		if (maximum == -1)
			System.out.println("No Triplet Exists");
		else
			System.out.println("Maximum Product is " + maximum);
	}
}
