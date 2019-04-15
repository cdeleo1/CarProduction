package main.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

import main.java.builder.Car;
import main.java.builder.CarBuilder;
import main.java.builder.CarDirector;
import main.java.builder.HondaSportsCarBuilder;
import main.java.builder.CustomCarBuilder;

public class OrderFrame extends JFrame
{
	static int MAIN_FRAME_WIDTH = 800;
	static int MAIN_FRAME_HEIGHT = 600;
	public static String dealerSel;
	public static String makeSel;
	public static String modelSel;
	public static String colorSel;
	public static String vehicleTypeSel;
	public static int numCylindersSel;
	public static String cabMaterialSel;
	public static String transmissionSel;
	public static double tireSizeSel;
	public static Boolean spoilerUpgradeSel;
	public static Boolean mufflerUpgradeSel;
	public static Boolean bodyKitUpgradeSel;
	public static Boolean engineUpgradeSel;
	
	public OrderFrame()
	{
		JFrame tabFrame = new JFrame();

		JTabbedPane tabbedPane = new JTabbedPane();
					
		JPanel homePanel = new JPanel();
		JPanel modelPanel = new JPanel();
		JPanel colorPanel = new JPanel();
		JPanel enginePanel = new JPanel();
		JPanel cabMaterialPanel = new JPanel();
		JPanel transmissionPanel = new JPanel();
		JPanel tireSizePanel = new JPanel();
		JPanel optionalUpgradesPanel = new JPanel();
		
		JButton applyButton = new JButton("Apply");
		JButton purchaseButton = new JButton("Purchase");
		
		JRadioButton dealerRB1 = new JRadioButton("Transit");
		JRadioButton dealerRB2 = new JRadioButton("Union");
		JRadioButton dealerRB3 = new JRadioButton("Creek View");
		JRadioButton dealerRB4 = new JRadioButton("Skyline");
		JRadioButton dealerRB5 = new JRadioButton("Orchard Park");
		
		JRadioButton makeRB1 = new JRadioButton("BMW");
		JRadioButton makeRB2 = new JRadioButton("Ford");
		JRadioButton makeRB3 = new JRadioButton("Honda");
		JRadioButton makeRB4 = new JRadioButton("Mazda");
		JRadioButton makeRB5 = new JRadioButton("Mitsubishi");
		
		JRadioButton modelRB1 = new JRadioButton("330ci");
		JRadioButton modelRB2 = new JRadioButton("Mustang");
		JRadioButton modelRB3 = new JRadioButton("Accord");
		JRadioButton modelRB4 = new JRadioButton("RX8");
		JRadioButton modelRB5 = new JRadioButton("Eclips");
		
		JRadioButton colorRB1 = new JRadioButton("White");
		JRadioButton colorRB2 = new JRadioButton("Red");
		JRadioButton colorRB3 = new JRadioButton("Blue");
		JRadioButton colorRB4 = new JRadioButton("Green");
		JRadioButton colorRB5 = new JRadioButton("Black");
		
		JRadioButton vehicleTypeRB1 = new JRadioButton("Gas");
		JRadioButton vehicleTypeRB2 = new JRadioButton("Electric");
		JRadioButton vehicleTypeRB3 = new JRadioButton("Hybrid");
		
		JRadioButton numCylindersRB1 = new JRadioButton("4");
		JRadioButton numCylindersRB2 = new JRadioButton("6");
		JRadioButton numCylindersRB3 = new JRadioButton("8");
		
		JRadioButton cabMaterialRB1 = new JRadioButton("Cloth");
		JRadioButton cabMaterialRB2 = new JRadioButton("Leather");
		
		JRadioButton transmissionRB1 = new JRadioButton("Automatic");
		JRadioButton transmissionRB2 = new JRadioButton("Manual");
		
		JRadioButton tireSizeRB1 = new JRadioButton("20.0");
		JRadioButton tireSizeRB2 = new JRadioButton("20.5");
		JRadioButton tireSizeRB3 = new JRadioButton("21.0");
		JRadioButton tireSizeRB4 = new JRadioButton("21.5");
		JRadioButton tireSizeRB5 = new JRadioButton("22.0");
		
		tabFrame.add(tabbedPane);
		tabFrame.setTitle("Car Shopper");
		tabFrame.setSize(MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		tabFrame.setLayout(null);
		tabFrame.setLocationRelativeTo(null); // Center the frame
		tabFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabFrame.setVisible(true);
		
		tabbedPane.add("Home", homePanel);
		tabbedPane.add("Model", modelPanel);
		tabbedPane.add("Color", colorPanel);
		tabbedPane.add("Engine", enginePanel);
		tabbedPane.add("Interior", cabMaterialPanel);
		tabbedPane.add("Transmission", transmissionPanel);
		tabbedPane.add("Tires", tireSizePanel);
		tabbedPane.add("Optional Upgrades", optionalUpgradesPanel);
		
		tabbedPane.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		tabbedPane.setVisible(true);
		
		// HOME PANEL SETUP //
		homePanel.add(applyButton);
		homePanel.add(purchaseButton);
		
		homePanel.add(makeRB1);
		homePanel.add(makeRB2);
		homePanel.add(makeRB3);
		homePanel.add(makeRB4);
		homePanel.add(makeRB5);
		
		homePanel.add(dealerRB1);
		homePanel.add(dealerRB2);
		homePanel.add(dealerRB3);
		homePanel.add(dealerRB4);
		homePanel.add(dealerRB5);
		
		homePanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		homePanel.setLayout(null);
		homePanel.setVisible(true);
		
		makeRB1.setBounds(25, 25, 100, 30);
		makeRB2.setBounds(25, 50, 100, 30);
		makeRB3.setBounds(25, 75, 100, 30);
		makeRB4.setBounds(25, 100, 100, 30);
		makeRB5.setBounds(25, 125, 100, 30);
		
		dealerRB1.setBounds(150, 25, 100, 30);
		dealerRB2.setBounds(150, 50, 100, 30);
		dealerRB3.setBounds(150, 75, 100, 30);
		dealerRB4.setBounds(150, 100, 100, 30);
		dealerRB5.setBounds(150, 125, 100, 30);
		
		applyButton.setBounds(550, 500, 100, 30);
		purchaseButton.setBounds(650, 500, 100, 30);
		
		// MODEL PANEL SETUP //
		modelPanel.add(modelRB1);
		modelPanel.add(modelRB2);
		modelPanel.add(modelRB3);
		modelPanel.add(modelRB4);
		modelPanel.add(modelRB5);
		
		modelPanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		modelPanel.setLayout(null);
		modelPanel.setVisible(true);
		
		modelRB1.setBounds(25, 25, 100, 30);
		modelRB2.setBounds(25, 50, 100, 30);
		modelRB3.setBounds(25, 75, 100, 30);
		modelRB4.setBounds(25, 100, 100, 30);
		modelRB5.setBounds(25, 125, 100, 30);
		
		// COLOR PANEL SETUP //
		colorPanel.add(colorRB1);
		colorPanel.add(colorRB2);
		colorPanel.add(colorRB3);
		colorPanel.add(colorRB4);
		colorPanel.add(colorRB5);
		
		colorPanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		colorPanel.setLayout(null);
		colorPanel.setVisible(true);
		
		colorRB1.setBounds(25, 25, 100, 30);
		colorRB2.setBounds(25, 50, 100, 30);
		colorRB3.setBounds(25, 75, 100, 30);
		colorRB4.setBounds(25, 100, 100, 30);
		colorRB5.setBounds(25, 125, 100, 30);
		
		// ENGINE PANEL SETUP //
		enginePanel.add(vehicleTypeRB1);
		enginePanel.add(vehicleTypeRB2);
		enginePanel.add(vehicleTypeRB3);
		
		enginePanel.add(numCylindersRB1);
		enginePanel.add(numCylindersRB2);
		enginePanel.add(numCylindersRB3);
		
		enginePanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		enginePanel.setLayout(null);
		enginePanel.setVisible(true);
		
		vehicleTypeRB1.setBounds(25, 25, 100, 30);
		vehicleTypeRB2.setBounds(25, 50, 100, 30);
		vehicleTypeRB3.setBounds(25, 75, 100, 30);
		
		numCylindersRB1.setBounds(150, 25, 100, 30);
		numCylindersRB2.setBounds(150, 50, 100, 30);
		numCylindersRB3.setBounds(150, 75, 100, 30);
		
		// CAB MATERIAL PANEL SETUP //
		cabMaterialPanel.add(cabMaterialRB1);
		cabMaterialPanel.add(cabMaterialRB2);
		
		cabMaterialPanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		cabMaterialPanel.setLayout(null);
		cabMaterialPanel.setVisible(true);
		
		cabMaterialRB1.setBounds(25, 25, 100, 30);
		cabMaterialRB2.setBounds(25, 50, 100, 30);
		
		// TRANSMISSION PANEL SETUP //
		transmissionPanel.add(transmissionRB1);
		transmissionPanel.add(transmissionRB2);
		
		transmissionPanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		transmissionPanel.setLayout(null);
		transmissionPanel.setVisible(true);
		
		transmissionRB1.setBounds(25, 25, 100, 30);
		transmissionRB2.setBounds(25, 50, 100, 30);
		
		// TIRE SIZE PANEL SETUP //
		tireSizePanel.add(tireSizeRB1);
		tireSizePanel.add(tireSizeRB2);
		tireSizePanel.add(tireSizeRB3);
		tireSizePanel.add(tireSizeRB4);
		tireSizePanel.add(tireSizeRB5);
		
		tireSizePanel.setBounds(0, 0, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
		tireSizePanel.setLayout(null);
		tireSizePanel.setVisible(true);
		
		tireSizeRB1.setBounds(25, 25, 100, 30);
		tireSizeRB2.setBounds(25, 50, 100, 30);
		tireSizeRB3.setBounds(25, 75, 100, 30);
		tireSizeRB4.setBounds(25, 100, 100, 30);
		tireSizeRB5.setBounds(25, 125, 100, 30);
		
		//////////////// 	APPLY BUTTON ACTION 	/////////////////
		applyButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				CarDirector carDirector = new CarDirector();
				CarBuilder customCarBuilder = new CustomCarBuilder();
				carDirector.MakeCar(customCarBuilder);
				Car customCar = customCarBuilder.GetCar();
			    System.out.println(customCar);
				System.out.println("Price: "+customCar.Price);
			}
		});
		
