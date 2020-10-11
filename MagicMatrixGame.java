import javax.swing.*; 
import java.awt.event.*; 
import java.awt.Color;
 public class MagicMatrixGame extends JFrame{
  JButton Next,b1,b2,b3,b4,b5,b6,b7,b8,b9;
   JTextField jf; JLabel l,l1,l2,l3,l4,l5,l6;
public MagicMatrixGame(){ 
	super("Magic_Matrix_Game"); 
	l = new JLabel("GAME_RULES : "); 
	l.setBackground(Color.GREEN);
	l.setBounds(10,10,500,20); add(l);
l1 = new JLabel("1-> EACH ROW ELEMENT IS SUM = 15"); 
l1.setBounds(10,25,350,40);
 add(l1);
 l2 = new JLabel("2-> EACH COLUNM ELEMENT IS SUM = 15");
  l2.setBounds(10,45,350,60);
   add(l2);
    l3 = new JLabel("3-> EACH DIAGANAL ELEMENT IS SUM = 15");
     l3.setBounds(10,65,350,80); 
     add(l3);
l4 = new JLabel("4->ELEMENT RANGE IS 1 TO 8AND SPACE BOX IS CONSIDERED = 9");
 l4.setBounds(10,85,350,100); 
 add(l4);
  l5 = new JLabel("5-> IF YOU WIN THEN RESULT SHOW IN RESULT BOX");
   l5.setBounds(10,105,350,120);
    add(l5);
    l6 = new JLabel("RESULT :");
     l6.setBounds(400, 380,150,30);
      add(l6);
b1=new JButton("2");
 b1.setBackground(Color.GREEN);
  b1.setBounds(400,40,90,90);
   add(b1); 
   b1.addActionListener(new A1());
b2=new JButton("3");
 b2.setBounds(500,40,90,90);
  b2.setBackground(Color.GREEN);
   add(b2);
    b2.addActionListener(new A2());
b3=new JButton("5"); 
b3.setBounds(600,40,90,90);
 b3.setBackground(Color.GREEN);
  add(b3);
   b3.addActionListener(new A3());
b4=new JButton("7"); 
b4.setBounds(400,140,90,90);
 b4.setBackground(Color.GREEN); 
 add(b4); b4.addActionListener(new A4());
b5=new JButton("4"); 
b5.setBounds(500,140,90,90); 
b5.setBackground(Color.GREEN);
 add(b5);
  b5.addActionListener(new A5());
b6=new JButton("6");
 b6.setBounds(600,140,90,90);
  b6.setBackground(Color.GREEN); 
  add(b6);
   b6.addActionListener(new A6());
b7=new JButton("1");
 b7.setBounds(400,240,90,90);
  b7.setBackground(Color.GREEN);
   add(b7);
    b7.addActionListener(new A7());
b8=new JButton("8");
 b8.setBounds(500,240,90,90);
  b8.setBackground(Color.GREEN);
   add(b8);
    b8.addActionListener(new A8());
b9=new JButton(" ");
 b9.setBounds(600,240,90,90);
  b9.setBackground(Color.GREEN); 
  add(b9); 
  b9.addActionListener(new A9());
Next = new JButton("NEXT_GAME");
 Next.setBounds(465,345,150,30);
  Next.setBackground(Color.CYAN);
   add(Next); Next.addActionListener(new A());
jf = new JTextField();
 jf.setBounds(465, 380,150,30);
  jf.setBackground(Color.CYAN);
   add(jf); jf.setEditable(false);
setBounds(5,5,850,950);
setLayout(null); setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 } 
 class A implements ActionListener{
  public void actionPerformed(ActionEvent e){
  if(e.getSource()==Next){
                  String s = b5.getText();
                   b5.setText(b1.getText()); 
                   b1.setText(s); 
                   String s1= b6.getText();
                    b6.setText(b4.getText()); 
                    b4.setText(s1); 
                    String s2 = b8.getText();
                     b8.setText(b5.getText());
                      b5.setText(s2);
                       String s3 = b5.getText();
                        b5.setText(b9.getText());
                         b9.setText(s3); 
                         String s4= b7.getText(); 
                         b7.setText(b2.getText());
                          b2.setText(s4); 
                          String s5 = b3.getText();
                           b3.setText(b7.getText());
                            b7.setText(s5);
b1.setEnabled(true); b2.setEnabled(true);  b3.setEnabled(true); 
b4.setEnabled(true); 
b5.setEnabled(true);  b6.setEnabled(true);b7.setEnabled(true);  b8.setEnabled(true);  b9.setEnabled(true);
jf.setText(" ");
 jf.setEditable(false);
} 
}
 }

public void setEnable(){
 b1.setEnabled(false); 
 b2.setEnabled(false); 
 b3.setEnabled(false); 
 b4.setEnabled(false); 
 b5.setEnabled(false); 
 b6.setEnabled(false); 
 b7.setEnabled(false); 
 b8.setEnabled(false);
  b9.setEnabled(false); 
}
class A1 implements ActionListener{
public void actionPerformed(ActionEvent e){ 
	if(e.getSource()==b1){
	 String s = b1.getText();
	  if(b2.getText()==" "){
	   b2.setText(s); b1.setText(" "); 
	} else if(b4.getText()==" "){ 
		b4.setText(s); b1.setText(" "); 
	} if(check()){ 
		jf.setText("YOU WON GAME ");
		 setEnable();
	} 
	} 
}
 }
class A2 implements ActionListener{ 
	public void actionPerformed(ActionEvent e){ 
		if(e.getSource()==b2){ 
			String s = b2.getText();
			 if(b1.getText()==" "){
			  b1.setText(s);
			   b2.setText(" ");
			    } else if(b3.getText()==" "){
			     b3.setText(s); 
			     b2.setText(" ");
			      } else if(b5.getText()==" "){
			       b5.setText(s);
			        b2.setText(" "); 
			    } if(check()){
			       jf.setText("YOU WON GAME "); 
			        setEnable();}
			       }
	
			        }
			         }
class A3 implements ActionListener{ 
	public void actionPerformed(ActionEvent e){ 
		if(e.getSource()==b3){ 
			String s = b3.getText();
			 if(b2.getText()==" "){
			  b2.setText(s);
			   b3.setText(" ");
			    } else if(b6.getText()==" "){
			     b6.setText(s); b3.setText(" ");
			      }
if(check()){
 jf.setText("YOU WON GAME ");
 setEnable();}
 } 
} 
}
class A4 implements ActionListener{ 
	public void actionPerformed(ActionEvent e){
	 if(e.getSource()==b4){
	  String s = b4.getText();
	   if(b1.getText()==" "){ 
	   	b1.setText(s);
	   	 b4.setText(" "); 
	   	} else if(b5.getText()==" "){
	   	 b5.setText(s); b4.setText(" ");
	   	  } else if(b7.getText()==" "){
	   	   b7.setText(s); b4.setText(" ");
	   	    } if(check()){
	   	     jf.setText("YOU WON GAME "); 
	   	     setEnable();}
	   	  } 
	   	}
	   }
class A5 implements ActionListener{ 
	public void actionPerformed(ActionEvent e){
	 if(e.getSource()==b5){ 
	 	String s = b5.getText();
	 	 if(b2.getText()==" "){ 
	 	 	b2.setText(s); b5.setText(" ");
	 	 	 } else if(b4.getText()==" "){ 
	 	 	 	b4.setText(s); b5.setText(" ");
	 	 	 	 } else if(b6.getText()==" "){
	 	 	 	  b6.setText(s); b5.setText(" ");
	 	 	 	   }else if(b8.getText()==" "){
	 	 	 	    b8.setText(s); b5.setText(" "); 
	 	 	 	} if(check()){
	 	 	 	 jf.setText("YOU WON GAME "); 
	 	 	 	 setEnable();} 
} 
}
 }
class A6 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b6){
  	String s = b6.getText();
  	 if(b3.getText()==" "){ 
  	 	b3.setText(s); 
  	 	b6.setText(" ");
  	 	 } else if(b5.getText()==" "){
  	 	  b5.setText(s); b6.setText(" ");
  	 	   } else if(b9.getText()==" "){
  	 	    b9.setText(s); b6.setText(" ");
  	 	     } if(check()){
  	 	      jf.setText("YOU WON GAME ");
  	 	       setEnable();} 
  	 	} 
  	 } 
  	}
