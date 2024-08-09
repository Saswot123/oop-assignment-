package oopTurtleGraphics;

import uk.ac.leedsbeckett.oop.OOPGraphics;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import uk.ac.leedsbeckett.oop.OOPGraphics;

public class TurtleGraphics extends OOPGraphics{
/*
*
*/
private Integer distance;
private Integer angle;
private String color;
String[] cmd;

List<String> usedCommand = new ArrayList<String>();

public TurtleGraphics()
{
JFrame MainFrame = new JFrame();              
         MainFrame.setLayout(new FlowLayout());
         MainFrame.add(this);
         MainFrame.pack();                                              
         MainFrame.setVisible(true);
         MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                            
}

void triangle(int side1, int side2, int side3) {
    double a = (double) side1;
    double b = (double) side2;
    double c = (double) side3;

    double cosA = (b * b + c * c - a * a) / (2 * b * c);
    double cosB = (a * a + c * c - b * b) / (2 * a * c);
    double cosC = (a * a + b * b - c * c) / (2 * a * b);
    double angleA = Math.toDegrees(Math.acos(cosA));
    double angleB = Math.toDegrees(Math.acos(cosB));
    double angleC = Math.toDegrees(Math.acos(cosC));
    int ang1 = (int) angleA;
    int ang2 = (int) angleB;
    int ang3 = (int) angleC;
    int x = 180 - ang1;
    int y = 180 - ang2;
    int z = 180 - ang3;

    penUp();
    forward(100); // Move the pen away from the previous position
    turnLeft(90); // Adjust orientation
    penDown();
    forward(side3);
    turnLeft(y);
    forward(side1);
    turnLeft(z);
    forward(side2);
    penUp();
    reset();
}

void square(int side)
    {
penDown();

turnLeft(90);
forward(side);

turnLeft(90);
forward(side);

turnLeft(90);
forward(side);

turnLeft(90);
forward(side);
    }

void triangle(int side)
{
penDown();
turnRight(120);
forward(side);

turnRight(120);
forward(side);

turnRight(120);
forward(side);
   
}

boolean saveImage= false;
boolean saveCommand= false;
public void saveImage()
{
JFileChooser file= new JFileChooser();
file.setFileSelectionMode(JFileChooser.FILES_ONLY);
file.showSaveDialog(null);

File output_file= new File(String.valueOf(file.getSelectedFile()));
try
{
ImageIO.write(getBufferedImage(), "jpg", output_file);
saveImage= true;
}
catch(IOException e)
{
JOptionPane.showMessageDialog(null, "Could't save file");
}
}

public void loadImage()
{
reset();
clear();
if(saveImage==true)
{
JFileChooser file= new JFileChooser();
file.setFileSelectionMode(JFileChooser.FILES_ONLY);
file.showOpenDialog(null);
File input_file= new File(String.valueOf(file.getSelectedFile()));

try
{
BufferedImage buffer= ImageIO.read(input_file);
setBufferedImage(buffer);
}
catch(IOException e)
{
JOptionPane.showMessageDialog(null, "Could't save file");
}
}
else
{
JOptionPane.showMessageDialog(null, "Image is not saved yet");
}
}

public void saveCommand()
{
JFileChooser file= new JFileChooser();
file.setFileSelectionMode(JFileChooser.FILES_ONLY);
file.showSaveDialog(null);

File output_file= new File(String.valueOf(file.getSelectedFile()));
try
{
FileWriter writer = new FileWriter(output_file);
    for (String s : usedCommand)
    {
            writer.write(s + "\n");
       }
            writer.close();
            JOptionPane.showMessageDialog(null, "command saved successfully");
            saveCommand= true;
}
catch(IOException e)
{
JOptionPane.showMessageDialog(null, "Could't save file");
}
}

public void loadCommand()
{
if(saveCommand== true)
{
JFileChooser file= new JFileChooser();
file.setFileSelectionMode(JFileChooser.FILES_ONLY);
file.showSaveDialog(null);

File input_file= new File(String.valueOf(file.getSelectedFile()));
try
{
FileReader fr= new FileReader(input_file);
BufferedReader reader= new BufferedReader(fr);
String content="";
String line;
while((line= reader.readLine()) != null)
{
content+= line+ "\n";
}
JOptionPane.showMessageDialog(null, content, "List of Commands", JOptionPane.INFORMATION_MESSAGE);
}
catch(IOException e)
{
JOptionPane.showMessageDialog(null, "Could't load file");
}
}
else
{
JOptionPane.showMessageDialog(null, "Command is not save yet");
}
}

public void about() {
	
	// Draw 'S'
	reset();
	penUp();
	forward(100);
	turnRight();
	forward(350);
	turnRight();
	forward(120);
	setStroke(5);
	setPenColour(Color.MAGENTA);
	turnRight(180);

	forward(90);
	turnRight(90);
	forward(10);
	turnRight(210);

	penDown();
	for (int i = 0; i < 12; i++) {
	    forward(15);
	    turnLeft(18);
	}

	for (int i = 0; i < 12; i++) {
	    forward(18);
	    turnRight(20);
	}

	// Draw 'A'
	reset();
	penUp();
	setStroke(5);

	forward(90);
	setPenColour(Color.YELLOW);
	setStroke(5);
	turnRight(90);
	forward(280);
	turnRight(105);

	penDown();
	forward(200);
	turnRight(150);
	forward(200);
	turnLeft(180);
	forward(100);
	turnLeft(75);
	forward(50);

	// Draw 'S'
	reset();
	penUp();
	forward(100);
	turnRight();
	forward(100);
	turnRight();
	forward(120);
	setStroke(5);
	setPenColour(Color.RED);
	turnRight(180);

	forward(90);
	turnRight(90);
	forward(10);
	turnRight(210);

	penDown();
	for (int i = 0; i < 12; i++) {
	    forward(15);
	    turnLeft(18);
	}

	for (int i = 0; i < 12; i++) {
	    forward(18);
	    turnRight(20);
	}

	// Draw 'W'
	reset();
	penUp();
	forward(80);
	turnLeft();
	setStroke(5);
	setPenColour(Color.BLUE);

	turnLeft();
	penDown();
	forward(220);
	forward(-220);
	turnRight(40);
	forward(70);
	turnRight(100);
	forward(70);
	turnLeft(140);
	forward(220);

	
//	 A

	reset();
	penUp();
	forward(80);
	turnLeft();
	setStroke(5);
	setPenColour(Color.PINK);
	forward(120);
	turnLeft(80);
	penDown();
	forward(220);
	turnRight(160);
	forward(220);
	turnRight(180);
	forward(100);
	turnLeft(90);
	forward(35);
	
	
	//T
	reset();
	penUp();
	forward(80);
	turnLeft();
	setStroke(5);
	setPenColour(Color.GRAY);
	forward(280);
	turnLeft();
	penDown();
	forward(220);
	turnLeft();
	penUp();
	forward(60);
	penDown();
	forward(-120);
	
	
	
	
	
	
	


	
    


    

}

@Override
public void processCommand(String command) {
 
    command= command.toLowerCase();
cmd = command.split(" ");

boolean validInstruction= false;
try {
while(!validInstruction) {

if(cmd[0].equals("about"))
{
if(cmd.length>1) {
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
about();
usedCommand.add(command);
}
validInstruction= true;
}


else if(cmd[0].equals("reset"))
{
if(cmd.length>1) {
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
reset();
}
usedCommand.add(command);
validInstruction= true;
}


else if(cmd[0].equals("clear"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
clear();
usedCommand.add(command);
}
validInstruction= true;
}

else if(cmd[0].equals("saveimage"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
saveImage();
usedCommand.add(command);
}
validInstruction= true;
}

else if(cmd[0].equals("loadimage"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
loadImage();
usedCommand.add(command);
}
validInstruction= true;
}

else if(cmd[0].equals("savecommand"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
saveCommand();
usedCommand.add(command);
}
validInstruction= true;
}

else if(cmd[0].equals("loadcommand"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
loadCommand();
usedCommand.add(command);
}
validInstruction= true;
}


else if(cmd[0].equals("pendown"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
penDown();
usedCommand.add(command);
}
validInstruction= true;
}


else if(cmd[0].equals("penup"))
{
if(cmd.length>1)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
penUp();
usedCommand.add(command);
}
validInstruction= true;
}


else if(cmd[0].equals("pencolor")) {
if(cmd.length>2) {
JOptionPane.showMessageDialog(null,"Invalid command!.");
}
else {
color= String.valueOf(cmd[1]);
switch (color) {
case "red":
setPenColour(Color.RED);
break;

case "orange":
setPenColour(Color.ORANGE);
break;

case "green":
setPenColour(Color.GREEN);
break;
case "blue":
setPenColour(Color.BLUE);
break;

case "white":
setPenColour(Color.WHITE);
break;

default:
JOptionPane.showMessageDialog(null,"No pen colour is selected.");
break;
}
}
usedCommand.add(command);
validInstruction= true;
}


else if(cmd[0].equals("turnleft"))
{
if(cmd.length > 2) {
JOptionPane.showMessageDialog(null,"Invalid command! Need 2 parameter.");
}
else if(cmd.length ==1)
{
turnLeft();
usedCommand.add(command);
}

else if (cmd.length== 2)
{
angle= Integer.valueOf(cmd[1]);
turnLeft(angle);
usedCommand.add(command);
}
validInstruction= true;
}


else if(cmd[0].equals("turnright"))
{
if(cmd.length > 2) {
JOptionPane.showMessageDialog(null,"Invalid command! Need 2 parameter.");
}
else if(cmd.length ==1)
{
turnRight();
usedCommand.add(command);
}

else if (cmd.length== 2)
{
angle= Integer.valueOf(cmd[1]);
turnRight(angle);
usedCommand.add(command);
}
validInstruction= true;
}


else if (cmd[0].equals("forward"))
{
if(cmd.length != 2)
{
JOptionPane.showMessageDialog(null,"Invalid command! Need 2 parameter.");
}
else
{
distance= Integer.valueOf(cmd[1]);
forward(distance);
usedCommand.add(command);
}
validInstruction= true;
}

else if (cmd[0].equals("backward"))
{
if(cmd.length != 2)
{
JOptionPane.showMessageDialog(null,"Invalid command! Need 2 parameter.");
}
else
{
distance= Integer.valueOf(cmd[1]);
forward(-distance);
usedCommand.add(command);
}
validInstruction= true;
}

else if (cmd[0].equals("penwidth"))
{
if(cmd.length != 2)
{
JOptionPane.showMessageDialog(null,"Invalid command! Need 2 parameter.");
}
else
{
int width= Integer.valueOf(cmd[1]);
setStroke(width);
usedCommand.add(command);
}
validInstruction= true;
}
//TRIANGLE

else if (cmd[0].equals("triangle")) {
    if (cmd.length == 2) {
    	int side = Integer.parseInt(cmd[1]);
        triangle(side);
        usedCommand.add(command);
    } else if (cmd.length == 4) {
            int side1 = Integer.parseInt(cmd[1]);
            int side2 = Integer.parseInt(cmd[2]);
            int side3 = Integer.parseInt(cmd[3]);
            triangle(side1, side2, side3);
            usedCommand.add(command);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid command!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        validInstruction = true;
}

else if (cmd[0].equals("square"))
{
if(cmd.length>2)
{
JOptionPane.showMessageDialog(null,"Invalid command!");
}
else
{
int side= Integer.valueOf(cmd[1]);
square(side);
}
validInstruction= true;
}

else if(cmd[0].equals("circle"))
{
if(cmd.length > 2) {
JOptionPane.showMessageDialog(null,"Invalid command! Need 1 parameter.");
}

else if (cmd.length== 2)
{
int radius = Integer.valueOf(cmd[1]);
circle(radius);
usedCommand.add(command);
}
validInstruction= true;
}

}
}

catch(ArrayIndexOutOfBoundsException e)
{
JOptionPane.showMessageDialog(null,"Invalid command! too many parameters provided.");
validInstruction= true;
}
catch(NumberFormatException e)
{
JOptionPane.showMessageDialog(null,"Invalid command! Non-numeric data is found.");
validInstruction= true;
}
    }

}