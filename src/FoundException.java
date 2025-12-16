import java.util.Date;
public class FoundException {

	public static void main(String[] args) throws Exception {
		Date date = null;
		Date today = new Date();
		try {
			System.out.println(date.getClass().getName());
		} catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(Date.class.getName());
		}
		System.out.println(today.getClass().getName());

	}

}
