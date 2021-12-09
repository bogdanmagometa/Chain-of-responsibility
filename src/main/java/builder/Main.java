package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().firstName("Bohdan")
                .age(18)
                .occupation("programming")
                .occupation("UCU")
                .lastName("Mahometa")
                .build();
        System.out.println(user);
    }
}
