package drawshapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends AbstractShape
{
    protected int width;
    protected int height;
    
    public Rectangle(Point clicked, int width, int height, Color color){
        super(clicked);
        setBoundingBox(clicked.x - width/2, clicked.x + width/2, clicked.y - height/2, clicked.y + height/2);
        this.color = color;
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int left, int right, int top, int bottom) {
        // annoying that I can't set width/height first and then use them in the super() call
        // but super() calls have to be the first line of the constructor per Java's rules
        super(new Point(left + (right - left)/2, top + (bottom - top)/2));
        setBoundingBox(left, right, top, bottom);
        this.color = Color.BLUE;
        this.width = right - left;
        this.height = bottom - top;
    }

    /* (non-Javadoc)
     * @see drawshapes.sol.Shape#draw(java.awt.Graphics)
     */
    @Override
    public void draw(Graphics g) {
        if (isSelected()){
            g.setColor(color.darker());
        } else {
            g.setColor(getColor());
        }
        //g.fillRect(getAnchorPoint().x, getAnchorPoint().y, width, height);
        g.fillRect(getAnchorPoint().x - width/2, getAnchorPoint().y - height/2, width, height);
    }

    public String toString() {
        return String.format("RECTANGLE %d %d %d %d %s %s", 
                getAnchorPoint().x,
                getAnchorPoint().y,
                width,
                height,
                colorToString(getColor()),
                selected);
    }
    

    /* (non-Javadoc)
     * @see drawshapes.sol.Shape#setAnchorPoint(java.awt.Point)
     */
    @Override
    public void setAnchorPoint(Point p) {
        // TODO: move bounding box
        this.anchorPoint = p;
    }

    public void scaleUp()
    {
        width = (int)(width * 1.25);
        height = (int)(height * 1.25);
    }

}
