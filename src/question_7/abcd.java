package question_7;

public class abcd {

			static int sum(int a,int b){
				return a+b;
				}  
			static float sum(int a,int b,int c){
				return a+b+c;
				}  
			public static void main(String[] args) {
			System.out.println(sum(11,11));  
			System.out.println(sum(11,11,11));  
/*Yes we can overload a method with the same return type,
  If two methods have same name, same parameters and have 
  different return type, then this is not a valid method 
  overloading example. This will throw compilation error */
			
	}
}