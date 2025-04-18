package drawshapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AbstractShape
{
    private int diameter;
    
    public Circle(Color color, Point center, int diameter) {
        super(new Point(center.x, center.y));
        setBoundingBox(center.x - diameter/2, center.x + diameter/2, center.y - diameter/2, center.y + diameter/2);
        this.color = color;
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics g) {
        if (isSelected()){
            g.setColor(this.color.darker());
        } else {
            g.setColor(getColor());
        }
        g.fillOval((int)getAnchorPoint().getX() - diameter/2,
                (int)getAnchorPoint().getY() - diameter/2,
                diameter,
                diameter);
    }
    
    public String toString() {
        return String.format("CIRCLE %d %d %d %s %s", 
                this.getAnchorPoint().x, 
                this.getAnchorPoint().y,
                this.diameter,
                Util.colorToString(getColor()),
                this.isSelected());
    }

    @Override
    public void setAnchorPoint(Point p) {
        // TODO: move bounding box
        this.anchorPoint = p;
    }
    @Override
    public void scaleUp(){
        diameter = (int) (diameter * 1.25);
        setBoundingBox(anchorPoint.x-diameter/2, anchorPoint.x+diameter/2, anchorPoint.y-diameter/2, anchorPoint.y+diameter/2);
    }
    @Override
    public void scaleDown(){
        diameter = (int) (diameter * 0.75);
        setBoundingBox(anchorPoint.x-diameter/2, anchorPoint.x+diameter/2, anchorPoint.y-diameter/2, anchorPoint.y+diameter/2);
    }
    public IShape copy(){
        return new Circle(color, new Point(anchorPoint.x,anchorPoint.y), diameter);
    }

}
