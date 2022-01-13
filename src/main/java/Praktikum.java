public class Praktikum {

    public static void main(String[] args) {
        String name = "Тестовое Имя";
        Account account = new Account(name);
        Boolean result = account.checkNameToEmboss();
        System.out.println(result);
    }
}