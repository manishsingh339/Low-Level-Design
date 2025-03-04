package designpatterns.chainOfResponsibility;

class FrontDesk extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("General Inquiry")) {
            System.out.println("Front Desk is handling the request.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}

class TechnicalSupport extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("Technical Issue")) {
            System.out.println("Technical Support is handling the request.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}


class Manager extends SupportHandler {
    @Override
    public void handleRequest(String requestType) {
        if (requestType.equals("Manager Issue")) {
            System.out.println("Manager is handling the request.");
        } else if(nextHandler != null) {
            nextHandler.handleRequest(requestType);
        }
    }
}