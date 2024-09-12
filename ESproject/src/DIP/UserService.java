package DIP;

public class UserService {
	
	//user service dipende dall'interfaccia DataSotrgae
	private DataStorage datastorege;  // di tipo interfaccia

	public UserService(DataStorage datastorege) {
		super();
		this.datastorege = datastorege;
	}
	
	public void saveUser(String user) {
		datastorege.save(user);
	}

}
