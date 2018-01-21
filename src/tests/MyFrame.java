package tests;

import java.awt.*;
import java.util.ArrayList;

public class MyFrame extends Frame
{

    private int x;
    private int y;
    private String title;
    private ArrayList<Component> components = new ArrayList<>();

    public MyFrame(int x, int y, String title)
    {
        this.x = x;
        this.y = y;
        this.title = title;
    }

    public void generate()
    {
        this.setVisible(true);
        this.setSize(this.x, this.y);
        this.setTitle(this.title);
        this.addComponents();
        this.setLayout(new FlowLayout());
        this.setResizable(false);
    }

    private void addComponents()
    {
        for(Component c : this.components)
        {
            this.add(c);
        }
    }

    public void addComponent(Component c)
    {
        this.components.add(c);
    }

}
