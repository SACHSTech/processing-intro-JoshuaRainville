import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 150, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
  fill(1, 143, 18);
  rect(0, 300, 400, 100);
  
  fill(176, 94, 7);
  rect(100, 150, 200, 200);

  fill(219, 171, 13);
  rect(60, 150, 275, 35);

  fill(219, 171, 50);
  rect(125, 250, 50, 100);

  fill(252, 227, 3);
  ellipse(400, 0, 100, 100);

  fill(0);
  ellipse(138, 297, 7, 7);

  fill(176, 233, 247);
  rect(220, 240, 50, 50);

  fill(0);
  line(248, 240, 248, 290);  

  fill(0);
  line(220, 264, 270, 264);
  }
  
  // define other methods down here. 
}