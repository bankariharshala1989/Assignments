package Object;

public class TestObject {

	public static void main(String[] args) {
		
		Human h= new Human();
		h.name="Harshala";
		h.age=30;
		System.out.println(h.name +" your age is " +h.age);
		
		Laptop l=new Laptop();
		l.company="hp";
		l.colour="silver";
		l.height=37.8;
		l.width=25.9;
		System.out.println(h.name +" having laptop of " +l.company +" company , which has "+ l.colour +" colour and dimensions are " +l.height +"*" +l.width);
		
		
		SportMan s= new SportMan();
		s.name="Dhoni";
		s.sportName="Cricket";
		s.country="India";
		System.out.println(s.name +" is from " + s.country +". He was formal captain of Indian " + s.sportName +" team.");
		
		
		TestCase t=new TestCase();
		t.testCaseId=1;
		t.objective="To test objects of Human class";
		t.precondition="Human class must be created";
		t.stepId=1;
		t.stepDescription="Create object of Human class ";
		t.input="h";
		t.expectedResult="We should access the variable of that class";
		t.actualResult="When we enter 'h.',we can see all varible in that class";
		t.status="Pass";
		t.remark="Ok";
		System.out.println("Test Case Template:");
		System.out.println("Test_case_id : " +t.testCaseId);
		System.out.println("Objective : "+t.objective);
		System.out.println("Precondition : "+t.precondition);
		System.out.println("Step Id : " +t.stepId);
		System.out.println("Step Description :" +t.stepDescription);
		System.out.println("Input : "+t.input);
		System.out.println("Expected Result : "+t.expectedResult);
		System.out.println("Actual Result : "+t.actualResult);
		System.out.println("Status : "+t.status);
		System.out.println("Remark : "+t.remark);

		
		
		
	}

}
