import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dao.LoginDAO;
import org.junit.Assert;
import org.junit.Test;
import service.LoginService;
import sun.security.util.PendingException;

public class LoginTestRunner {

    LoginService loginService = new LoginService();

    @Given("^Users Existing valid Username \"([^\"]*)\" and password \"([^\"]*)\" to login\\.$")
    public void users_Existing_valid_Username_and_password_to_login(String userName, String password) throws Exception {

        LoginDAO loginDAO = new LoginDAO(userName, password);
        String result =  loginService.validateUserName(loginDAO);
        Assert.assertEquals(result, "Success");
    }

/*

    @Given("^Users does not enter any Username \"([^\"]*)\" and password \"([^\"]*)\" to login\\.$")
    @Test( expected = Exception.class)
    public void users_does_not_enter_any_Username_and_password_to_login(String userName, String password) throws Throwable {
        LoginDAO loginDAO = new LoginDAO(userName, password);
        String result =  loginService.validateUserName(loginDAO);
        //Assert.(result, "User Name and Password should be entered");
    }*/
/*

    @When("^User does not enter the Username and password in the respective fields and click on Login Button\\.$")
    public void user_does_not_enter_the_Username_and_password_in_the_respective_fields_and_click_on_Login_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Application Displays a Message \"([^\"]*)\"$")
    public void application_Displays_a_Message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Users enter Invalid Username \"([^\"]*)\" and Vaild Password \"([^\"]*)\" to login\\.$")
    public void users_enter_Invalid_Username_and_Vaild_Password_to_login(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enters Invalid Username and Valid password in the respective fields and click on Login Button\\.$")
    public void user_enters_Invalid_Username_and_Valid_password_in_the_respective_fields_and_click_on_Login_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^Users enter Valid Username \"([^\"]*)\" and Invalid Password \"([^\"]*)\" to login\\.$")
    public void users_enter_Valid_Username_and_Invalid_Password_to_login(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User enters Valid Username and an Invalid password in the respective fields and click on Login Button\\.$")
    public void user_enters_Valid_Username_and_an_Invalid_password_in_the_respective_fields_and_click_on_Login_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
*/


}
