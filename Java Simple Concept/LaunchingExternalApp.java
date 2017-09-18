package JavaSimpleConcept;

import java.io.IOException;

public class LaunchingExternalApp {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		try {
			
			runtime.exec("notepad");	
			String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "http://javaconceptoftheday.com/"};
			runtime.exec(s);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
