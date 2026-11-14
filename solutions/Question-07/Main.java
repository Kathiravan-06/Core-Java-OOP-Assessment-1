import java.util.*;
interface AccessControl {
    String getRole();
    int getAccessLevel();
    boolean canAccess(int requiredLevel);
}
class Developer implements AccessControl {
    public String getRole() {
        return "Developer";
    }
    public int getAccessLevel() {
        return 1;
    }
    public boolean canAccess(int level) {
        return getAccessLevel() >= level;
    }
}
class Manager implements AccessControl {
    public String getRole() {
        return "Manager";
    }
    public int getAccessLevel() {
        return 2;
    }
    public boolean canAccess(int level) {
        return getAccessLevel() >= level;
    }
}
class Administrator implements AccessControl {
    public String getRole() {
        return "Administrator";
    }
    public int getAccessLevel() {
        return 3;
    }
    public boolean canAccess(int level) {
        return getAccessLevel() >= level;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int requiredLevel = sc.nextInt();
        AccessControl user;
        switch (type) {
            case 1:
                user = new Developer();
                break;
            case 2:
                user = new Manager();
                break;
            default:
                user = new Administrator();
        }
        System.out.println("Role: " + user.getRole());
        System.out.println("Access Level: " + user.getAccessLevel());
        System.out.println("Can Access: " + user.canAccess(requiredLevel));
    }
}
