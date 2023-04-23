package Assignment11;

import java.util.Objects;

public class Key {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Key(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return firstName.equals(key.firstName) &&
                lastName.equals(key.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
