import javax.swing.*;  
public class CheckBoxExample  {  
     CheckBoxExample(){  
        JFrame f= new JFrame("CheckBox Example");  
        JCheckBox checkBox1 = new JCheckBox("Java");  
        checkBox1.setBounds(100,100, 100,100);  
        f.add(checkBox1);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new CheckBoxExample();  
    }}  