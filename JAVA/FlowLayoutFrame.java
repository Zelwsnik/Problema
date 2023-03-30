import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayoutFrame extends JFrame 
{
    private JButton leftButton;
    private JButton centerJBUtton;
    private JButton rightButton;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame()
    {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout);

        leftButton =  new JButton("Left");
        add(leftButton);
        leftJButton.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.LEFT);

                    layou.layoutContainer(container);
                }
            }
        );

        centerJBUtton = new JButton("Center");
        add(centerJBUtton);
        centerJBUtton.addActionListener(
            
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.setAlignment(FlowLayout.CENTER);

                    layout.layoutContainer(container);
                }
            }
        );

        rightJButton = new JButton("Right");
        add(rightJButton);
        rightJButton.addActionListener(
            
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    layout.set setAlignment(FlowLayout.RIGHT);

                    layout.layoutContainer(container);
                }
            }
        );
    }
}