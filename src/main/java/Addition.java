import java.util.ArrayList;
import java.util.List;

public class Addition {
    public static void main(String[] args) {
        System.out.println("This is about adding two integer");
        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println("the sum is" + sum);
    }

    int sum(int a, int b){
        return a+b;
    }

    float sumf(float a, float b){
        return a+b;
    }

    Integer sum_wrapper(Integer a, Integer b){
        return a+b;
    }


    String sum(String fname, String lname)
    {
        return fname+lname;
    }
    List sum(List listA, List listB){
        List list = new ArrayList();
        list.addAll(listA);
        list.addAll(listB);
        return list;
    }
}
