
public class Course {

	String CourseCode, day;
	int studentCount, Capacity;
	double averageGrade;

	public Course(String CourseCode, int Capacity, String day, int studentCount, double averageGrade) {

		this.CourseCode = CourseCode;
		this.day = day;
		this.studentCount = studentCount;
		this.Capacity = Capacity;
		this.averageGrade = averageGrade;
	}

	public boolean addGradeCourse(double grade) {
		double totalGradeCourse = 0;
		if (Capacity > 0) {
			
			totalGradeCourse = studentCount * averageGrade;
			totalGradeCourse += grade;
			studentCount++;
			averageGrade = totalGradeCourse / studentCount;
			Capacity--;
			return true;

		} else
			return false;

	}

	public boolean removeGradeCourse(double grade) {
		double totalGradeCourse = 0;
		if (studentCount != 0) {
			
			totalGradeCourse = studentCount * averageGrade;
			totalGradeCourse -= grade;
			studentCount--;
			averageGrade = totalGradeCourse / studentCount;
			Capacity++;
			return true;

		} else
			return false;

	}

	public String toString() {
		return CourseCode;
	}

	public String getCourseCode() {
		return CourseCode;
	}

	public void setCourseCode(String courseCode) {
		CourseCode = courseCode;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

}
