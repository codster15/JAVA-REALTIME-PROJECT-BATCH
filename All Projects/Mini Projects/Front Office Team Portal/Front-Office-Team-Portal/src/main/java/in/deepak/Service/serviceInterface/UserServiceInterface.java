package in.deepak.Service.serviceInterface;


import in.deepak.FormBinding.SignupFormBinding;
import in.deepak.FormBinding.loginFormBinding;
import in.deepak.FormBinding.unlockAccountFormBinding;

public interface UserServiceInterface {

    public boolean login(loginFormBinding loginForm);


    public boolean Registration(SignupFormBinding signUp);


    public String forgetPassword(String emailId);


    public String unlockAccount (unlockAccountFormBinding unlock);


}
