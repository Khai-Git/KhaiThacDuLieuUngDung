package loadARFF.iuh;

public class TestDemo {
	public static void main(String[] args) throws Exception {
		LoadFile load = new LoadFile();
		load.load("C:\\Program Files\\Weka-3-8-6\\data\\weather.numeric.arff");
		System.out.println(load.toString());
	}
}
