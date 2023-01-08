import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class GraphGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	GraphMain g1;
	Graph2 g2;
	int kenar1,kenar2,agirlik;
	int VertexAdet;
	private JButton btnNewButton_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GraphGUI window = new GraphGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GraphGUI() {
		initialize();
		g1 = new GraphMain(100);
		g2 = new Graph2();
			VertexAdet=0;
	        kenar1=0;
	        kenar2=0;
	        agirlik=0;	
	}
	
	void VertexCreate(int VertexSayi){
        int ascii=64;
        for (int i = 0; i < VertexSayi; i++) {
            ascii+=1;
            g1.addVertex((char)(ascii));
        }
    }
    void VertexDisplay(int VertexSayi){
        for (int i = 0; i < VertexSayi; i++) {
            g1.displayVertex(i);
        }
    }
    void sifirla(){
        kenar1=0;
        kenar2=0;
        agirlik=0;        
    }

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(160, 32, 111, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 135, 111, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 182, 111, 36);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 229, 111, 36);
		frame.getContentPane().add(textField_3);
		

		final JTextArea textArea = new JTextArea();
		textArea.setBounds(294, 270, 227, 124);
		frame.getContentPane().add(textArea);
		
		
		JButton btnNewButton = new JButton("Dugum Olustur");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 VertexAdet=Integer.parseInt(textField.getText());
			        VertexCreate(VertexAdet);
			        VertexDisplay(VertexAdet);
			}
		});
		btnNewButton.setBounds(318, 39, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCizgiOlustur = new JButton("Cizgi Olustur");
		btnCizgiOlustur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   sifirla();
			       
			       kenar1=Integer.parseInt(textField_1.getText());
			       
			       kenar2=Integer.parseInt(textField_2.getText());
			       
			       agirlik=Integer.parseInt(textField_3.getText());
			       
			       g1.addEdge(kenar1, kenar2, agirlik);
			       
			}
		});
		btnCizgiOlustur.setBounds(306, 142, 145, 23);
		frame.getContentPane().add(btnCizgiOlustur);
		
		JButton btnNewButton_2 = new JButton("Djikstra");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g1.dijkstra(g1.komsuluk, 0);
				
				textArea.setText(g1.dijiktra);
		
			}
		});
		btnNewButton_2.setBounds(362, 236, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("Cizdir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g2.Start2(VertexAdet,g1.komsuluk);
			}
		});
		btnNewButton_1.setBounds(362, 189, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Dugum sayisi giriniz");
		lblNewLabel.setBounds(10, 32, 120, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblDugum = new JLabel("1. dugum");
		lblDugum.setBounds(10, 135, 120, 36);
		frame.getContentPane().add(lblDugum);
		
		JLabel lblDgm = new JLabel("2. dugum");
		lblDgm.setBounds(10, 193, 120, 36);
		frame.getContentPane().add(lblDgm);
		
		JLabel lblAgirlikGiriniz = new JLabel("Agirlik giriniz");
		lblAgirlikGiriniz.setBounds(10, 240, 120, 36);
		frame.getContentPane().add(lblAgirlikGiriniz);
	}
}
