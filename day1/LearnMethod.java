package week2.day1;

public class LearnMethod {
	
	public void method1() {
		System.out.println("Its a Public Method");
	}
	
	protected void method2() {
		System.out.println("Its a Protected Method");
	}
	
	void method3() {
		System.out.println("Its a Default Method");
	}
	
	private void method4() {
		System.out.println("Its a Private Method");
	}
	 public static void main(String args[])
	 {
		 LearnMethod lm= new LearnMethod();
		 lm.method1();
		 lm.method2();
		 lm.method3();
		 lm.method4();
}

	 
 }