public class Account {

    private final String name;

    public Account(String name) {
        if (name == null) {
            throw new NullPointerException("Имя не может быть пустым");
        }
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.matches("(?=.{3,19}$)[А-Яа-я]+\\s[А-Яа-я]+");
    }

}
