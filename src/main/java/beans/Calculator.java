package beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public void summ(int a,int b){
        System.out.println("summ="+(a+b));
    }
}
