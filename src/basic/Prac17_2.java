package basic;

public class Prac17_2 {

	public static void main(String[] args) {
		try {
			String s = "abc" ;
			System.out.println(s.length());
		} catch (NullPointerException e) {

			System.out.println
				("NullPointerException例外をcatchしました。");
			System.out.println("－－スタックトレース－－");
			e.printStackTrace();
			System.out.println("－－スタックトレース－－");
		}


	}

}
