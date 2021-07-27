package basic;
import java.util.Scanner;

public class Prac4 {

	public static void main(String[] args) {

	prac4_2();
	prac4_4();

	}

	public static void prac4_2() {


		int [] moneyList = {121902,8302,55100};

			for(int i = 0 ; i < moneyList.length ; i ++){
				System.out.println(moneyList[i]);
			}

			for (int value : moneyList) {
				System.out.println(value);

			}
	}

	public static void prac4_4() {

		int [] numbers = {3,4,9};

		System.out.println("1桁の数字を入力してください");

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		for (int i = 0 ; i < numbers.length ; i ++ ) {
			if (numbers[i] == input) {
				System.out.println("アタリ！");
			}
		scan.close();

		}


	}
}
