package DIP;

public class Main {

	public static void main(String[] args) {
		
		DataStorage db = new DataStorage() {
			
			@Override
			public void save(String data) {
				System.out.println("salvato in db : " + data);
			}
		}; 
		
		
		DataStorage files = new DataStorage() {
			
			@Override
			public void save(String data) {
				System.out.println("salavto su files : "+data);
			}
		};
		
		UserService user = new UserService(db);
		user.saveUser("Ernesto ");
		
		UserService userf = new UserService(files);
		userf.saveUser("Mia e LIsa");
		

	}

}
