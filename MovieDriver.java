import java.util.Scanner;

public class MovieDriver
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		Movie movie = new Movie(); // movie object
		String decision;
		
		do
		{
		System.out.print("\nEnter the title of a movie: ");
		movie.setTitle (input.nextLine());
		
		
		
		System.out.print("Enter the movie's rating: ");
		movie.setRating (input.nextLine());
		
	
		
		System.out.print("Enter the number of tickets sold at some theater: ");
		movie.setSoldTickets (input.nextInt()); 
		
		// call toString method
		System.out.println(movie.toString());
		
		
		System.out.print("\nWould you like to enter another movie? (yes or no): ");
		decision = input.nextLine();
		decision = input.nextLine(); // read nextLine again so user input is allowed
		} while (decision.equals("yes"));
		
		System.out.println("Thank you! Goodbye.");
	}
}
