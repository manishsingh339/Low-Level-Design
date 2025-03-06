package designpatterns.bridge;

public interface Color {
    void applyColor();
}

class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("\t Applying red color");
    }
}

class Green implements Color {
    @Override
    public void applyColor() {
        System.out.println("\t Applying green color");
    }
}
