/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Thibaut
 */
public class Morpion {
    int[][] plateau;
    boolean cKiKiJoue;

    public Morpion(){
        this.cKiKiJoue = true;
        this.plateau = new int[3][3];
        for(int i = 0 ; i < 3 ; i++)
        {
               for(int j = 0 ; j < 3 ; j++)
               {
                    this.plateau[i][j]= 0;
               }
        }
        this.go();
    }

    public void jouerCoup(int x , int y , int joueur){
        if(this.plateau[x][y] == 0){
            this.plateau[x][y] = joueur;
            return;
        }

        while(plateau[x][y] != 0)
        {
            x = (int)((100*Math.random())%3);
            y = (int)((100*Math.random())%3);
            if(plateau[x][y] == 0){
                plateau[x][y] = joueur;
                return;
            }
        }
    }

    public void afficher(){
        for(int i = 0 ; i < 3 ; i++)
        {
               for(int j = 0 ; j < 3 ; j++)
               {
                   if(plateau[i][j] == 1)
                       System.out.print(" X ");
                   else if(plateau[i][j] == 2)
                       System.out.print(" 0 ");
                   else
                       System.out.print(" _ ");

                   if( j != 2 )
                       System.out.print("|");
               }
            if( i != 2 )
                System.out.print("\n---+---+---\n");
        }
        System.out.println("\n\n");
    }

    public int finDePartie(){
        if((plateau[0][0] != 0 && plateau[0][0] == plateau[0][1] && plateau[0][1] == plateau[0][2]) ||
               (plateau[1][0] != 0 && plateau[1][0] == plateau[1][1] && plateau[1][1] == plateau[1][2]) ||
               (plateau[2][0] != 0 && plateau[2][0] == plateau[2][1] && plateau[2][1] == plateau[2][2]) ||
               (plateau[0][0] != 0 && plateau[0][0] == plateau[1][0] && plateau[1][0] == plateau[2][0]) ||
               (plateau[0][1] != 0 && plateau[0][1] == plateau[1][1] && plateau[1][1] == plateau[2][1]) ||
               (plateau[0][2] != 0 && plateau[0][2] == plateau[1][2] && plateau[1][2] == plateau[2][2]) ||
               (plateau[0][0] != 0 && plateau[0][0] == plateau[1][1] && plateau[1][1] == plateau[2][2]) ||
               (plateau[0][2] != 0 && plateau[0][2] == plateau[1][1] && plateau[1][1] == plateau[2][0]))
               return 1;
        else if (plateau[0][0] != 0 && plateau[0][1] != 0 && plateau[0][2] != 0 &&
                 plateau[1][0] != 0 && plateau[1][1] != 0 && plateau[1][2] != 0 &&
                 plateau[2][0] != 0 && plateau[2][1] != 0 && plateau[2][2] != 0 )
            return 2;
        else
            return 0;
    }

    public void go(){
        int a , b , c = 0;
        while(this.finDePartie() == 0){
           a = (int)((100*Math.random())%3);
           b = (int)((100*Math.random())%3);
           c += 1;
           this.jouerCoup(a, b, c);
           c %= 2;
           this.afficher();
        }
        if (this.finDePartie() == 1)
            System.out.println("Bien joué !!!");
        else
            System.out.println("Dommage");
    }
}
