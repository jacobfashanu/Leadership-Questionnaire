import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class Question17 extends JFrame implements ActionListener
{
   JCheckBox one = new JCheckBox("Never");
   JCheckBox two = new JCheckBox("Rarely");
   JCheckBox three = new JCheckBox("Occasionally");
   JCheckBox four = new JCheckBox("Frequently");
   JCheckBox five = new JCheckBox("Pretty much Always");
   
   // constructor for TwoButtons
   public Question17 (String title)                           
   {
      super( title );
      JLabel text = new JLabel("17) I allow my groupmates");
      JLabel text1 = new JLabel("to set priorities with my guidance.");
      JLabel text3 = new JLabel("                                                                                                              ");
   
      one.setActionCommand( "one" );   // set the  command 
      two.setActionCommand( "two" );
      three.setActionCommand( "three" );   // set the  command 
      four.setActionCommand( "four" );
      five.setActionCommand( "five" );   // set the  command 
   
    
   
   
      // register the buttonDemo frame
      // as the listener for both Buttons.
      one.addActionListener( this );
      two.addActionListener( this );
      three.addActionListener( this );
      four.addActionListener( this );
      five.addActionListener( this );
   
           
   
      setLayout( new FlowLayout() ); 
      add( text ); 
      add( text1 );   
  //    add( text2 ); 
      add( text3 );                 
      add( one );
      add( two );
      add( three );
      add( four );
      add( five );
      setVisible(true);
      setBounds(0, 0,400, 200 );     
     
   
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

   public void actionPerformed( ActionEvent evt)
   {
      // check which command has been sent
      if ( evt.getActionCommand().equals( "one" ) )
      {
         setVisible(false);
         Question18 confirm = new Question18 ("Question #18");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.participativeTally = Results2.participativeTally + 1;
      }
      else if ( evt.getActionCommand().equals( "two" ) )
      {
         setVisible(false);
         Question18 confirm = new Question18 ("Question #18");

         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.participativeTally = Results2.participativeTally + 2;
      
      }
      else if ( evt.getActionCommand().equals( "three" ) )
      {
         setVisible(false);
         Question18 confirm = new Question18 ("Question #18");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.participativeTally = Results2.participativeTally + 3;
      
      }
      else if ( evt.getActionCommand().equals( "four" ) )
      { 
         setVisible(false);
         Question18 confirm = new Question18 ("Question #18");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.participativeTally = Results2.participativeTally + 4;
      }
      else
      {
         setVisible(false);
         Question18 confirm = new Question18 ("Question #18");
         confirm.setVisible(true);
         confirm.setBounds(500,300,400,200);
         Results2.participativeTally = Results2.participativeTally + 5;
      }
             
   }
  
}