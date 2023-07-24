import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



class Login1  implements ActionListener
{

Frame f;
Label l1,l2,l3;
TextField t1,t2,t3,t4,t5;
Checkbox c1,c2,c3,c4;
Button b1;

Login1()
{

  f=new Frame();
  f.setLayout(new FlowLayout());
  l1=new Label("email");
 f.add(l1);

 t1=new TextField(10);
 f.add(t1);

 l2=new Label("enter password");
 f.add(l2);

 t2=new TextField(10);
 f.add(t2);


b1=new Button("OK");
f.add(b1);

b1.addActionListener(this);

f.setTitle("Login");
f.setSize(300,300);
f.setVisible(true);

}



public void actionPerformed(ActionEvent e){
 if(e.getSource()==b1){
 
JOptionPane.showMessageDialog(null,"Login Successfully");


 }

}
}




class Booking implements ActionListener
{

JFrame f;
JLabel l1,l2,l3,l4,l5;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
JPanel p1,p2;
ImageIcon i1,i2;
JTextField t1,t2,t3,t4;

Booking()
{
f=new JFrame();
f.setLayout(null);


l1=new JLabel("BOOKING");
l1.setFont(new Font("Times New Roman", Font.PLAIN, 100));
l1.setBounds(50,20,780,100);
f.add(l1);


l2=new JLabel("Registration Number");
 l2.setBounds(50, 160, 150, 30);   
f.add(l2);
t1=new JTextField();
  t1.setBounds(230, 160, 200, 30);
f.add(t1);



l3=new JLabel("email");
 l3.setBounds(50, 260, 150, 30);   
f.add(l3);
t2=new JTextField();
  t2.setBounds(230, 260, 200, 30);
f.add(t2);



b1=new JButton("confirm");
 b1.setBounds(100, 360, 150, 30);

b2=new JButton("cancel");
 b2.setBounds(300, 360, 150, 30);
 f.add(b1);
 f.add(b2);
 
 b1.addActionListener(this);
 b2.addActionListener(this);




f.setSize(900,2000);
f.setVisible(true);
}


public void actionPerformed(ActionEvent e){
 if(e.getSource()==b1){
   JOptionPane.showMessageDialog(null,"SuccessFull Registred");


}
}


}



class project implements ActionListener,ItemListener
{

JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
JTabbedPane j1;
ImageIcon i1,i2,i3,i4,i5,i6,i7;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
JRadioButton r1,r2;
JCheckBox c1,c2,c3;
JTextArea ta1,ta2;
String proof,proof1,proof2,proof3,gender;
Connection con;
PreparedStatement st;
project()
{
	
	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	     con=DriverManager.getConnection("jdbc:odbc:test");
		st=con.prepareStatement("insert into table(name,password,gender,dob,idproof,email) values(?,?,?,?,?,?)");
		
	}
	catch(Exception ee)
	{
		System.out.println("sorry to connect");
	}
	
f=new JFrame();
j1=new JTabbedPane();
f.setLayout(null);


p1=new JPanel();
p1.setBounds(20,20,800,800);




p2=new JPanel();
p2.setBounds(20,20,800,800);



p3=new JPanel();
p3.setBounds(20,20,800,800);

p8=new JPanel();
p8.setBounds(20,20,800,800);

p9=new JPanel();
p9.setBounds(20,20,800,800);

l4=new JLabel("Now we bring to you IVRS facility for refill booking. The benefits of using IVRS for refill cylinder booking are many: ");
l4.setBounds(30,30,450,800);






p3.add(l4);

p4=new JPanel();
p4.setBounds(20,20,800,800);



//--------HOME
p1.setLayout(null);
l26=new JLabel("Apni Gas");
l26.setBounds(300,10,200,50);
l26.setFont(new Font("Times New Roman", Font.PLAIN, 40));
p1.add(l26);
 l26.setForeground(Color.red);
 

i6=new ImageIcon("online1.png");
 l24=new JLabel(i6);
 l24.setBounds(10,60,800,300);
 p1.add(l24);

 
 l25=new JLabel("Gas System");
 l25.setBounds(10,350,200,50);
 l25.setFont(new Font("Times New Roman", Font.PLAIN, 30));
 l25.setForeground(Color.red);
 p1.add(l25);
 
ta2=new JTextArea("At IndianOil, we continuously strive for customer delight "+
 "\r\n" + 
"through our value-added products and services. Indane has"+ "\r\n"  +
 "leveraged the strength of digital technology to provide "+"\r\n"+"numerous initiatives for greater customer convenience:"+"\r\n"+"\r\n"+"* SMS/IVRS Refill Booking"+"\r\n"+"* Missed Call Refill Booking"+"\r\n"+"* Preferred Time Delivery"+"\r\n"+"* Online Portability of Connections"+
"\r\n"+"* Refill Booking Portability");
 ta2.setBounds(10,410,500,400);
ta2.setEditable(false);
ta2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
//ta2.setBackground(Color.DARK_GRAY); 

p1.add(ta2);


i7=new ImageIcon("a1.gif");
 l25=new JLabel(i7);
 l25.setBounds(550,400,200,400);
 p1.add(l25);

 

//gallery------------------------------------------
p4.setLayout(null);
p5=new JPanel();
p5.setBounds(10,10,800,150);
p6=new JPanel();
p6.setBounds(10,170,800,800);

p4.add(p5);
p4.add(p6);

p5.setBackground(Color.pink);
p6.setBackground(Color.green);

l6=new JLabel("APNI GAS");
l6.setFont(new Font("Times New Roman", Font.PLAIN, 100));
//l1.setBounds(50,50,100);
p5.add(l6);
  
i1=new ImageIcon("lpg.gif");
 b1=new JButton(i1); 
 
