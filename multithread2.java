package day23112022;

public class multithread2 implements Runnable{
	public void run()
	{
		System.out.println("multithread type 2 extended successfully");
	}
	public static void main(String[]args)
	{
		multithread2 mt2=new multithread2();
		mt2.run();
	}

}
