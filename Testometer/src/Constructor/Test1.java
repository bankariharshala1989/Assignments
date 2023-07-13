package Constructor;

public class Test1 {

	public static void main(String[] args) {
		B b=new B();
	}
	
}

class B{				//This is constructor

			B(){
				B();
				}

	void B(){			//This is method

		System.out.println("Method");

			}

		}

//This code is valid