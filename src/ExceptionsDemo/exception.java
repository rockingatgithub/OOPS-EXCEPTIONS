package ExceptionsDemo;

public class exception {
	
	public static int divide(int a, int b) throws DivideByZeroException {
		
		if(b == 0){
			throw new DivideByZeroException();
		}
		
		return a/b;
		
	}
	
	public static void main (String args[]) {
		
		try {
			
			int result = divide(10, 0);
			System.out.println("The result is:- "+ result);
			
		} catch (DivideByZeroException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured:" + e);
		} finally {
			System.out.println("The finally block!");
		}
		
	}

}
