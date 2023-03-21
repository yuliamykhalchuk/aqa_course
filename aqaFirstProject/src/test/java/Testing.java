import data.User;
import org.testng.annotations.Test;
import util.PropertiesReader;

public class Testing {
    @Test
    public void testConfiguration(){
        System.out.println(PropertiesReader.getProperty("base.ui.url"));
        System.out.println(PropertiesReader.getProperty("base.ui.user"));
        System.out.println(PropertiesReader.getProperty("base.ui.password"));
    }
    @Test
    public void testUser() {
        User newUser = new User();
        newUser.createUser(newUser);
        newUser.deleteUser(newUser);
    }
}