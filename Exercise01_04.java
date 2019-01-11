
public class Exercise01_04 {
	public static void main(String[] args) {
		double seconds_in_year = 365 * 24 * 60 * 60;
		double birth = seconds_in_year / 7.0;
		double death = seconds_in_year / 13.0;
		double immigrant = seconds_in_year / 45.0;
		int current_pop = 312032486;
		
		double first_year = birth - death + immigrant + current_pop;
		System.out.println(first_year);
		
		double second_year = birth - death + immigrant + first_year;
		System.out.println(second_year);
		
		double third_year = birth - death + immigrant + second_year;
		System.out.println(third_year);
		
		double fourth_year = birth - death + immigrant + third_year;
		System.out.println(fourth_year);
		
		double fifth_year = birth - death + immigrant + fourth_year;
		System.out.println(fifth_year);
	}
}
