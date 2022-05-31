package vttp2022.myapp;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("good morning");

        String [] todos = new String[4];
        todos[0]= "learn java";
        todos[1]= "go jogging";
        todos[2]= "watch a movie";

        System.out.printf("Index: %d: value= %s\n", 0, todos[0]);
        System.out.printf("Index: %d: value= %s\n", 0, todos[1]);
        System.out.printf("Index: %d: value= %s\n", 0, todos[2]);
        System.out.printf("Index: %d: value= %s\n", 0, todos[3]);

        System.out.printf("Size of array: %d \n", todos.length);

        //size of args
        System.out.printf("Size of args: %d\n", args.length);
        System.out.printf("Size of args: %d\n", 0, args[0]);
        System.out.printf("Size of args: %d\n", 0, args[1]);
        

    }
}
