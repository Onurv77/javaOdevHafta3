package example;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName()+", kaydýnýz baþarýyla tamamlanmýþtýr "+user.getFirstName()+" "+user.getLastName());
	}
	public void update(User user) {
		System.out.println("Kaydýnýz güncellenmiþtir "+user.getFirstName()+" "+user.getLastName());
	}
	public void delete(User user) {
		System.out.println("Kaydýnýz silinmiþtir");
	}
}
