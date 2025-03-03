package solidprinciple.dip.follow;

interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() { System.out.println("Connected to MySQL"); }
}

class PostgreSQLDatabase implements Database {
    public void connect() { System.out.println("Connected to PostgreSQL"); }
}

class Application {
    private Database db;

    Application(Database db) { this.db = db; }

    void start() {
        db.connect();
    }
}

