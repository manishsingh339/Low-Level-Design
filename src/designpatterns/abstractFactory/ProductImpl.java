package designpatterns.abstractFactory;

class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Window Button");
    }
}

class WindowCheckbox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Checking Window Checkbox");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}

class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Linux Button");
    }
}

class MacCheckbox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Checking Mac Checkbox");
    }
}

class LinuxCheckbox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Checking Linux Checkbox");
    }
}


