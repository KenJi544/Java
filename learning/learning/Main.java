package learning;

import java.util.*;

public class Main {
		static ArrayList<ArrayList<Integer>> dl = new ArrayList<ArrayList<Integer>>();
		static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {
		for(int i=0;i<3;i++)
			dl.add(new ArrayList<Integer>());
		

		System.out.println("adding Integers:");
		/*for(ArrayList<Integer> i:dl){
			ListIterator<Integer> it = i.listIterator();
			System.out.println(j);
			it.add(new Integer(j++));
			int a = ((Number)it).intValue();
			System.out.println(j + ":" + a);
		}*/
		
		for(ArrayList<Integer> a:dl) { 
			int v = in.nextInt();
			while(v != 0) {
				a.add(v);
				v = in.nextInt();
			}
		}
		
		System.out.println("Integers were added");

		/*for(ArrayList<Integer> i:dl){
			ListIterator<Integer> it = i.listIterator();	
			while(it.hasNext())
				System.out.println(it.next());
		}*/
		printList();
		System.out.println("Type a value you want to delete from the list");
		dl.forEach((x) -> {
			try {
				x.remove(x.indexOf(in.nextInt()));
			}catch(Exception e) {
				System.err.println("not found");
			}
		});
		printList();
	}
	static void printList() {
		for(ArrayList<Integer> a:dl) {
			for(Integer i:a)
				System.out.print(i.toString()+" ");
			System.out.println();
		}
	}
}
