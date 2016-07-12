package builder;

public class MacbookBuilder extends Builder {
	private Computer mComputer=new MacBook();
	@Override
	public void buildBoard(String board) {
		mComputer.setBoard(board);
	}

	@Override
	public void buildDisplay(String display) {
		mComputer.setDisplay(display);
	}

	@Override
	public void buildOS() {
		mComputer.setOS();
	}

	@Override
	public Computer creater() {
		
		return mComputer;
	}

}
