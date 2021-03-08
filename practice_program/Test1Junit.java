package practice_program;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Test1Junit {

	@Test
	void test() {
		com.as.mitt.test.Test t = new com.as.mitt.test.Test();
		
		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(10);
		lst.add(20);
		lst.add(1);
		lst.add(3);
		
		ArrayList<Integer> lst1 = new ArrayList<>();
		lst1.add(1);
		lst1.add(3);
		lst1.add(10);
		lst1.add(20);
		
		assertEquals(lst1, t.sort(lst));
	
	}

}
