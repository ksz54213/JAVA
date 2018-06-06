import java.lang.*;


public class CDinner extends Thread implements Imple{
	
	String food;
	
	public CDinner(String food) { //Constructer 
		this.food = food;
	}
	
	
	@Override public void run() {  // start() need run()
		serving();
		
	}
	private void serving(){ // function
	    	   System.out.println("¤Wµæ:" + food);
	}

	@Override public void Sleep() {
		// TODO Auto-generated method stub
		try {
			sleep( (long)(1000*Math.random()) );// sleep 0~1s
		}
		catch(Exception e) {}
	}
}
