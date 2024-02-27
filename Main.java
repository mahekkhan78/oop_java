class Emerging_Technologie {
    void forum() {
        System.out.println("Forum: General Emerging Technologies Forum");
    }
}

class AIDS extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:Mahek Khan");
        System.out.println("Forum Vice President:khushi");
        System.out.println("Forum Secretary:khushbir");
        System.out.println("Forum Treasurer: muskan");
        System.out.println("Event Head:shreya");
    }
}

class AIML extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:isha ");
        System.out.println("Forum Vice President:ayushi ");
        System.out.println("Forum Secretary:achal ");
        System.out.println("Forum Treasurer:pranjal");
        System.out.println("Event Head:sakshi");
    }
}

class CSE extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President:ankita");
        System.out.println("Forum Vice President:dimple");
        System.out.println("Forum Secretary:srushti");
        System.out.println("Forum Treasurer:pranali");
        System.out.println("Event Head:shreyanshi");
    }
}

public class Main {
    public static void main(String[] args) {
        AIML aimlForum = new AIML();
        AIDS aidsForum = new AIDS();
        CSE cseForum = new CSE();

        System.out.println("AIML Forum Details:");
        aimlForum.forum();
        System.out.println();

        System.out.println("AIDS Forum Details:");
        aidsForum.forum();
        System.out.println();

        System.out.println("CSE Forum Details:");
        cseForum.forum();
    }
}
