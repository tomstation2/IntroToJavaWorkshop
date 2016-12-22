
int X = 20;
int Y = 200;
int sped=20;
int spod=20;
PImage backgroundImage; 

void setup() {
  size(1000, 1000);
backgroundImage = loadImage("imgres.jpg");  //in the setup method


  
  
}

void draw() {
image(backgroundImage, 0, 0);
backgroundImage.resize(1000,1000);
  ellipse(X, Y, 50, 50);
  fill(255, 100, 150);
  stroke(100, 80, 200);
  X=X+sped;
  if (X>1000)
  {
    sped=-sped;
  }
  if (X<-0) {
    sped=-sped;
  }
  Y=Y+spod;
  if (Y>1000)
  {
    println("You LOSE mate");
  }
  if (Y<-0) {
    spod=-spod;
  }
 rect(mouseX, 900, 200,50);
 boolean inter=intersects(X, Y, mouseX, 900, 200); 
  
  if(inter==true){
  spod=-spod;
}
  
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
return true;
else 
return false;
}