class A7 implements ActionListener{
 public void actionPerformed(ActionEvent e){ 
 	if(e.getSource()==b7){
 	 String s = b7.getText();
 	  if(b8.getText()==" "){ 
 	  	b8.setText(s); 
 	  	b7.setText(" "); 
 	  } else if(b4.getText()==" "){ 
 	  	b4.setText(s); b7.setText(" "); 
 	  } if(check()){ 
 	  	jf.setText("YOU WON GAME "); 
 	  	setEnable();} 
 	}
 	 }
 	  }
class A8 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b8){ 
  	String s = b8.getText();
if(b5.getText()==" "){
 b5.setText(s);
  b8.setText(" ");
   } else if(b7.getText()==" "){
    b7.setText(s);
     b8.setText(" ");
      } else if(b9.getText()==" "){
       b9.setText(s);
        b8.setText(" ");
         } if(check()){
          jf.setText("YOU WON GAME ");
           setEnable();} 
   } 
}
 }
class A9 implements ActionListener{
 public void actionPerformed(ActionEvent e){
  if(e.getSource()==b9){ 
   String s = b9.getText(); if(b6.getText()==" "){ 
   	b6.setText(s); 
   	b9.setText(" ");
   	 } else if(b8.getText()==" "){ 
   	 	b8.setText(s);
   	 	 b9.setText(" ");
   	 	  } if(check()){
   	 	   jf.setText("YOU WON GAME ");
   	 	    setEnable();} 
   	 	      } 

   	 	  } 
   	 	}
