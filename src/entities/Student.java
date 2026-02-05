package entities;

public class Student {
	public double nota1;
	public double nota2;
	public double nota3;
	public String name;
	
	public double finalNote() {
		double finalNote = nota1 + nota2 + nota3;
		return finalNote;
	}
	
//	public void PassFailed() {
//		if (FinalNote() >= 60.00) {
//			System.out.printf("FINAL GRADE = %.2f%n", FinalNote());
//			System.out.println("PASS");
//		}
//		else {
//			System.out.printf("FINAL GRADE = %.2f%n", FinalNote());
//			System.out.println("FAILED");
//			System.out.printf("MISSING %.2f%n", (60.00 - FinalNote()), " POINTS");
//		}
	public double missingPoints() {
		if (finalNote() < 60.0) {
		return 60.0 - finalNote();
		}
		else {
		return 0.0;
		}
}
}

