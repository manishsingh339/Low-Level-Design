package designpatterns.abstractFactory;

class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowCheckbox();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckbox();
    }
}

class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new LinuxCheckbox();
    }
}
