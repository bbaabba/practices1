package Chap11.Sec02.Ex03;

interface A {
	public abstract void abc();
}

interface B {
	void bcd();//자동으로 앞에 public abstract가 붙는다
}

class C implements A{
	public void abc() {
		
	}
}

/* public -> default 불가능  << 이건 다시 한번 읽어봐야겠다
class D implements B{     
	void bcd(){
	}
}
 */



public class IngeritanceOfInterface_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
