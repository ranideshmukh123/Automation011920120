package Functions;

public class Accessmodifiers {

	public static void main(String[] args) {
		
		
		 Accessmodifiers obj= new  Accessmodifiers();
		
		obj.publicFunction();
		
		obj.privateFunction();
		
		obj.noAccessModFunc();
        obj.protectedFunction();
	}
	
	public void publicFunction()
	{
		System.out.println("public function");
	}

	private void privateFunction()
	{
		System.out.println("private function");
	}
	
	void noAccessModFunc()
	{
		System.out.println("No access modifiers function");
	}
	
	protected void protectedFunction()
	{
		System.out.println("protected function");
	}
	
	
}
