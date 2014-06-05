package behavioral.visitor;

public class CarElementDoVisitor implements CarElementVisitor
{
	@Override
	public void visit(Wheel wheel)
	{
		System.out.println("Changing wheel...");
	}
	
	@Override
	public void visit(Engine engine)
	{
		System.out.println("Starting engine...");
	}
	
	@Override
	public void visit(Body body)
	{
		System.out.println("Paiting body...");
	}
	
	@Override
	public void visit(Car car)
	{
		System.out.println("Starting car...");
	}
}