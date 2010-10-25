
public class MorpionModele {
	public boolean joueur = true;
	private int[][] plateau = new int[3][3];

        public MorpionModele(){
             for(int i = 0 ; i < 3 ; i++)
        {
               for(int j = 0 ; j < 3 ; j++)
               {
                    this.plateau[i][j]= 0;
               }
        }
}

	public void changePlayer(){
		this.joueur = !this.joueur;
	}
	
	public void fillCase(int x , int y){
		if(this.joueur)
			this.plateau[x][y] = 1;
		else
			this.plateau[x][y] = 2;
                this.changePlayer();
		//System.out.println("T'es nul c'est déja coché");
	}
	
	public int getCase(int x , int y){
		return this.plateau[x][y];
	}

        public boolean getPlayer(){
            return this.joueur;
        }
}