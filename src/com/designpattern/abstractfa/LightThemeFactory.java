package com.designpattern.abstractfa;

public class LightThemeFactory implements GUIFactory {
    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
