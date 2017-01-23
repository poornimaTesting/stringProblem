package apple;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringProblem {
	
  
  @Parameters(value={"str", "ltr"})
  @Test
   public static void rmChr(String str, char ltr){
  	System.out.println("\nUsing Iteration one character at a time ");
      System.out.println("Before removing the letter "+ltr +" from : "+str);
      StringBuilder sb = new StringBuilder();
      char[] rmString = str.toCharArray();
      for(int i=0; i<rmString.length; i++){
          if(rmString[i] != ltr){
          	sb.append(rmString[i]);
           }
          }
         System.out.println("After  removing the letter " + ltr+" : "+sb.toString());
   
 }
  
  @Parameters(value={"str", "ltr"})
  @Test
  public static void rmChr1(String str, char x){
      System.out.println("\n Using String class");
      System.out.println("Before removing the letter "+x +" from : "+str);
      String k = String.valueOf(x);
      String str1 = str.replace(k,"");
      System.out.println("After  removing the letter " + x+" : "+str1);
        
    }
  
  @Parameters(value={"newstr", "newltr"})
  @Test
  public static void rmChr2(String newstr, char newltr){
      System.out.println("\n Using String class");
      System.out.println("Before removing the letter "+newltr +" from : "+newstr);
      String k = String.valueOf(newltr);
      String str1 = newstr.replace(k,"");
      System.out.println("After  removing the letter " + newltr+" : "+str1);
      
      if(str1.equals(newstr)){
    	  System.out.println("There is no "+newltr +"  Present in " +newstr);
      }
    }
  
  @Parameters(value={"str", "ltr"})
  @Test
  public static void pstve_test(String str, String ltr){
  		
      System.out.println("\n The given String is  : "+str);
      int n = str.indexOf(ltr);
      
      if (n != -1){
      	System.out.println(" The given String has  letter " + '"'+ltr+'"' +"  instances");
      }
      else{
      	System.out.println(" The given String has not  letter " + '"'+ltr+'"' +"  instances");
      }
  }
  
  @Parameters(value={"str", "newltr"})
  @Test
  public static void ngtve_test(String str,String newltr ){
  	
	  System.out.println("\n The given String is  : "+str);
      int n = str.indexOf(newltr);
      
      if (n != -1){
      	System.out.println(" The given String has  letter " + '"'+newltr+'"' +"  instances");
      }
      else{
      	System.out.println(" The given String has not  letter " + '"'+newltr+'"' +"  instances");
     Assert.fail();
      }
  }
}
