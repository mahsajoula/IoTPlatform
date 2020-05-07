public class Database {

	private String database;
	private String user;
	private String password;
	private String url;

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void connect() {

	}

	public Database() {
		connect();
	}

	public void execute() {

	}

	public Object insert(String Query) {
		execute();
		return new Object();

	}

	public Object delete(String Query) {
		execute();
		return new Object();
	}

	public Object read(String Query) {
		execute();
		return new Object();
	}

	public Object update(String Query) {
		execute();
		return new Object();
	}
}
