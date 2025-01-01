package in.deepak.Service.serviceImpl;

import in.deepak.FormBinding.SignupFormBinding;
import in.deepak.FormBinding.loginFormBinding;
import in.deepak.FormBinding.unlockAccountFormBinding;
import in.deepak.Service.serviceInterface.UserServiceInterface;

public class UserService implements UserServiceInterface {
    @Override
    public String login(loginFormBinding loginForm) {
        return "";
    }

    @Override
    public String Registration(SignupFormBinding signUp) {
        return "";
    }

    @Override
    public String forgetPassword(String emailId) {
        return "";
    }

    @Override
    public String unlockAccount(unlockAccountFormBinding unlock) {
        return "";
    }
}
