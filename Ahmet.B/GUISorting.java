import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class GUISorting {

	private JFrame frame;
	private JTextField textField;
	SortingAlgo so;
	public int arr2 [];
	public int arrInter [];
	public int arrSelect [];
	public int arrbuble [];
	public int arrshell [];
	public int arrquict [];
	public int arrcount [];

	public int basmaSayısı=1;
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUISorting window = new GUISorting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GUISorting() {
		initialize();
		so = new SortingAlgo();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 790, 593);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(24, 53, 170, 63);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		String alg[] = {"Inter" ,"Select" , "Buuble" , "Shell","Quick", "Count"}; 
		final JComboBox comboBox = new JComboBox(alg);
		comboBox.setEditable(true);
		comboBox.setBounds(24, 143, 170, 22);
		frame.getContentPane().add(comboBox);
		comboBox.setSelectedItem("Algoritmalar");
		
		final JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(633, 255, 109, 28);
		frame.getContentPane().add(textArea_2);
		
		final JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea_1.setBounds(24, 325, 193, 158);
		frame.getContentPane().add(textArea_1);
		
		final JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea_3.setBounds(440, 171, 302, 51);
		frame.getContentPane().add(textArea_3);		
		
		final JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setBounds(440, 109, 302, 51);
		frame.getContentPane().add(textArea);
		
		final JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Monospaced", Font.PLAIN, 12));
		textArea_4.setBounds(324, 323, 418, 220);
		frame.getContentPane().add(textArea_4);
		
		
		JButton btnNewButton = new JButton("Dizi Yap");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elemanIndex = comboBox.getSelectedIndex();
			    int elemansay=Integer.parseInt(textField.getText());
			    int arr1 [] = new int [elemansay];

			   
	
			    
				arr1=so.random(elemansay);
			    String s ="";
			   
			    for (int i = 0; i < elemansay; i++) {
			          s+=Integer.toString(arr1[i]) + " ";			            
			       }
			    textArea.setText(s );
			    
			  
			   
			    
			    arrInter = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrInter[i] = arr1[i];
			    }
			    	
			    arrSelect = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrSelect[i] = arr1[i];
			    }
			    
			    arrbuble = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrbuble[i] = arr1[i];
			    }
			    
			    arrshell = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrshell[i] = arr1[i];
			    }
			    
			    arrquict = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrquict[i] = arr1[i];
			    }
			    arrcount = new int [arr1.length];
			    for(int i=0;i<arr1.length;i++) {
			    	arrcount[i] = arr1[i];
			    }

					        
			        
			        
			}
		});
		btnNewButton.setBounds(391, 31, 170, 63);
		frame.getContentPane().add(btnNewButton);
		
		final JButton btnSrala = new JButton("Sırala");
		btnSrala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int elemanIndex = comboBox.getSelectedIndex();
			    int elemansay=Integer.parseInt(textField.getText());
			    so.sifirla();
	
			    
		
			    
				  switch(elemanIndex+1) {
				    case 1:
				    	so.Insertionsort(arrInter);
				    	 String StepIS = Integer.toString(so.StepIS); 
				    	 
				    	 String sInter ="";
					    String sInserStep= so.printArray(arrInter);

				    	arr2 = arrInter;
				    	for(int i=0;i<arrInter.length;i++) {
				    		sInter+=Integer.toString(arr2[i]) + " ";
				    	}
				    	textArea_3.setText(sInter);
				    	textArea_2.setText(StepIS);
				    	textArea_4.setText(sInserStep);

				    break;
				    case 2:
				    	so.selectionSort(arrSelect);
				    	String StepSS = Integer.toString(so.StepSS); 
				    	
				    	String sSeleck ="";
				    	String sSelectStep= so.printArray(arrSelect);
					    	arr2 = arrSelect;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sSeleck+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sSeleck);
					    	textArea_2.setText(StepSS);
					    	textArea_4.setText(sSelectStep);

				      break;
				    case 3:
				    	so.bubbleSort(arrbuble);
				    	String StepBS = Integer.toString(so.StepBS); 

				    	 String sBuuble ="";
				    	 String sBuubleStep= so.printArray(arrbuble);
					    	arr2 = arrbuble;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sBuuble+=Integer.toString(arr2[i]) + " ";
					    		
					    	}	
					    	textArea_3.setText(sBuuble);
					    	textArea_2.setText(StepBS);
					    	textArea_4.setText(sBuubleStep);

				      break;
				    case 4:
				    	so.shellSort(arrshell,arrshell.length);
				    	String StepSH = Integer.toString(so.StepSheS); 

				    	 String sShell ="";
				    	 String sShellStep= so.printArray(arrshell);

					    	arr2 = arrshell;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sShell+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sShell);
					    	textArea_2.setText(StepSH);
					    	textArea_4.setText(sShellStep);

				      break;
				    case 5:
				    	so.quickSort(arrquict,0,arrquict.length-1);
				    	String StepQS = Integer.toString(so.StepQS); 

				    	 String sQuick ="";
				    	 String sQuicStep= so.printArray(arrquict);

					    	arr2 = arrquict;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sQuick+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sQuick);
					    	textArea_2.setText(StepQS);
					    	textArea_4.setText(sQuicStep);

					    	
				      break;
				    case 6:
				    	so.countSort(arrcount, arrcount.length);
				    	String StepCO = Integer.toString(so.StepCS); 

				    	 String sCount ="";
				    	 String sCounttep= so.printArray(arrcount);

					    	arr2 = arrcount;
					    	 
					    	for(int i=0;i<arrInter.length;i++) {
					    		sCount+=Integer.toString(arr2[i]) + " ";
					    	}
					    	textArea_3.setText(sCount);
					    	textArea_2.setText(StepCO);
					    	textArea_4.setText(sCounttep);

				      break;
				  }
				  

				  so.Insertionsort(arrInter);
			    	so.selectionSort(arrSelect);
			    	so.bubbleSort(arrbuble);
			    	so.shellSort(arrshell,arrshell.length);
			    	so.quickSort(arrquict, 0, arrquict.length-1);
			    	so.countSort(arrcount, arrcount.length);
			    	
			    	
				    textArea_1.setText("Insertion Sort: "+so.StepIS+"\nSelection Sort: "+ so.StepSS + "\nBubble Sort: "+so.StepBS +"\nShell Sort: "+so.StepSheS+
			                "\nQuick Sort: "+so.StepQS+"\nCount Sort: "+so.StepCS);
			
				  
			}
		});
		btnSrala.setBounds(572, 31, 170, 63);
		frame.getContentPane().add(btnSrala);
		
		JLabel lblNewLabel = new JLabel("Dizinin Son Hali");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(335, 169, 95, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seçilen algoritmada işlem sayısı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(441, 255, 182, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Diğer Algoritmalar\r\nda işlem sayısı");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(20, 279, 197, 35);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Diğer Adımlar");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(313, 281, 95, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblOluturulanDizi = new JLabel("Oluşturulan Dizi");
		lblOluturulanDizi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOluturulanDizi.setBounds(335, 116, 95, 28);
		frame.getContentPane().add(lblOluturulanDizi);
		
		
		

	}
}
