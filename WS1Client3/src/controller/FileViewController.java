package controller;

import java.rmi.RemoteException;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import se.lu.ics.grupp14.WebService1SoapProxy;

public class FileViewController {
	/*@FXML 
	private TextField textBox;*/
	@FXML
	private TextArea textArea;
	@FXML
	private ComboBox<String> comboBox;
	@FXML 
	private Label lblResponse;
	
	WebService1SoapProxy proxy = new WebService1SoapProxy();
	private Main main;
	
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
		populateComboBox();
	}
	
	public void populateComboBox() {
		
		try {
			for(String s : proxy.returnFiles()) {
				comboBox.getItems().add(s);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@FXML
	public void comboBox() {
		String s = comboBox.getValue();
		try {
			textArea.setText(proxy.readFile(s));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*@FXML
	public void btnSearch() throws Exception {
		String s = textBox.getText();
		
		if (s.isEmpty()) {
			lblResponse.setText("Please enter a text file");
			System.out.println("Första if");
		//} else if (proxy.returnFiles()) {
			//lblResponse.setText("Please enter a valid text file");
		}else { 
			textArea.setText(proxy.readFile(s));
			lblResponse.setText(" ");
			System.out.println("Andra if");
			}
	}*/
	
	@FXML
	public void btnGoBack() throws Exception {
		main.navigate(Main.Pages.HOME);
	}
	
	
}
