package designpatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler frontDesk = new FrontDesk();
        SupportHandler technicalSupport = new TechnicalSupport();
        SupportHandler manager = new Manager();

        frontDesk.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler(manager);

        frontDesk.handleRequest("General Inquiry");
        frontDesk.handleRequest("Technical Issue");
        frontDesk.handleRequest("Manager Issue");

    }
}
