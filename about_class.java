// 人クラス 人間の身体情報を持ち、その処理方法を記述する
// クラスはC言語の構造体+関数のイメージ
class Person
{
	// クラスで保持する変数を並べる。C言語の構造体に近い概念
	// この変数達を「メンバ変数」とよぶ
	int myAge=5;		//年齢
	double myWeight;	//体重[kg]
	double myHeight;	//身長[cm]

	// クラス内には処理を記述できる。それをメソッドと呼ぶ
	// そのクラスの中だけで使える関数に近い概念
	// (C++などではメンバ関数とも呼ぶ)
	int show()							// 戻り値がいらないときはvoid
	{
		System.out.println("年齢は"+myAge+"歳");
		System.out.println("体重は"+myWeight+"[kg]");
		System.out.println("身長は"+myHeight+"[cm]");
		return -10;
	}
}

public class about_class 
{
	public static void main(String[] args)
	{
		Person gachaping;			//人クラスの入れ物を準備
		gachaping =new Person();	//人クラスの実体を割り当て

		int ret;


		//クラスのメンバ変数にアクセスするときは.を使う(構造体と一緒)
//		gachaping.myAge = 51;
		gachaping.myHeight= 165.0;
		gachaping.myWeight = 80.0;

		System.out.println(gachaping.myAge);

		//クラスのメソッドを呼び出すときは.で繋いでメソッド名を書く
		ret=gachaping.show();
		System.out.println(ret);
	}
}
