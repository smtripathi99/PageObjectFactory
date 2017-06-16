package test.java.base;

public interface Config {

	final String url = System.getProperty("url",
			"http://the-internet.herokuapp.com/");
	
}
