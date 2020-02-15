/*
 * The main staff view of all staff members. Buttons are set to editable depending on staff position.
 * 
 * 
 */

package OtherPanels;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class StaffView{
	
JTextArea staffInfo;
JScrollPane staffInfoScrollPanel;
JPanel staffInfoPanel;


JPanel staffControl; // the main frame
CardLayout layout; // content panel card layout
 JPanel staffMenu; //  holds the buttons
 JPanel contentPanel; // holds the content
 JPanel controlButtons;
 JPanel loginPanel;
 JButton newMember;
 JButton lookUpMember;
 JButton updateMember;
 JButton removeMember;
 public JButton assessment;
 public JButton newStaff;
 
 // login panel
 JButton logOut;
 JLabel staffName;
 JLabel staffPosition;
 public JLabel staffPosition2;
 JLabel staffName2;
 
 //lookup member GUI
 JLabel accountNumber;
 JTextField accountNumberText;
 JButton lookup;
 //new member GUI
 JPanel newMemberPanel;
 JPanel memberLookupPanel;
 JLabel firstName;
 JLabel lastName;
 JLabel email;
 JLabel newPassword;
 JTextField firstNameText;
 JTextField lastNameText;
 JTextField emailText;
 JPasswordField newPasswordText;
 JButton save;
 JButton cancel;
 
 // new staff member
 
 JLabel staffFirstName;
 JLabel staffLastName;
 JLabel staffEmail;
 JLabel staffPassword;
 JPanel newStaffPanel;
 JTextField staffFirstNameText;
 JTextField staffLastNameText;
 JTextField staffEmailText;
 JPasswordField staffPasswordText;
 JButton staffSave;
 
 
 /*
  * Creates the staff member controls.
  * For the prototype purposes, only "New Member"
  * and Assessment Work. 
  * 
  * Functions:
  * New Member: add new member
  * Look Up: Look Up a Member
  * Update Member: Look up a member and edit their information (not currently functional)
  * Assessment: perform the fitness assessment (only functional with Admin and Trainer Logins)
  * Remove Member: Removes a member from the database (not currently functional)
  * 
  */
public void createStaffView() {
    JFrame staffControl = new JFrame();
    staffControl.setLayout(new GridBagLayout());
    staffControl.setVisible(true);
    staffControl.setSize(500, 500);

    
    GridBagConstraints sc = new GridBagConstraints();
    sc.fill = GridBagConstraints.HORIZONTAL;

    sc.weighty = 1;
    
    

 
	
    /*
     * create the panel that holds the control buttons
     */
	
	controlButtons = new JPanel();
	
	controlButtons.setBorder(BorderFactory.createTitledBorder("Control Panel"));
	controlButtons.setLayout(new GridBagLayout());
	GridBagConstraints cb = new GridBagConstraints();
	cb.fill = GridBagConstraints.HORIZONTAL;
	cb.anchor = GridBagConstraints.FIRST_LINE_START;
	cb.insets = new Insets(10, 0, 0, 0);
	cb.weighty = 1;
	
	
	cb.gridx = 0;
	cb.gridy = 0;
	newMember = new JButton("New Member");	
	newMember.addActionListener(new commandEvent());
	controlButtons.add(newMember, cb);
	
	
	cb.gridx = 0;
	cb.gridy = 1;
	lookUpMember = new JButton("Look Up");	
	lookUpMember.addActionListener(new commandEvent());
	controlButtons.add(lookUpMember, cb);
	
	cb.gridx = 0;
	cb.gridy = 2;
	updateMember = new JButton("Update Member");	
	controlButtons.add(updateMember, cb);
	
	cb.gridx = 0;
	cb.gridy = 3;
	assessment = new JButton("Assessment");
	assessment.addActionListener(new assessmentEvent());
	controlButtons.add(assessment, cb);
	assessment.setEnabled(false);
	
	
	cb.gridx = 0;
	cb.gridy = 4;
	removeMember = new JButton("Remove Member");
	controlButtons.add(removeMember, cb);
	
	cb.gridx = 0;
	cb.gridy = 5;
	newStaff = new JButton("New Staff");
	newStaff.setEnabled(false);
	newStaff.addActionListener(new commandEvent());
	controlButtons.add(newStaff, cb);
	
	sc.gridx = 0;
	sc.gridy = 1;
	sc.anchor = GridBagConstraints.PAGE_START;
	staffControl.add(controlButtons, sc);
	
	
	
	
	/*
	 * creates the panel that displays name, position, and logout button
	 */
	loginPanel = new JPanel();
	loginPanel.setLayout(new GridBagLayout());
	loginPanel.setBorder(BorderFactory.createTitledBorder("Info"));
	GridBagConstraints lg = new GridBagConstraints();
	lg.fill = GridBagConstraints.HORIZONTAL;
	
	lg.weightx = 1.0;
	lg.gridx = 0;
	lg.gridy = 0;
	
	staffName = new JLabel("name:  ");
	loginPanel.add(staffName, lg);
	
	lg.gridx = 1;
	lg.gridy = 0; 
	
	staffName2 = new JLabel("John Smith"); // change to pull from database
	loginPanel.add(staffName2, lg);
	
	lg.gridx = 0;
	lg.gridy = 1;
	lg.anchor = GridBagConstraints.NORTHEAST;
	staffPosition = new JLabel("position:   ");
	loginPanel.add(staffPosition, lg);
	
	lg.gridx = 1;
	lg.gridy = 1;
	lg.anchor = GridBagConstraints.NORTHEAST;
	staffPosition2 = new JLabel("Front Desk"); // change to switch depending on account
	loginPanel.add(staffPosition2, lg);
	
	
	lg.gridx = 2;
	lg.gridy = 1;
	lg.anchor = GridBagConstraints.FIRST_LINE_END;
	lg.insets = new Insets(0, 0, 0, 0);
	logOut = new JButton("Log Out");
	logOut.addActionListener(new logOutEvent());
	loginPanel.add(logOut, lg);
	
	sc.gridwidth = 4;
	sc.gridheight = 1;
	sc.weighty = 0;
	sc.gridx = 0;
	sc.gridy = 0;
	sc.anchor = GridBagConstraints.FIRST_LINE_START;
	staffControl.add(loginPanel, sc);

	layout = new CardLayout();
	contentPanel = new JPanel(layout);
	
	sc.gridx = 1;
	sc.gridy = 1;
	sc.weightx = 1;	
	sc.gridheight = 2;
	sc.anchor = GridBagConstraints.FIRST_LINE_START;
	staffControl.add(contentPanel, sc);
	
	/*
	 * create the panel for the new member
	 */
	newMemberPanel = new JPanel();
	newMemberPanel.setLayout(new GridBagLayout());
	newMemberPanel.setBorder(BorderFactory.createTitledBorder("New Member"));
	GridBagConstraints mp = new GridBagConstraints();
	mp.fill = GridBagConstraints.HORIZONTAL;
	mp.insets = new Insets(0, 0, 10, 5);
	
	
	mp.gridx = 0;
	mp.gridy = 0;
	firstName = new JLabel("First Name: ");
	newMemberPanel.add(firstName, mp);
	
	mp.gridx = 1;
	mp.gridy = 0;
	mp.gridwidth = 2;
	firstNameText = new JTextField(20);
	firstNameText.setEditable(true);
	newMemberPanel.add(firstNameText, mp);
	
	mp.gridx = 0;
	mp.gridy = 1;
	lastName = new JLabel("Last Name: ");
	newMemberPanel.add(lastName, mp);
	
	mp.gridx = 1;
	mp.gridy = 1;
	lastNameText = new JTextField(20);
	lastNameText.setEditable(true);
	newMemberPanel.add(lastNameText, mp);
	
	mp.gridx = 0;
	mp.gridy = 2;
	email = new JLabel("Email: ");
	newMemberPanel.add(email, mp);
	
	mp.gridx = 1;
	mp.gridy = 2;
	emailText = new JTextField(20);
	emailText.setEditable(true);
	newMemberPanel.add(emailText, mp);
	
	mp.gridx = 0;
	mp.gridy = 3;
	newPassword = new JLabel("Password: ");
	newMemberPanel.add(newPassword, mp);
	
	mp.gridx = 1;
	mp.gridy = 3;
	newPasswordText = new JPasswordField(20);
	newPasswordText.setEditable(true);
	newMemberPanel.add(newPasswordText, mp);
	
	mp.gridx = 0;
	mp.gridy = 4;
	save = new JButton("Save");
	newMemberPanel.add(save, mp);
	
	mp.gridx = 1;
	mp.gridy = 4;
	cancel = new JButton("Cancel");
	newMemberPanel.add(cancel, mp);
	
	
	
	contentPanel.add(newMemberPanel, "New Member");
	
	
	/*
	 * create the panel for the member lookup
	 */
	memberLookupPanel = new JPanel();
	memberLookupPanel.setLayout(new GridBagLayout());
	memberLookupPanel.setBorder(BorderFactory.createTitledBorder("Look Up Member"));
		GridBagConstraints ml = new GridBagConstraints();
		ml.fill = GridBagConstraints.HORIZONTAL;
		ml.insets = new Insets(0, 0, 10, 5);
		
		
		ml.gridx = 0;
		ml.gridy = 0;
		firstName = new JLabel("First Name: ");
		memberLookupPanel.add(firstName, ml);
		
		ml.gridx = 1;
		ml.gridy = 0;
		
		firstNameText = new JTextField(20);
		firstNameText.setEditable(true);
		memberLookupPanel.add(firstNameText, ml);
		
		ml.gridx = 0;
		ml.gridy = 1;
		lastName = new JLabel("Last Name: ");
		memberLookupPanel.add(lastName, ml);
		
		ml.gridx = 1;
		ml.gridy = 1;
		lastNameText = new JTextField(20);
		lastNameText.setEditable(true);
		memberLookupPanel.add(lastNameText, ml);
		
		ml.gridx = 0;
		ml.gridy = 2;
		accountNumber = new JLabel("Account Number: ");
		memberLookupPanel.add(accountNumber, ml);
		
		ml.gridx = 1;
		ml.gridy = 2;
	
		accountNumberText = new JTextField(20);
		accountNumberText.setEditable(true);
		memberLookupPanel.add(accountNumberText, ml);
		
		ml.gridx = 0;
		ml.gridy = 3;
		lookup = new JButton("Look Up");
		lookup.addActionListener(new lookUpEvent());
		memberLookupPanel.add(lookup, ml);
		
		ml.gridx = 1;
		ml.gridy = 3;
		cancel = new JButton("Cancel");
		memberLookupPanel.add(cancel, ml);
		
		contentPanel.add(memberLookupPanel, "Look Up");
		
		/*
		 * create the panel for the new staff
		 */
		newStaffPanel = new JPanel();
		newStaffPanel.setLayout(new GridBagLayout());
		newStaffPanel.setBorder(BorderFactory.createTitledBorder("New Staff"));
		GridBagConstraints ns = new GridBagConstraints();
		ns.fill = GridBagConstraints.HORIZONTAL;
		ns.insets = new Insets(0, 0, 10, 5);
		
		
		ns.gridx = 0;
		ns.gridy = 0;
		staffFirstName = new JLabel("First Name: ");
		newStaffPanel.add(staffFirstName, ns);
		
		ns.gridx = 1;
		ns.gridy = 0;
		ns.gridwidth = 2;
		staffFirstNameText = new JTextField(20);
		staffFirstNameText.setEditable(true);
		newStaffPanel.add(staffFirstNameText, ns);
		
		ns.gridx = 0;
		ns.gridy = 1;
		staffLastName = new JLabel("Last Name: ");
		newStaffPanel.add(staffLastName, ns);
		
		ns.gridx = 1;
		ns.gridy = 1;
		staffLastNameText = new JTextField(20);
		staffLastNameText.setEditable(true);
		newStaffPanel.add(staffLastNameText, ns);
		
		ns.gridx = 0;
		ns.gridy = 2;
		staffEmail = new JLabel("Email: ");
		newStaffPanel.add(staffEmail, ns);
		
		ns.gridx = 1;
		ns.gridy = 2;
		staffEmailText = new JTextField(20);
		staffEmailText.setEditable(true);
		newStaffPanel.add(staffEmailText, ns);
		
		ns.gridx = 0;
		ns.gridy = 3;
		staffPassword = new JLabel("Password: ");
		newStaffPanel.add(staffPassword, ns);
		
		ns.gridx = 1;
		ns.gridy = 3;
		staffPasswordText = new JPasswordField(20);
		staffPasswordText.setEditable(true);
		newStaffPanel.add(staffPasswordText, ns);
		
		ns.gridx = 0;
		ns.gridy = 4;
		staffSave = new JButton("Save");
		newStaffPanel.add(staffSave, ns);
		
		ns.gridx = 1;
		ns.gridy = 4;
		cancel = new JButton("Cancel");
		newStaffPanel.add(cancel, ns);
		
		
		
		contentPanel.add(newStaffPanel, "New Staff");
		
		   /*
	     * create the panel that holds the text area where the information is
	     * sent
	     */
	    
	    staffInfo = new JTextArea(5, 40);
	    staffInfo.setEditable(false);
	    staffInfoScrollPanel = new JScrollPane(staffInfo);
	    staffInfoPanel = new JPanel();
	    staffInfo.setLayout(new BorderLayout());
	    staffInfoPanel.add(staffInfo);
	    staffInfoPanel.setBorder(BorderFactory.createTitledBorder("Information"));
	    sc.gridx = 0;
	    sc.gridy = 2;
	    sc.gridwidth = 2;
	    sc.weighty = 1;
	    sc.weightx = 1;
	    sc.anchor = GridBagConstraints.NORTH;
	    staffControl.add(staffInfoPanel, sc);
	

} // end createStaffView()



	

//action Listeners

	// switches between New Member, Look Up, and New Staff
	private class commandEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 String command = e.getActionCommand();
	            if ("New Member".equals(command)) {
	                layout.show(contentPanel, "New Member");
	            }
	            else if("Look Up".equals(command)) {
	            	layout.show(contentPanel, "Look Up");
	            }
	            else if("New Staff".equals(command)) {
	            	layout.show(contentPanel, "New Staff");
	            }
		}
	}

	// opens the fitness assessment forms
	private class assessmentEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			 FitnessGUI newAssessment = new FitnessGUI();
			 newAssessment.createAssessment();
		}
	}
	
	//closes the staff view frame
	private class logOutEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//TODO
		}
	}
	
	// look up member
	private class lookUpEvent implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		/*
		 * this is supposed to look up the member and display the information
		 * in the JTextArea
		 */
		}
	}
	

}