import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hello3
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://galeri.uludagsozluk.com/29/gunther_137242.gif");
        JOptionPane.showMessageDialog(null, "Deep in the Night", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        }
    }