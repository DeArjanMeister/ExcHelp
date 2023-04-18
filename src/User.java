import java.util.HashMap;

public class User {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


//    public void login() {
//    Scanner scanner = new Scanner(System.in);
//    boolean loggedIn = false;
//    HashMap<String, String> userMap = new HashMap<>();
//        while (!loggedIn) {
//            System.out.println("Wil je inloggen of een account aanmaken?");
//            System.out.println("1. Inloggen");
//            System.out.println("2. Account aanmaken");
//            int choice = scanner.nextInt();
//
//            if (choice == 1) {
//                System.out.println("Voer je e-mailadres in:");
//                email = scanner.next();
//                System.out.println("Voer je wachtwoord in:");
//                password = scanner.next();
//
//                if (userMap.containsKey(email) && userMap.get(email).equals(password)) {
//                    System.out.println("Je bent ingelogd.");
//                    loggedIn = true;
//                } else {
//                    System.out.println("Ongeldige combinatie van e-mailadres en wachtwoord. Probeer opnieuw.");
//                }
//            } else if (choice == 2) {
//                System.out.println("Voer je e-mailadres in:");
//                email = scanner.next();
//                System.out.println("Voer je wachtwoord in:");
//                password = scanner.next();
//
//                if (userMap.containsKey(email)) {
//                    System.out.println("Dit e-mailadres is al in gebruik. Probeer een ander e-mailadres.");
//                } else {
//                    userMap.put(email, password);
//                    System.out.println("Je account is aangemaakt.");
//                    loggedIn = true;
//                }
//            } else {
//                System.out.println("Ongeldige keuze. Probeer opnieuw.");
//            }
//        }
//
//        scanner.close();
//    }