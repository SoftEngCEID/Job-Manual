public class User
{       
    private String username;
    private String password;
    private String email;
    private String profile_category;
    
    public User(){}
    
    public User(String username, String password, String email, String profile_category) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.profile_category = profile_category; 
    }
    
    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getEmail(){
        return email;
    }

    public String getProfile_category(){
        return profile_category;
    }

    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public void setProfile_category(String profile_category){
        this.profile_category = profile_category;
    }
}

class Candid_User extends User
{
    public Candid_User(){
        super();
    }

    public Candid_User(String username, String password, String email, String profile_category) {
        super(username, password, email, profile_category);
    }

    private String name, last_name, address, birth_date, nationality, phone_number;

    public void Insert_data(String newName, String newLast, String newAdd, String newBirth, String newNation, String newPhone){
        this.name = newName;
        this.last_name = newLast;
        this.address = newAdd;
        this.birth_date = newBirth;
        this.nationality = newNation;
        this.phone_number = newPhone;
    }

    public void Insert_name(String newName){
        this.name = newName;
    }

    public void Insert_lastname(String newLast){
        this.last_name = newLast;
    }

    public void Insert_adress(String newAdd){
        this.address = newAdd;
    }

    public void Insert_newBirth(String newBirth){
        this.birth_date = newBirth;
    }

    public void Insert_newnationality(String newnationality){
        this.nationality = newnationality;
    }

    public void Insert_newphone_number(String newphone_number){
        this.phone_number = newphone_number;
    }

    public String Get_Data(){
        String s = "Name: " + name + "\nLast name: " + last_name + "\nAddress: " + address + "\nBirthday: " + birth_date + "\nNationality: " + nationality + "\nPhone number: " + phone_number;
        return s;
    }
}

class Employer_user extends User{

    public Employer_user(){
        super();
    }

    public Employer_user(String username, String password, String email, String profile_category) {
        super(username, password, email, profile_category);
    }

    private String business_description;
    private String fund_date;

    //Setters
    public void setBusiness_description(String business_description) {
        this.business_description = business_description;
    }

    public void setFund_date(String fund_date) {
        this.fund_date = fund_date;
    }

    //Getters
    public String getBusiness_description() {
        return business_description;
    }
    
    public String getFund_date() {
        return fund_date;
    }
}