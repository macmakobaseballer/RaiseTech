package basic.prac11;

public class Computer_11 extends TangibleAsset_11 {
	  String makerName;
	  // コンストラクタ
	  public Computer_11(String name, int price, String color, String makerName) {
		  super(name, price, color);
		  this.makerName = makerName;
	  }
	  // メソッド
	  public String getMakerName() {
		  return this.makerName;
	  }

}

