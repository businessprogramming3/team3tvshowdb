import java.util.List;

public interface IShowDAO {

	void createRecord(Show show);
	
	Show retrieveRecordById(int id);
	
	//Show retrieveRecordByName(String name);
	
	List<Show> retrieveAllRecords();
	
	void updateRecord(Show updatedShow);
	
	void deleteRecord(int id);
	
}
