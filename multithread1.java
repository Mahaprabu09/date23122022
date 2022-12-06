package day23112022;

public class multithread1 extends Thread{
	public void run()
	{
		System.out.println("multithread type 1 extended succussfully");
	}
	public static void main(String[]args)
	{
		multithread1 mt=new multithread1();
		mt.start();
	}

}
