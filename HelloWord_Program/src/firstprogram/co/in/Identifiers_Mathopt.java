package firstprogram.co.in;

public class Identifiers_Mathopt {
 int a=10;
 int b=20;
 
 int doAdd() {
	 int resultofAdd=this.a+this.b;
	 return resultofAdd;
 }
	public static void main(String[] args) {
		Identifiers_Mathopt m=new Identifiers_Mathopt();
		System.out.println(m.doAdd());
	}

}
