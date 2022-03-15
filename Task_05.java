/*
 * Сравнява го с име на приятел/ка, 
 * като използвате equals(),
equalsIgnoreCase(), compareTo(),
 резултатите да излизат на отделни редове
 * */
public class Task_05 {

	public static void main(String[] args) {
		
		String myname = "Mariela";
		String friendName = "Petia";
		

		System.out.println(myname.equals(friendName));
		System.out.println(myname.equalsIgnoreCase(friendName));
		System.out.println(myname.compareTo(friendName));
	}

}
