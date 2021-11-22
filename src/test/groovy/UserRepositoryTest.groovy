import spock.lang.Specification

class UserRepositoryTest extends Specification {

    def "Meth"() {
        setup:
        def username = "John"
        def user = new User(2, username)
        def userRepMock=Spy(UserRepository)
        UserRepository userRepository=new UserRepository()

    }
}
