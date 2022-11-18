import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {
		int temp;
		int rev = 0;
		int mod = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
		int num = sc.nextInt();
		temp = num;
		while (num > 0) {
			mod = num % 10;
			rev = (rev * 10) + mod;
			num = num / 10;
		}
		if (temp == rev)

			System.out.println(+temp+" is palindrome");
		else

			System.out.println(+temp+" is not palindrome");
		sc.close();
	}

}
