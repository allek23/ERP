package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import Persons.*;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;



public class GUI_ERP extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private final Action action = new SwingAction();

	/**
	 * Create the frame.
	 */
	public GUI_ERP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(24, 24, 356, 21);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Datei");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Öffnen");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Schließen");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Bearbeiten");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Einstellungen");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Hilfe");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmberErp = new JMenuItem("Über ERP");
		mnNewMenu_2.add(mntmberErp);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 89, 356, 188);
		contentPane.add(scrollPane);
		
		String[][] data = EmployeeManager.getEmployeeArray();
		String column[] = {"ID","Vorname","Nachname"};
		table = new JTable(data,column);
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 289, 356, 244);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblMitaebeiternr = new JLabel("Mitaebeiter");
		lblMitaebeiternr.setBounds(26, 12, 83, 15);
		panel.add(lblMitaebeiternr);
		
		textField = new JTextField();
		textField.setBounds(111, 10, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(39, 39, 70, 15);
		panel.add(lblVorname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 37, 114, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(26, 65, 83, 15);
		panel.add(lblNachname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 63, 114, 19);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Neu");
		btnNewButton.setAction(action);
		btnNewButton.setBounds(24, 57, 105, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ändern");
		btnNewButton_1.setBounds(141, 57, 115, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Löschen");
		btnNewButton_2.setBounds(268, 57, 112, 25);
		contentPane.add(btnNewButton_2);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			Employee employee = new Employee();
			employee.setNewEmployeeData("Justin","Time");
			
		}
	}
}
