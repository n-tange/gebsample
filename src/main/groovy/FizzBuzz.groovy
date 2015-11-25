class FizzBuzz {
    def check(Integer i){
        def base = {checkVal, word, target -> (target % checkVal == 0) ? word : "" }
        def fizz = base.curry(3, "Fizz")
        def buzz = base.curry(5, "Buzz")
        fizz(i) + buzz(i) ?: i
    }
}
