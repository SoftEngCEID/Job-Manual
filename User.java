import java.util.Scanner;
import java.util.Map;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class User
{       
    private String username;
    private String password;
    private String email;
    private String profile_category;
    
    public User(String username, String password, String email, String profile_category) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.profile_category = profile_category; 
    }

    // Setter
    public void setName(String newUsername, String newPassword, String newEmail) {
        this.username = newUsername;
        this.password = newPassword;
        this.email = newEmail;
    }
}

class Candid_User extends User
{
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

    public String Get_Data(){
        String s = "Name: " + name + "\nLast name: " + last_name + "\nAddress: " + address + "\nBirthday: " + birth_date + "\nNationality: " + nationality + "\nPhone number: " + phone_number;
        return s;
    }

    public void Insert_Bio(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Bio: ");

        String bio1 = myObj.nextLine();
        
        System.out.println("Do you want it to be public?\nYES: Press 1\tNO: Press 2");
        int choice = myObj.nextInt();
        boolean istrue;
        switch(choice){
            case 1:
                istrue = true;
            case 2:
                istrue = false;
            default:
                istrue = false;
        }

        Biography bio = new Biography(bio1, istrue);
        System.out.println(bio.getBio());
        System.out.println(bio.getis_Public());
    }
}

class Employer_user extends User{

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