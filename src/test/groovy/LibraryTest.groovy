/*
 * This Spock specification was auto generated by running 'gradle init --type groovy-library'
 * by 'n-tange' at '15/11/15 1:26' with Gradle 2.8
 *
 * @author n-tange, @date 15/11/15 1:26
 */

import spock.lang.Specification

class LibraryTest extends Specification{
    def "someLibraryMethod returns true"() {
        setup:
        Library lib = new Library()
        when:
        def result = lib.someLibraryMethod()
        then:
        result == true
    }
}
