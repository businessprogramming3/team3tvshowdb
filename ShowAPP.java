import java.util.Scanner;



public class ShowAPP {
	IShowDAO shows = new ShowDAO();
	Scanner scan = new Scanner(System.in);
	
	public ShowAPP(){
		menu();
	}
	
	private void menu(){
		int id, rating, seasons;
		String name, writer, director, description;
		int choice = 1;
		while (choice != 0){
			System.out.println("TV Show Application");
			System.out.println("0 = Quit");
			System.out.println("1 = List All Records");
			System.out.println("2 = Create New Record");
			System.out.println("3 = Retrieve Record");
			System.out.println("4 = Update Record");
			System.out.println("5 = Delete Record");
			System.out.println("6 = Retrieve Records by Rating");
			System.out.println("7 = Retrieve Records by Director");
			System.out.println("8 = Retrieve Records by Writer");
			choice = scan.nextInt();
			
			if (choice == 0){
				System.exit(1);
			} else if (choice == 1){
				printRecords();
			} else if (choice == 2){
				createRecord();
			} else if (choice == 3){
				retrieveRecordById();
			} else if (choice == 4){
				updateRecord();
			} else if (choice == 5){
				deleteRecord();
			} else if (choice == 6){
				retrieveRecordsByRating();
			} else if (choice == 7){
				retrieveRecordsByDirector();
			} else if (choice == 8){
				retrieveRecordsByWriter();
			} else {
				System.out.print("Choice Not Valid.  Try another choice: ");
				choice = scan.nextInt();
			}
		}
		
	}

	public void printRecords(){
		System.out.println(shows.toString());
	}
	
	public void createRecord(){
		System.out.print("New Show ID: ");
		int id = scan.nextInt();
		System.out.print("New Show Rating: ");
		int rating = scan.nextInt();
		System.out.print("New Number of Seasons: ");
		int seasons = scan.nextInt();
		System.out.print("New Show Title: ");
		String title = scan.nextLine();
		System.out.print("New Show Director: ");
		String director = scan.nextLine();
		System.out.print("New Show Writer: ");
		String writer = scan.nextLine();
		System.out.print("New Short Description: ");
		String description = scan.next();
		
		shows.createRecord(new Show(id, rating, seasons, title, director, writer, description));
	}
	
	public void retrieveRecordById(){
		System.out.print("Enter ID To Retrieve: ");
		int id = scan.nextInt();
		System.out.println(shows.retrieveRecordById(id));
	}
	
	public void updateRecord(){
		System.out.print("Enter ID To Update: ");
		int id = scan.nextInt();
		System.out.print("Enter Name: ");
		String name = scan.nextLine();
		System.out.print("Enter Rating: ");
		int rating = scan.nextInt();
		System.out.print("Enter Number of Seasons: ");
		int seasons = scan.nextInt();
		System.out.print("Enter Director: ");
		String director = scan.nextLine();
		System.out.print("Enter Writer: ");
		String writer = scan.nextLine();
		System.out.print("Enter Short Description");
		String description = scan.next();
		shows.updateRecord(new Show(id, rating, seasons, name, director, writer, description));
	}
	
	public void deleteRecord(){
		System.out.print("Enter ID of Show to Delete: ");
		int id = scan.nextInt();
		System.out.println(shows.retrieveRecordById(id));
		System.out.print("Are you sure you want to delete record " + id + "?");
		String choice = scan.nextLine();
		if (choice.equalsIgnoreCase("Y")){
			shows.deleteRecord(id);
		} else {
			menu();
		}
	}
	
	public void retrieveRecordsByRating(){
		
	}
	
	public void retrieveRecordsByDirector(){
		
	}
	
	public void retrieveRecordsByWriter(){
		
	}
	
	public static void main(String[] args){
		new ShowAPP();
	}
}
