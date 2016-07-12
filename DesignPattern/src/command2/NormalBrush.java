package command2;

import java.nio.file.Path;

public class NormalBrush implements IBrush {

	@Override
	public void down(Path path, float x, float y) {
		System.out.println("down called!");
	}

	@Override
	public void move(Path path, float x, float y) {
		System.out.println("move called!");
	}

	@Override
	public void up(Path path, float x, float y) {
		System.out.println("up called!");
	}

}
