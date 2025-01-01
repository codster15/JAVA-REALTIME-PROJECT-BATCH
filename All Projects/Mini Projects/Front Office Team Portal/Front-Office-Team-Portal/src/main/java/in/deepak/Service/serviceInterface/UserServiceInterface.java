package in.deepak.Service.serviceInterface;


import in.deepak.FormBinding.SignupFormBinding;
import in.deepak.FormBinding.loginFormBinding;
import in.deepak.FormBinding.unlockAccountFormBinding;

public interface UserServiceInterface {

    public String login(loginFormBinding loginForm);


    public String Registration(SignupFormBinding signUp);


    public String forgetPassword(String emailId);


    public String unlockAccount (unlockAccountFormBinding unlock);


}
