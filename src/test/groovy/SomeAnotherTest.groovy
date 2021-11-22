import org.junit.jupiter.api.Timeout
import spock.lang.Specification

class SomeAnotherTest extends Specification {

    def "check objMeth"() {
        def name = "Sara"
        def obj = new User(1, name)
        expect:
        obj.name == "Sara"
    }

    def "check objMeth1"() {
        setup:
        def obj = new User(1, "Sara")
        expect:
        obj.name == c
        b == 2
        where:
        b | c
        2 | "Sara"
    }

    @Timeout(2000L)
    def "check objMeth3"() {
        setup:
        def list = [1, 2, 3]
        when:
        list.add(12)
        list.add(13)
        list.add(14)
        then:
        list.get(5) == 14
        Thread.sleep(1000)
        println "SomeAnotherTest.check objMeth3"
    }


    def "check_test_with_parameters"(int a, int b, int c) {
        expect:
        Math.min(a, b) == c

        where:
        a  | b  | c
        7  | 7  | 7
        22 | 45 | 22
        -1 | 3  | -1
        0  | 0  | 0
    }
}
