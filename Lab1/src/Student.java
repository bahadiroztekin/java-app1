
public class Student {
	Grade[] Grades = new Grade[4];
	String Name, StudentID;
	int GradeCount;

	public Student(String Name, String StudentID) {
		this.Name = Name;
		this.StudentID = StudentID;
		Grade[] Grades = new Grade[4];
		GradeCount = 0;

	}

	boolean updateGradeStudent(int index, String newGrade) {

		if ((index >= GradeCount) || (GradeCount == 0)) {
			System.out.println("Grade count already zero or wrong index ");
			return false;
			
		} else if ((index < GradeCount) && (GradeCount != 0)) {
			Grades[index] = new Grade(newGrade);
			System.out.println("Success");
		}
		return true;
		
	}

	public boolean addGradeStudent(String letterGrade) {

		if (GradeCount == 4) {
			return false;

		} else {
			Grades[GradeCount] = new Grade(letterGrade);
			GradeCount++;
			return true;
		}

	}

	public boolean removeGradeStudent(int index) {
		if (GradeCount == 0) {
			return false;

		} else {
			while (index < (Grades.length - 1)) {
				Grades[index] = Grades[index + 1];
				index++;

			}
			GradeCount--;
			return true;

		}

	}

	public String printGradesStudent() {
		String listOfGrades = "";
		for (int i = 0; i < GradeCount; i++) {
			listOfGrades += Grades[i].grade + " ";

		}
		return listOfGrades;

	}

	public double averageGradeStudent() {
		double listOfAverages = 0.0;
		for (int i = 0; i < GradeCount; i++) {
			listOfAverages += (Grades[i].grade) / GradeCount;

		}
		return listOfAverages;

	}

	@Override
	public String toString() {
		return Name + "(" + StudentID + ")";
	}

	public Grade[] getGrades() {
		return Grades;
	}

	public void setGrades(Grade[] grades) {
		Grades = grades;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getStudentID() {
		return StudentID;
	}

	public void setStudentID(String studentID) {
		StudentID = studentID;
	}

	public int getGradeCount() {
		return GradeCount;
	}

	public void setGradeCount(int gradeCount) {
		GradeCount = gradeCount;
	}

}
