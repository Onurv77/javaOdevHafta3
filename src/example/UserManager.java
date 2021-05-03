package example;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName()+", kaydınız başarıyla tamamlanmıştır "+user.getFirstName()+" "+user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kaydınız güncellenmiştir "+user.getFirstName()+" "+user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kaydınız silinmiştir");
	}
}
