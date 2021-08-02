package basic;

public class Prac17_3 {

	public static void main(String[] args) {
		try {
			String a = "165";
			int i = Integer.parseInt(a);
			System.out.println(i);	
		} catch (NumberFormatException e) {
			System.out.println
				("NumberFormatExceptionをcatchしました。");
		}

	}

}
