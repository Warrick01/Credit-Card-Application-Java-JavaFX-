package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private Button cancelButton;

    @FXML
    private TextField checkingsAccount;

    @FXML
    private TextField customerID;

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML 
    private TextField address;
    
    @FXML
    private TextField phoneNumber;

    @FXML
    private Button saveButton;

    @FXML
    private TextField savingsAccount;

    int custID;
    
   

   
   public void saveButtonPressed(ActionEvent event) throws IOException {
    	// save text from fields into a textFile
	   
	
	   	try {
		   custID = Integer.parseInt(customerID.getText()); // converts the customer ID to and integer. this will be put through a series of tests
		   
	   if (customerID.getText().length() > 4) {
		   System.out.println("Customer ID can only be four digits in length ");
	   }else {
		   
		    File file = new File(customerID.getText().toString());
	    	FileWriter fw = new FileWriter(file);
	    	PrintWriter pw = new PrintWriter(fw);
		    pw.println("Customer First Name: " + fName.getText().toString() +"\n");
	    	pw.println("Customer Last Name: " + lName.getText().toString() +"\n");
	    	pw.println("Customer  ID: " + customerID.getText().toString() +"\n");
	    	pw.println("Customer Phone Number: " + phoneNumber.getText().toString() +"\n");
	    	pw.println("Customer Address: " + address.getText().toString() +"\n");
	    	pw.println("Checkings Account number: " + checkingsAccount.getText().toString() +"\n");
	    	pw.println("Savings Account number: " + savingsAccount.getText().toString() +"\n");
	    	
	    	pw.close();
	    	
	    	System.out.println("Successful login");
		   
	   }
    	
    	
	   }
	   catch(NumberFormatException e){
		   System.out.println("Customer ID must contain only numbers");
	   }
	   catch(Exception e) {
		   System.out.print("Error");
	   }
   }
   
   
   public void cancelButtonPressed(ActionEvent event) {
	fName.clear();
	lName.clear();
	customerID.clear();
	phoneNumber.clear();
	address.clear();
	checkingsAccount.clear();
	savingsAccount.clear();
	
   	//Platform.exit();
   	System.out.println("Cancel Button Pressed");
   }

  
}
