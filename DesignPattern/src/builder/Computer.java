package builder;

public abstract class Computer {
	protected String mBoard;

	public void setBoard(String board) {
		this.mBoard = board;
	}

	protected String mDisplay;
	protected String mOS;

	protected Computer() {

	}

	public void setDisplay(String display) {
		mDisplay = display;

	}

	public abstract void setOS();

	public String toString() {
		return "Computer [mBoard=" + mBoard + ",mDisplay=" + mDisplay + ", mOS=" + mOS + "]";
	}
}
