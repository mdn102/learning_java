public class Main {
    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile( firstName: "Sally", lastName: "Salmon", declaredMajor:"Film", gpa: 3.75, expectedYearToGraduate: 2022);
        StudentProfile profileTwo = new StudentProfile( firstName: "Max", lastName: "Tiffen", declaredMajor: "CS", gpa: 3.45, expectedYearToGraduate: 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
