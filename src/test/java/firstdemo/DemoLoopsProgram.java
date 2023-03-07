package firstdemo;

public class DemoLoopsProgram {
	
	
	int num=1;
	
	public void loopDemo()
	{
		
		while(num<=100)
		{
			
			
			System.out.println(num);
			num++;
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		DemoLoopsProgram d = new DemoLoopsProgram();
		d.loopDemo();
		
	}

}
