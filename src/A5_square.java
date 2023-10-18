public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        rowOfSquares();



//        for(int x=1; x<=10; x=x+1) {
//            square();
//        }

        //Start i = 30
        //End i < 120
        //Interval +=10
        //Check if i=30 is less than 120 (10 added after each iteration); so long as i<120, code runs
        //System.out.println prints whatever is in the parentheses (prints the value of i)
        //Side length of i changes every time
        //

    }

    public void fives() {
        for(int i=5;i<=35;i=i+1) {
            System.out.println(i);
        }
    }
    public void countDown() {
        for(int i=7;i>=2;i=i-1) {
            System.out.println(i);
        }
    }

    public void drawASquare() {
            for(int x=1;x<=4;x=x+1) {
                plane.move(100);
                plane.turn(90);
        }
            plane.turn(90);
    }

    public void rowOfSquares() {
        for(int x=1;x<=5;x=x+1) {
            plane.isTrail=true;
            drawASquare();
            plane.isTrail=false;
            plane.move(150);
            plane.turn(270);
        }
    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void triangle() {
        plane.move(111);
        plane.turn(120);
        plane.setColor(0,0,200);
        plane.move(111);
        plane.turn(120);
        plane.setColor(77,66,55);
        plane.move(111);
    }

    public void house() {
        square();
        plane.startingAngle(0);
        triangle();
    }

    public void bush() {
        plane.setColor(20,255,40);
        plane.startingAngle(0);
        plane.move(60);
        plane.turn(60);
        plane.move(36);
        plane.turn(60);
        plane.move(36);
        plane.turn(60);
        plane.move(60);
        plane.turn(60);
        plane.move(36);
        plane.turn(60);
        plane.move(36);
        plane.turn(330);
        plane.setColor(150,75,0);
        plane.move(48);
        plane.turn(90);
        plane.move(60);
        plane.turn(90);
        plane.move(48);
    }

    public void star() {
        plane.setColor(255,255,0);
        plane.startingAngle(0);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
        plane.turn(45);
        plane.move(20);
        plane.turn(180);
        plane.move(20);
    }

    public void bird() {
        plane.startingAngle(5);
        plane.move(111);
        plane.turn(120);
        plane.move(22);
        plane.turn(120);
        plane.move(22);
        plane.turn(120);
        plane.move(22);
        plane.turn(120);
        plane.move(111);
        plane.turn(120);
        plane.move(222);
        plane.turn(240);
        plane.move(111);
        plane.turn(240);
        plane.move(111);
        plane.turn(270);
        plane.move(150);
        plane.turn(180);
        plane.move(39);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(39);
        plane.turn(180);
        plane.move(150);
        }

    }



/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/