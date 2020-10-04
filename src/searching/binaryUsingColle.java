package searching;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class binaryUsingColle {
	public static void main(String[] args) 
    { 
	 byte byteArr[] = {10,20,15,22,35}; 
     char charArr[] = {'g','p','q','c','i'}; 
     int intArr[] = {10,20,15,22,35}; 
     double doubleArr[] = {10.2,15.1,2.2,3.5}; 
     float floatArr[] = {10.2f,15.1f,2.2f,3.5f}; 
     short shortArr[] = {10,20,15,22,35}; 
     
     List<String>col=new ArrayList<String>();
     col.add("s");
     col.add("q");
     col.add("c");
     col.add("b");
     Collections.sort(col);
     
     String key="b";
     List<Integer>comp=new ArrayList<Integer>();
     comp.add(3);
     comp.add(1);
     comp.add(0);
     comp.add(9);
     
     Integer key1=9;
     Collections.sort(comp);
     
     
     
     Arrays.sort(byteArr);
     
     
     System.out.println("sorted array"+byteArr);
     Arrays.sort(charArr);
     Arrays.sort(intArr);
     Arrays.sort(doubleArr);
     Arrays.sort(floatArr);
     Arrays.sort(shortArr);
     
     byte byteKey = 35; 
     char charKey = 'q'; 
     int intKey = 22; 
     double doubleKey = 1.5; 
     float floatKey = 3.5f; 
     short shortKey = 5; 
     
     System.out.println(byteKey + " found at index = "
             +Arrays.binarySearch(byteArr,byteKey)); 
System.out.println(charKey + " found at index = "
             +Arrays.binarySearch(charArr,charKey)); 
System.out.println(intKey + " found at index = "
             +Arrays.binarySearch(intArr,intKey)); 
System.out.println(doubleKey + " found at index = "
             +Arrays.binarySearch(doubleArr,doubleKey)); 
System.out.println(floatKey + " found at index = "
             +Arrays.binarySearch(floatArr,floatKey)); 
System.out.println(shortKey + " found at index = "
             +Arrays.binarySearch(shortArr,shortKey)); 

System.out.println("key from collections"+ Collections.binarySearch(col, key));
System.out.println("key from collections"+ Collections.binarySearch(comp, key1,Collections.reverseOrder()));

    }

}
