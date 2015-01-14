//ALSO 
//GUI müsste glaub ich fast passen nur zeigts die 3 Objekte also MainArrayPanel, MainStackPanel und DeckPanel ned an         
//wie wenn was mit dem visible(true) ned passt hab ich aber nix mehr gefunden... 
//Dann kannst dir überlegen wie wir des mit den actionlistener machen die müssen jetzt dann den observer benachrichtigen denke ich (mal bei den anderen nachschauen) 
//des GuiTest war jetzt wirklich nur als test gedacht um die 3 klassen halt mal zu testen. Also is denk noch verbesserungsfähig
//und dann is noch der scheiß mit Tui und Gui parallel laufen zu lassen
//GuiTobi is alles Müll
//der Cycle im Jenkins is au weg 
//Logger könnt ma sich noch überlegen bzw. irgendwas mit view (dann braucht ma kein system out mehr) 
//VIEL SPASS :) 
//

package de.htwg.elferraus.gui;

/**
 *
 * @author Tobi
 */
//public class GuiTobi extends JFrame implements IObserver, ActionListener {
//    
//    JFrame mainWindow = new JFrame("Elfer Raus");
//    //JComboBox indexChooser = new JComboBox();
//    JTextField playerAmount = new JTextField();
//    JButton start = new JButton("Start");
//    
//    
//    
//    private final ElferRausController controller;
//    
//    public GuiTobi(ElferRausController controller){
//        this.controller = controller;
//        controller.addObserver(this);
//        mainWindow.setLayout(new GridLayout());
//        
//      
//        playerPanel.setLayout(new GridLayout(1,2));
//        
//        
//    }
//
//    public void initialize(){
//        start.addActionListener(this);
//        mainWindow.add(playerAmount);
//        mainWindow.add(start);
//    }
//    
//    public void iterate(){
//        
//        
//    }
//    
//    public void printGUI(){
//      //  mainArrayPanel.
//        
//    }
//    
//    
//    
//    
//    
//    public void update() {
//        printGUI();
//    }
//    
//     public void actionPerformed (ActionEvent ae){
//        if(ae.getSource() == this.start){
//            int i = Integer.parseInt(playerAmount.getText());
//            this.controller.setPlayer(i);
//        }
//        else if(ae.getSource() == this.nextButton){
//            //label.setText("Button 2 wurde betätigt");
//        }
//        else if (ae.getSource() == this.exitButton){
//            //label.setText(("Button 3 wurde betätigt"));
//        }
//    }
//    
//}
