package learning;
import java.util.Scanner;

public class AI_Robot {
	FTP f = new FTP();
	Scanner input = new Scanner(System.in);
	protected String[] map;
	AI_Robot(){
		System.out.println("give the file path:");
		f.setPath(input.nextLine());
		map = f.readFile();
	}
	protected void directionX(boolean x) {
		if (x) System.out.println("Right");
		else System.out.println("Left");
	}
	protected void directionY(boolean y) {
		if (y) System.out.println("Up");
		else System.out.println("Down");
	}
	public void move() {
		int n = map.length;
		boolean x = false, y = true;
		char[] c;
		c = map[0].toCharArray();
		if (c[n-1] == 'p' || c[n-1] == 'P') {
			x = true; y = true;
		}
		c = map[n-1].toCharArray();
		if (c[0] == 'p' || c[0] == 'P') {
			x = false; y = false;
		}
		if (c[n-1] == 'p' || c[n-1] == 'P') {
			x = true; y = false;
		}
		for (int i = 0; i < n/2 - 1; i++) {
			this.directionX(x);
			this.directionY(y);
		}
		if (n % 2 == 0) 
			this.directionX(x);
		else {
			this.directionX(x);
			this.directionY(y);
		}
	}
}
