import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


int startX=0;
int startY=150;
int endX=0;
int endY=150;
public void setup()
{
  size(300,300);
  //strokeWeight(6);
  noLoop();

}
public void draw()
{
	stroke(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	
	background(0);

	while (endX<300)
	{
	endX = startX + (int)(Math.random()*10);
	endY = startY + ((int)(Math.random()*19))-9;
	System.out.println(endX);
	line(startX,startY,endX,endY);
	stroke(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	line(startX,startY+20,endX,endY+20);
	stroke(((int)(Math.random()*150)),((int)(Math.random()*150)),((int)(Math.random()*0)));
	line(startX,startY+40,endX,endY+40);

	startX=endX;
	startY=endY;
	}

}
public void mousePressed()
{
startX=0;
startY=150;
endX=0;
endY=150;
redraw();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
