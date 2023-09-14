package groovy.blog

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class TodoControllerSpec extends Specification implements ControllerUnitTest<TodoController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
