package basic.prac11;

public abstract class TangibleAsset_11 {
	 String name;
	 int price;
	 String color;
	 
	// コンストラクタ
	 public TangibleAsset_11(String name, int price, String color) {
		  this.name = name;
		  this.price = price;
		  this.color = color;
	 }

	 // メソッド
	 public String getName() {
		 return this.name;
	 }

	 public int getPrice() {
		 return this.price;
	 }

	 public String getColor(){
		 return this.color;
	 }
	 
	 
}
