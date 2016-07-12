package prototype;

public class Test {
	public static void main(String[] args) {
		WordDocument doc = new WordDocument();
		doc.setmText("this one file！");
		doc.addImage("img 1");
		doc.addImage("img 2");
		doc.addImage("img 3");

		doc.showDocument();

		WordDocument doc2 = doc.clone();
		doc2.showDocument();
		doc2.setmText("update doc ");
		doc2.addImage("haha.jpg");
		doc2.showDocument();

		doc.showDocument();
	}
}
