package designpatterns.singleton;

import java.util.Objects;

public class Database {
	private static Database database;
	
	private Database() {}
	
	public static Database getInstance() {
		if(Objects.isNull(database)) {
			database = new Database();
			database.connect("/use/local/data/users.db");
		}
		return database;
	}
	
	private void connect(String url) {
		Objects.requireNonNull(url);
	}
	
	public static void main(String[] args) {
		Database a = Database.getInstance();
		Database b = Database.getInstance();
		
		System.out.println(a == b);
	}
	
}
