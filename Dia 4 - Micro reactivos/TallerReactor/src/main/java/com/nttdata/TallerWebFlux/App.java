package com.nttdata.TallerWebFlux;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import reactor.core.publisher.Flux;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	 Flux<String> messageSender = Flux.just("Mensaje1","Mensaje2","Mensaje3");
    	 
    	 messageSender.subscribe(
    			 subscribe -> System.out.println("Observer1.suscribed"),
    			 next -> System.out.println("Observer1.received " + next),
    			 error -> System.out.println("Observer1.Error: " + error.getMessage()),
    			 complete -> System.out.println("Observer1.completed")
    		 
    	  );
    	 
//    	 messageSender.subscribe(new Observer() {
//
//  			@Override
//  			public void onSubscribe(Disposable d) {
//
//  				System.out.println("Observer1.suscribed");
//  				
//  			}
//
//  			@Override
//  			public void onNext(Object t) {
//  				
//  				System.out.println("Observer1.received " + t);
//  				
//  			}
//
//  			@Override
//  			public void onError(Throwable e) {
//
//  				System.out.println("Observer1.Error: " + e.getMessage());
//  				
//  			}
//
//  			@Override
//  			public void onComplete() {
//
//  				System.out.println("Observer1.completed");
//  				
//  			} }
//    		 
//    	  );
    	 
    }
}
