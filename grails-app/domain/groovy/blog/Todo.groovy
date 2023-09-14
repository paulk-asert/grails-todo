package groovy.blog

class Todo {
    String title
    String description
    LocalDate due
    LocalDate completed

    static constraints = {
        due mullable: true
        completed mullable: true
        description mullable: true
    }
}
