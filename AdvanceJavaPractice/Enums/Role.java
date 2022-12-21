package AdvanceJavaPractice.Enums;

public enum Role {
    Role_admin("Admin"),
    Role_Teacher("Teacher"),
    Role_Student("Student");

    String name;

    Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
