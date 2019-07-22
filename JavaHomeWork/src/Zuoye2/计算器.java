package Zuoye2;

import java.awt.*;
import java.awt.event.*;

class 计算器 implements ActionListener
{
  TextField FirstTF,SecondTF,ResultTF;
  Button addB,subB,mulB,divB,clearB;


 计算器()
  {
   Frame f=new Frame("简易计算器");
    f.setSize(400,300);
    f.setVisible(true);
   // f.setDefaultCloseOperation(WindowConstrants.EXIT_ON_CLOSE);

    Panel p=new Panel();

   Label FirstLabel= new Label("第一个数");
    Label SecondLabel= new Label("第二个数");
   Label ResultLabel= new Label("结     果");

    FirstTF=new TextField(10);
     SecondTF=new TextField(10);
     ResultTF=new TextField(10);

     addB=new Button("+");
     subB=new Button("-");
     mulB=new Button("*");
    divB=new Button("/");
    clearB=new Button("清空");

  f.add(p);
  p.setLayout(null);
  
  FirstLabel.setBounds(50,30,80,20);
  p.add(FirstLabel);
  FirstTF.setBounds(140,30,100,20);
  p.add(FirstTF);

   SecondLabel.setBounds(50,60,80,20);
  p.add(SecondLabel);
  SecondTF.setBounds(140,60,100,20);
  p.add(SecondTF);

   ResultLabel.setBounds(50,90,80,20);
  p.add(ResultLabel);
  ResultTF.setBounds(140,90,100,20);
  p.add(ResultTF);

   addB.setBounds(50,140,30,20);
  p.add(addB);
   subB.setBounds(90,140,30,20);
  p.add(subB);
  mulB.setBounds(130,140,30,20);
  p.add(mulB);
   divB.setBounds(170,140,30,20);
  p.add(divB);
   clearB.setBounds(210,140,40,20);
  p.add(clearB);

  addB.addActionListener(this);
  subB.addActionListener(this);
  mulB.addActionListener(this);
  divB.addActionListener(this);
  clearB.addActionListener(this);
 
 }
 public void actionPerformed(ActionEvent e)
 {  
  double  first=0,second=0,result=0;

  first=Double.parseDouble(FirstTF.getText());
 second=Double.parseDouble(SecondTF.getText());
 
  if(e.getSource()==addB)
  {
   result=first+second;
    ResultTF.setText(String.valueOf(result));
   }
  if(e.getSource()==subB)
  {
   result=first-second;
    ResultTF.setText(String.valueOf(result));
   }
 if(e.getSource()==mulB)
  {
   result=first*second;
    ResultTF.setText(String.valueOf(result));
   }

 if(e.getSource()==divB)
  {
   result=first/second;
    ResultTF.setText(String.valueOf(result));
   }
  if(e.getSource()==clearB)
  {
    FirstTF.setText("");
  SecondTF.setText("");
    ResultTF.setText("");
   }
 
  }

 public static void main(String args[])
  {new 计算器();}  
 }
