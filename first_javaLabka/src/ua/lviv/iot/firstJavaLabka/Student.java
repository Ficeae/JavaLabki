package ua.lviv.iot.firstJavaLabka;

public record Student (String name, 
					   double rating, 
					   double height,
					   int yearOfEntry,
					   String speciality,
					   boolean isOnBudget) {
	
	static final String university = "Lviv Polytechnical NU";
	
	public static String getUniversity() {
		return university;
	}
	
	public Student () {
		this("John", 180.3, 36, 2020, "Computer Science", false);
	}
	
	public Student (String name, double rating, double height) {
		this(name, rating, height, 2021, "IoT", true);
	}
	
	public String toString() {
		return "Student " + this.name + ", year of entry: " + this.yearOfEntry + ", speciality: " + this.speciality;
	}
}