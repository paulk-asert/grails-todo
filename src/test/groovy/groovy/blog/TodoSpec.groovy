package groovy.blog

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TodoSpec extends Specification implements DomainUnitTest<Todo> {

     void "test domain constraints"() {
        when:
        Todo domain = new Todo()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
