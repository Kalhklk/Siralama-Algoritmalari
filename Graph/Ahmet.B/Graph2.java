import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.*;
import javax.swing.*;

public class Graph2 {
    
  public static void Start2(final int disiSayisi, final int komsulukMatris[][]) {
 // public static void main(String args []) {

    // Create a new frame
    JFrame frame = new JFrame("Grafik");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    
 //   final int diziSay = 8;
    final int marg = 30;  
    final int[] CorX = new int [disiSayisi];
    final int[] CorY = new int [disiSayisi];

    
    //final int[] cord = {50, 20, 40, 80, 60};  
    
    final int[] cord = new int [disiSayisi];  
    final int[] random = new int [disiSayisi];
    
    for(int i =0; i< random.length;i++ ) {
    	random[i] = (int)(Math.random()*1000);
    }
	
    
    for(int i=0;i<cord.length;i++) {
    	cord[i] = random[i];
    }
    
    
 /*   for(int i=0;i<cord.length;i++) {
    	System.out.println(cord[i]); 
}	*/
    
   
  
    
    
   
    JPanel panel = new JPanel() {

    	 public void paint(Graphics grf){  
    	        //create instance of the Graphics to use its methods  
    	        super.paintComponent(grf);  
    	        Graphics2D graph = (Graphics2D)grf;  
    	          
    	        //Sets the value of a single preference for the rendering algorithms.  
    	        graph.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
    	          
    	        // get width and height  
    	        int width = getWidth();  
    	        int height = getHeight();  
    	          
    	        //find value of x and scale to plot points  
    	        double x = (double)(width-2*marg)/(cord.length-1);  
    	        double scale = (double)(height-2*marg)/getMax(cord); 
    	          
    	        //set color for points  
    	        graph.setPaint(Color.RED);  
    	          
    	        // set points to the graph  
    	        for(int i=0; i<cord.length; i++){  
    	            double x1 = marg+i*x;  
    	            double y1 = height-marg-scale*cord[i];  
    	            graph.fill(new Ellipse2D.Double(x1, y1, 10, 10));  
    	      //      System.out.println("x1: " + x1 + " y1: " + y1);

    	            CorX[i] = (int)x1;
    	            CorY[i] = (int)y1;
    	            
    	        }  

    	        for(int i=0;i<disiSayisi;i++) {
    	        	for(int j=0;j<disiSayisi;j++) {
    	        		
    	        		
    	        		if( komsulukMatris[i][j] <= 0) {
    	        			
    	        		}
    	        		else {
    	        		int l = komsulukMatris[i][j];
    	        		 grf.drawLine(CorX[i], CorY[i], CorX[j] ,CorY[j]);
    	     	         grf.drawString(Integer.toString(l), ((CorX[i]+ CorX[j])/2)-20, ((CorY[i]+ CorY[j])/2));
    	     	         grf.drawString(Integer.toString(i), CorX[i]-20, CorY[i]-10);

    	        		}
    	        	}
    	        }
    	        
    	        
    	    }  
    };
    
    
    frame.add(panel);
    frame.setVisible(true);
    
    
    
  }
  
  private static int getMax(int cord []){  
      int max = -Integer.MAX_VALUE;  
      for(int i=0; i<cord.length; i++){  
          if(cord[i]>max)  
              max = cord[i];  
           
      }  
      return max;  
  }   
}

