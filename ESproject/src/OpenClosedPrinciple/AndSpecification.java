package OpenClosedPrinciple;

public class AndSpecification<T> implements Specification<T> {

	private Specification<T> first, second;
	
	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public Boolean isSatisfied(T item) {
		return first.isSatisfied(item) && second.isSatisfied(item);
	}

}
