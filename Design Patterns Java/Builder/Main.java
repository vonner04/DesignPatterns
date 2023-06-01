
public class Main {

	public static void main(String[] args) {

		SoupNoodle noodle = new SoupNoodle.Builder(SoupNoodle.NoodleType.WHEAT_RAMEN, SoupNoodle.Size.NORMAL).build();
		System.out.println(noodle);
	}

}