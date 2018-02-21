import java.util.ArrayList;
import java.util.List;

public class Subtraction {
    public static void main(String[] args) {
        System.out.println("This is about adding two integer numbers.");
        int a = 10;
        int b = 20;
        int sub = a - b;
        System.out.println("The sub is " + sub);
    }

    int sub(int a, int b){
        return a-b;
    }

    float subf(float a, float b){
        return a-b;
    }

    Integer sub_wrapper(Integer a, Integer b){
        return a-b;
    }



    List sub(List listA, List listB){
        List list=new ArrayList();
        list.addAll(listA);
        list.addAll(listB);
        return list;
    }

}
