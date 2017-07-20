package com.eteration.dp.creational.abstractfactory;
public class WindowsFactory implements GUIFactory {

    
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}