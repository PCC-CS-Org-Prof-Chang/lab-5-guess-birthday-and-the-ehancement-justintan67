package edu.pasadena.cs.cs03b;

import java.util.Scanner;

public class Dummy {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an integer from 1 - 255: ");
		int n = scanner.nextInt() + 1;

		int setAmmount = (int)Math.ceil((Math.log(n) / Math.log(2)));
		int[][] setsArray = generateSet(setAmmount);
		int[] binaryNums = new int[setAmmount];

		for (int i = 0; i < setAmmount; i++) {
			for (int j = 0; j < Math.ceil(n/2); j++) {
				System.out.print(setsArray[i][j] + " ");
			}
			System.out.print("\nEnter your number: ");
			int userNum = scanner.nextInt();
			int[] currentSet = setsArray[i];
			
			if (inSet(currentSet, userNum)) {
				System.out.println("Your number is in the set\n");
				binaryNums[setAmmount - i - 1] = 1;
			}
			else {
				System.out.println("Your number is not in the set\n");
				binaryNums[setAmmount - i - 1] = 0;
			}
		}

		System.out.println("Your number is " + binaryToInt(binaryNums));

		scanner.close();
	}

	public static int[][] generateSet(int setAmmount) {
		
		int length = (int) Math.pow(2, setAmmount);
		int[][] sets = new int[setAmmount][length / 2];

		for (int i = 0; i < setAmmount; i++) {
			int pos = 0;
			for (int j = 0; j < length; j++) {
				if ((j & (int) Math.pow(2, i)) != 0) {
					sets[i][pos] = j;
					pos++;
				}
			}
		}
		return sets;
	}
	
	public static boolean inSet(int set[], int num){

		for (int i = 0; i < set.length; i++) {
			if (set[i] == num) {
				return true;
			}
		}
		return false;
	}

	public static int binaryToInt(int[] binaryNums) {
		int num = 0;
		int length = binaryNums.length - 1;
		for (int i = length; i >= 0; i--) {
			if (binaryNums[length - i] == 1) {
				num += Math.pow(2, i);
			}
		}
		return num;
	}
}
