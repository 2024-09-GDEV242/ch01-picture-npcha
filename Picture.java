/**
 * This picture shows a race between two people trying 
 * to get to on top of the mountain for gold.
 * The first person is on the second stair getting near the finish desti-
 * nation. However, the second person still on the obstacle trying to 
 * catch up with the first person.
 * 
 * @author  Pipatporn Chaluthong
 * @version 2024.09.03
 */
public class Picture
{
    private Square sky;
    private Square grass;
    private Circle sun;
    private Triangle mountain;
    private Circle gold;
    private Square stair1;
    private Square stair2;
    private Square stair3;
    private Square stair4;
    private Circle obstacle1;
    private Circle obstacle2;
    private Circle obstacle3;
    private Person person1;
    private Person person2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        grass = new Square();
        sun = new Circle();
        mountain = new Triangle();
        gold = new Circle();
        stair1 = new Square();
        stair2 = new Square();
        stair3 = new Square();
        stair4 = new Square();
        obstacle1 = new Circle();
        obstacle2 = new Circle();
        obstacle3 = new Circle();
        person1 = new Person();
        person2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.changeSize(550);
            sky.moveHorizontal(-350);
            sky.moveVertical(-250);
            sky.makeVisible();
            
            sun.changeColor("orange");
            sun.changeSize(68);
            sun.moveHorizontal(-200);
            sun.moveVertical(-70);
            sun.makeVisible();

            stair1.changeColor("mutedGreen");
            stair1.changeSize(60);
            stair1.moveHorizontal(50);
            stair1.moveVertical(70);
            stair1.makeVisible();
            
            stair2.changeColor("olive");
            stair2.changeSize(50);
            stair2.moveHorizontal(0);
            stair2.moveVertical(85);
            stair2.makeVisible();
            
            stair3.changeColor("shadow");
            stair3.changeSize(40);
            stair3.moveHorizontal(-40);
            stair3.moveVertical(100);
            stair3.makeVisible();
            
            stair4.changeColor("yellowGreen");
            stair4.changeSize(30);
            stair4.moveHorizontal(-70);
            stair4.moveVertical(115);
            stair4.makeVisible();
            
            obstacle2.changeColor("bronze");
            obstacle2.changeSize(140);
            obstacle2.moveHorizontal(-260);
            obstacle2.moveVertical(135);
            obstacle2.makeVisible();
            
            obstacle3.changeColor("cornsilk");
            obstacle3.changeSize(100);
            obstacle3.moveHorizontal(-100);
            obstacle3.moveVertical(145);
            obstacle3.makeVisible();
            
            obstacle1.changeColor("camal");
            obstacle1.changeSize(90);
            obstacle1.moveHorizontal(-150);
            obstacle1.moveVertical(125);
            obstacle1.makeVisible();
            
            person1.changeColor("grey");
            person1.changeSize(40,20);
            person1.moveHorizontal(20);
            person1.moveVertical(2);
            person1.makeVisible();
            
            person2.changeColor("grey");
            person2.changeSize(40,20);
            person2.moveHorizontal(-155);
            person2.moveVertical(0);
            person2.makeVisible();
            
            mountain.changeColor("asparagus");
            mountain.changeSize(200,200);
            mountain.moveHorizontal(260);
            mountain.moveVertical(-70);
            mountain.makeVisible();
            
            grass.changeColor("darkSeaGreen");
            grass.changeSize(550);
            grass.moveHorizontal(-350);
            grass.moveVertical(130);
            grass.makeVisible();
            
            gold.changeColor("golden");
            gold.changeSize(30);
            gold.moveHorizontal(224);
            gold.moveVertical(-40);
            gold.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        sun.changeColor("white");
        stair1.changeColor("white");
        stair2.changeColor("white");
        stair3.changeColor("white");
        stair4.changeColor("white");
        obstacle2.changeColor("white");
        obstacle3.changeColor("white");
        obstacle1.changeColor("white");
        person1.changeColor("white");
        person2.changeColor("white");
        mountain.changeColor("white");
        grass.changeColor("white");
        gold.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        sun.changeColor("orange");
        stair1.changeColor("mutedGreen");
        stair2.changeColor("olive");
        stair3.changeColor("shadow");
        stair4.changeColor("yellowGreen");
        obstacle2.changeColor("bronze");
        obstacle3.changeColor("cornsilk");
        obstacle1.changeColor("camal");
        person1.changeColor("grey");
        person2.changeColor("grey");
        mountain.changeColor("asparagus");
        grass.changeColor("darkSeaGreen");
        gold.changeColor("golden");
    }
}
