package com.infiniteshivtechnologies.ISTOptionpane;



public class ISTOptionpane {

    public static MainFrame frame = new MainFrame();    
    
    public void displaypane(String title,String question){
    
        MainFrame.title_lab.setText(title);
        MainFrame.question_lab.setText(question);
        frame.setTitle(title);
        frame.setVisible(true);
    }
        
}
