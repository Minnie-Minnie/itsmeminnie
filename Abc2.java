//<applet code="MyApplet" width="500" height="200"></applet>  
import java.awt.*;
import java.awt.event.*;
import java.applet.*;//appletviewer--> reads 1 line.
public class MyApplet extends Applet implements ActionListener{ 


	Label b;
	TextField tf;//as it is of class type it holds a value of null that's why there is a nullpointerexception.
	Button r,g;
	public void init(){
		 Color c= new Color(200,50,100);
		 setBackground(c);
		 //tf.setBackground(Color.yellow);
		 //tf.setForeground(c);
		 setLayout(new BorderLayout());
		 setBackground(c);		 
		 b=new Label("Selection");
		 tf=new TextField();
		// tf.setText(tf.getBackgroundColor()); eror cann't find symbol.
		 tf.setBackground(Color.pink);
		 tf.setForeground(c);
		 //tf.setText(tf.getBackgroundColor());
		 r=new Button("orange");
		 g=new Button("green");
		 //t=new Button("black");
		 Font f= new Font("Arial",Font.ITALIC,18);
		 tf.setFont(f);
		 r.setFont(f);
		 g.setFont(f);
		 b.setFont(f);
		 //t.setFont(f);
		// b.setBounds(10,10,80,30);
		 //tf.setBounds(100,10,80,30); all the buttons are overlapped.to overcome this we have a solution-->
		 //r.setBounds(10,120,80,30);
		 //g.setBounds(100,120,80,30);
		 //t.setBounds(180,120,80,30);
		 r.addActionListener(this);
		 g.addActionListener(this);
		 //t.addActionListener(this);
		 add(b,BorderLayout.NORTH);
		 add(tf,BorderLayout.SOUTH);
		 add(r,BorderLayout.EAST);
		 add(g,BorderLayout.WEST);	
		 //add(t);	
	} 
public void actionPerformed(ActionEvent ae){
	String st=ae.getActionCommand();//public String getActionCommand();
    tf.setText(st);	
	Object ob=ae.getSource();// public Object getSource--> returns the refeence of the components  to
	//  which user has intercated.
	if(ob==r){//obejct comparison
		setBackground(Color.orange);	
	}	else if(ob==g){
		setBackground(Color.GREEN);
		}	
		
}


}
