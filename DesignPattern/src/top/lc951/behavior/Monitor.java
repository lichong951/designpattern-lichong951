package top.lc951.behavior;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerParVisitor) {
		// TODO Auto-generated method stub
		computerParVisitor.visit(this);
	}

}
