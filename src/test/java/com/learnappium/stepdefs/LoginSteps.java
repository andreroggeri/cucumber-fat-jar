package com.learnappium.stepdefs;

import com.learnappium.pageobject.LoginPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginSteps {

    @Autowired
    private LoginPage loginPage;

    @Given("that the user is authenticated")
    public void thatTheUserIsAuthenticated() {
        loginPage.loginWithEmail("email", "password");
    }

}
