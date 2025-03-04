package designpatterns.state;

class DraftState implements DocumentState {
    public void edit(Document document) {
        System.out.println("Editing...");
    }
    public void publish(Document document) {
        System.out.println("Moving document to Moderation.");
        document.setState(new ModerationState());
    }
}


class ModerationState implements DocumentState {
    public void edit(Document document) {
        System.out.println("Editing is not allowed, document is in Moderation.");
    }
    public void publish(Document document) {
        document.setState(new PublishedState());
    }
}

class PublishedState implements DocumentState {
    @Override
    public void edit(Document document) {
        System.out.println("Editing is not allowed, document is already published.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document is already published.");
    }
}