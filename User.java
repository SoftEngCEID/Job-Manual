import java.util.Scanner;

public class User {
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
    public void setName(String newUsername) {
        this.username = newUsername;

    }

    public void setpasswrd(String newPassword) {

        this.password = newPassword;

    }

    public void setemail(String newEmail) {

        this.email = newEmail;

    }

    public void setprofile_category(String profile_category) {
        this.profile_category = profile_category;
        if (this.profile_category == "candidate") {

        } else if (this.profile_category == "employer") {

        } else {
            System.out.println("There are only two categories.Please select ");
        }

    }

    public String getprofile_category() {
        return profile_category;

    }

}

class Candid_User extends User {

    private String name, last_name, address, birth_date, nationality;
    private int phone_number;

    public Candid_User(String name, String last_name, String address, String birth_date, String nationality,
            int phone_number, String username, String password, String email, String profile_category) {
        super(username, password, email, profile_category);

    }

    public void Insert_name(String newName) {
        this.name = newName;
    }

    public void Insert_lastname(String newLast) {

        this.last_name = newLast;

    }

    public void Insert_adress(String newAdd) {
        this.address = newAdd;
    }

    public void Insert_newBirth(String newBirth) {
        this.birth_date = newBirth;
    }

    public void Insert_newnationality(String newnationality) {
        this.nationality = newnationality;
    }

    public void Insert_newphone_number(int newphone_number) {
        this.phone_number = newphone_number;
    }

    public String Get_Data() {
        String s = "Name: " + name + "\nLast name: " + last_name + "\nAddress: " + address + "\nBirthday: " + birth_date
                + "\nNationality: " + nationality;

        return s;
    }

    public int Get_phone() {

        System.out.println("Phone :");
        return phone_number;

    }

    /*
     * public void Insert_Bio() {
     * Scanner myObj = new Scanner(System.in);
     * System.out.println("Enter Bio: ");
     * 
     * String bio1 = myObj.nextLine();
     * 
     * System.out.println("Do you want it to be public?\nYES: Press 1\tNO: Press 2"
     * );
     * int choice = myObj.nextInt();
     * boolean istrue;
     * switch (choice) {
     * case 1:
     * istrue = true;
     * case 2:
     * istrue = false;
     * default:
     * istrue = false;
     * }
     * 
     * // Biography bio = new Biography(bio1, is
     * // System.out.println(bio.getBio());
     * // System.out.println(bio.getis_Public());
     * }
     */

}