package builder;

public class Test {

	public static void main(String[] args) {
		Builder builder = new MacbookBuilder();
		Director pcDirector = new Director(builder);
		pcDirector.construct("因特主板", "retina显示器");
		System.out.println("Computer Info:" + builder.creater().toString());
	}

}
