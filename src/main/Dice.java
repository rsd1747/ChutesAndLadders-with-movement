import processing.core.*;
import java.util.Random;

public class Dice extends PApplet {

  int diceValue = 1;
  int cycleCount = 0;
  Random rand = new Random();

  public void settings() {
    size(200, 200);
  }

  public void setup() {
    textAlign(CENTER);
    textSize(32);
  }

  public void draw() {
    frameRate(30);
    background(255);
    fill(0);
    rect(50, 50, 100, 100);
    fill(255);
    switch(diceValue) {
      case 1:
        ellipse(100, 100, 20, 20);
        break;
      case 2:
        ellipse(75, 75, 20, 20);
        ellipse(125, 125, 20, 20);
        break;
      case 3:
        ellipse(75, 75, 20, 20);
        ellipse(100, 100, 20, 20);
        ellipse(125, 125, 20, 20);
        break;
      case 4:
        ellipse(75, 75, 20, 20);
        ellipse(125, 75, 20, 20);
        ellipse(75, 125, 20, 20);
        ellipse(125, 125, 20, 20);
        break;
      case 5:
        ellipse(75, 75, 20, 20);
        ellipse(125, 75, 20, 20);
        ellipse(100, 100, 20, 20);
        ellipse(75, 125, 20, 20);
        ellipse(125, 125, 20, 20);
        break;
      case 6:
        ellipse(75, 75, 20, 20);
        ellipse(125, 75, 20, 20);
        ellipse(75, 100, 20, 20);
        ellipse(125, 100, 20, 20);
        ellipse(75, 125, 20, 20);
        ellipse(125, 125, 20, 20);
        break;
    }

    if (cycleCount < 6) {
      if (frameCount % 10 == 0) {
        diceValue = rand.nextInt(6) + 1;
        cycleCount++;
      }
    } else {
      textSize(20);
      fill(0);
      text("Your Roll: " + diceValue, width/2, height/5);
      noLoop();
    }
  }

  public static void main(String[] args) {
    PApplet.main("Dice");
    PApplet.main("Dice");
  }
}
