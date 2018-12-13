package top.lc951.behavior.visitor;

public class Mouse implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerParVisitor) {
		// TODO Auto-generated method stub
		computerParVisitor.visit(this);
	}

}