   i2=new ImageIcon("g1.jpeg");
     b2=new JButton(i1);    
     b3=new JButton(i1);    
     b4=new JButton(i1);    
     b5=new JButton(i1);    
     b6=new JButton(i1);    
     b7=new JButton(i1);    
     b8=new JButton(i1);    
     b9=new JButton(i1);    
     // adding buttons to the frame       
    p6.add(b1); p6.add(b2); p6.add(b3);  
    p6.add(b4); p6.add(b5); p6.add(b6);  
    p6.add(b7); p6.add(b8); p6.add(b9);    
  
p6.setLayout(new GridLayout(4,4));





//------------------------------------------------------

//new Connection--------------------------------


 p2.setLayout(null);
  l7 = new JLabel("Name");
  t1 = new JTextField(20);
  
  l8= new JLabel("Password");
   t2 = new JTextField(20);
   
     
p2.add(l7);
p2.add(t1);
p2.add(l8);
p2.add(t2);

 l7.setBounds(50, 60, 100, 30);
        t1.setBounds(130, 60, 200, 30);
        l8.setBounds(50, 110, 100, 30);
        t2.setBounds(130, 110, 100, 30);
		
		
		

l9=new JLabel("Gender");
l9.setBounds(50, 160, 100, 30);
p2.add(l9);
r1=new JRadioButton("Male");
r1.setBounds(130, 160, 100, 30);
r2=new JRadioButton("Female");
r2.setBounds(240, 160, 100, 30);
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);
bg.add(r2);


p2.add(r1);
p2.add(r2);

		
	
l10=new JLabel("DOB");
l10.setBounds(50, 210, 100, 30);
p2.add(l10);

t3=new JTextField();
 t3.setBounds(130, 210, 100, 30);
p2.add(t3);

l11=new JLabel("ID proofs");
l11.setBounds(50, 260, 100, 30);
p2.add(l11);

c1=new JCheckBox("PAN");
c1.setBounds(130,260,100,30);

c2=new JCheckBox("ADHAR");
c2.setBounds(230,260,100,30);

c3=new JCheckBox("VOTER CARD");
c3.setBounds(330,260,200,30);

p2.add(c1);
p2.add(c2);
p2.add(c3);
r1.addItemListener(this);
	r2.addItemListener(this);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	



l16=new JLabel("email");
l16.setBounds(50, 310, 100, 30);
p2.add(l16);

t6=new JTextField();
 t6.setBounds(130, 310, 100, 30);
p2.add(t6);



i5=new ImageIcon("gas.png");
 l23=new JLabel(i5);
 l23.setBounds(500,150,300,400);
 p2.add(l23);
 


b11=new JButton("Submit");
b12=new JButton("Login");
b11.addActionListener(this);
b12.addActionListener(this);

