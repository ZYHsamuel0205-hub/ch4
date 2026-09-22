public class FormatDate {

	public static void printAmerican (String day, int date, String month, int year) {
		System.out.println (day + ", " + month + " " + date + ", " + year);
		}
		
	public static void printEuropean (String day, int date, String month, int year) {
		System.out.println (day + " " + date + " " + month + " " + year);
		}
		
	public static void main (String[] args) {
		printAmerican ("Tuesday", 22, "September", 2026);
		printEuropean ("Tuesday", 22, "September", 2026);
		}
		
}
