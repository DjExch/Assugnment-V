/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prinality;

/**
 *
 * @author User
 */
public class Prinality {
    //checking prime for method 1
    static boolean isPrime(int n){
        if(n<=1) return false;
        
        for(int i = 2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    //for method 1
    static int result(int n){
        int iteration = 0;
        if(isPrime(n)){
            System.out.println("This is prime number and factors are -> ");
               for(int i = 2; i<n; i++){
                 iteration++;  
                   
            }
        }
        
        else{
            System.out.print("This is composite number and the factor are -> ");
            for(int i = 2; i<n; i++){
                iteration++;
                if(n%i == 0){
                    
                    System.out.print(i + ",");
            }
                
        }
                System.out.println(" ");
    }
         return iteration;
    }
    //for method 2
    static int result2(int n){
        int iteration = 0;
        int x = n;
        int i = 2;
        int b = (int) Math.sqrt(n);
       
            //System.out.println("This is prime number and factors are -> ");
               while(x>1 && i<=b) {
                   while(i/x >= 1){
                       System.out.println(i);
                       b = (int) Math.sqrt(x);
                       iteration++;
                   }
                   i = i+1;
                   iteration++;
            }
        return iteration;
              
    }
    //printing result for method one 
    static String CheckPrimeMethodOne(int n){
        int iteration = result(n);
        String num = "With 1st method number of iteration  is: " + iteration;
        return num;
    }
    
    //printing result for method two
    static String CheckPrimeMethodTwo(int n){
        int iteration = result2(n);
        String num = "With 2nd method number of iteration  is: " + iteration;
        return num;
    }
    //main method
    public static void main(String[] args) {
        //lets test the methods 
        
        
        System.out.println(CheckPrimeMethodOne(12));
         System.out.println(CheckPrimeMethodTwo(12));
        
        
    }
    
}
