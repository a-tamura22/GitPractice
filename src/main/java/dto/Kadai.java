package dto;

public class Kadai {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String tall;
	private String mail;
	private String salt;
	private String password;
	private String hashedPassword;

	public Kadai(int id, String name, int age, String gender, String tall, String mail, String salt, String password, String hashedPassword) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tall = tall;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
	}

	public Kadai(String name, int age, String gender,String tall,String mail) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tall = tall;
		this.mail = mail;
	}
	
	public Kadai(int id, String name, String mail, String salt, String password, String hashedPassword) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.salt = salt;
		this.password = password;
		this.hashedPassword = hashedPassword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTall() {
		return tall;
	}

	public void setTall(String tall) {
		this.tall = tall;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHashedPassword() {
		return hashedPassword;
	}

	public void setHashedPassword(String hashedPassword) {
		this.hashedPassword = hashedPassword;
	}
}
