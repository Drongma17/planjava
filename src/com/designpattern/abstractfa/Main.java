package com.designpattern.abstractfa;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // Switch themes easily by changing this flag
        String theme = "dark";

        if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
