package com.designpattern.abstractfa;

public class DarkThemeFactory implements GUIFactory {
    public Button createButton() {
        return new DarkButton();
    }

    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

