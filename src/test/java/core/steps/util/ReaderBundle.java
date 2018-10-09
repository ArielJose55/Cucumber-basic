package core.steps.util;

import java.util.ResourceBundle;

public class ReaderBundle {
	private ResourceBundle rb;
	
	private static ReaderBundle READER = null;
	
	private ReaderBundle() {
		rb = ResourceBundle.getBundle("com/accenture/Reto4/resources/config");
	}
	
	public static ReaderBundle getReader() {
		if(READER == null)
			READER = new ReaderBundle();
		return READER;
	}
	
	public String getStringKey(String key) {
		return rb.getString(key);
	}
	
}
