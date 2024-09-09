/**
 * 
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
            
            grass.changeColor("green");
            grass.changeSize(550);
            grass.moveHorizontal(-350);
            grass.moveVertical(130);
            grass.makeVisible();
            
            sun.changeColor("orange");
            sun.changeSize(68);
            sun.moveHorizontal(-200);
            sun.moveVertical(-70);
            sun.makeVisible();
            
            mountain.changeColor("green");
            mountain.changeSize(200,200);
            mountain.moveHorizontal(250);
            mountain.moveVertical(-70);
            mountain.makeVisible();
            
            gold.changeColor("yellow");
            gold.changeSize(30);
            gold.moveHorizontal(215);
            gold.moveVertical(-40);
            gold.makeVisible();
            
            stair1.changeColor("black");
            stair1.changeSize(60);
            stair1.moveHorizontal(50);
            stair1.moveVertical(70);
            stair1.makeVisible();
            
            stair2.changeColor("yellow");
            stair2.changeSize(50);
            stair2.moveHorizontal(0);
            stair2.moveVertical(85);
            stair2.makeVisible();
            
            stair3.changeColor("red");
            stair3.changeSize(40);
            stair3.moveHorizontal(-40);
            stair3.moveVertical(100);
            stair3.makeVisible();
            
            stair4.changeColor("magenta");
            stair4.changeSize(30);
            stair4.moveHorizontal(-70);
            stair4.moveVertical(115);
            stair4.makeVisible();
            
            obstacle1.changeColor("orange");
            obstacle1.changeSize(90);
            obstacle1.moveHorizontal(-150);
            obstacle1.moveVertical(125);
            obstacle1.makeVisible();
            
            obstacle2.changeColor("orange");
            obstacle2.changeSize(140);
            obstacle2.moveHorizontal(-260);
            obstacle2.moveVertical(140);
            obstacle2.makeVisible();
            
            obstacle3.changeColor("black");
            obstacle3.changeSize(100);
            obstacle3.moveHorizontal(-100);
            obstacle3.moveVertical(145);
            obstacle3.makeVisible();
            
            person1.changeColor("magenta");
            person1.changeSize(40,20);
            person1.moveHorizontal(20);
            person1.moveVertical(2);
            person1.makeVisible();
            
            person2.changeColor("magenta");
            person2.changeSize(40,20);
            person2.moveHorizontal(-155);
            person2.moveVertical(0);
            person2.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        grass.changeColor("white");
        sun.changeColor("white");
        mountain.changeColor("white");
        gold.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("blue");
        grass.changeColor("green");
        sun.changeColor("orange");
        mountain.changeColor("green");
        gold.changeColor("yellow");
    }
}
