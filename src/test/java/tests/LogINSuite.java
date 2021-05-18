package tests;

import org.testng.annotations.Test;
import pages.HomeMenu;

public class LogINSuite extends BaseTest {

    @Test
    public void correctUserLogIn(){
        HomeMenu menu = new HomeMenu(_driver);

        menu.GoHomePage();
        menu.LoginUser("Selenium", "prueba123");
        menu.verifyUserLogIn();

        System.out.println("Test correctUserLogIn OK");
    }
 
    @Test
    public void wrongUserPasswordLogIN(){
        HomeMenu menu = new HomeMenu(_driver);

        menu.GoHomePage();
        menu.LoginUser("Selenium", "badpass");
        menu.verifyWrongPass();

        System.out.println("Test wrongUserPasswordLogIN OK");
    }

    @Test
    public void correctUserLogOut(){
        HomeMenu menu = new HomeMenu(_driver);

        menu.GoHomePage();
        menu.LoginUser("Selenium", "prueba123");
        menu.LogOutUser();

        menu.verifyLogOutUser();

        System.out.println("Test correctUserLogOut OK");
    }
}