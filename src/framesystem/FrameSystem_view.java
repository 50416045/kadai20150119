package framesystem;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib.Calculation_lib;

public class FrameSystem_view extends Frame implements ActionListener,WindowListener{
   
	private TextField text1 = new TextField("",10);
	private TextField text2 = new TextField("",10);
	private Button button1 = new Button("ë´ÇµéZ");	
	private Button button2 = new Button("à¯Ç´éZ");
	private TextField text3 = new TextField("",10);
	private TextField text4 = new TextField("",10);
	
	public FrameSystem_view(){
         addWindowListener(this);
         setTitle("FrameSystem");
         setLayout((LayoutManager) new FlowLayout(FlowLayout.CENTER));
         add(text1);
         add(new Label("Å}"));
         add(text2);
         add(button1);
         add(button2);
         add(new Label("ìöÇ¶"));
         add(text3);
         add(text4);
         button1.addActionListener(this);   
         button2.addActionListener(this);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int val1 = Integer.parseInt(text1.getText());
		int val2 = Integer.parseInt(text2.getText());
		//text3.setText(String.valueOf(val1 + val2));
		Calculation_lib clib = new Calculation_lib(val1, val2);
		text3.setText(String.valueOf(clib.getPlus()));
		text4.setText(String.valueOf(clib.getMinus()));
		
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
	    System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
