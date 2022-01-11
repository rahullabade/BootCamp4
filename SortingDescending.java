package company;

import java.util.Scanner;

public class SortingDescending {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, temp = 0, position = 0;
		System.out.println("Enter the Number Of Elements :");
		number = scanner.nextInt();

		Integer array[] = new Integer[number];
		System.out.print("Enter the Elements of Array :");
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Insert the element you want insert :");
		number = scanner.nextInt();
		for (int i = 0; i < number; i++) {
			if (array[i] < number) {
				position++;
			} else {
				break;
			}
		}
		System.out.println("Position " + position);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of array sorted in descending order :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] +" ");
		}
	}
}
