package Addressbook;

public class contact {
    private String name;
    private String phoneno;

    private String email;

    public contact(String name, String phoneno, String email) {
        this.name = name;
        this.phoneno = phoneno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name:" +name+ "\tPhone Number:" +phoneno+ "\tEmail:" +email;
    }
}
