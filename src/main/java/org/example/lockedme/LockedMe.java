package org.example.lockedme;

import org.example.lockedme.screens.WelcomeScreen;

public class LockedMe {

    public static void main(String[] args) {
    	
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.introWS();
    	welcome.GetUserInput();

    }
}
