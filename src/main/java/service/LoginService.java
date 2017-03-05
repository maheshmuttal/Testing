package service;

import dao.LoginDAO;

/**
 * Created by Maheshwar Muttal on 3/4/2017.
 */
public class LoginService  {

    public String validateUserName(LoginDAO loginDAO) throws Exception{

        String userName = "TestUser";
        String password = "TestUser";
        if(loginDAO.getUserName() == null || loginDAO.getPassword() ==null){
            throw new Exception("User Name and Password should be entered");
        }
        if(loginDAO.getUserName().equalsIgnoreCase(userName)){

            if(loginDAO.getPassword() .equalsIgnoreCase(password)){
                return "Success";
            } else {
               throw new Exception("Password is not matching.");
            }
        } else {

             throw new Exception("User Name not found");
        }

    }
}