p2.add(b11);
p2.add(b12);
b11.setBounds(50,360,100,30);
b12.setBounds(200,360,100,30);


//-------------Booking


p3.setLayout(null);
l13=new JLabel("Login");
l13.setFont(new Font("Times New Roman", Font.PLAIN, 100));
l13.setBounds(50,20,780,100);
p3.add(l13);


l14=new JLabel("email");
 l14.setBounds(50, 160, 150, 30);   
p3.add(l14);
t4=new JTextField();
  t4.setBounds(230, 160, 200, 30);
p3.add(t4);




l15=new JLabel("password");
 l15.setBounds(50, 260, 150, 30);   
p3.add(l15);
t5=new JTextField();
  t5.setBounds(230, 260, 200, 30);
p3.add(t5);



b13=new JButton("confirm");
 b13.setBounds(100, 360, 150, 30);

b14=new JButton("cancel");
 b14.setBounds(300, 360, 150, 30);
 p3.add(b13);
 p3.add(b14);
 
 b13.addActionListener(this);
 b14.addActionListener(this);



i4=new ImageIcon("apnigas.jpg");
 l22=new JLabel(i4);
 l22.setBounds(500,50,300,400);
 p3.add(l22);




//Contact Us



p8.setLayout(null);

l17=new JLabel("Contact Us");
l17.setFont(new Font("Times New Roman", Font.PLAIN, 100));
l17.setBounds(50,20,780,100);
p8.add(l17);


l18=new JLabel("Name");
 l18.setBounds(50, 160, 150, 30);   
p8.add(l18);
t7=new JTextField();
  t7.setBounds(230, 160, 200, 30);
p8.add(t7);




l19=new JLabel("Email");
l19.setBounds(50, 210, 150, 30);
p8.add(l19);
t8=new JTextField();
  t8.setBounds(230, 210, 200, 30);
p8.add(t8);

l20=new JLabel("FeedBack");
l20.setBounds(50,260,150,30);
p8.add(l20);

ta1=new JTextArea();
ta1.setBounds(230, 260, 200, 130);
p8.add(ta1);




b15=new JButton("Submit");
b15.setBounds(200,410,200,30);
p8.add(b15);

i3=new ImageIcon("image1.png");
 l21=new JLabel(i3);
 l21.setBounds(500,150,300,400);
 p8.add(l21);







j1.setBounds(25,25,800,800);
j1.add("      Home    ",p1);
j1.add("new Connection",p2);
j1.add("     Booking  ",p3);
j1.add("     gallery  ",p4);
j1.add("  Contact US  ",p8);
j1.add("     print    ",p9);


f.add(j1);






f.setSize(900,2000);
f.setVisible(true);
}




public void actionPerformed(ActionEvent e){
	
	
if(e.getSource()==b11){
   
   try{
	   proof=proof1+","+proof2+","+proof3;
	   st.setString(1,t1.getText());
	   st.setString(2,t2.getText());
	   st.setString(3,gender);
	   st.setString(4,t3.getText());
	   st.setString(5,proof);
	   st.setString(6,t6.getText());
	   st.executeUpdate();
	   
	 
   }
   catch(Exception e1){
	   System.out.println("sorry");
   }
   System.out.println(t1.getText());
      System.out.println(t2.getText());
	     System.out.println(gender);
		    System.out.println(t3.getText());
			   System.out.println(proof);
			      System.out.println(t6.getText());

 
}


 if(e.getSource()==b12){
   //JOptionPane.showMessageDialog(null,"Login");

 j1.setSelectedIndex(2);
}

 if(e.getSource()==b13){
   //JOptionPane.showMessageDialog(null,"Login");4
       System.out.println(t4.getText());
	   System.out.println(t5.getText());
   new Booking();

 
}

}


public void itemStateChanged(ItemEvent eee)
{
  if(eee.getSource()==c1)
  {
	   proof1="PAN";
  }
    if(eee.getSource()==c2)
  {
	   proof2="ADHAR";
  }
    if(eee.getSource()==c3)
  {
	   proof3="VOter Card";
  }
  
  
  if(eee.getSource()==r1)
  {
	  gender="Male";
	  
  }
   if(eee.getSource()==r2)
  {
	  gender="Female";
	  
  }
  
}

public static void main(String args[])
{
new project();
}

}