




//


import java.time.LocalDate;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.MissingResourceException;


import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;





import javax.swing.JComboBox;

import java.util.Arrays;

import javax.swing.JCheckBox;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import java.lang.Object;
import java.util.StringTokenizer;
import java.lang.Math;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;
import java.lang.NumberFormatException;
import java.lang.ArithmeticException;
import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;
import java.util.MissingResourceException;




//




public class GYMworkoutLOG extends JFrame
{
	
	
	//
	
				
		
	public   String info=" ";
		
		public String x=" ";
		
		public String keyString=" ";
		
		
        //  public String [] menu=new String[]{"Job Advertisment Media","Advertised Organization","Job Title","Job Description","Date Posted","Application Submission Date"};   
	
	
	public String [] menu=new String[]{"Gym Attended","Date","Notes"};
	
	
	//
	
	
	public JTextArea TA;
	
	
	//
	
	public JLabel [] fnLabel=new JLabel[3];
	// fnLabel.setHorizontalAlignment(JLabel.CENTER);
	//  fnLabel.setBackground(Color.WHITE);
	 // fnLabel.setForeground(Color.BLACK);			
	//	fnLabel.setFont(f);
	//	createFILE.add(fnLabel);
		
		//
		
	public JTextField [] fnTF=new JTextField[2];
	 // fnTF.setBackground(Color.WHITE);
	//  fnTF.setForeground(Color.BLACK);			
	//	fnTF.setFont(f);
	//  createFILE.add(fnTF);
	
	
	
	//
	
	
	public  JLabel currentPATHdirectory;
	
	
	//
	
	public String FILEname="C:/Gym.Diary./2019/February/";
	
	//
	
	public  Font f = new Font("Serif", Font.BOLD, 14);
	
	//
	
