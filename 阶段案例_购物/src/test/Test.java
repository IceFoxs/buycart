package test;

public class Test {
      public static void main(String[] args) {
    	  String str="c++javajavacjava++ccc++c++java";
    	  System.out.println(find(str,"java"));
      }
  public static int find(String src,String des) {
    	  int count=0;
    	  if(src!=null) {
    		  int index=src.indexOf(des);
    		  while(index!=-1) {
    			  count++;
    		      index=src.indexOf(des,index+des.length());
    		  }	   
    	  }
    	  return count;
      }
}
