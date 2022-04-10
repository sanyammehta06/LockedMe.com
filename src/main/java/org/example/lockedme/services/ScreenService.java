package org.example.lockedme.services;

import org.example.lockedme.screens.FileOptionsScreen;
import org.example.lockedme.screens.Screen;
import org.example.lockedme.screens.WelcomeScreen;
import org.example.lockedme.entities.Directory;


public class ScreenService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();
    
    

    public static Screen CurrentScreen = WelcomeScreen;

    
    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
