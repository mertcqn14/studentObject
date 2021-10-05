package studentObject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student1=new Student();
        student1.setName("Mertcan");
        student1.setSurname("Çiftçioðlu");
        student1.setGender(true);		
	    student1.setAge(15);
	    student1.setClassRoom("10AMP");
	    student1.setStage(10);
	    student1.setNationalIdentity("21243");
	    student1.setLength(1.78);
	    student1.setSchoollNumber("207");
	    System.out.println("Öðrenci :"+student1.getName()+" "+student1.getSurname());  
	    
	    Student student2=new Student("Mertcan","Çiftçioðlu","207,",11,1.78,41,"10AMP",true,"13341");
	    System.out.println(student2.getNationalIdentity());
	
	    Schooll schooll1=new Schooll();
	    schooll1.setAddres("BOLU MERKEZ");
	    schooll1.setName("EML");
	    schooll1.setPhone("132146");
	    
	
	
	}

}
