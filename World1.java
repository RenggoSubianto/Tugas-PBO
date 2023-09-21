import greenfoot.*;
public class World1 extends World
{
    public World1()
    {    
        super(600, 400, 1);
        
        Plane Plane1 = new Plane();
        this.addObject(Plane1, 30, 200);
        Plane1.setName("Plane1");
        
        Plane Plane2 = new Plane();
        Plane2.setRotation(180);
        Plane2.setName("Plane2");
        this.addObject(Plane2, 570,200);
        
        Plane Plane3 = new Plane();
        Plane3.setRotation(270);
        Plane3.setName("Plane3");
        this.addObject(Plane3, 300, 370);
        
        Plane Plane4 = new Plane();
        Plane4.setRotation(90);
        Plane4.setName("Plane4");
        this.addObject(Plane4, 300, 30);
    }
}
