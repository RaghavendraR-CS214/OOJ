class BMSThread extends Thread {
	@Override 
	public void run() {
		while(true) { 
			System.out.println("BMS college of engineering"); 
			try {
				Thread.sleep(10000); 
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}
	}
} 

class CSEThread extends Thread {
	@Override
	public void run() {
		while(true) { 
			System.out.println("CSE"); 
			try {
				Thread.sleep(2000); 
			} catch (InterruptedException e) {
				e.printStackTrace(); 
			}
		}
	}
}

public class threadEx {
	public static void main(String[] args) {
		BMSThread bms = new BMSThread(); 
		bms.start(); 
		CSEThread cse = new CSEThread(); 
		cse.start(); 
	}
}