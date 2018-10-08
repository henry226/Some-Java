package Chapter7.GradeBook;
// GradeBookTest creates a GradeBook object using an array of grades,
//then invokes method processGrades to analyze them.
public class GradeBookTest {

	public static void main(String[] args) {
		// array of student grades
		int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		GradeBook myGradeBook = new GradeBook("CS662 Advance Programming Technique", gradesArray);
		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
		myGradeBook.processGrades();
	}

}
