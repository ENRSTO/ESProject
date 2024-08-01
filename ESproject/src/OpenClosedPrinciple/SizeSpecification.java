package OpenClosedPrinciple;

public class SizeSpecification implements Specification<Product>{

	private Size size;

	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public Boolean isSatisfied(Product item) {
		// TODO Auto-generated method stub
		return item.size == size;
	}

}
