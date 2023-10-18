public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        gridOfSmallSquares_v2();
    }

    public void rowOfSmallSquares(int y) {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 900; x = x + 150) {
            System.out.println(x);
            plane.teleport((x + 30), y);
            plane.square(10);
            plane.setColor(x / 4, x / 4, x / 4);
        }
    }

    public void gridOfSmallSquares_v1() {
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 900; x = x + 150) {
            System.out.println(x);
            rowOfSmallSquares(x);
        }


    }

    public void gridOfSmallSquares_v2() {
        plane.trailWidth = 5;
        for (int x = 0; x < 500; x = x + 100) {
            for (int y = 0; y < 500; y = y + 100) {
                System.out.println("x: " + x + ", y: " + y);
                plane.teleport(x, y);
                plane.setColor(x/2,y/3,x/2);
                plane.square(10);
            }
        }
    }

    public void columnOfSmallSquares() {
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
        plane.isTrail = true;
        for (int x = 0; x < 900; x = x + 150) {
            System.out.println(x);
            plane.teleport(300, x + 30);
            plane.square(10);
        }

        //put your loop here

    }

    public void fitness() {
        for (int s = 0; s < 5; s = s + 1) {
            System.out.println("sprint" + s);
            for (int p = 0; p < 10; p = p + 1) {
                System.out.println("pushup" + p);
            }
        }
    }
}