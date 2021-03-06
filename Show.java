
public class Show {

	private int id;
	private int seasons;
	private int rating;
	private String name; 
	private String director;
	private String writer;
	private String shortDescription;
	
	public Show(){
		id = 0;
		seasons = 0;
		rating = 0;
		name = "";
		director = "";
		writer = "";
		shortDescription = "";
	}
	
	public Show(int id, int rating, int seasons, String name, String director, String writer, String description){
		this.id = id;
		this.seasons = seasons;
		this.rating = rating;
		this.name = name;
		this.director = director;
		this.writer = writer;
		this.shortDescription = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String toString() {
		return "show [id=" + id + ", seasons=" + seasons + ", rating=" + rating
				+ ", name=" + name + ", director=" + director + ", writer="
				+ writer + ", shortDescription=" + shortDescription
				+ "]";
	}
	 
	
}
