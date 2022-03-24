import java.awt.Graphics;

public class Line extends Shape
{

    public Line()
    {
        super();  // call parent constructor (note the parent's constructor has no parameters)
    }

    @Override
    public void draw(Graphics g)
    {
        // set the color
        g.setColor(getColor());

        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
    }
}


