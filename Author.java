public class Author {
    private String fname, lname, email;

    public Author(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }
    public String getFname() {
        return this.fname;
    }
    public String getLname() {
        return this.lname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAuthorData() {
        return String.format("NAME: %s %s\nEMAIL: %s\n", this.fname, this.lname, this.email);
    }
}
