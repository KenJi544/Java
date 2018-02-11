package learning;
import java.io.*;
import java.util.Scanner;
import java.util.LinkedList;

public class FTP {
	private String path = "./example.txt";
	public void setPath(String x) {
		path = x;
	}
	LinkedList<String> list = new LinkedList<String>();
	public String[] readFile() {
		try {
			File f = new File(path);
			Scanner fscanner = new Scanner(f);
			while(fscanner.hasNext()) {
				list.add(fscanner.next());
			}
			fscanner.close();
		}catch (FileNotFoundException e) {
			System.out.println("wrong file path or the file does not exists");
		}
		String[] s = new String[list.size()];
		int x = 0;
		for (String i:list)
			s[x++] = i;
		return s;
	}
}