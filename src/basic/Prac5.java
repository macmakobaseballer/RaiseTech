package basic;
import java.math.BigDecimal;


public class Prac5 {

	public static void main(String[] args) {
	
		introduceOneself();

	}
	public static void introduceOneself() {
		
		String name	            = "Mako"   ;
		int age		            = 29       ;
		BigDecimal height       = new BigDecimal("183.9");
		char earthlyBranches	= '猿'     ;
		
		System.out.println("名前：" + name           );
		System.out.println("年齢：" + age    + "歳"  );
		System.out.println("身長：" + height + "cm"  );
		System.out.println("干支：" + earthlyBranches);
		
	}
}
