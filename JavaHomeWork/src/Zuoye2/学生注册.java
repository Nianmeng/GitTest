package Zuoye2;

import java.awt.*;
import javax.swing.*;
class ѧ��ע��
{
  ѧ��ע��()
  {
   Frame f=new Frame("ѧ��ע��");
     f.setSize(300,200);
     f.setVisible(true);
Panel p=new Panel();
Panel p1=new Panel();
Panel p2=new Panel();

  Label SNOLabel=new Label("ѧ��");
  Label NameLabel=new Label("����");
  Label deptLabel=new Label("Ժϵ");
  Label ageLabel=new Label("����");
  Label TELLabel=new Label("��ϵ��ʽ");

Label l1=new Label("*");
Label l2=new Label("*");
Label l3=new Label("*");
Label l4=new Label("*");
Label l5=new Label("*");

l1.setForeground(Color.red);
l2.setForeground(Color.red);
l3.setForeground(Color.red);
l4.setForeground(Color.red);
l5.setForeground(Color.red);

    TextField SNOTF=new TextField(20);
    TextField NameTF=new TextField(20);
    TextField deptTF=new TextField(20);
    TextField ageTF=new TextField(20);

    TextField TELTF=new TextField(20);
Button conformB=new Button("ȷ��");
Button cancelB=new Button("ȡ��");

 f.add(p);
  p.setLayout(new BorderLayout());
  p.add(p1,BorderLayout.NORTH);
p.add(p2,BorderLayout.SOUTH);
  
p1.setLayout(new GridLayout(6,3));
p1.add(SNOLabel);p1.add(SNOTF);p1.add(l1);
p1.add(NameLabel);p1.add(NameTF);p1.add(l2);
p1.add(deptLabel);p1.add(deptTF);p1.add(l3);
p1.add(ageLabel);p1.add(ageTF);p1.add(l4);
p1.add(TELLabel);p1.add(TELTF);p1.add(l5);

p2.setLayout(new GridLayout(1,2));
p2.add(conformB);p2.add(cancelB);
}
public static void main(String args[])
{
new ѧ��ע��();
}
}
