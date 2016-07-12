package command2;

import java.awt.Canvas;

public class DrawPath implements IDraw {
	private final static String TAG = DrawPath.class.getName();

	@Override
	public void draw(Canvas canvas) {
		System.out.println(TAG + "  draw called!");
	}

	@Override
	public void undo() {
		System.out.println(TAG + "  undo called!");
	}

}