public boolean check(){
 int a,b,c,d,e,f,g,h,i;
if(b2.getText()==" "){
 b=9;
  a=Integer.parseInt(b1.getText());
   c=Integer.parseInt(b3.getText());
    d=Integer.parseInt(b4.getText());
     e=Integer.parseInt(b5.getText());
      f=Integer.parseInt(b6.getText()); 
      g=Integer.parseInt(b7.getText()); 
      h=Integer.parseInt(b8.getText());
i=Integer.parseInt(b9.getText()); 
if((a+b+c+d+e+f+g+h+i)==45 && (a+b+c)==15 && (a+e+i)==15 && (a+d+g)==15 && (b+e+h)==15 && (c+e+g)==15 && (d+e+f)==15 && (g+h+i)==15 && (c+f+i)==15 ){
 return true;} 
}
if(b6.getText()==" "){
 f=9; 
 a=Integer.parseInt(b1.getText());
  b=Integer.parseInt(b2.getText());
   c=Integer.parseInt(b3.getText());
    d=Integer.parseInt(b4.getText());
     e=Integer.parseInt(b5.getText());
      g=Integer.parseInt(b7.getText());
       h=Integer.parseInt(b8.getText());
        i=Integer.parseInt(b9.getText());
         if((a+b+c+d+e+f+g+h+i)==45 && (a+b+c)==15 && (a+e+i)==15 && (a+d+g)==15 && (b+e+h)==15 && (c+e+g)==15 && (d+e+f)==15 && (g+h+i)==15 && (c+f+i)==15 ){
          return true; }
       } 
       if(b8.getText()==" "){
        h=9;
         a=Integer.parseInt(b1.getText());
          b=Integer.parseInt(b2.getText());
      c=Integer.parseInt(b3.getText());
       d=Integer.parseInt(b4.getText());
        e=Integer.parseInt(b5.getText());
         f=Integer.parseInt(b6.getText());
          g=Integer.parseInt(b7.getText());
           i=Integer.parseInt(b9.getText());
            if((a+b+c+d+e+f+g+h+i)==45 && (a+b+c)==15 && (a+e+i)==15 && (a+d+g)==15 && (b+e+h)==15 && (c+e+g)==15 && (d+e+f)==15 && (g+h+i)==15 && (c+f+i)==15 ){ 
            	return true; 
            } 
        }
if(b4.getText()==" "){ 
	d=9;
	 a=Integer.parseInt(b1.getText());
	  b=Integer.parseInt(b2.getText());
	   c=Integer.parseInt(b3.getText());
	    e=Integer.parseInt(b5.getText());
	     f=Integer.parseInt(b6.getText()); 
	     g=Integer.parseInt(b7.getText());
	      h=Integer.parseInt(b8.getText());
	       i=Integer.parseInt(b9.getText()); 
	       if((a+b+c+d+e+f+g+h+i)==45 && (a+b+c)==15 && (a+e+i)==15 && (a+d+g)==15 && (b+e+h)==15 && (c+e+g)==15 && (d+e+f)==15 && (g+h+i)==15 && (c+f+i)==15 ){ 
	    	   return true; }
	       }
return false;
 } 
  public static void main(String args[]){
   new MagicMatrixGame();
} 
}