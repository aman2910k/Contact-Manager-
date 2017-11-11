/*
 *  Contact Manager Program is a phone-book kind of desktop application used for Adding a new record(All fields required),
 *  Deleting an unwanted record (SSN is required for Deletion), Updating few fields of record(SSN is required for Updation,
 *  Searching a record from the database( Program searches on any fields, if none specific field is given then it gives data of all persons)
 *  
 *  Written by AMAN SACHAN for CS6390.004, Assignment 4, Starting Oct 20, 2017.
 *  NetID: axs174330
 */
package contactmanager;
/**
 *
 * @author AMAN
 */

/* ContactManager is my main Class and it is also calling the JFrame named SearchPage()*/
public class ContactManager {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SearchPage sp =new SearchPage();
        sp.show();
    }
    
}
