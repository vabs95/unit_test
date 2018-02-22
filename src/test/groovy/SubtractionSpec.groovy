import com.sun.javafx.animation.TickCalculation
import spock.lang.Specification;

public class SubtractionSpec extends Specification{
    def subtraction;

    void setup(){
        subtraction=new Subtraction()
    }

    void "canaryTest"(){
        println "This is canary test"
        expect:
        true
    }

    void "testTheSubtractWithTwoInts"(){

        setup:
        def a=10
        def b=20

        when:
        def sub = subtraction.sub(b,a)
        then:
        sub==10
    }

    void "testTheSubtractWithTwoFloat"(){

        given:
        def a=10.1
        def b=20.2

        expect:
        subtraction.subf(b,a) == 10.1 // resulting error

    }

    void "testTheSubtractWithTwoInteger"(){

        given:
        def a=Integer.valueOf(10)
        def b=Integer.valueOf(20)

        expect:
        subtraction.sub_wrapper(b,a) == Integer.valueOf(10) 

    }
}
