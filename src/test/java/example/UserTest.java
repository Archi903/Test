package example;

import org.example.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    private static final String CORRECT_LOGIN = "login";
    private static final String CORRECT_EMAIL = "login@mail.ru";
    private static final String CORRECT_ADDRESS = "@mail.ru";


    @Test
    public void addTwoParameters (){
        User user = new User(CORRECT_LOGIN,CORRECT_EMAIL);
        Assertions.assertEquals(CORRECT_LOGIN,user.getLogin());
        Assertions.assertEquals(CORRECT_EMAIL,user.getEmail());
    }

    @Test
    public void addNoParameters (){
        User user = new User();
        Assertions.assertNull(user.getLogin());
        Assertions.assertNull(user.getEmail());
    }

    @Test
    public void correctTypeOfEmailAddress(){
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertTrue(user.getEmail().contains(CORRECT_ADDRESS));
    }

    @Test
    public void checkThatLoginAndEmailNotSame(){
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        Assertions.assertNotEquals(user.getEmail(), user.getLogin());
    }
}
