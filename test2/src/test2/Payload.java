package test2;

public class Payload {

	public static String Adduser(String email) {
		return "{\r\n"
				+ "    \"firstName\": \"Abhinav\",\r\n"
				+ "    \"lastName\": \"Singh\",\r\n"
				+ "    \"email\": \""+email+"\",\r\n"
				+ "    \"password\": \"myPasswooord\"\r\n"
				+ "}";
		
	}
	public static String Addcontact() {
		return "{\r\n"
				+ "    \"firstName\": \"Johnny\",\r\n"
				+ "    \"lastName\": \"De\",\r\n"
				+ "    \"birthdate\": \"1990-01-01\",\r\n"
				+ "    \"email\": \"jdfofe@fake.com\",\r\n"
				+ "    \"phone\": \"8085555555\",\r\n"
				+ "    \"street1\": \"1 Low St.\",\r\n"
				+ "    \"street2\": \"Apartment bt\",\r\n"
				+ "    \"city\": \"Skol\",\r\n"
				+ "    \"stateProvince\": \"AS\",\r\n"
				+ "    \"postalCode\": \"8888\",\r\n"
				+ "    \"country\": \"USA\"\r\n"
				+ "    \"password\": \"myPassword\"\r\n"
				+ "}";
		
	}
}
