package AceesMod1;

public class Ppclass {
	// we can give public/default right to Ppclass class
		public static void main(String[] args) {
			
		}
	}

	class Test6{
	//we can give only default right to Test6 class
	//we cannot give public right to Test6 class. because visibility cannot decrease. 
		 
	}


	/*
	 when we use private or protected keyword while declaring class it show compile error as 
	 “Illegal modifier for the class your_class_name; only public, abstract & final are permitted”.
	 
	 private:anything defined using private keyword is only accessible inside the entity 
	 (class or package or interface) in which it is defined.and is not visible to outside world.
	 
	 protected:anything defined using protected keyword is accessible inside package.
	 Also we can visible them outside the package only if it is inherited class
	 
	 public -> default ->  protected -> private 
	 */