	public GYMworkoutLOG()
	{
		
		
		
		//
		
		
		
		
		
	String [] dirMAP={"C:/Gym.Diary./","C:/Gym.Diary./2019/","C:/Gym.Diary./2019/February/"};
		

	File file1;
	
	
	try
	{
	for(int s=0;s<dirMAP.length;s++)	
	 {
	file1 = new File(dirMAP[s]);
	try{
	if (!file1.exists())
	{
	file1.mkdir();
	}}
	catch(SecurityException se1)
	{
        se1.printStackTrace();
         }        
         }
       }
     catch(SecurityException  se)
        {
	se.printStackTrace();
        }
		
		
		//
		//initialize JPanels
		//
		
		
		JPanel header= new JPanel(); 
		
		JPanel currentDIRECTORY=new JPanel(); 
		
		
		JPanel createFILE=new JPanel(); 
	
			JPanel jtextareaheader = new JPanel(); 
		
		JPanel currentDIRECTORYjTextArea = new JPanel(); 
		
			JPanel fireJButton = new JPanel(); 
		
		JPanel box=new JPanel(); // carries all the jpanels
	
	//
	
					header.setLayout(new FlowLayout(FlowLayout.LEFT));    // jmenubar
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			currentDIRECTORY.setLayout(new FlowLayout(FlowLayout.CENTER));    // directory Layout
			currentDIRECTORY.setBackground(Color.GRAY); 
			currentDIRECTORY.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			createFILE.setLayout(new GridLayout(2,2,5,5)); // JLabel and JTextField Layout
		createFILE.setBackground(Color.CYAN);
		createFILE.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
		
			jtextareaheader.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea header ..... 
			jtextareaheader.setBackground(Color.GRAY); 
			jtextareaheader.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
		
			currentDIRECTORYjTextArea.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea Layout
			currentDIRECTORYjTextArea.setBackground(Color.GRAY); 
			currentDIRECTORYjTextArea.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
					fireJButton.setLayout(new FlowLayout(FlowLayout.CENTER));    // footer layout
			fireJButton.setBackground(Color.GRAY); 
			fireJButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  // add all layouts in one main layout ..... 
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			//
			
			
			  JMenuBar KBMenuBar = new JMenuBar();
			
			      JMenu  options = new JMenu("MENU");
		options.setForeground(Color.BLACK);
		options.setBackground(Color.WHITE);
		
		
			JMenu ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(options);
		 KBMenuBar.add(ABOUT);
		
		
			
			
			//
			

            
		JLabel saveTHEcontent=new JLabel("set a new path(folder/directory) ....");
	  saveTHEcontent.setBackground(Color.WHITE);
	   saveTHEcontent.setForeground(Color.BLACK);
	 saveTHEcontent.setEnabled(true);
    saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =saveTHEcontent.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           saveTHEcontent.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          saveTHEcontent.setForeground(oldcolor);
         }
      }
      );
	saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		
		//
		
		String fN = JOptionPane.showInputDialog(null, "Please enter your preferred folder/directory/path name : ");
		
		//
		
		FILEname=fN;
		
		//
		
		currentPATHdirectory.setText("current directory path is : "+FILEname);
		
		//
		
		
		
		
			//	String[] lines = TA.getText().split("\n"); 
			
                                  /*
		
				for(int i = 0 ; i<lines.length; i++)
				{
                                   System.out.println(lines[i]);
				}
		
				*/
		
		//
		
		
		/*
		  
	
         try 
	{
	
            BufferedWriter out = new BufferedWriter(new FileWriter(FILEname));
          
		
	for(int i=0;i<lines.length;i++)
	    {
		    
            out.write(lines[i]);
		    
		     out.newLine(); 
		    
	    }
	    
            out.close();
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
	
	
			*/	
		
	//
		 		
        }
		
      }
      );
       options.add(new JSeparator());//add a seperator line
	 options.add(saveTHEcontent);	
       options.add(new JSeparator());//add a seperator line

	  
	  
	  //
	  
	  /*
	  
	  JLabel generateApassword=new JLabel("Generate a password !!!");
	  generateApassword.setBackground(Color.WHITE);
	   generateApassword.setForeground(Color.BLACK);
	 generateApassword.setEnabled(true);
	  generateApassword.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =generateApassword.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           generateApassword.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          generateApassword.setForeground(oldcolor);
         }
      }
      );
	  	generateApassword.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	                passwordGEN pg = new passwordGEN();
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	  	 options.add(generateApassword);	
	options.add(new JSeparator());//add a seperator line
	
	
	*/
	  

			//
	  
					
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button, \n in order for the program to be terminated ...... \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 options.add(EXIT);	
	options.add(new JSeparator());//add a seperator line
      
	  
	  //
	  
	  
	  
	    
      
      		JLabel programAuthor=new JLabel("author ...");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n program created by: \n Constantinos <451/> Constantinou \n @ 02/2019 \n email : c.constantinou.24@gmail.com \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
	  ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
				
				 //
	  
	  
	    
      
      		JLabel programVsion=new JLabel("program version .....");
	  programVsion.setBackground(Color.WHITE);
	  programVsion.setForeground(Color.BLACK);
	 programVsion.setEnabled(true);
   programVsion.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programVsion.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programVsion.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programVsion.setForeground(oldcolor);
         }
      }
      );
	programVsion.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Gym Memo/Diary - version 1.00 - \n 02/2019 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programVsion);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
	  
	  //
	  
	  
	  	JLabel technologyUSED=new JLabel("technologies used .....");
	  technologyUSED.setBackground(Color.WHITE);
	  technologyUSED.setForeground(Color.BLACK);
	 technologyUSED.setEnabled(true);
   technologyUSED.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =technologyUSED.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           technologyUSED.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         technologyUSED.setForeground(oldcolor);
         }
      }
      );
	technologyUSED.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Program created by using the following technologies : \n 1) Java JDK version 8 \n 2) SciTE text editor version 4 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(technologyUSED);
	  ABOUT.add(new JSeparator());//add a seperator line
	  
	  
	  //
	  
	  
	  header.add(KBMenuBar);	
	  
	  
	  //
	  
	  
	  
	  
	   currentPATHdirectory=new JLabel("current directory path is : "+FILEname);
	  currentPATHdirectory.setBackground(Color.WHITE);
	  currentPATHdirectory.setForeground(Color.GREEN);			
		currentPATHdirectory.setFont(f);
      currentDIRECTORY.add(currentPATHdirectory);
      
	  /*
	  
	  //
	
					header.setLayout(new FlowLayout(FlowLayout.LEFT));    // jmenubar
			header.setBackground(Color.GRAY); 
			header.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			currentDIRECTORY.setLayout(new FlowLayout(FlowLayout.CENTER));    // directory Layout
			currentDIRECTORY.setBackground(Color.GRAY); 
			currentDIRECTORY.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			createFILE.setLayout(new GridLayout(6,2,5,5)); // JLabel and JTextField Layout
		createFILE.setBackground(Color.CYAN);
		createFILE.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
							currentDIRECTORYjTextArea.setLayout(new FlowLayout(FlowLayout.CENTER));    // JTextArea Layout
			currentDIRECTORYjTextArea.setBackground(Color.GRAY); 
			currentDIRECTORYjTextArea.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		
					fireJButton.setLayout(new FlowLayout(FlowLayout.CENTER));    // footer layout
			fireJButton.setBackground(Color.GRAY); 
			fireJButton.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		 
		box.setLayout((new BoxLayout( box, BoxLayout.Y_AXIS)));  // add all layouts in one main layout ..... 
			box.setBackground(Color.WHITE); 
			box.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			//
	  
	  */
	  
	  //
	  
	  
 // public String [] menu=new String[]{"Job Advertisment Media","Advertised Organization","Job Title","Job Description","Date Posted","Application Submission Date"};  
	  
	  
	  //
	  
	  
	  
	 fnLabel=new JLabel[3];
	// fnLabel.setHorizontalAlignment(JLabel.CENTER);
	//  fnLabel.setBackground(Color.WHITE);
	 // fnLabel.setForeground(Color.BLACK);			
	//	fnLabel.setFont(f);
	//	createFILE.add(fnLabel);
		
		
		
	fnTF=new JTextField[2];
	 // fnTF.setBackground(Color.WHITE);
	//  fnTF.setForeground(Color.BLACK);			
	//	fnTF.setFont(f);
	//  createFILE.add(fnTF);
	  
	  
	  //
	  
	  for(int i=0;i<fnLabel.length;i++)
	  {
	  
		  for(int j=0;j<fnTF.length;j++)
		  {
			  
			  if(j == 0)
			  {
			  
	   fnLabel[i]=new JLabel(menu[i]);
	 fnLabel[i].setHorizontalAlignment(JLabel.CENTER);
	   fnLabel[i].setBackground(Color.WHITE);
	   fnLabel[i].setForeground(Color.BLACK);			
		 fnLabel[i].setFont(f);
				if(i<(fnLabel.length-1))
				{
		               createFILE.add(fnLabel[i]);
				}
				  if(i==(fnLabel.length-1))
				  {
	//	jtextareaheader.add(fnLabel[i]);
				  }
				  
			  }
		if( j>0 && i<(fnLabel.length-1) )
		       {
			
		 fnTF[i]=new JTextField("",45);
	  fnTF[i].setBackground(Color.WHITE);
	  fnTF[i].setForeground(Color.BLACK);			
		fnTF[i].setFont(f);
		createFILE.add(fnTF[i]);
			
		      }
			  
		}
	  
	  }
	  
	  //
	  
	  
	  /*
	  
	  JLabel pwLabel=new JLabel(" enter the desired password : ");
	pwLabel.setHorizontalAlignment(JLabel.CENTER);
	  pwLabel.setBackground(Color.WHITE);
	  pwLabel.setForeground(Color.BLACK);			
		pwLabel.setFont(f);
		createFILE.add(pwLabel);
		
		
		
		JTextField pwTF=new JTextField(" ",45);
	  pwTF.setBackground(Color.WHITE);
	  pwTF.setForeground(Color.BLACK);			
		pwTF.setFont(f);
	  createFILE.add(pwTF);
	  
	  */
	  


		
				
		
	      // 
		
		
		
		
			TA=new JTextArea(" ");
			TA.setEditable(true);
			  //  TA.setPreferredSize(new Dimension(550,250));
                     TA.setBounds(5,5,650,350);
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
	       TA.setCaretPosition(TA.getDocument().getLength());
		TA.setFont(new Font("Serif",Font.PLAIN,12));
		TA.addKeyListener(new KeyListener()
			 {
				 
				 
				 //			 
				 
    public void keyReleased(KeyEvent e)
        {
	    
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        } 
	    
	}
    
    //
    
    public void keyPressed(KeyEvent e)
	{
		
		
      int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
			
	char c = e.getKeyChar();
			
	keyString=String.valueOf(c);
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
        } 		
		
	try
	{
		
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        }
	
        }
	catch(StringIndexOutOfBoundsException StringIndexOutOfBoundsException)
	{
		
		StringIndexOutOfBoundsException.printStackTrace();
		
	}
		
	}
    
    //
	    
	                    
			
	public void keyTyped(KeyEvent e) 
	{
		/*		
        
         int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
		 
		 
			
            char c = e.getKeyChar();
			
            keyString=String.valueOf(c);
		 
		 
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
		 
		 
        } 
	else 
	{
		
		
		
           int keyCode = e.getKeyCode();
            
		keyString = "key code = " + keyCode+ " ("+ KeyEvent.getKeyText(keyCode)+ ")";
		
		x=new StringBuilder().append(x).append(TA.getText()).append(keyString).toString();
	
	      TA.setText(x);
		
		
		
        }
	
                */
			
	}
	
	
			
		//
	    
		
				 
			 });
			 
	//	 JTextAreaPanel.add(TA);
			 
			 
	JScrollPane scrollPane = new JScrollPane(TA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		 scrollPane.setPreferredSize(new Dimension(650, 350));
		scrollPane.setBounds(5, 5, 650, 350);
                scrollPane.setBorder(BorderFactory.createTitledBorder("Notes/Comments"));
		scrollPane.setViewportView(TA);			 
		// JScrollBar sb = scrollPane.getVerticalScrollBar();
                //  sb.setValue( sb.getMaximum() );
		// Box box=Box.createHorizontalBox();
		// box.add(scrollPane);
			 
			 
	//	JTextAreaPanel.add(scrollPane);
			 
			 
		
		//	 

			 
			 
			 
		
	//	currentDIRECTORYjTextArea.add(navigationMENU);
	//	 currentDIRECTORYjTextArea.add(JTextAreaPanel);
		   
			 
	//  currentDIRECTORYjTextArea.add(TA);
	//  currentDIRECTORYjTextArea.add(scrollPane);	

                    jtextareaheader.add(scrollPane);	
			 
		
			  //
	  
	  
	         JButton reset=new JButton("Reset Fields");
	reset.setBackground(Color.WHITE);
	reset.setForeground(Color.BLACK);			
	reset.setFont(f);
	reset.setEnabled(true);
	reset.setToolTipText("application ::: reset button");
	reset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				
				for(int u=0;u<fnTF.length;u++)
				{
					
					
					 fnTF[u].setText("");
					
					
				}
				
				
				TA.setText(" ");
				
				
				
			}
		});
      
      
      fireJButton.add(reset);
	  
	  
	  //
	  
	  JButton createFile=new JButton("create entry");
	createFile.setBackground(Color.WHITE);
	createFile.setForeground(Color.BLACK);			
	createFile.setFont(f);
	createFile.setEnabled(true);
	  createFile.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String [] elements = new String[fnTF.length];
				
				// gather sources --- parsers
				
				for(int u1=0;u1<fnTF.length;u1++)
				{
					
					//if(u1<6)
					//{
					
					 elements[u1]=fnLabel[u1].getText();
					
						 elements[u1]= elements[u1]+" : "+fnTF[u1].getText();
					
					//}
					
				}
				
				//
				
				
				
				

				
				//
				
	//	String fileNAME = hn1 ;
				
				//
				
				LocalDate a = LocalDate.now();
				
				
			//	String date=a;
				
				
				String sometext=FILEname+fnTF[0].getText()+".GYM.WORKOUT.LOG."+a+".txt";
				
				
				File file = new File(sometext);
				
			//
				
			
				System.out.println(file);
			
			
			//





	try
	{
	  if (!file.exists()) 
	{
	     file.createNewFile();
	  }
        }
     catch(IOException expn1)
        {
            
             expn1.printStackTrace();
		
        }
	
	
	
	
	
	
	
	/*
	catch(FileNotFoundException fnfe1)
	{
		
		
		 fnfe1.printStackTrace();
		
		
	}
		*/
		
		
		
				
	
	try 
	{
		
		
	
		
	BufferedWriter out = new BufferedWriter(new FileWriter(file));
		    
		
		//
		
		
		out.newLine(); 
		
				for(int uu=0;uu<elements.length;uu++)
				{
					
					 out.newLine(); 
					
					out.write(elements[uu]);
					
					out.newLine(); 
					
				}
				
				out.newLine(); 
				
				out.write(fnLabel[2].getText());
				
				out.newLine(); 
				
				for (String line : TA.getText().split("\\n"))
				{
					
					out.newLine(); 
					
					out.write(line);
					
				}
				
				
		  out.newLine(); 
				
				//
		
        //    out.write(" username : "+usrNAME);
		    
	//	  out.newLine(); 
		
	//	 out.write(" password : "+usrPSWRD);
		    
	//     out.newLine(); 
		
		//
		
		
	    
            out.close();
		
		
		//
		
		
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
		
	
	// reset components
	
	                         for(int u23=0;u23<2;u23++)
				{
					
					
					 fnTF[u23].setText("");
					
					
				}
				
				
				TA.setText("");
			
		// reset components 
				
				
		}});		
		
		
		fireJButton.add(createFile);
		
		
		
		
		
		//
	  
		
		
		box.add(header);
		   box.add(currentDIRECTORY);
		   box.add(createFILE);
		box.add(jtextareaheader);
		box.add(currentDIRECTORYjTextArea);
		     box.add(fireJButton);
		     
		     //
		
		JFrame frame=new JFrame(" Gym Workout Log/Memo - version 1.00 - ");
		frame.add(box);
		
		// 
		
		frame.setDefaultLookAndFeelDecorated(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		frame.setResizable(false);
		
		frame.setLocationRelativeTo(null);
		
	        frame.pack();
		
		//
		
		
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void main(String [] GYMworkoutLOG)
	{
		
		new GYMworkoutLOG();
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
}


