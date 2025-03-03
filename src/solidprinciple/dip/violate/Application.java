package solidprinciple.dip.violate;

class MySQLDatabase {
    void connect() { System.out.println("Connected to MySQL"); }
}

class Application {
    private MySQLDatabase db = new MySQLDatabase();

    void start() {
        db.connect();
    }
}
