import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet{

    private String string="";
    public void paint(Graphics graphics){
        graphics.drawString(string,100,20);
    }
    public void init(){
        string=string+"Initializing.";
        repaint();
    }
    public void start(){
        string=string+"Starting.";
        repaint();
    }
    public void stop(){
        string=string+"Stopping.";
        repaint();
    }
    public void destroy(){
        string=string+"Destroying.";
        repaint();
    }

}
