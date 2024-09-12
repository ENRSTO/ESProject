package Builder;

public class HtmlBuilder {
	
	private String rootName;
	private HtmlElement root;
	
	public HtmlBuilder(String rootName) {
		super();
		this.rootName = rootName;
		root.name = rootName;
	}
	
	
	public void addChild (String childName, String childText) {
		
		HtmlElement e = new HtmlElement(childName, childText);
		
		
		
	}
	
	
	
	

}
