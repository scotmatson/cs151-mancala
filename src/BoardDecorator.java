import java.awt.*;

/**
 Created by scot on 12/1/15.
 */
public abstract class BoardDecorator implements Drawable
{
   protected Drawable decoratedDrawable;

   public BoardDecorator(Drawable decoratedDrawable)
   {
      this.decoratedDrawable = decoratedDrawable;
   }

   public void draw(Graphics g)
   {
      decoratedDrawable.draw(g);
   }
}
