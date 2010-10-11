package doodlegames;


public class Morpion {
	MorpionModele mod;
	public static void main(){
		
	}
	

    public Morpion(){
       /* for(int i = 0 ; i < 3 ; i++)
        {
               for(int j = 0 ; j < 3 ; j++)
               {
                    this.mod.plateau[i,j]= 0;
               }
        }*/
        this.go();
    }

    public void jouerCoup(int x , int y , int joueur){
        if(this.mod.getCase(x,y) == 0){
        	this.mod.fillCase(x,y);
            return;
        }

        while(this.mod.getCase(x,y) != 0)
        {
            x = (int)((100*Math.random())%3);
            y = (int)((100*Math.random())%3);
            if(this.mod.getCase(x,y) == 0){
            	this.mod.fillCase(x,y);
                return;
            }
        }
    }

    public void afficher(){
        for(int i = 0 ; i < 3 ; i++)
        {
               for(int j = 0 ; j < 3 ; j++)
               {
                   if(this.mod.getCase(i,j) == 1)
                       System.out.print(" X ");
                   else if(this.mod.getCase(i,j) == 2)
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
        if((this.mod.getCase(0,0) != 0 && this.mod.getCase(0,0) == this.mod.getCase(0,1) && this.mod.getCase(0,1) == this.mod.getCase(0,2)) ||
               (this.mod.getCase(1,0) != 0 && this.mod.getCase(1,0) == this.mod.getCase(1,1) && this.mod.getCase(1,1) == this.mod.getCase(1,2)) ||
               (this.mod.getCase(2,0) != 0 && this.mod.getCase(2,0) == this.mod.getCase(2,1) && this.mod.getCase(2,1) == this.mod.getCase(2,2)) ||
               (this.mod.getCase(0,0) != 0 && this.mod.getCase(0,0) == this.mod.getCase(1,0) && this.mod.getCase(1,0) == this.mod.getCase(2,0)) ||
               (this.mod.getCase(0,1) != 0 && this.mod.getCase(0,1) == this.mod.getCase(1,1) && this.mod.getCase(1,1) == this.mod.getCase(2,1)) ||
               (this.mod.getCase(0,2) != 0 && this.mod.getCase(0,2) == this.mod.getCase(1,2) && this.mod.getCase(1,2) == this.mod.getCase(2,2)) ||
               (this.mod.getCase(0,0) != 0 && this.mod.getCase(0,0) == this.mod.getCase(1,1) && this.mod.getCase(1,1) == this.mod.getCase(2,2)) ||
               (this.mod.getCase(0,2) != 0 && this.mod.getCase(0,2) == this.mod.getCase(1,1) && this.mod.getCase(1,1) == this.mod.getCase(2,0)))
               return 1;
        else if (this.mod.getCase(0,0) != 0 && this.mod.getCase(0,1) != 0 && this.mod.getCase(0,2) != 0 &&
                 this.mod.getCase(1,0) != 0 && this.mod.getCase(1,1) != 0 && this.mod.getCase(1,2) != 0 &&
                 this.mod.getCase(2,0) != 0 && this.mod.getCase(2,1) != 0 && this.mod.getCase(2,2) != 0 )
            return 2;
        else
            return 0;
    }

    public void go(){
        int a , b , c = 0;
        while(this.finDePartie() == 0){
           a = (int)(100*Math.random())%3;
           b = (int)(100*Math.random())%3;
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
