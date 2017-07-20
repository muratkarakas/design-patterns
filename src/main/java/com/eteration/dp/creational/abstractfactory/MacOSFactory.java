package com.eteration.dp.creational.abstractfactory;
public class MacOSFactory implements GUIFactory {

    
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}