package com.nttdata.ProgFuncionalEj2;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
    	
    	BigDecimal acumulador = new BigDecimal(0);
    	
//    	BigDecimal costeTotal = shopping.stream().reduce(acumulador, (BigDecimal total, Product item)->{ 
//    		BigDecimal valorConIva = new BigDecimal("0.0");
//    		BigDecimal multiplicadorImpuesto = new BigDecimal(1 + item.tax.getPercent());
//    		valorConIva = item.price.multiply(multiplicadorImpuesto);
//    		total = total.add(valorConIva);
//    		return total;
//    	});
    	
    	Double total = shopping.stream().mapToDouble(subtotal -> subtotal.price.doubleValue()*(1+subtotal.tax.percent)).sum();
    	
    	System.out.println("Total: " + total);
    	
    	String itemsConC = shopping.stream().filter(item -> item.name.startsWith("C")).map(x -> x.name).collect(Collectors.joining(","));
    	
    	System.out.println("Empieza por C: " + itemsConC);
    	
    }
}
