


package pkg2;




public class DiscountException extends Exception{

	public DiscountException(int x)

	{

		System.out.println("Cogratulations.....u get 10% discount on ur total price of" +x);

	}




}

-------------------------------------


package pkg2;




public interface CalPrice {

void Calculate();

}

-----------------------------------------





package pkg1;







import java.awt.Color;

import java.awt.Component;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.ItemEvent;

import java.util.ArrayList;




import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JCheckBox;

import javax.swing.JComboBox;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

import javax.swing.JTextField;




import pkg2.CalPrice;

import pkg2.DiscountException;




 public class SwingParts implements ActionListener,CalPrice {

	 ArrayList<Integer> pri=new ArrayList<Integer>();

	 ArrayList<String> per=new ArrayList<String>();

	 String total1;

public int adults,infants,total,tota,n,m,row;

String places[]={"Bangalore","Delhi","Mumbai","Chennai","Kerala"};

//BoughtItem objbought = new BoughtItem();

Integer dates[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};

String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};

JLabel jl1 = new JLabel("From:");

JComboBox frm=new JComboBox(places);

JLabel jl2 = new JLabel("      To: ");

JComboBox to=new JComboBox(places);

JRadioButton opt=new JRadioButton(" 1-way   \t");

JLabel jl3 = new JLabel("leaving \t:");

JComboBox dat=new JComboBox(dates);

JComboBox mon=new JComboBox(month);

JLabel jl4 = new JLabel("\t returning:");

JComboBox dat1=new JComboBox(dates);

JComboBox mon1=new JComboBox(month);

JLabel jl6 = new JLabel("              Adults \t");

public JTextField tb=new JTextField(5);

JLabel jl7 = new JLabel("Infants");

public JTextField tb1=new JTextField(5);

JFrame f2=new JFrame();

JButton jb1=new JButton("submit");

JPanel jp = new JPanel(); 

JRadioButton rb1=new JRadioButton("Business");

JRadioButton rb2=new JRadioButton("Economy");




JLabel t=new JLabel("Total price: \n");




ButtonGroup bg=new ButtonGroup();

//JFrame jf = new JFrame("fligt details");

JPanel jp5=new JPanel();

JPanel jp3=new JPanel();

JPanel jp6=new JPanel();

JPanel jp4=new JPanel();

JButton pr=new JButton("proceed");

public JPanel p2=new JPanel();

public JPanel p=new JPanel();

//jp.setBackground(Color.blue);

JFrame jf = new JFrame(); 

JLabel jl5=new JLabel("success");

JLabel j1=new JLabel("Name");

JTextField na=new JTextField(20);




JLabel j2=new JLabel("Address");

JTextField ad=new JTextField(20);

JLabel j3=new JLabel("City");

JTextField ci=new JTextField(20);

JLabel j6=new JLabel("State");

JTextField st=new JTextField(20);




JLabel j4=new JLabel("Mobile No");

JTextField mo=new JTextField(20);

JLabel j5=new JLabel("Email Id");

JTextField em=new JTextField(20);

JRadioButton r1=new JRadioButton("8,000");

JRadioButton r2=new JRadioButton("9,000");

JRadioButton r3=new JRadioButton("12,000");

//JRadioButton r3=new JRadioButton("Silver Class");

//JRadioButton r4=new JRadioButton("Economic");

ButtonGroup bg1=new ButtonGroup();

JRadioButton rc1=new JRadioButton("18,000");

JRadioButton rc2=new JRadioButton("20,000");

//JRadioButton r3=new JRadioButton("Silver Class");

//JRadioButton r4=new JRadioButton("Economic");

ButtonGroup bg2=new ButtonGroup();




JCheckBox ag=new JCheckBox("I agree to terms and conditions");

JButton co=new JButton("Continue");

JLabel congo=new JLabel("Cogratulations.....u get 10% discount on ur total price");

JLabel book=new JLabel("                Number of seats booked:");

JLabel dum=new JLabel();

JLabel dummy=new JLabel();

JButton bo=new JButton("book");

public SwingParts(){

	

jp.add(jl1); 

jp.add(frm);

//jp.add(tfprice);

jp.add(jl2); 

jp.add(to);

//jp.add(tfqty); 




jp.add(opt);




jp.add(jl3); 

jp.add(dat);

jp.add(mon);

//jp.add(tfunittot); 

jp.add(jl4); 

jp.add(dat1);

jp.add(mon1);

jp.add(jl6);

jp.add(tb);

jp.add(jl7);

jp.add(tb1);

jp.add(jb1);

p2.add(j1);

	p2.add(na);

	

	p2.add(j2);

	p2.add(ad);

	p2.add(j3);

	p2.add(ci);

	p2.add(j6);

	p2.add(st);

	p2.add(j4);

	p2.add(mo);

	p2.add(j5);

	p2.add(em);

	p2.add(co);

	jf.add(p2);

	bg.add(rb1);

	bg.add(rb2);

	

	jp5.add(rb1);

	jp5.add(rb2);

	

	

rb1.addActionListener(this);

rb2.addActionListener(this);

	

jf.add(jp5);

	jf.setVisible(true);

	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

	jf.setSize(200,500); 

	co.addActionListener(this);

	

jf.add(jp); 

//p2.add(jl1);

jf.setVisible(true); 




//jp4.add(to);




//    jl5.setVisible(false);  

//mon1.setVisible(false); 

//dat1.setVisible(false); 

jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

jf.setSize(300,200); 

jf.setResizable(true);

jf.setContentPane(jp);

//jf.add(jp);

jp.setBackground(Color.pink);

//jb1.addActionListener(this);

opt.addActionListener(this);

jb1.addActionListener(this);

r1.addActionListener(this);

pr.addActionListener(this);

bo.addActionListener(this);




}

