/*
 * The frame that holds all the fitness assessment forms. The date is set to editable(false) and is set
 * to the current date in yyyy-MM-dd format
 * The panels are tabbed, but the user can return to the Staff View by clicking cancel on any for the forms
 * 
 */

package Panels;
//dddd
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class FitnessGUI {
	//current date and time in yyyy-MM-dd format
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate currentDate = LocalDate.now();
	
	JButton cancel;
	JTabbedPane tabbedPane;
	JFrame AssessmentFrame;
	JScrollPane scrollPane;
	
	//Coronary Risk
	JPanel coronaryRiskPanel;
	JLabel systolicBP;
	JLabel diastolicBP;
	JLabel idealBodyWeight;
	JLabel physicalActivity;
	JLabel totalCholesteral;
	JLabel hdlRatio;
	JLabel hdlCholesterol;
	JLabel ldlCholesterol;
	JLabel triglycerides;
	JLabel glucose;


	JTextField systolicBPText;
	JTextField diastolicBPText;
	JTextField idealBodyWeightText;
	JTextField physicalActivityText;
	JTextField totalCholesteralText;
	JTextField hdlRatioText;
	JTextField hdlCholesterolText;
	JTextField ldlCholesterolText;
	JTextField triglyceridesText;
	JTextField glucoseText;
	JButton crButton;
	
	//Body Comp. Variables
	JPanel bodyCompPanel;
	JLabel BMI;
	JLabel domForearm;
	JLabel domArm;
	JLabel domThigh;
	JLabel abdomen;
	JLabel waistCircumference;
	JLabel hipCircumference;
	JLabel bodyCompProtocol;
	JLabel chest;
	JLabel midAxillary;
	JLabel triceps;
	JLabel subscapular;
	JLabel supralliac;
	JLabel thigh;
	JLabel percentBodyFat;
	JLabel leanWeight;
	JLabel fatWeight;
	JLabel desiredWeight;
	JTextField BMIText;
	JTextField domForearmText;
	JTextField domArmText;
	JTextField domThighText;
	JTextField abdomenText;
	JTextField waistCircumferenceText;
	JTextField hipCircumferenceText;
	JTextField bodyCompProtocolText;
	JTextField chestText;
	JTextField midAxillaryText;
	JTextField tricepsText;
	JTextField subscapularText;
	JTextField supralliacText;
	JTextField thighText;
	JTextField percentBodyFatText;
	JTextField leanWeightText;
	JTextField fatWeightText;
	
	JButton bcButton;
	
	//Strength and Flex Variables
	JPanel strengthAndFlex;
	JLabel accountNumber;
	JLabel firstName;
	JLabel lastName;
	JLabel trainerID;
	JLabel date;
	JLabel pushups;
	JLabel situps;
	JLabel sitReach;
	JTextField accountNumberText;
	JTextField firstNameText;
	JTextField lastNameText;
	JTextField trainerIDText;
	JTextField dateInput;
	JTextField pushUpsText;
	JTextField sitUpsText;
	JTextField sitReachText;
	JButton sfButton;
	
	
	//Aerobic Capacity Variables
	
	JPanel aerobicCapacity;
	JLabel heartRateMax;
	JLabel restedHeartRate;
	JLabel finalTestHeartRate;
	JLabel minTargetHeartRate;
	JLabel maxTargetHeartRate;
	JLabel protocol;
	JLabel timeInMin;
	JLabel maxVO2;
	JTextField heartRateMaxText;
	JTextField restedHeartRateText;
	JTextField finalTestHeartRateText;
	JTextField minTargetHeartRateText;
	JTextField maxTargetHeartRateText;
	JTextField protocolText;
	JTextField timeInMinText;
	JTextField maxVO2Text;
	JButton acButton;
	

	public void createAssessment() {
		// create the frame
		AssessmentFrame = new JFrame();
		AssessmentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		AssessmentFrame.setSize(500, 500);
		
		//create the tabbed pane
		tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(50, 50, 400, 400);
		
		/*
		 * create the strength and Flex Form
		 */
		strengthAndFlex = new JPanel();
		strengthAndFlex.setLayout(new GridBagLayout());
		GridBagConstraints sf = new GridBagConstraints();
		sf.fill = GridBagConstraints.HORIZONTAL;
		sf.insets = new Insets(0, 0, 10, 5);
	
	
		sf.gridx = 0;
		sf.gridy = 0;
		accountNumber = new JLabel("Account Number: ");
		strengthAndFlex.add(accountNumber, sf);
	
		sf.gridx = 1;
		sf.gridy = 0;
	
		accountNumberText = new JTextField(20);
		accountNumberText.setEditable(true);
		strengthAndFlex.add(accountNumberText, sf);
	
		sf.gridx = 0;
		sf.gridy = 1;
		firstName = new JLabel("FirstName: ");
		strengthAndFlex.add(firstName, sf);
	
		sf.gridx = 1;
		sf.gridy = 1;
		firstNameText = new JTextField(20);
		firstNameText.setEditable(true);
		strengthAndFlex.add(firstNameText, sf);
	
		sf.gridx = 0;
		sf.gridy = 2;
		lastName = new JLabel("LastName: ");
		strengthAndFlex.add(lastName, sf);
	
		sf.gridx = 1;
		sf.gridy = 2;

		lastNameText = new JTextField(20);
		lastNameText.setEditable(true);
		strengthAndFlex.add(lastNameText, sf);
		
		sf.gridx = 0;
		sf.gridy = 3;
		trainerID = new JLabel("Trainer ID: ");
		strengthAndFlex.add(trainerID, sf);
	
		sf.gridx = 1;
		sf.gridy = 3;

		trainerIDText = new JTextField(20);
		trainerIDText.setEditable(true);
		strengthAndFlex.add(trainerIDText, sf);
	
		sf.gridx = 0;
		sf.gridy = 4;
		date = new JLabel("Date: ");
		strengthAndFlex.add(date, sf);
	
		sf.gridx = 1;
		sf.gridy = 4;
		dateInput = new JTextField(dtf.format(currentDate));
		dateInput.setEditable(false);
		strengthAndFlex.add(dateInput, sf);
	
		sf.gridx = 0;
		sf.gridy = 5;
		pushups = new JLabel("Push Ups: ");
		strengthAndFlex.add(pushups, sf);
	
		sf.gridx = 1;
		sf.gridy = 5;
		pushUpsText = new JTextField(5);
		pushUpsText.setEditable(true);
		strengthAndFlex.add(pushUpsText, sf);
	
		sf.gridx = 0;
		sf.gridy = 6;
		situps = new JLabel("Sit Ups: ");
		strengthAndFlex.add(situps, sf);
	
		sf.gridx = 1;
		sf.gridy = 6;
		sitUpsText = new JTextField(5);
		sitUpsText.setEditable(true);
		strengthAndFlex.add(sitUpsText, sf);
	
		sf.gridx = 0;
		sf.gridy = 7;
		sitReach = new JLabel("Sit Reach: ");
		strengthAndFlex.add(sitReach, sf);
	
		sf.gridx = 1;
		sf.gridy = 7;
		sitReachText = new JTextField(5);
		sitReachText.setEditable(true);
		strengthAndFlex.add(sitReachText, sf);
		
		sf.gridx = 0;
		sf.gridy = 8;
		sfButton = new JButton("Save");
		strengthAndFlex.add(sfButton, sf);
		
		sf.gridx = 1;
		sf.gridy = 8;
		cancel = new JButton("Cancel");
		cancel.addActionListener(new cancelEvent());
		strengthAndFlex.add(cancel, sf);
	
		/*
		 * create the Aerobic Capacity Form
		 */
		
		aerobicCapacity = new JPanel();
		aerobicCapacity.setLayout(new GridBagLayout());
		GridBagConstraints ac = new GridBagConstraints();
		ac.fill = GridBagConstraints.HORIZONTAL;
		ac.insets = new Insets(0, 0, 10, 5);
	
	
		ac.gridx = 0;
		ac.gridy = 0;
		accountNumber = new JLabel("Account Number: ");
		aerobicCapacity.add(accountNumber, ac);
	
		ac.gridx = 1;
		ac.gridy = 0;
	
		accountNumberText = new JTextField(20);
		accountNumberText.setEditable(true);
		aerobicCapacity.add(accountNumberText, ac);
	
		ac.gridx = 0;
		ac.gridy = 1;
		firstName = new JLabel("FirstName: ");
		aerobicCapacity.add(firstName,ac);
	
		ac.gridx = 1;
		ac.gridy = 1;
		firstNameText = new JTextField(20);
		firstNameText.setEditable(true);
		aerobicCapacity.add(firstNameText, ac);
	
		ac.gridx = 0;
		ac.gridy = 2;
		lastName = new JLabel("LastName: ");
		aerobicCapacity.add(lastName, ac);
	
		ac.gridx = 1;
		ac.gridy = 2;

		lastNameText = new JTextField(20);
		lastNameText.setEditable(true);
		aerobicCapacity.add(lastNameText, ac);
		
		ac.gridx = 0;
		ac.gridy = 3;
		trainerID = new JLabel("Trainer ID: ");
		aerobicCapacity.add(trainerID, ac);
	
		ac.gridx = 1;
		ac.gridy = 3;

		trainerIDText = new JTextField(20);
		trainerIDText.setEditable(true);
		aerobicCapacity.add(trainerIDText, ac);
	
		ac.gridx = 0;
		ac.gridy = 4;
		date = new JLabel("Date: ");
		aerobicCapacity.add(date, ac);
	
		ac.gridx = 1;
		ac.gridy = 4;
		dateInput = new JTextField(dtf.format(currentDate));
		dateInput.setEditable(false);
		aerobicCapacity.add(dateInput, ac);
	
		ac.gridx = 0;
		ac.gridy = 5;
		heartRateMax = new JLabel("Max Heart Rate: ");
		aerobicCapacity.add(heartRateMax, ac);
	
		ac.gridx = 1;
		ac.gridy = 5;
		heartRateMaxText = new JTextField(20);
		heartRateMaxText.setEditable(true);
		aerobicCapacity.add(heartRateMaxText, ac);
		
		ac.gridx = 0;
		ac.gridy = 6;
		restedHeartRate = new JLabel("Rested Heart Rate: ");
		aerobicCapacity.add(restedHeartRate, ac);
	
		ac.gridx = 1;
		ac.gridy = 6;
		restedHeartRateText = new JTextField(20);
		restedHeartRateText.setEditable(true);
		aerobicCapacity.add(restedHeartRateText, ac);
		
		ac.gridx = 0;
		ac.gridy = 7;
		finalTestHeartRate = new JLabel("Final Test Heart Rate: ");
		aerobicCapacity.add(finalTestHeartRate, ac);
	
		ac.gridx = 1;
		ac.gridy = 7;
		finalTestHeartRateText = new JTextField(20);
		finalTestHeartRateText.setEditable(true);
		aerobicCapacity.add(finalTestHeartRateText, ac);
		
		
		ac.gridx = 0;
		ac.gridy = 8;
		minTargetHeartRate = new JLabel("Target Heart Rate (Min): ");
		aerobicCapacity.add(minTargetHeartRate, ac);
	
		ac.gridx = 1;
		ac.gridy = 8;
		minTargetHeartRateText = new JTextField(20);
		minTargetHeartRateText.setEditable(true);
		aerobicCapacity.add(minTargetHeartRateText, ac);
		
		ac.gridx = 0;
		ac.gridy = 9;
		maxTargetHeartRate = new JLabel("Target Heart Rate (Max): ");
		aerobicCapacity.add(maxTargetHeartRate, ac);
	
		ac.gridx = 1;
		ac.gridy = 9;
		maxTargetHeartRateText = new JTextField(20);
		maxTargetHeartRateText.setEditable(true);
		aerobicCapacity.add(maxTargetHeartRateText, ac);
		
		ac.gridx = 0;
		ac.gridy = 10;
		protocol = new JLabel("Protocol: ");
		aerobicCapacity.add(protocol, ac);
	
		ac.gridx = 1;
		ac.gridy = 10;
		protocolText = new JTextField(20);
		protocolText.setEditable(true);
		aerobicCapacity.add(protocolText, ac);
		
		ac.gridx = 0;
		ac.gridy = 11;
		timeInMin = new JLabel("Time In Minutes: ");
		aerobicCapacity.add(timeInMin, ac);
	
		ac.gridx = 1;
		ac.gridy = 11;
		timeInMinText = new JTextField(20);
		timeInMinText.setEditable(true);
		aerobicCapacity.add(timeInMinText, ac);
		
		
		ac.gridx = 0;
		ac.gridy = 12;
		maxVO2 = new JLabel("Max VO2: ");
		aerobicCapacity.add(maxVO2, ac);
	
		ac.gridx = 1;
		ac.gridy = 12;
		maxVO2Text = new JTextField(20);
		maxVO2Text.setEditable(true);
		aerobicCapacity.add(maxVO2Text, ac);
		
		ac.gridx = 0;
		ac.gridy = 13;
		acButton = new JButton("Save");
		aerobicCapacity.add(acButton, ac);
		ac.gridx = 1;
		ac.gridy = 13;
		cancel = new JButton("Cancel");
		cancel.addActionListener(new cancelEvent());
		aerobicCapacity.add(cancel, ac);
		
		/*
		 * create the Body Composition Form
		 */
		bodyCompPanel = new JPanel();
		bodyCompPanel.setLayout(new GridBagLayout());
		GridBagConstraints bc = new GridBagConstraints();
		bc.fill = GridBagConstraints.HORIZONTAL;
		bc.insets = new Insets(0, 0, 5, 0);
		bc.weightx = 1.0;
		
	
		bc.gridx = 0;
		bc.gridy = 0;
		accountNumber = new JLabel("Account Number: ");
		bodyCompPanel.add(accountNumber, bc);
	
		bc.gridx = 1;
		bc.gridy = 0;
	
		accountNumberText = new JTextField(20);
		accountNumberText.setEditable(true);
		bodyCompPanel.add(accountNumberText, bc);
	
		bc.gridx = 0;
		bc.gridy = 1;
		firstName = new JLabel("FirstName: ");
		bodyCompPanel.add(firstName, bc);
	
		bc.gridx = 1;
		bc.gridy = 1;
		firstNameText = new JTextField(20);
		firstNameText.setEditable(true);
		bodyCompPanel.add(firstNameText, bc);
	
		bc.gridx = 0;
		bc.gridy = 2;
		lastName = new JLabel("LastName: ");
		bodyCompPanel.add(lastName, bc);
	
		bc.gridx = 1;
		bc.gridy = 2;

		lastNameText = new JTextField(20);
		lastNameText.setEditable(true);
		bodyCompPanel.add(lastNameText, bc);
		
		bc.gridx = 0;
		bc.gridy = 3;
		trainerID = new JLabel("Trainer ID: ");
		bodyCompPanel.add(trainerID, bc);
	
		bc.gridx = 1;
		bc.gridy = 3;
		trainerIDText = new JTextField(20);
		trainerIDText.setEditable(true);
		bodyCompPanel.add(trainerIDText, bc);
	
		bc.gridx = 0;
		bc.gridy = 4;
		date = new JLabel("Date: ");
		bodyCompPanel.add(date, bc);
	
		bc.gridx = 1;
		bc.gridy = 4;
		dateInput = new JTextField(dtf.format(currentDate));
		dateInput.setEditable(false);
		bodyCompPanel.add(dateInput, bc);
		

		bc.gridx = 0;
		bc.gridy = 5;
		BMI = new JLabel("BMI: ");
		bodyCompPanel.add(BMI, bc);
	
		bc.gridx = 1;
		bc.gridy = 5;
		BMIText = new JTextField(20);
		BMIText.setEditable(true);
		bodyCompPanel.add(BMIText, bc);
		
		bc.gridx = 0;
		bc.gridy = 6;
		domForearm = new JLabel("Dominant Forearm: ");
		bodyCompPanel.add(domForearm, bc);
	
		bc.gridx = 1;
		bc.gridy = 6;
		domForearmText = new JTextField(20);
		domForearmText.setEditable(true);
		bodyCompPanel.add(domForearmText, bc);
		
		bc.gridx = 0;
		bc.gridy = 7;
		domArm = new JLabel("Dominant Arm: ");
		bodyCompPanel.add(domArm, bc);
	
		bc.gridx = 1;
		bc.gridy = 7;
		domArmText = new JTextField(20);
		domArmText.setEditable(true);
		bodyCompPanel.add(domArmText, bc);
		
		bc.gridx = 0;
		bc.gridy = 8;
		domThigh = new JLabel("Dominant Thigh: ");
		bodyCompPanel.add(domThigh, bc);
	
		bc.gridx = 1;
		bc.gridy = 8;
		domThighText = new JTextField(20);
		domThighText.setEditable(true);
		bodyCompPanel.add(domThighText, bc);
		
		bc.gridx = 0;
		bc.gridy = 9;
		abdomen = new JLabel("Abdomen: ");
		bodyCompPanel.add(abdomen, bc);
	
		bc.gridx = 1;
		bc.gridy = 9;
		abdomenText = new JTextField(20);
		abdomenText.setEditable(true);
		bodyCompPanel.add(abdomenText, bc);
		
		bc.gridx = 0;
		bc.gridy = 10;
		waistCircumference = new JLabel("Waist Circumference: ");
		bodyCompPanel.add(waistCircumference, bc);
	
		bc.gridx = 1;
		bc.gridy = 10;
		waistCircumferenceText = new JTextField(20);
		waistCircumferenceText.setEditable(true);
		bodyCompPanel.add(waistCircumferenceText, bc);
		
		bc.gridx = 0;
		bc.gridy = 11;
		hipCircumference = new JLabel("Hip Circumference: ");
		bodyCompPanel.add(hipCircumference, bc);
	
		bc.gridx = 1;
		bc.gridy = 11;
		hipCircumferenceText = new JTextField(20);
		hipCircumferenceText.setEditable(true);
		bodyCompPanel.add(hipCircumferenceText, bc);
		
		bc.gridx = 0;
		bc.gridy = 12;
		bodyCompProtocol = new JLabel("Body Composition Protocol: ");
		bodyCompPanel.add(bodyCompProtocol, bc);
	
		bc.gridx = 1;
		bc.gridy = 12;
		bodyCompProtocolText = new JTextField(20);
		bodyCompProtocolText.setEditable(true);
		bodyCompPanel.add(bodyCompProtocolText, bc);
		
		bc.gridx = 0;
		bc.gridy = 13;
		chest = new JLabel("Chest: ");
		bodyCompPanel.add(chest, bc);
	
		bc.gridx = 1;
		bc.gridy = 13;
		chestText = new JTextField(20);
		chestText.setEditable(true);
		bodyCompPanel.add(chestText, bc);
		
		bc.gridx = 0;
		bc.gridy = 14;
		midAxillary = new JLabel("Mid Axillary: ");
		bodyCompPanel.add(midAxillary, bc);
	
		bc.gridx = 1;
		bc.gridy = 14;
		midAxillaryText = new JTextField(20);
		midAxillaryText.setEditable(true);
		bodyCompPanel.add(midAxillaryText, bc);
		
		bc.gridx = 0;
		bc.gridy = 15;
		triceps = new JLabel("Triceps: ");
		bodyCompPanel.add(triceps, bc);
	
		bc.gridx = 1;
		bc.gridy = 15;
		tricepsText = new JTextField(20);
		tricepsText.setEditable(true);
		bodyCompPanel.add(tricepsText, bc);
		
		bc.gridx = 0;
		bc.gridy = 16;
		subscapular = new JLabel("Sub Scapular: ");
		bodyCompPanel.add(subscapular, bc);
	
		bc.gridx = 1;
		bc.gridy = 16;
		subscapularText = new JTextField(20);
		subscapularText.setEditable(true);
		bodyCompPanel.add(subscapularText, bc);
	
		
		bc.gridx = 0;
		bc.gridy = 17;
		supralliac = new JLabel("Suprailliac: ");
		bodyCompPanel.add(supralliac, bc);
	
		bc.gridx = 1;
		bc.gridy = 17;
		supralliacText = new JTextField(20);
		supralliacText.setEditable(true);
		bodyCompPanel.add(supralliacText, bc);
		
		bc.gridx = 0;
		bc.gridy = 18;
		thigh = new JLabel("Thigh: ");
		bodyCompPanel.add(thigh, bc);
	
		bc.gridx = 1;
		bc.gridy = 18;
		thighText = new JTextField(20);
		thighText.setEditable(true);
		bodyCompPanel.add(thighText, bc);
		
		
		bc.gridx = 0;
		bc.gridy = 19;
		percentBodyFat = new JLabel("Percent Body Fat: ");
		bodyCompPanel.add(percentBodyFat, bc);
	
		bc.gridx = 1;
		bc.gridy = 19;
		percentBodyFatText = new JTextField(20);
		percentBodyFatText.setEditable(true);
		bodyCompPanel.add(percentBodyFatText, bc);
		
		bc.gridx = 0;
		bc.gridy = 20;
		leanWeight = new JLabel("Lean Weight: ");
		bodyCompPanel.add(leanWeight, bc);
	
		bc.gridx = 1;
		bc.gridy = 20;
		leanWeightText = new JTextField(20);
		leanWeightText.setEditable(true);
		bodyCompPanel.add(leanWeightText, bc);
		
		
		bc.gridx = 0;
		bc.gridy = 21;
		fatWeight = new JLabel("Fat Weight: ");
		bodyCompPanel.add(fatWeight, bc);
	
		bc.gridx = 1;
		bc.gridy = 21;
		fatWeightText = new JTextField(20);
		fatWeightText.setEditable(true);
		bodyCompPanel.add(fatWeightText, bc);
		
		
		bc.gridx = 0;
		bc.gridy = 22;
		bcButton = new JButton("Save");
		bodyCompPanel.add(bcButton, bc);
		
		bc.gridx = 1;
		bc.gridy = 22;
		cancel = new JButton("Cancel");
		cancel.addActionListener(new cancelEvent());
		bodyCompPanel.add(cancel, bc);
	
		//add bodyComp to scroll Pane
		scrollPane = new JScrollPane(bodyCompPanel);
		
		
		/*
		 * create coronory risk panel
		 */
		coronaryRiskPanel = new JPanel();
		coronaryRiskPanel.setLayout(new GridBagLayout());
		GridBagConstraints cr = new GridBagConstraints();
		cr.fill = GridBagConstraints.HORIZONTAL;
		cr.insets = new Insets(0, 0, 5, 0);
		cr.weightx = 1.0;
		
	
		cr.gridx = 0;
		cr.gridy = 0;
		accountNumber = new JLabel("Account Number: ");
		coronaryRiskPanel.add(accountNumber, cr);
	
		cr.gridx = 1;
		cr.gridy = 0;
	
		accountNumberText = new JTextField(20);
		accountNumberText.setEditable(true);
		coronaryRiskPanel.add(accountNumberText, cr);
	
		cr.gridx = 0;
		cr.gridy = 1;
		firstName = new JLabel("FirstName: ");
		coronaryRiskPanel.add(firstName, cr);
	
		cr.gridx = 1;
		cr.gridy = 1;
		firstNameText = new JTextField(20);
		firstNameText.setEditable(true);
		coronaryRiskPanel.add(firstNameText, cr);
	
		cr.gridx = 0;
		cr.gridy = 2;
		lastName = new JLabel("LastName: ");
		coronaryRiskPanel.add(lastName, cr);
	
		cr.gridx = 1;
		cr.gridy = 2;

		lastNameText = new JTextField(20);
		lastNameText.setEditable(true);
		coronaryRiskPanel.add(lastNameText, cr);
		
		cr.gridx = 0;
		cr.gridy = 3;
		trainerID = new JLabel("Trainer ID: ");
		coronaryRiskPanel.add(trainerID, cr);
	
		cr.gridx = 1;
		cr.gridy = 3;
		trainerIDText = new JTextField(20);
		trainerIDText.setEditable(true);
		coronaryRiskPanel.add(trainerIDText, cr);
	
		cr.gridx = 0;
		cr.gridy = 4;
		date = new JLabel("Date: ");
		coronaryRiskPanel.add(date, cr);
	
		cr.gridx = 1;
		cr.gridy = 4;
		dateInput = new JTextField(dtf.format(currentDate));
		dateInput.setEditable(false);
		coronaryRiskPanel.add(dateInput, cr);
		

		cr.gridx = 0;
		cr.gridy = 5;
		systolicBP = new JLabel("Systolic Blood Pressure: ");
		coronaryRiskPanel.add(systolicBP, cr);
	
		cr.gridx = 1;
		cr.gridy = 5;
		systolicBPText = new JTextField(20);
		systolicBPText.setEditable(true);
		coronaryRiskPanel.add(systolicBPText, cr);
		
		cr.gridx = 0;
		cr.gridy = 6;
		diastolicBP = new JLabel("Diastolic Blood Pressure: ");
		coronaryRiskPanel.add(diastolicBP, cr);
	
		cr.gridx = 1;
		cr.gridy = 6;
		diastolicBPText = new JTextField(20);
		diastolicBPText.setEditable(true);
		coronaryRiskPanel.add(diastolicBPText, cr);
		
		cr.gridx = 0;
		cr.gridy = 7;
		idealBodyWeight= new JLabel("Ideal Body Weight: ");
		coronaryRiskPanel.add(idealBodyWeight, cr);
	
		cr.gridx = 1;
		cr.gridy = 7;
		idealBodyWeightText = new JTextField(20);
		idealBodyWeightText.setEditable(true);
		coronaryRiskPanel.add(idealBodyWeightText, cr);
		
		cr.gridx = 0;
		cr.gridy = 8;
		physicalActivity = new JLabel("Physical Activity: ");
		coronaryRiskPanel.add(physicalActivity, cr);
	
		cr.gridx = 1;
		cr.gridy = 8;
		physicalActivityText = new JTextField(20);
		physicalActivityText.setEditable(true);
		coronaryRiskPanel.add(physicalActivityText, cr);
		
		cr.gridx = 0;
		cr.gridy = 9;
		totalCholesteral = new JLabel("Total Cholesteral: ");
		coronaryRiskPanel.add(totalCholesteral, cr);
	
		cr.gridx = 1;
		cr.gridy = 9;
		totalCholesteralText = new JTextField(20);
		totalCholesteralText.setEditable(true);
		coronaryRiskPanel.add(totalCholesteralText, cr);
		
		cr.gridx = 0;
		cr.gridy = 10;
		hdlRatio = new JLabel("HDL Ratio: ");
		coronaryRiskPanel.add(hdlRatio, cr);
	
		cr.gridx = 1;
		cr.gridy = 10;
		hdlRatioText = new JTextField(20);
		hdlRatioText.setEditable(true);
		coronaryRiskPanel.add(hdlRatioText, cr);
		
		cr.gridx = 0;
		cr.gridy = 11;
		hdlCholesterol = new JLabel("HDL Cholesterol: ");
		coronaryRiskPanel.add(hdlCholesterol, cr);
	
		cr.gridx = 1;
		cr.gridy = 11;
		hdlCholesterolText = new JTextField(20);
		hdlCholesterolText.setEditable(true);
		coronaryRiskPanel.add(hdlCholesterolText, cr);
		
		cr.gridx = 0;
		cr.gridy = 12;
		ldlCholesterol = new JLabel("LDL Cholesterol: ");
		coronaryRiskPanel.add(ldlCholesterol, cr);
	
		cr.gridx = 1;
		cr.gridy = 12;
		ldlCholesterolText = new JTextField(20);
		ldlCholesterolText.setEditable(true);
		coronaryRiskPanel.add(ldlCholesterolText, cr);
		
		cr.gridx = 0;
		cr.gridy = 13;
		triglycerides = new JLabel("Triglycerides: ");
		coronaryRiskPanel.add(triglycerides, cr);
	
		cr.gridx = 1;
		cr.gridy = 13;
		triglyceridesText = new JTextField(20);
		triglyceridesText.setEditable(true);
		coronaryRiskPanel.add(triglyceridesText, cr);
		
		cr.gridx = 0;
		cr.gridy = 14;
		glucose = new JLabel("Mid Axillary: ");
		coronaryRiskPanel.add(glucose, cr);
	
		cr.gridx = 1;
		cr.gridy = 14;
		glucoseText = new JTextField(20);
		glucoseText.setEditable(true);
		coronaryRiskPanel.add(glucoseText, cr);
		
		cr.gridx = 0;
		cr.gridy = 15;
		crButton = new JButton("Save");
		coronaryRiskPanel.add(crButton, cr);
		cr.gridx = 1;
		cr.gridy = 15;
		cancel = new JButton("Cancel");
		cancel.addActionListener(new cancelEvent());
		coronaryRiskPanel.add(cancel, cr);
	
		tabbedPane.add("Coronary Risk", coronaryRiskPanel);
		tabbedPane.add("Body Composition", scrollPane);
		tabbedPane.add("Strength and Flex", strengthAndFlex);
		tabbedPane.add("Aerobic Capacity", aerobicCapacity);
		AssessmentFrame.add(tabbedPane);
		AssessmentFrame.setVisible(true);	
	
	}//end createAssessment
	
	private class cancelEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			AssessmentFrame.dispose();
		}
	}
}
