
package vttp2022.myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class ExampleByChun {

    //variables
    List<String> shoppingCart = new ArrayList<String>();
    Console cons =  System.console();
    boolean stop = false;
    String input;

    //main loop
    while (!stop){
        input=cons.readLine();
        System.out.prinf("READ: %\n", input);

        String[] terms = input.split("");

        switch (terms[0]){
            case "add":
                break;
            
            case "list":
                if (cart.size() > 0){
                    for (int i = 0; i < cat.size(); i++){
                        System.out.printf("%d %s\n", (i+1), cart.get(i));
                    }
                }else{
                    System.out.println("Your cart is empty.");
                }
                break;
            
            case "del":
                
                break;

            case "end":
                break;
            
            default:


        }
    }
    
}
