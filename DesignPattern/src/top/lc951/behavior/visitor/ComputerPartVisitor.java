package top.lc951.behavior.visitor;

public interface ComputerPartVisitor {
	public void visit(Keyboard item);
	public void visit(Monitor item);
	public void visit(Mouse item);
	public void visit(Computer item);
}
