package example;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName()+", kayd�n�z ba�ar�yla tamamlanm��t�r "+user.getFirstName()+" "+user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kayd�n�z g�ncellenmi�tir "+user.getFirstName()+" "+user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kayd�n�z silinmi�tir");
	}
}
