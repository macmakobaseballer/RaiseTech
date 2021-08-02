package basic.prac11;

public class Book_11 extends TangibleAsset_11{
	 String isbn;


	 // コンストラクタ
	 public Book_11(String name, int price, String color, String isbn) {
		 super(name, price, color);
		 this.isbn = isbn;
	 }

	 // メソッド
	 public String getIsbn() {
		 return this.isbn;
	 }


}
