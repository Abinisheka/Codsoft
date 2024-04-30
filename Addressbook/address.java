package Addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class address {
    private ArrayList<contact>C=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public void addcontact(){
        System.out.println("Enter Name:");
        String name=sc.nextLine();
        System.out.println("Enter Phone Number:");
        String phn=sc.nextLine();
        System.out.println("Enter the Email:");
        String em=sc.nextLine();


        contact con=new contact(name,phn,em);
        C.add(con);
        System.out.println("Contacts Added Successfully!");

    }

    public void viewcontact(){
        if(C.isEmpty()){
            System.out.println("Address book is empty");
        }
        else {
            System.out.println("***  Contacts  ***");
            for (contact con:C){
                System.out.println(con);
            }
        }
            }

    public void editcontact(){
        if(C.isEmpty()){
            System.out.println("Address book is empty!! you can't edit");
            return;
        }
        System.out.println("Enter the contact name to edit:");
        String search=sc.nextLine();
        for (contact con:C){
            if(con.getName().equalsIgnoreCase(search)){
                System.out.println("Enter the Phone number:");
                String newph=sc.nextLine();
                con.setPhoneno(newph);

                System.out.println("Enter the Email: ");
                String  newem=sc.nextLine();
                con.setEmail(newem);

                System.out.println("Contact Details Updated Successfully!!");
                return;
            }
        }
        System.out.println("Contact Details not found");
    }

    public void deletecontact(){
        if (C.isEmpty()){
            System.out.println("No data!! you cannot edit");
            return;
        }
        System.out.println("Enter the contact to delete:");
        String sn=sc.nextLine();

        for (int i=0;i<C.size();i++){
            if(C.get(i).getName().equalsIgnoreCase(sn)){
                C.remove(i);
                System.out.println("**Contact Deleted**");
                return;
            }
        }
        System.out.println("Contact not found");

    }

    public void display(){
        while (true){
            System.out.println("\n***  Welcome to Address Book System  ***");
            System.out.println("1.Add Contact");
            System.out.println("2.View Contact");
            System.out.println("3.Edit Contact");
            System.out.println("4.Delete Contact");
            System.out.println("5.Exit");

            System.out.println("Enter your choice:");
            int ch=Integer.parseInt(sc.nextLine());

            switch (ch){
                case 1:
                    addcontact();
                    break;
                case 2:
                    viewcontact();
                    break;
                case 3:
                    editcontact();
                    break;
                case 4:
                    deletecontact();
                    break;
                case 5:
                    System.out.println("Exited Succesfully");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }






    public static void main(String[] args) {
        address add=new address();
        add.display();
    }
}
