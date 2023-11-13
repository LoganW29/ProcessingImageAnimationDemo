import processing.core.PApplet;
import processing.core.PImage; //import the PImage library

public class Sketch extends PApplet {

  PImage imgMeteor; // declare a global image variable
  PImage imgRocket; // declare a global image variable

  float fltMeteorX = 100;
  float fltMeteorY = -200;

  float fltCirX = width/2;
  float fltCirY = width/2;

  float fltRocketY = height + 50; // rocket Y position below the screen
  float fltRocketX = width / 3; // rocket X position 


  public void settings() {
    size(400, 400);
  
  }

  public void setup() {
    background(0);
    imgMeteor = loadImage("spaceMeteors_003.png"); // load the image into the program

       // resize meteor
    imgMeteor.resize(50,50); 

    imgRocket = loadImage("spaceRockets_001.png"); // load the image 
    
    // resize rocket
    imgRocket.resize(imgRocket.width/2, imgRocket.height/2);
  }

  public void draw() {
      background(0); 
    // draw Meteor and move
    image(imgMeteor,fltMeteorX,fltMeteorY);
    fltMeteorY = fltMeteorY + 1; 

    if (fltMeteorY > height){
      fltMeteorY = -400; 
    }

    // draw rocket and move
    image(imgRocket, fltRocketX, fltRocketY); 
    fltRocketY = fltRocketY - 1; 

    if(fltRocketY < -imgRocket.height){
      fltRocketY = height + 50;
    }

  }
}