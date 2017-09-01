package org.schoolactivities.model;

public class FootballActivity {
	
	private Student studentC, studentD, studentE, studentF;
	
	public Student getStudentC() {
		return studentC;
	}

	public void setStudentC(Student studentC) {
		this.studentC = studentC;
	}

	public Student getStudentD() {
		return studentD;
	}

	public void setStudentD(Student studentD) {
		/*studentD.setName("D");
		studentD.setSurname("StudentD");*/
		this.studentD = studentD;
	}

	public Student getStudentE() {
		return studentE;
	}

	public void setStudentE(Student studentE) {
		/*studentE.setName("E");
		studentE.setSurname("StudentE");*/
		this.studentE = studentE;
	}
		
	public Student getStudentF() {
		return studentF;
	}

	public void setStudentF(Student studentF) {
		this.studentF = studentF;
		studentF.setName("F");
		studentF.setSurname("StudentF");
	}
	
	
}
