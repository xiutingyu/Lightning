
int startX=0;
int startY=150;
int endX=0;
int endY=150;
void setup()
{
  size(300,300);
  strokeWeight(3);
 noLoop();
}

void draw()
{
	stroke(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	
	background(0);

	while (endX<300)
	{
	endX = startX + (int)(Math.random()*10);
	endY = startY + ((int)(Math.random()*19))-9;
	
	line(startX,startY,endX,endY);
	stroke(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256)));
	line(startX,startY+20,endX,endY+20);
	stroke(((int)(Math.random()*150)),((int)(Math.random()*150)),((int)(Math.random()*0)));
	line(startX,startY+40,endX,endY+40);
	startX=endX;
	startY=endY;
	fill(0,0,100);
	noStroke();
	ellipse(10,0,80,80);
	ellipse(60,0,80,80);
	ellipse(110,0,80,80);
	ellipse(160,0,80,80);
	ellipse(210,0,80,80);
	ellipse(260,0,80,80);
	
	}
}


void mousePressed()
{
startX=0;
startY=150;
endX=0;
endY=150;
redraw();
}

