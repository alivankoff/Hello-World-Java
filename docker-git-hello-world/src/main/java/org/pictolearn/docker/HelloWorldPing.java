package org.pictolearn.docker;


public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 101; i++){
			System.out.println("Sasha: Hello World Ping " + i );
			if (i == 100 ) {
				System.out.println("\n============ C - O - D - A ===========\n");
				System.out.println("\n============ C - O - D - A ===========\n");
				System.out.println("\n============ C - O - D - A ===========\n");
				System.out.println("\n============ C - O - D - A ===========\n");
			}
			Thread.sleep(1000);
		}
	}
}
