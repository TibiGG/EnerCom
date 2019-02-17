package project;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.sun.media.jfxmediaimpl.HostUtils;

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
import java.net.*;
import javafx.scene.control.TextField;
/*******************************************************
 * 
 * i used my course work template 
 * ignore the commons please
 * code is messy because time limit, please value your eyes
 * interface was too rush
 * you might see some brain dead design , that's because i was doing it mid night
 * 
 * @author cv010737@reading@CS second year@zuqiang(zack)
 *
 */

public class THEMAIN extends Application implements EventHandler<ActionEvent> {
 double canvasHeight = 800;
 double canvasWeight = 800;
	ArrayList<Label> energyz = new ArrayList<Label>();
 String days = "morning";
		TextField perposYInput = new TextField();
		Random rand = new Random();
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
	
	public int[] GET_URL() {
		BufferedReader in = null;
		String result="";
	
		int[]datan=	 new int[3];
		try {
			URL url = new URL("https://api.thingspeak.com/channels/705365/feeds.json?api_key=XMKQAAA675WVZ2TN&results=2");
			URLConnection conne = url.openConnection();
			conne.connect();
			in = new BufferedReader(new InputStreamReader(conne.getInputStream()));
			String line;
			while((line = in.readLine())!=null)
			{
				
				result+=line+="\n";
				result=result.replaceAll("[^0-9]+", " ");
				String[] temp = result.split(" ");

				

				
				datan[0]=Integer.parseInt(temp[temp.length-5]);
				System.out.println(datan[0]);
				datan[1]=Integer.parseInt(temp[temp.length-3]);
				System.out.println(datan[1]);
				datan[2]=Integer.parseInt(temp[temp.length-1]);
				System.out.println(datan[2]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	        return datan;
		}
	private void drawSystem() {
		house1(demo.get_server().get_firt_group().get_house(0));
		
		house2(demo.get_server().get_firt_group().get_house(1));
		house3(demo.get_server().get_firt_group().get_house(2));
		house4(demo.get_server().get_firt_group().get_house(3));
		house5(demo.get_server().get_firt_group().get_house(4));
		house6(demo.get_server().get_firt_group().get_house(5));
		gd(demo.get_server().get_group(0).get_c_battery());
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
			gc.drawImage(b4, 50,0,50,50);
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
			gc.drawImage(b2, 250,0,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 250,0,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b4, 250,0,50,50);
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
			gc.drawImage(b2, 450,0,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 450,0,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b4, 450,0,50,50);
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
			gc.drawImage(b2, 50,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 50,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b4, 50,150,50,50);
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
			gc.drawImage(b2, 250,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 250,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b4, 250,150,50,50);
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
			gc.drawImage(b2, 450,150,50,50);
		}
		else if(target.get_battery().Get_energy()<75)
		{
			gc.drawImage(b3, 450,150,50,50);
		}
		else if(target.get_battery().Get_energy()<100)
		{
			gc.drawImage(b4, 450,150,50,50);
		}
		
	}
	private void gd(Energy_storage target)
	{
		if(target.Get_energy()<250)
		{
			gc.drawImage(b1, 0,500,150,150);
		}
		else if(target.Get_energy()<500)
		{
			gc.drawImage(b2, 0,500,150,150);
		}
		else if(target.Get_energy()<750)
		{
			gc.drawImage(b3, 0,500,150,150);
		}
		else if(target.Get_energy()<1000)
		{
			gc.drawImage(b4, 0,500,150,150);
		}
		
	}

	private void morening_act()
	{
		
		int[] dataz = GET_URL();
		for(int i=0;i<2;i++)
		{
		demo.get_server().get_firt_group().get_house(i).get_battery().charge(dataz[0]/100);
		}
		for(int i=2;i<4;i++)
		{
		demo.get_server().get_firt_group().get_house(i).get_battery().charge(dataz[1]/100);
		}
		for(int i=4;i<6;i++)
		{
		demo.get_server().get_firt_group().get_house(i).get_battery().charge(dataz[2]/100);
		}
		demo.daily_cost(2);
	}
	private void gd_control()
	{	
		double energy=0;
		for(int i=0;i<6;i++)
		{
			if(demo.get_server().get_firt_group().get_house(i).get_battery().Get_energy()>110)
			{
				demo.get_server().get_firt_group().get_house(i).get_battery().cost(50);
				energy+=50;
			}
			
		}
		demo.get_server().get_firt_group().get_c_battery().charge(energy);
		
	}
	private void night_act()
	{
		demo.charge_from_supply();
		demo.night_cost();
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
    					gd_control();
    					 updatetext();
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
	public void updatetext()
	{
		for(int i=0;i<6;i++)
		{
			energyz.get(i).setText("House "+Integer.toString(i+1)+": "+(String.valueOf(demo.get_server().get_firt_group().get_house(i).get_battery().Get_energy())));
		}
	}
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Community energy management");
		primaryStage.setOnCloseRequest(e -> closeProgram());

		/** file menu
		 *  menu items
		 *  shows the about message
		 */
		
		//Building Buttons
		VBox midMenu = new VBox();
		
			midMenu.setSpacing(20);
			
			 //room input

			// Create Buttons
			Button HbuttonA = new Button("morning"); // create building on button press
			HbuttonA.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					 animationTimer();
					
				}
				
			});
			Button HbuttonB = new Button("Night"); // create building on button press
			HbuttonB.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
					days = "night";
				
				}
				
			});
			Button HbuttonC = new Button("reset"); // create building on button press
			HbuttonC.setOnAction(new EventHandler<ActionEvent>() {	
				public void handle(ActionEvent event) {
				demo.get_server().get_firt_group().reset();
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
			for(int i=0;i<6;i++)
			{
				energyz.add(new Label(String.valueOf(demo.get_server().get_firt_group().get_house(i).get_battery().Get_energy())));
			}
			
			
			HBox line1 = new HBox();
			HBox line2 = new HBox();
			HBox line3 = new HBox();
			line1.getChildren().addAll(HbuttonA,HbuttonB,HbuttonC);
	
			line3.setSpacing(50);
			line1.setSpacing(50);
			line2.setSpacing(50);
			
			line3.getChildren().addAll(energyz.get(0),energyz.get(1),energyz.get(2),energyz.get(3),energyz.get(4),energyz.get(5));
			midMenu.getChildren().addAll(line1,line3); //add multiple Buttons 
			
			
		
	
		Canvas canvas = new Canvas( canvasHeight, canvasWeight );
		// and canvas to draw in
	// root.getChildren().addAll( canvas );			// and add canvas to group
		
		
	gc = canvas.getGraphicsContext2D();
		
			BorderPane bp = new BorderPane();
			drawSystem();
			bp.setCenter(midMenu);
			 bp.setRight(canvas);
			Scene scene = new Scene(bp);
			primaryStage.setHeight(700);
			primaryStage.setWidth(1000);
			//primaryStage.setMaximized(true);
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