public void Calculate() {

	// TODO Auto-generated method stub

	

}

public void actionPerformed(ActionEvent e){

	

	if(e.getSource()==rb2)

	{

		

		JLabel j1=new JLabel("jet 1: ");

	JLabel j1t=new JLabel("2:30 a.m -");

	JLabel j2t=new JLabel("4:30 a.m ");

	JLabel j2=new JLabel("jet 2: ");

	JLabel j3t=new JLabel("8:30 a.m -");

	JLabel j4t=new JLabel("10:30 a.m ");

	JLabel j3=new JLabel("jet 3: ");

	JLabel j5t=new JLabel("12:30 p.m -");

	JLabel j6t=new JLabel("14:30 p.m ");

	




	bg1.add(r1);

	bg1.add(r2);

	bg1.add(r3);

	jp3.add(j1);

	jp3.add(j1t);

	jp3.add(j2t);

	jp3.add(r1);

	jp3.add(j2);

	jp3.add(j3t);

	jp3.add(j4t);

	jp3.add(r2);

	jp3.add(j3);

	jp3.add(j5t);

	jp3.add(j6t);

	jp3.add(r3);

	jf.add(jp3);

	jp3.add(pr);

	jf.setSize(250,200);

	

	//r1.isSelected();

	

	jf.setContentPane(jp3);

	jp3.setBackground(Color.yellow);

		jf.setVisible(true);

		

		//pr.addActionListener(this);

	}

	

	if(e.getSource()==rb1)

	{

		

		JLabel j1=new JLabel("jet 1: ");

	JLabel j1t=new JLabel("2:30 a.m -");

	JLabel j2t=new JLabel("4:30 a.m ");

	JLabel j2=new JLabel("jet 2: ");

	JLabel j3t=new JLabel("8:30 a.m -");

	JLabel j4t=new JLabel("10:30 a.m ");

	




	bg2.add(rc1);

	bg2.add(rc2);




	jp3.add(j1);

	jp3.add(j1t);

	jp3.add(j2t);

	jp3.add(rc1);

	jp3.add(j2);

	jp3.add(j3t);

	jp3.add(j4t);

	jp3.add(rc2);

	jf.add(jp3);

	jp3.add(pr);

	

	jf.setSize(250,200);

	jf.setContentPane(jp3);

	jp3.setBackground(Color.yellow);

		jf.setVisible(true);

	}

	

	if(e.getSource()==pr)

	{String value=na.getText();

		if(r1.isSelected())

	{//q=8000;

	pri.add(8000);

	System.out.println(pri);

	

}

	if(r2.isSelected())

	{//q=8000;

	pri.add(9000);

	System.out.println(pri);

	

}

	if(r3.isSelected())

	{//q=8000;

	pri.add(12000);

	System.out.println(pri);

	

}

	if(rc1.isSelected())

	{//q=8000;

	pri.add(18000);

	System.out.println(pri);

	

}

	if(rc2.isSelected())

	{//q=8000;

	pri.add(20000);

	System.out.println(pri);

	

}

	

		jf.add(p2);

		 jf.setSize(250,400);

		jf.setContentPane(p2);

		p2.setBackground(Color.magenta);

		jf.setVisible(true);

		//System.out.println(value);

	}

		

	   

if(e.getSource()==opt)

{

   dat1.setEnabled(false);

   

       mon1.setEnabled(false);   

    }

if(e.getSource()==jb1) 

{

	jf.add(jp5);

	jf.setContentPane(jp5);

	jp5.setBackground(Color.black);

	jf.setVisible(true);

}




if(e.getSource()==bo)

{ 







	total=(n*pri.get(0))+(m*(pri.get(0)/2));

	

	try

	{

	if(total>25000)

	{jp4.add(congo);

		throw new DiscountException(total);

	}

	}

	catch(DiscountException e1)

	{

		System.out.println(e1);

	}

		

		System.out.println(total);

		total1=Integer.toString(total/10);

		jp4.add(t);

		jp4.add(dummy);

		jp4.add(book);

		jp4.add(dum);

dummy.setText(total1);

dum.setText(Integer.toString(row));

jf.add(jp4);

jf.setContentPane(jp4);

jp4.setBackground(Color.pink);

jp4.setSize(250,100);

jf.setVisible(true);

}







if(e.getSource()==co) { 

	 n = Integer.parseInt(tb.getText());

	 m = Integer.parseInt(tb1.getText());




	   row=n+m;

	   for(int i=0;i<row;i++)

	   {

	   	JLabel j1i=new JLabel("Name");

	   	JTextField j2i=new JTextField(8);

	per.add(j2i.getText());

	

	//per.add(value);

	   	JLabel j3i=new JLabel("Birth Date");

	   	JTextField j4i=new JTextField(8);

	   	p.add(j1i);

	   	p.add(j2i);

	   	p.add(j3i);

	   	p.add(j4i);

	   }

	  

p.add(bo);

jf.add(p);

jf.setSize(315,200);

jf.setContentPane(p);

p.setBackground(Color.white);

jf.setVisible(true);

}




 

}




public static void main(String args[])

{

	

	try

	{

SwingParts bsp=new SwingParts();

	}

catch(Exception e)

{

System.out.println(e);

}

}







}
