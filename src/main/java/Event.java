public class Event {

private String firstName;

private String lastName;

private String company;

private String email;

private int phoneareacode;

private int phoneNo;

private String subject;

    public Event(String firstName, String lastName, String company, String email,
                 int phoneareacode, int phoneNo, String subject) {
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
        setEmail(email);
        setPhoneareacode(phoneareacode);
        setPhoneNo(phoneNo);
        setSubject(subject);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneareacode() {
        return phoneareacode;
    }

    public void setPhoneareacode(int phoneareacode) {
        this.phoneareacode = phoneareacode;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
