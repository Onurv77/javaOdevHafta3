package example;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		Student student1 = new Student();
		
		instructor1.setId(0);
		instructor1.setUserName("EngDmrog123");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setPassword("12345");
		instructor1.setEmail("asd@hotmail.com");
		instructor1.setAbout("MCT, PMP ve ITIL sertifikalarýna sahibim.");
		
		student1.setId(0);
		student1.setUserName("Onurv77");
		student1.setFirstName("Onur");
		student1.setLastName("Özcan");
		student1.setPassword("54231");
		student1.setEmail("dsa@hotmail.com");
		student1.setAdress("X mah. Y sok. no 1 daire 2, Z ilçesi");
		
		UserManager instructorManager1 = new UserManager();
		UserManager studentManager1 = new UserManager();
		instructorManager1.add(instructor1);
		studentManager1.update(student1);
		
	}

}
