package ArrayString;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i;

		do {

			System.out.println("Enter" + "\n" + " 1 for counting duplicates" + "\n" + "2 for counting likes" + "\n"
					+ "3 for making largest possible number" + "\n" + "4 for finding number appearing odd number of times" + "\n" + "5 to exit");
			i = scanner.nextInt();

			switch (i) {
			case 1: {
				System.out.println("Enter a string");
				String s = scanner.next();
				s=s.toLowerCase();
				char string[] = s.toCharArray(); 
				int n=string.length; 
				 CountDuplicates cd = new CountDuplicates();
				 int number = cd.countDuplicate(string, n);
				 System.out.println("Number of Duplicate characters in a given string: "+number); 
				break;
			}
			case 2: {
				
				System.out.println("Enter number of people who likes");
				int n = scanner.nextInt();
				String[] like = new String[10];
				
				for(int j=0;j<n;j++)
				{
					like[j] = scanner.next();
				}
				LikeNumber ln = new LikeNumber();
				String s = ln.likeNumber(like,n);
				System.out.println(s); 
			}

			case 3: {
				System.out.println("Enter total number of digits ");
				int k = scanner.nextInt();
				System.out.println("Enter number ");
				int n = scanner.nextInt();
				LargestNumber ln = new LargestNumber();
				int num = ln.largestNumber(n,k);
				System.out.println("Largest possible number is "+ num);
				break;
			}

			case 4: {
				
				int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 }; 
		        int n = arr.length; 
		        OddOccurrence od = new OddOccurrence();
		        int odd = od.oddOccurrence(arr, n);
		        System.out.println("Number appear odd times " + odd);
				break;
			}


			default: {

				break;
			}

			}

		} while (i != 5);
		scanner.close();
	}

}
