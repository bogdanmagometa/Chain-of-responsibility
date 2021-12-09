package builder;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        user = User.builder().firstName("Ivan")
                .age(19)
                .occupation("boxing")
                .occupation("dancing")
                .lastName("Popov")
                .build();
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("User(firstName=Ivan, lastName=Popov, occupations=[boxing, dancing], gender=null, age=19, weight=0)", user.toString());
    }
}