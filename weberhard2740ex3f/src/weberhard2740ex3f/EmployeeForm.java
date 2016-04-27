package weberhard2740ex3f;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class EmployeeForm extends JFrame {

	private JPanel contentPane;
	private DefaultListModel listModel;
	private JList list;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField positionTextField;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeForm frame = new EmployeeForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EmployeeForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 119);
		contentPane.add(scrollPane);
		
		listModel = new DefaultListModel();
		list = new JList(listModel);
		scrollPane.setViewportView(list);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(20, 141, 73, 14);
		contentPane.add(lblEmployeeId);
		
		idTextField = new JTextField();
		idTextField.setText("101");
		lblEmployeeId.setLabelFor(idTextField);
		idTextField.setBounds(112, 138, 86, 20);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(30, 172, 46, 14);
		contentPane.add(lblName);
		
		nameTextField = new JTextField();
		nameTextField.setText("Renee Stoll");
		lblName.setLabelFor(nameTextField);
		nameTextField.setBounds(112, 169, 86, 20);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(20, 207, 73, 14);
		contentPane.add(lblDepartment);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"FEO", "Sporting Goods", "Lawn & Garden", "Building", "Yard"}));
		lblDepartment.setLabelFor(comboBox);
		comboBox.setBounds(112, 204, 86, 20);
		contentPane.add(comboBox);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setBounds(30, 243, 73, 14);
		contentPane.add(lblPosition);
		
		positionTextField = new JTextField();
		positionTextField.setText("Associate");
		lblPosition.setLabelFor(positionTextField);
		positionTextField.setBounds(112, 240, 86, 20);
		contentPane.add(positionTextField);
		positionTextField.setColumns(10);
		
		JButton btnNoArg = new JButton("No Arg");
		btnNoArg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Employee emp = new Employee();
				listModel.addElement(emp);
			}
		});
		btnNoArg.setBounds(236, 157, 89, 23);
		contentPane.add(btnNoArg);
		
		JButton btn2Arg = new JButton("2 Arg");
		btn2Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				emp.setIdNumber(Integer.parseInt(idTextField.getText()));
				emp.setName(nameTextField.getText());
				listModel.addElement(emp);
			}
		});
		btn2Arg.setBounds(236, 191, 89, 23);
		contentPane.add(btn2Arg);
		
		JButton btn4Arg = new JButton("4 Arg");
		btn4Arg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Employee emp = new Employee();
				emp.setIdNumber(Integer.parseInt(idTextField.getText()));
				emp.setName(nameTextField.getText());
				String dept = (String)comboBox.getSelectedItem();
				emp.setDepartment(dept);
				emp.setPosition(positionTextField.getText());
				listModel.addElement(emp);
			}
		});
		btn4Arg.setBounds(236, 225, 89, 23);
		contentPane.add(btn4Arg);
	}
}
