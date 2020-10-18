import java.util.Scanner;

public class StudentAffairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student[] studentList = new Student[10];
		Course[] courseList = new Course[10];
		int stc = 0;
		int coc = 0;

		while (true) {

			System.out.println("Enter a command:");
			String input = sc.nextLine();
			String[] inputList = input.split(" ");

			if ("Q".equalsIgnoreCase(input)) {
				break;
			}

			switch (inputList[0]) {

			case "createCourse":
				String CourseCode = inputList[1];
				int Capacity = Integer.parseInt(inputList[2]);
				String day = inputList[3];
				int studentCount = Integer.parseInt(inputList[4]);
				double averageGrade = Double.parseDouble(inputList[5]);
				courseList[coc] = new Course(CourseCode, Capacity, day, studentCount, averageGrade);
				System.out.println("Course " + courseList[coc] + " successfully added.");
				coc++;
				break;

			case "createStudent":
				String Name = inputList[1];
				String StudentID = inputList[2];
				studentList[stc] = new Student(Name, StudentID);
				System.out.println("Student " + studentList[stc] + " successfully added.");
				stc++;
				break;

			case "addGradeStudent":
				StudentID = inputList[1];
				String letterGrade = inputList[2];

				for (int i = 0; i < stc; i++) {

					if (studentList[i].getGradeCount() == 4) {
						System.out.println("Capacity (" + studentList[i].getGradeCount() + ") reached.");

					} else if (inputList[1].equals(studentList[i].StudentID)) {
						studentList[i].addGradeStudent(letterGrade);
						System.out.println("Success");

					}
				}
				break;

			case "addGradeCourse":
				CourseCode = inputList[1];
				double grade = Double.parseDouble(inputList[2]);

				for (int i = 0; i < coc; i++) {

					if (courseList[i].getCapacity() == 0) {
						System.out.println("Capacity reached");

					} else if (inputList[1].equals(courseList[i].CourseCode)) {
						courseList[i].addGradeCourse(grade);
						System.out.println("Success");

					}

				}
				break;

			case "removeGradeStudent":
				StudentID = inputList[1];
				int index = Integer.parseInt(inputList[2]);

				for (int i = 0; i < stc; i++) {

					if ((index >= studentList[i].getGradeCount()) || (studentList[i].getGradeCount() == 0)) {
						System.out.println("Grade count already zero or wrong index");

					} else if (inputList[1].equals(studentList[i].StudentID)) {
						studentList[i].removeGradeStudent(index);
						System.out.println("Success");

					}
				}

				break;

			case "removeGradeCourse":
				CourseCode = inputList[1];
				grade = Double.parseDouble(inputList[2]);

				for (int i = 0; i < coc; i++) {

					if (courseList[i].getStudentCount() == 0) {
						System.out.println("Number of student in course is already 0.");

					} else if (inputList[1].equals(courseList[i].CourseCode)) {
						courseList[i].removeGradeCourse(grade);
						System.out.println("Success");

					}

				}
				break;

			case "averageGradeStudent":
				StudentID = inputList[1];

				for (int i = 0; i < stc; i++) {
					if (inputList[1].equals(studentList[i].StudentID)) {
						System.out.println(
								"Grades of Student " + studentList[i] + " is " + studentList[i].averageGradeStudent());
					}
				}

				break;

			case "averageGradeCourse":
				CourseCode = inputList[1];

				for (int i = 0; i < coc; i++) {
					if (inputList[1].equals(courseList[i].CourseCode)) {
						System.out
								.println("Grades of Student " + courseList[i] + ": " + courseList[i].getAverageGrade());
					}
				}

				break;

			case "printGradesStudent":
				StudentID = inputList[1];

				for (int i = 0; i < stc; i++) {
					if (inputList[1].equals(studentList[i].StudentID)) {
						System.out.println(
								"Grades of Student " + studentList[i] + ": " + studentList[i].printGradesStudent());
					}
				}
				break;

			case "updateGradeStudent":
				StudentID = inputList[1];
				index = Integer.parseInt(inputList[2]);
				String newLetterGrade = inputList[3];

				for (int i = 0; i < stc; i++) {
					
					if (inputList[1].equals(studentList[i].getStudentID())) {
						studentList[i].updateGradeStudent(index, newLetterGrade);
					}
				}
				break;
			
			}

		}

	}
}
