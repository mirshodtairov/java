package Day27;

public class CanvasCaures {

	public static void main(String[] args) {
		String url = ("https://learn.cybertekschool.com/courses/149");
		String [] str = url.split("/");
//		--> split by "/" and get the last value from array
//		--> convert it to integer. Integer.parseInt(...) -> int value
//		--> switch statement and find the matching
		
		int courseID = Integer.parseInt(str[4]);
		
			System.out.println(str[str.length-1]);
			
			switch(courseID) {
			case 147:
				System.out.println("the course is Java Programming");
				break;
			case 204:
				System.out.println("Mentoring Session");
				break;
			case 149:
				System.out.println("SDLC");
				break;
			case 152:
				System.out.println("Qa Testing");
				break;
			case 144:
				System.out.println("Team activity");
				break;
			case 143:
				System.out.println("Welcome Kit");
				break;
				default:
					System.out.println("Invalid number for the course");
					break;
				
			
		
		

	}

}
}
