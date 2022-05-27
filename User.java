public class User
{       
    private String username;
    private String password;
    private String email;
    
    // Setter
    public void setName(String newUsername, String newPassword, String newEmail) {
        this.username = newUsername;
        this.password = newPassword;
        this.email = newEmail;
    }
}

class Candid_User extends User
{
    public String name;
    public String last_name;
    public String address;
    public String birth_date;
    public String nationality;
    public int phone_number;
}

class Employer_User extends User
{
    public String business_description;
    public String fund_date;
}