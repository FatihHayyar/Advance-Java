package AdvanceJavaPractice.Enums;

public class Userr {
    private String username;
    private Role role;

    public Userr(String username, Role role) {
        this.username = username;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Userr{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

}
