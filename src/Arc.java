import java.awt.Graphics;

public class Arc extends Shape
{
    private int startAngle;
    private int arcAngle;

    public Arc()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
        startAngle = 30;
        arcAngle = 70;
    }

    @Override
    public void draw(Graphics g)
    {
        // set the color
        g.setColor(getColor());

        // draw the rectangle given the top left point and width and height
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle,arcAngle);
    }
}


