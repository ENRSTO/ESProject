package OpenClosedPrinciple;

public class ColorSpecification implements Specification<Product>{
	
	Color color;

	public ColorSpecification(Color color) {
		super();
		this.color = color;
	}

	@Override
	public Boolean isSatisfied(Product item) {
		return item.color == color;
	}

}
