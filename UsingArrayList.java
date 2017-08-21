package reverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class UsingArrayList {

	public static void main(String[] args) {
		String str= "Max Jayswal";
		char[] chr = str.toCharArray();
		
		List<Character> mylist = new ArrayList<Character>();
		for(char c:chr){
			mylist.add(c);
		}
		Collections.reverse(mylist);
		ListIterator li = mylist.listIterator();
		while(li.hasNext()){
			System.out.print(li.next());
		}
	}
}
