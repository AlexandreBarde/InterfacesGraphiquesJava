package tests;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App
{

    public static void main(String args[])
    {
        Button b = new Button("ok");
        TextField utilisateur = new TextField(20);
        TextField motDePasse = new TextField(20);

        MyFrame f = new MyFrame(200, 300, "Connexion");
        f.addComponent(new Label("Utilisateur"));
        f.addComponent(utilisateur);
        f.addComponent(new Label("Mot de passe"));
        f.addComponent(motDePasse);
        f.addComponent(b);

        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Bouton ok");
                System.out.println(utilisateur.getText() + " " + motDePasse.getText());
            }
        });

        f.generate();
    }

}
