package groovy.blog

class TodoController {
    def index() {
        Todo.list()
    }
}