package top.lc951.behavior.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Keyboard item) {
		System.out.println("Displaying Computer.");

	}

	@Override
	public void visit(Monitor item) {
		System.out.println("Displaying Mouse.");

	}

	@Override
	public void visit(Mouse item) {
		 System.out.println("Displaying Keyboard.");

	}

	@Override
	public void visit(Computer item) {
		System.out.println("Displaying Monitor.");

	}

}
