
public class Eat {

	public static void main(String[] args) {
		String[] items = { "饺子", "寻客速食", "十分钟", "胖哥", "嘉禾一品" };
		int i = (int) ( Math.random() * items.length);
		System.out.println("吃"+items[i]);
	}

}
