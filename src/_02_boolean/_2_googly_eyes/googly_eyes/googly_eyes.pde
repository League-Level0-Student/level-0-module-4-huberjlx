PImage face;
void setup() {
  size(800,600);
  
  face = loadImage("Nautilus_OriginalCentered.jpg");
  face.resize(width,height);
  
}

void draw() {
  background(0);
  image (face,0,0);
  noStroke();
    fill(255,255,255);
  ellipse (379,195,20,20);
  ellipse(423,165,20,20);

 if (mouseX<=399 && mouseX>=359 && mouseY <=215 && mouseY >= 175) {

  fill(0,0,0);
  ellipse(mouseX,mouseY,5,5);
  ellipse(mouseX+44,mouseY-30,5,5);
 }
}
