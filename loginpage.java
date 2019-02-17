package project;

import java.awt.Graphics;
import java.io.Closeable;


import javax.swing.JOptionPane;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.image.Image;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Alert;

import javafx.scene.control.TextField;

//inheritance
public class loginpage extends Application implements EventHandler<ActionEvent> {
 double canvasHeight = 800;
 double canvasWeight = 800;
 String days = "morning";
		TextField perposYInput = new TextField();
		TextField Password = new TextField();
		TextField Username = new TextField();
		TextField buildingSizeInput = new TextField();
	static GraphicsContext gc;
	Abstract demo = new Abstract(2);
  double movement; 
  boolean trigger=true;
  double steps;
  /**
   * setting images
   * 
   * 
   */
	Image b1 = new Image(getClass().getResourceAsStream("1bar.jpg")); //**setting images
	Image b2 = new Image(getClass().getResourceAsStream("2bar.jpg"));
	Image b3 = new Image(getClass().getResourceAsStream("3bar.jpg"));
	Image b4 = new Image(getClass().getResourceAsStream("4bar.jpg"));
	/**
	 * below is label item
	 */

	
	/** calls application and sets up program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args); 
		
	}
	private void drawSystem() {
		house1(demo.get_server().get_firt_group().get_house(0));
		System.out.println(demo.get_server().get_firt_group().get_house(0).get_battery().Get_energy());
		house2(demo.get_server().get_firt_group().get_house(1));
		house3(demo.get_server().get_firt_group().get_house(2));
		house4(demo.get_server().get_firt_group().get_house(3));
		house5(demo.get_server().get_firt_group().get_house(4));
		house6(demo.get_server().get_firt_group().get_house(5));
	}
	private void house1(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 50,0,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b2, 50,0,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 50,0,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b3, 50,0,50,50);
		}
	
	}
	private void house2(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 250,0,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b1, 250,0,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b1, 250,0,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b1, 250,0,50,50);
		}
		
	}
	private void house3(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 450,0,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b1, 450,0,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b1, 450,0,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b1, 450,0,50,50);
		}
	
	}
	private void house4(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 50,150,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b1, 50,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b1, 50,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b1, 50,150,50,50);
		}
		
	}
	private void house5(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 250,150,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b1, 250,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b1, 250,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b1, 250,150,50,50);
		}
		
	}
	private void house6(House target)
	{
		if(target.get_battery().Get_energy()<25)
		{
			gc.drawImage(b1, 450,150,50,50);
		}
		else if(target.get_battery().Get_energy()<50)
		{
			gc.drawImage(b1, 450,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b1, 450,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b1, 450,150,50,50);
		}
		
	}
	
	private void morening_act()
	{
		demo.chargeup(6);
		//demo.daily_cost(3);
	}
	private void night_act()
	{
		demo.charge_from_supply();
		//demo.night_cost();
	}
	/*private void donation()
	{
		demo.get_server().community_transfer(demo.get_server().get_firt_group(),demo.get_server().get_group(1));
	}*/
  /**
   * defines the static timer
   * creates a timer
   * define dynamic timer
   * getting difference between static and dynamic
   * adds them to a double until it becomes 1
   * when its 1 it triggers the update function of the person
   * draws out images
   * by default the timer will start when the button is pressed
   */
	private void animationTimer() {
		final long startNanoTime = System.nanoTime();
		new AnimationTimer()			// create timer
    	{
    		public void handle(long currentNanoTime) {
    				// define handle for what do at this time
    			if(trigger==true) {
    				movement = (currentNanoTime - startNanoTime) / 100000000.0;
    				trigger=false;
    			} 
    			steps+= movement;
    			if (steps >=1) {
    				if(days =="morning")
    				{
    					morening_act();

    				}
    				else
    				{
    					night_act();
    				}
    				 
    				steps=0; //sets it back to zero so everytime it moves one step
    			
    				
    			}
    	
    			drawSystem();
    		}
    	}.start();
		}
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("BuildingGUI");
		primaryStage.setOnCloseRequest(e -> closeProgram());

		/** file menu
		 *  menu items
		 *  shows the about message
		 */
		
		//Building Buttons
		VBox midMenu = new VBox();
		
			midMenu.setSpacing(50);
			
			 //room input

			// Create Buttons
			Button HbuttonA = new Button("start"); // create building on button press
			HbuttonA.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					animationTimer();
				}
				
			});
			Button HbuttonB = new Button("Night"); // create building on button press
			HbuttonB.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					
				}
				
			});
			Button HbuttonC = new Button("Donation"); // create building on button press
			HbuttonC.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					
				}
				
			});
			Button HbuttonD = new Button("Bill calculation"); // create building on button press
			HbuttonD.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					
				}
				
			});
			Button HbuttonE = new Button("Log-in"); // create building on button press
			HbuttonE.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					
				}
				
			});
			Button HbuttonF = new Button("Log-in"); // create building on button press
			HbuttonE.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					
				}
				
			});
	
	
			
			HbuttonA.setPrefWidth(120);
			HbuttonA.setPrefHeight(40);
			HbuttonB.setPrefWidth(120);
			HbuttonB.setPrefHeight(40);
			HbuttonC.setPrefWidth(120);
			HbuttonC.setPrefHeight(40);
			HbuttonD.setPrefWidth(120);
			HbuttonD.setPrefHeight(40);
			HbuttonE.setPrefWidth(120);
			HbuttonE.setPrefHeight(40);
			HbuttonF.setPrefWidth(120);
			HbuttonF.setPrefHeight(40);
			HBox line1 = new HBox();
			HBox line2 = new HBox();
			HBox line3 = new HBox();
			line1.getChildren().addAll(HbuttonA,HbuttonB);
			line2.getChildren().addAll(HbuttonC,HbuttonD);
			line3.getChildren().addAll(HbuttonE,HbuttonF);
			line3.setSpacing(50);
			line1.setSpacing(50);
			line2.setSpacing(50);
			midMenu.getChildren().addAll(line1,line2,line3); //add multiple Buttons 
			
			
		
	
		Canvas canvas = new Canvas( canvasHeight, canvasWeight );
		// and canvas to draw in
	// root.getChildren().addAll( canvas );			// and add canvas to group
		
		
	gc = canvas.getGraphicsContext2D();
		
			BorderPane bp = new BorderPane();
			drawSystem();
			bp.setCenter(midMenu);
			 bp.setRight(canvas);
			Scene scene = new Scene(bp);
			/*primaryStage.setHeight(250);
			primaryStage.setWidth(300);*/
			primaryStage.setMaximized(true);
			//primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	

	protected Graphics getGraphics() {
		// TODO Auto-generated method stub
		return null;
	}
	private Object closeProgram() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void showAbout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void handle(ActionEvent event) {

	}

}
