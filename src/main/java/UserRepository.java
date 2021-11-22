public class UserRepository {
    public static User findOneByName(String name) {
        System.out.println("It's meth findOneByName");
        return new User(1, "John");
    }
}
