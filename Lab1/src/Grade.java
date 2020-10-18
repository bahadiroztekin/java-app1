
public class Grade {
	double grade;
	
	public Grade(String letterGrade) {
		this.grade = convertLetter(letterGrade);
	
	}

	public double convertLetter(String letterGrade) {
		
		switch (letterGrade) {
			
			case "AA": 
				return 4.0;
			
			case "BA":	
				return 3.5;
			
			case "BB":	
				return 3.0;
			
			case "CB":	
				return 2.5;
			
			case "CC":	
				return 2.0;
			
			case "DC":	
				return 1.5;
			
			case "DD":	
				return 1.0;
			
			case "F":	
				return 0;
			
			case "FX":	
				return 0;
			
			default:	
				return 0;
		}	
    }
	
	public double getGrade() {
        return grade;
    }
	
	 public void setGrade(double grade) {
	        this.grade = grade;
	    }		

}
