package Excercise;

public class Calculator {
	 public void add(int num1,int num2) {
		 System.out.println((num1+num2));
		
	}
	 public void add(double num1,double num2) {
		 System.out.println((num1+num2));
				
		}
	 public void add(int num1,double num2) {
		 System.out.println((num1+num2));
				
		}
	 public void add(double num1,int num2) {
		 System.out.println((num1+num2));
				
		}
    public void sub(int num1,int num2) {
    	 System.out.println((num1-num2));
 			
	}
    public void sub(double num1,double num2) {
    	 System.out.println((num1-num2));
 			
  	}
    public void sub(int num1,double num2) {
    	 System.out.println((num1-num2));
 			
  	}
    public void sub(double num1,int num2) {
    	 System.out.println((num1-num2));
 			
  	}
    public void mul(int num1,int num2){
    	 System.out.println((num1*num2));
 		
    }
    public void mul(double num1,double num2) {
    	 System.out.println((num1*num2));
 			
    }
    public void mul(int num1,double num2) {
    	 System.out.println((num1*num2));
 			
    }
    public void mul(double num1,int num2) {
    	 System.out.println((num1*num2));
 			
    }
    
    public void div(int num1,int num2) {
    	 System.out.println((num1/num2));
 		
}
    public void div(double num1,double num2) {
    	 System.out.println((num1/num2));
 			
    }
    public void div(int num1,double num2) {
    	 System.out.println((num1/num2));
 			
    }
    public void div(double num1,int num2) {
    	 System.out.println((num1/num2));
 			
    }
    public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(10,20);
		c.add(20.0, 89.56);
		c.add(10,20.0);
		c.add(10.00,20);
		c.sub(10,20);
		c.sub(20.0, 89.56);
		c.sub(10,20.0);
		c.sub(10.00,20);
		c.mul(10,20);
		c.mul(20.0, 89.56);
		c.mul(10,20.0);
		c.mul(10.00,20);
		c.div(10,20);
		c.div(20.0, 89.56);
		c.div(10,20.0);
		c.div(10.00,20);
	}
}
