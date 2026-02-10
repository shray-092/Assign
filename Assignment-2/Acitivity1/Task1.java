package capgemini;
import java.util.*;



public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer>li=new ArrayList<>();
		li.add(90);
		li.add(60);
		li.add(67);
		li.add(78);
		li.add(89);
		li.set(2,92);
		int minmarks=101;
		int minindex=0;
		int i;
		for(i=0;i<li.size();i++) {
			if(li.get(i)<minmarks) {
				minmarks=li.get(i);
				minindex=i;
			}
		}
		li.remove(minindex);
	
		for(i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		
		}
	
}