		//////////////// 	PURCHASE BUTTON ACTION 	/////////////////
		purchaseButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Purchase Complete");
			}
		}); 
		
		//////////////// 	MAKE SELECTION 			/////////////////
		makeRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(makeRB1.isSelected()==true) {
					makeSel = makeRB1.getText();
					System.out.println("Selected Make: "+makeRB1.getText());
					makeRB2.setEnabled(false);
					makeRB3.setEnabled(false);
					makeRB4.setEnabled(false);
					makeRB5.setEnabled(false); } 
				else if(makeRB1.isSelected()==false) {
					makeRB2.setEnabled(true);
					makeRB3.setEnabled(true);
					makeRB4.setEnabled(true);
					makeRB5.setEnabled(true);
				}
				
				int i;
				String dealerStr = "";
				
				for (i = 0; i < Main.allDealersInventory.length; i++) {
					if (makeSel == Main.allDealersInventory[i][1]) {
						dealerStr = Main.allDealersInventory[i][0];
					}
				}
				
				if (dealerRB1.getText() == dealerStr) {
					dealerRB1.setSelected(true);
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB2.getText() == dealerStr) {
					dealerRB2.setSelected(true);
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB3.getText() == dealerStr) {
					dealerRB3.setSelected(true);
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); }
				else if (dealerRB4.getText() == dealerStr) {
					dealerRB4.setSelected(true);
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB5.getText() == dealerStr) {
					dealerRB5.setSelected(true);
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
				}
			}	
		}); 
		
		makeRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(makeRB2.isSelected()==true) {
					makeSel = makeRB2.getText();
					System.out.println("Selected Make: "+makeRB2.getText());
					makeRB1.setEnabled(false);
					makeRB3.setEnabled(false);
					makeRB4.setEnabled(false);
					makeRB5.setEnabled(false); } 
				else if(makeRB2.isSelected()==false) {
					makeRB1.setEnabled(true);
					makeRB3.setEnabled(true);
					makeRB4.setEnabled(true);
					makeRB5.setEnabled(true);
				}

				int i;
				String dealerStr = "";
				
				for (i = 0; i < Main.allDealersInventory.length; i++) {
					if (makeSel == Main.allDealersInventory[i][1]) {
						dealerStr = Main.allDealersInventory[i][0];
					}
				}
				
				if (dealerRB1.getText() == dealerStr) {
					dealerRB1.setSelected(true);
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB2.getText() == dealerStr) {
					dealerRB2.setSelected(true);
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB3.getText() == dealerStr) {
					dealerRB3.setSelected(true);
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); }
				else if (dealerRB4.getText() == dealerStr) {
					dealerRB4.setSelected(true);
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB5.getText() == dealerStr) {
					dealerRB5.setSelected(true);
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
				}
			}	
		}); 
		
		makeRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(makeRB3.isSelected()==true) {
					makeSel = makeRB3.getText();
					System.out.println("Selected Make: "+makeRB3.getText());
					makeRB1.setEnabled(false);
					makeRB2.setEnabled(false);
					makeRB4.setEnabled(false);
					makeRB5.setEnabled(false); } 
				else if(makeRB3.isSelected()==false) {
					makeRB1.setEnabled(true);
					makeRB2.setEnabled(true);
					makeRB4.setEnabled(true);
					makeRB5.setEnabled(true);
				}
				
				int i;
				String dealerStr = "";
				
				for (i = 0; i < Main.allDealersInventory.length; i++) {
					if (makeSel == Main.allDealersInventory[i][1]) {
						dealerStr = Main.allDealersInventory[i][0];
					}
				}
				
				if (dealerRB1.getText() == dealerStr) {
					dealerRB1.setSelected(true);
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB2.getText() == dealerStr)  {
					dealerRB2.setSelected(true);
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB3.getText() == dealerStr) {
					dealerRB3.setSelected(true);
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false);} 
				else if (dealerRB4.getText() == dealerStr) {
					dealerRB4.setSelected(true);
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB5.getText() == dealerStr) {
					dealerRB5.setSelected(true);
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
				}
			}	
		}); 
		
		makeRB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(makeRB4.isSelected()==true) {
					makeSel = makeRB4.getText();
					System.out.println("Selected Make: "+makeRB4.getText());
					makeRB1.setEnabled(false);
					makeRB2.setEnabled(false);
					makeRB3.setEnabled(false);
					makeRB5.setEnabled(false); } 
				else if(makeRB4.isSelected()==false) {
					makeRB1.setEnabled(true);
					makeRB2.setEnabled(true);
					makeRB3.setEnabled(true);
					makeRB5.setEnabled(true);
				}
				
				int i;
				String dealerStr = "";
				
				for (i = 0; i < Main.allDealersInventory.length; i++) {
					if (makeSel == Main.allDealersInventory[i][1]) {
						dealerStr = Main.allDealersInventory[i][0];
					}
				}
				
				if (dealerRB1.getText() == dealerStr) {
					dealerRB1.setSelected(true);
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB2.getText() == dealerStr) {
					dealerRB2.setSelected(true);
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB3.getText() == dealerStr) {
					dealerRB3.setSelected(true);
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB4.getText() == dealerStr) {
					dealerRB4.setSelected(true);
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB5.getText() == dealerStr) {
					dealerRB5.setSelected(true);
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
				}
			}	
		}); 
		
		makeRB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(makeRB5.isSelected()==true) {
					makeSel = makeRB5.getText();
					System.out.println("Selected Make: "+makeRB5.getText());
					makeRB1.setEnabled(false);
					makeRB2.setEnabled(false);
					makeRB3.setEnabled(false);
					makeRB4.setEnabled(false); } 
				else if(makeRB5.isSelected()==false) {
					makeRB1.setEnabled(true);
					makeRB2.setEnabled(true);
					makeRB3.setEnabled(true);
					makeRB4.setEnabled(true);
				}
				
				int i;
				String dealerStr = "";
				
				for (i = 0; i < Main.allDealersInventory.length; i++) {
					if (makeSel == Main.allDealersInventory[i][1]) {
						dealerStr = Main.allDealersInventory[i][0]; 
					}
				}
				
				if (dealerRB1.getText() == dealerStr) {
					dealerRB1.setSelected(true);
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB2.getText() == dealerStr) {
					dealerRB2.setSelected(true);
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB3.getText() == dealerStr) {
					dealerRB3.setSelected(true);
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false);} 
				else if (dealerRB4.getText() == dealerStr) {
					dealerRB4.setSelected(true);
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false); } 
				else if (dealerRB5.getText() == dealerStr) {
					dealerRB5.setSelected(true);
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false); 
				}
			}	
		}); 
		
		//////////////// 	DEALERSHIP SELECTION 			/////////////////
		dealerRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dealerRB1.isSelected()==true) {
					dealerSel = dealerRB1.getText();
					System.out.println("Selected Dealership: "+dealerRB1.getText());
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false);
				} else if(dealerRB1.isSelected()==false) {
					dealerRB2.setEnabled(true);
					dealerRB3.setEnabled(true);
					dealerRB4.setEnabled(true);
					dealerRB5.setEnabled(true);
		}	}	}); 
		
		dealerRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dealerRB2.isSelected()==true) {
					dealerSel = dealerRB2.getText();
					System.out.println("Selected Dealership: "+dealerRB2.getText());
					dealerRB1.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false);
				} else if(dealerRB2.isSelected()==false) {
					dealerRB1.setEnabled(true);
					dealerRB3.setEnabled(true);
					dealerRB4.setEnabled(true);
					dealerRB5.setEnabled(true);
		}	}	}); 
		
		dealerRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dealerRB3.isSelected()==true) {
					dealerSel = dealerRB3.getText();
					System.out.println("Selected Dealership: "+dealerRB3.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB4.setEnabled(false);
					dealerRB5.setEnabled(false);
				} else if(dealerRB3.isSelected()==false) {
					dealerRB1.setEnabled(true);
					dealerRB2.setEnabled(true);
					dealerRB4.setEnabled(true);
					dealerRB5.setEnabled(true);
		}	}	}); 
		
		dealerRB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dealerRB4.isSelected()==true) {
					dealerSel = dealerRB4.getText();
					System.out.println("Selected Dealership: "+dealerRB4.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB5.setEnabled(false);
				} else if(dealerRB4.isSelected()==false) {
					dealerRB1.setEnabled(true);
					dealerRB2.setEnabled(true);
					dealerRB3.setEnabled(true);
					dealerRB5.setEnabled(true);
		}	}	}); 
		
		dealerRB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dealerRB5.isSelected()==true) {
					dealerSel = dealerRB5.getText();
					System.out.println("Selected Dealership: "+dealerRB5.getText());
					dealerRB1.setEnabled(false);
					dealerRB2.setEnabled(false);
					dealerRB3.setEnabled(false);
					dealerRB4.setEnabled(false);
				} else if(dealerRB5.isSelected()==false) {
					dealerRB1.setEnabled(true);
					dealerRB2.setEnabled(true);
					dealerRB3.setEnabled(true);
					dealerRB4.setEnabled(true);
		}	}	});
		
		////////////////	MODEL SELECTION 		/////////////////
		modelRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelRB1.isSelected()==true) {
					modelSel = modelRB1.getText();
					System.out.println("Selected Model: "+modelRB1.getText());
					modelRB2.setEnabled(false);
					modelRB3.setEnabled(false);
					modelRB4.setEnabled(false);
					modelRB5.setEnabled(false);
				} else if(modelRB1.isSelected()==false) {
					modelRB2.setEnabled(true);
					modelRB3.setEnabled(true);
					modelRB4.setEnabled(true);
					modelRB5.setEnabled(true);
		}	}	}); 

		modelRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelRB2.isSelected()==true) {
					modelSel = modelRB2.getText();
					System.out.println("Selected Model: "+modelRB2.getText());
					modelRB1.setEnabled(false);
					modelRB3.setEnabled(false);
					modelRB4.setEnabled(false);
					modelRB5.setEnabled(false);
				} else if(modelRB2.isSelected()==false) {
					modelRB1.setEnabled(true);
					modelRB3.setEnabled(true);
					modelRB4.setEnabled(true);
					modelRB5.setEnabled(true);
		}	}	}); 

		modelRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelRB3.isSelected()==true) {
					modelSel = modelRB3.getText();
					System.out.println("Selected Model: "+modelRB3.getText());
					modelRB1.setEnabled(false);
					modelRB2.setEnabled(false);
					modelRB4.setEnabled(false);
					modelRB5.setEnabled(false);
				} else if(modelRB3.isSelected()==false) {
					modelRB1.setEnabled(true);
					modelRB2.setEnabled(true);
					modelRB4.setEnabled(true);
					modelRB5.setEnabled(true);
		}	}	}); 

		modelRB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelRB4.isSelected()==true) {
					modelSel = modelRB4.getText();
					System.out.println("Selected Model: "+modelRB4.getText());
					modelRB1.setEnabled(false);
					modelRB2.setEnabled(false);
					modelRB3.setEnabled(false);
					modelRB5.setEnabled(false);
				} else if(modelRB4.isSelected()==false) {
					modelRB1.setEnabled(true);
					modelRB2.setEnabled(true);
					modelRB3.setEnabled(true);
					modelRB5.setEnabled(true);
		}	}	}); 

		modelRB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelRB5.isSelected()==true) {
					modelSel = modelRB5.getText();
					System.out.println("Selected Model: "+modelRB5.getText());
					modelRB1.setEnabled(false);
					modelRB2.setEnabled(false);
					modelRB3.setEnabled(false);
					modelRB4.setEnabled(false);
				} else if(modelRB5.isSelected()==false) {
					modelRB1.setEnabled(true);
					modelRB2.setEnabled(true);
					modelRB3.setEnabled(true);
					modelRB4.setEnabled(true);
		}	}	});
		
		////////////////	COLOR SELECTION 	/////////////////
		colorRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(colorRB1.isSelected()==true) {
					colorSel = colorRB1.getText();
					System.out.println("Selected Color: "+colorRB1.getText());
					colorRB2.setEnabled(false);
					colorRB3.setEnabled(false);
					colorRB4.setEnabled(false);
					colorRB5.setEnabled(false);
				} else if(colorRB1.isSelected()==false) {
					colorRB2.setEnabled(true);
					colorRB3.setEnabled(true);
					colorRB4.setEnabled(true);
					colorRB5.setEnabled(true);
		}	}	}); 

		colorRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(colorRB2.isSelected()==true) {
					colorSel = colorRB2.getText();
					System.out.println("Selected Color: "+colorRB2.getText());
					colorRB1.setEnabled(false);
					colorRB3.setEnabled(false);
					colorRB4.setEnabled(false);
					colorRB5.setEnabled(false);
				} else if(colorRB2.isSelected()==false) {
					colorRB1.setEnabled(true);
					colorRB3.setEnabled(true);
					colorRB4.setEnabled(true);
					colorRB5.setEnabled(true);
		}	}	}); 

		colorRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(colorRB3.isSelected()==true) {
					colorSel = colorRB3.getText();
					System.out.println("Selected Color: "+colorRB3.getText());
					colorRB1.setEnabled(false);
					colorRB2.setEnabled(false);
					colorRB4.setEnabled(false);
					colorRB5.setEnabled(false);
				} else if(colorRB3.isSelected()==false) {
					colorRB1.setEnabled(true);
					colorRB2.setEnabled(true);
					colorRB4.setEnabled(true);
					colorRB5.setEnabled(true);
		}	}	}); 

		colorRB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(colorRB4.isSelected()==true) {
					colorSel = colorRB4.getText();
					System.out.println("Selected Color: "+colorRB4.getText());
					colorRB1.setEnabled(false);
					colorRB2.setEnabled(false);
					colorRB3.setEnabled(false);
					colorRB5.setEnabled(false);
				} else if(colorRB4.isSelected()==false) {
					colorRB1.setEnabled(true);
					colorRB2.setEnabled(true);
					colorRB3.setEnabled(true);
					colorRB5.setEnabled(true);
		}	}	}); 

		colorRB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(colorRB5.isSelected()==true) {
					colorSel = colorRB5.getText();
					System.out.println("Selected Color: "+colorRB5.getText());
					colorRB1.setEnabled(false);
					colorRB2.setEnabled(false);
					colorRB3.setEnabled(false);
					colorRB4.setEnabled(false);
				} else if(colorRB5.isSelected()==false) {
					colorRB1.setEnabled(true);
					colorRB2.setEnabled(true);
					colorRB3.setEnabled(true);
					colorRB4.setEnabled(true);
		}	}	});
		
		////////////////	VEHICLE TYPE SELECTION 	/////////////////
		vehicleTypeRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vehicleTypeRB1.isSelected()==true) {
					vehicleTypeSel = vehicleTypeRB1.getText();
					System.out.println("Selected Class: "+vehicleTypeRB1.getText());
					vehicleTypeRB2.setEnabled(false);
					vehicleTypeRB3.setEnabled(false);
				} else if(vehicleTypeRB1.isSelected()==false) {
					vehicleTypeRB2.setEnabled(true);
					vehicleTypeRB3.setEnabled(true);
		}	}	}); 

		vehicleTypeRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vehicleTypeRB2.isSelected()==true) {
					vehicleTypeSel = vehicleTypeRB2.getText();
					System.out.println("Selected Class: "+vehicleTypeRB2.getText());
					vehicleTypeRB1.setEnabled(false);
					vehicleTypeRB3.setEnabled(false);
				} else if(vehicleTypeRB2.isSelected()==false) {
					vehicleTypeRB1.setEnabled(true);
					vehicleTypeRB3.setEnabled(true);
		}	}	}); 

		vehicleTypeRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(vehicleTypeRB3.isSelected()==true) {
					vehicleTypeSel = vehicleTypeRB3.getText();
					System.out.println("Selected Class: "+vehicleTypeRB3.getText());
					vehicleTypeRB1.setEnabled(false);
					vehicleTypeRB2.setEnabled(false);
				} else if(vehicleTypeRB3.isSelected()==false) {
					vehicleTypeRB1.setEnabled(true);
					vehicleTypeRB2.setEnabled(true);
		}	}	}); 

		////////////////	NUM CYLINDERS SELECTION 	/////////////////
		numCylindersRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numCylindersRB1.isSelected()==true) {
					numCylindersSel = Integer.parseInt(numCylindersRB1.getText());
					System.out.println("Selected Cylinders: "+numCylindersRB1.getText());
					numCylindersRB2.setEnabled(false);
					numCylindersRB3.setEnabled(false);
				} else if(numCylindersRB1.isSelected()==false) {
					numCylindersRB2.setEnabled(true);
					numCylindersRB3.setEnabled(true);
		}	}	}); 

		numCylindersRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numCylindersRB2.isSelected()==true) {
					numCylindersSel = Integer.parseInt(numCylindersRB2.getText());
					System.out.println("Selected Cylinders: "+numCylindersRB2.getText());
					numCylindersRB1.setEnabled(false);
					numCylindersRB3.setEnabled(false);
				} else if(numCylindersRB2.isSelected()==false) {
					numCylindersRB1.setEnabled(true);
					numCylindersRB3.setEnabled(true);
		}	}	}); 

		numCylindersRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(numCylindersRB3.isSelected()==true) {
					numCylindersSel = Integer.parseInt(numCylindersRB3.getText());
					System.out.println("Selected Cylinders: "+numCylindersRB3.getText());
					numCylindersRB1.setEnabled(false);
					numCylindersRB2.setEnabled(false);
				} else if(numCylindersRB3.isSelected()==false) {
					numCylindersRB1.setEnabled(true);
					numCylindersRB2.setEnabled(true);
		}	}	}); 
		
		////////////////	CAB MATERIAL SELECTION 	/////////////////
		cabMaterialRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cabMaterialRB1.isSelected()==true) {
					cabMaterialSel = cabMaterialRB1.getText();
					System.out.println("Selected Material: "+cabMaterialRB1.getText());
					cabMaterialRB2.setEnabled(false);
				} else if(cabMaterialRB1.isSelected()==false) {
					cabMaterialRB2.setEnabled(true);
		}	}	}); 

		cabMaterialRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cabMaterialRB2.isSelected()==true) {
					cabMaterialSel = cabMaterialRB2.getText();
					System.out.println("Selected Material: "+cabMaterialRB2.getText());
					cabMaterialRB1.setEnabled(false);
				} else if(cabMaterialRB2.isSelected()==false) {
					cabMaterialRB1.setEnabled(true);
		}	}	}); 
		
		////////////////	TRANSMISSION SELECTION 	/////////////////
		transmissionRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(transmissionRB1.isSelected()==true) {
					transmissionSel = transmissionRB1.getText();
					System.out.println("Selected Transmission: "+transmissionRB1.getText());
					transmissionRB2.setEnabled(false);
				} else if(transmissionRB1.isSelected()==false) {
					transmissionRB2.setEnabled(true);
		}	}	}); 

		transmissionRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(transmissionRB2.isSelected()==true) {
					transmissionSel = transmissionRB2.getText();
					System.out.println("Selected Transmission: "+transmissionRB2.getText());
					transmissionRB1.setEnabled(false);
				} else if(transmissionRB2.isSelected()==false) {
					transmissionRB1.setEnabled(true);
		}	}	}); 
		
		////////////////	TIRE SIZE SELECTION 	/////////////////
		tireSizeRB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tireSizeRB1.isSelected()==true) {
					tireSizeSel = Double.parseDouble(tireSizeRB1.getText());
					System.out.println("Selected Tire Size: "+tireSizeRB1.getText());
					tireSizeRB2.setEnabled(false);
					tireSizeRB3.setEnabled(false);
					tireSizeRB4.setEnabled(false);
					tireSizeRB5.setEnabled(false);
				} else if(tireSizeRB1.isSelected()==false) {
					tireSizeRB2.setEnabled(true);
					tireSizeRB3.setEnabled(true);
					tireSizeRB4.setEnabled(true);
					tireSizeRB5.setEnabled(true);
		}	}	}); 

		tireSizeRB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tireSizeRB2.isSelected()==true) {
					tireSizeSel = Double.parseDouble(tireSizeRB2.getText());
					System.out.println("Selected Tire Size: "+tireSizeRB2.getText());
					tireSizeRB1.setEnabled(false);
					tireSizeRB3.setEnabled(false);
					tireSizeRB4.setEnabled(false);
					tireSizeRB5.setEnabled(false);
				} else if(tireSizeRB2.isSelected()==false) {
					tireSizeRB1.setEnabled(true);
					tireSizeRB3.setEnabled(true);
					tireSizeRB4.setEnabled(true);
					tireSizeRB5.setEnabled(true);
		}	}	}); 

		tireSizeRB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tireSizeRB3.isSelected()==true) {
					tireSizeSel = Double.parseDouble(tireSizeRB3.getText());
					System.out.println("Selected Tire Size: "+tireSizeRB3.getText());
					tireSizeRB1.setEnabled(false);
					tireSizeRB2.setEnabled(false);
					tireSizeRB4.setEnabled(false);
					tireSizeRB5.setEnabled(false);
				} else if(tireSizeRB3.isSelected()==false) {
					tireSizeRB1.setEnabled(true);
					tireSizeRB2.setEnabled(true);
					tireSizeRB4.setEnabled(true);
					tireSizeRB5.setEnabled(true);
		}	}	}); 

		tireSizeRB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tireSizeRB4.isSelected()==true) {
					tireSizeSel = Double.parseDouble(tireSizeRB4.getText());
					System.out.println("Selected Tire Size: "+tireSizeRB4.getText());
					tireSizeRB1.setEnabled(false);
					tireSizeRB2.setEnabled(false);
					tireSizeRB3.setEnabled(false);
					tireSizeRB5.setEnabled(false);
				} else if(tireSizeRB4.isSelected()==false) {
					tireSizeRB1.setEnabled(true);
					tireSizeRB2.setEnabled(true);
					tireSizeRB3.setEnabled(true);
					tireSizeRB5.setEnabled(true);
		}	}	}); 

		tireSizeRB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(tireSizeRB5.isSelected()==true) {
					tireSizeSel = Double.parseDouble(tireSizeRB5.getText());
					System.out.println("Selected Tire Size: "+tireSizeRB5.getText());
					tireSizeRB1.setEnabled(false);
					tireSizeRB2.setEnabled(false);
					tireSizeRB3.setEnabled(false);
					tireSizeRB4.setEnabled(false);
				} else if(tireSizeRB5.isSelected()==false) {
					tireSizeRB1.setEnabled(true);
					tireSizeRB2.setEnabled(true);
					tireSizeRB3.setEnabled(true);
					tireSizeRB4.setEnabled(true);
		}	}	});
	}
}
