package com.nttdata.ProgFuncionalEj1;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> numbers = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
    	
    	Integer count = (int) numbers.stream().filter(num -> num>10).count();
    	
    	System.out.println(count);
    	
    }
}
