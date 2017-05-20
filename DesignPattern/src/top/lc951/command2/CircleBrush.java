package top.lc951.command2;

import java.nio.file.Path;

public class CircleBrush implements IBrush {
	private final static String TAG = CircleBrush.class.getName();
	@Override
	public void down(Path path, float x, float y) {
		System.out.println(TAG + "  down called!");
	}

	@Override
	public void move(Path path, float x, float y) {
		System.out.println(TAG + "  move called!");
	}

	@Override
	public void up(Path path, float x, float y) {
		System.out.println(TAG + "  up called!");

	}

}
