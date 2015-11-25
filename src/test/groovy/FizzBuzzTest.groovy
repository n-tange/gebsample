import spock.lang.Specification
import spock.lang.Unroll;

class FizzBuzzTest extends Specification{
    @Unroll
    def "check(Integer i)は引数が#valueだったら#expectを返す"() {
        setup:
        def fizzbuzz = new FizzBuzz()
        when:
        def actual = fizzbuzz.check(value)
        then:
        actual == expect
        where:
        value | expect
        1     | 1
        2     | 2
        3     | "Fizz"
        4     | 4
        5     | "Buzz"
        6     | "Fizz"
        7     | 7
        8     | 8
        9     | "Fizz"
        10    | "Buzz"
        11    | 11
        12    | "Fizz"
        13    | 13
        14    | 14
        15    | "FizzBuzz"
        16    | 16
        
        
        
    }
}