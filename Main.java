import java.util.function.Function;

public class Main {
    public static void main(String... args){
        FunctionHolder holder = new FunctionHolder();

        holder.setMyFunction(/*Blank*/);

        Function<String, String> myFunction = holder.getMyFunction();



        String result = /*Blank*/;

        System.out.println(result);
        // Should print: Hello World!
    }
}

class FunctionHolder{
    Function<String, String> myFunction = null;

    void setMyFunction(Function<String, String> myFunction){
        this.myFunction = myFunction;
    }

    Function<String, String> getMyFunction(){
        return myFunction;
    }
}
