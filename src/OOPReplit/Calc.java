package OOPReplit;

public class Calc {
	
	private int x;
	private int y;
	private int result;
	
	
	
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getResult() {
		return result;
	}
	public void plus() {
		result=x+y;
		System.out.println(result);
		
		
	}
	public void minus() {
		result=x-y;
		System.out.println(result);
		
	}
	
	
	

}
