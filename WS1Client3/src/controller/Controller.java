package controller;

import java.lang.reflect.Array;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import se.lu.ics.grupp14.*;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;



public class Controller implements Initializable {
	
	@FXML 
	private TextField textBox;
	@FXML
	private TextArea textArea;
	@FXML
	private ComboBox<String> comboBox;
	@FXML
	private TableView<Astronaut> tableViewAstronaut;
	@FXML
	private TableColumn<Astronaut, Number> columnID;
	@FXML
	private TableColumn<Astronaut, String> columnName;
	@FXML
	private TableColumn<Astronaut, String> columnRank;
	@FXML
	private TableColumn<Astronaut, String> columnSpaceshipRegNbr;
	@FXML
	private TableView<Spaceship> tableViewSpaceship;
	@FXML
	private TableColumn<Spaceship, String> columnRegNbr;
	@FXML
	private TableColumn<Spaceship, String> columnHomestation;
	@FXML
	private ListView<String> listView = new ListView<String>();
	@FXML
	private ListView<String> listViewAstronaut = new ListView<String>();
	@FXML
	private ListView<String> listViewSpaceship = new ListView<String>();
	@FXML 
	private Label lblResponse;
	
	private ObservableList<Astronaut> astronautList;
	private ObservableList<Spaceship> spaceshipList;
	
	WebService1SoapProxy proxy = new WebService1SoapProxy();
	private Main main;
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		//ObservableList<String> files = FXCollections.observableArrayList();
		//ObeservableList <String> fileList = (ObservableList<String>)proxy.returnFiles();	
		
		columnID.setCellValueFactory(data -> new SimpleIntegerProperty(data.getValue().getAstronautID()));
		columnName.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getName()));
		columnRank.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getRank()));
		//columnSpaceshipRegNbr.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getSpaceShip()));
		//columnRegNbr.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getRegNbr()));
		try {
			astronautList = FXCollections.observableArrayList(Arrays.asList(proxy.readAstronaut()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tableViewAstronaut.setItems(astronautList);
	}
		
		
	public Main getMain() {
		return main;
	}
	
	
	
	public void setMain(Main main) {
		this.main = main;
		/*try {
			for(String s : proxy.returnFiles()) {
				System.out.println(s);
				//comboBox.getItems().add(s);
			}
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		updateList();*/
	}/*
	
	public void updateList() {
		try {
			astronautList = FXCollections.observableArrayList(Arrays.asList(proxy.readAstronaut()));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//tableViewAstronaut.getItems().clear();
		//tableViewAstronaut.setItems(astronautList);
	}
	
	@FXML
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
	public void GoToFileView() throws Exception {
		main.navigate(Main.Pages.FILEVIEW);
	}
	
	@FXML
	public void BtnGoBack() throws Exception {
		main.navigate(Main.Pages.HOME);
	}
	@FXML
	public void GoToShowData() throws Exception {
		main.navigate(Main.Pages.SHOWDATA);
		//UpdateListView();
	}
	@FXML
	public void btnShowSpaceship() throws Exception {
	}
	
	@FXML
	public void comboBox() {
		
	}
	
	/*@FXML
	public void btnShowAstronaut() {
		System.out.println("Du är inne u showastronaut");
		try {
		System.out.println(proxy.readAstronaut());
		System.out.println(proxy.readFile("heej.txt"));
		ObservableList<Astronaut> aList = FXCollections.observableArrayList(Arrays.asList(proxy.readAstronaut()));
		System.out.println(aList);
		//listViewAstronaut.getItems().addAll(aList);
			for(Astronaut a : aList) { 
				listViewAstronaut.getItems().add(a.getName( )+ "  Rank: " + a.getRank()+ "  Spaceship " + a.getSpaceShip());			
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
	public void UpdateListView() {
		listView.getItems().clear();
		
		try {
			
			Astronaut[] b = proxy.readAstronaut();
			
			//System.out.println(b[0]);
			System.out.println(proxy.readAstronaut());
			for(Astronaut a : proxy.readAstronaut()) {
				System.out.println("jaaaag");
				listView.getItems().add(a.toString());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	
}
