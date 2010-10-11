import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ModelSimon extends Observable{

	/**
	 * @param args
	 */
	
	ArrayList<Integer> seqList = new ArrayList<Integer>();
	int combientiemeCoup ;
	int bouton ;
	int niveau ;
	boolean gagne = false;
	
	
	public ModelSimon()
	{
		this.niveau = 1;
		combientiemeCoup = 0 ;
	}
	
	
	public void initSeq(int nb)
	{

		combientiemeCoup = 0 ;
		for ( int i = 0 ; i < nb; i++)
		{
			this.seqList.add(  (int) (Math.random()*4) );
		}
		for(int i = 0 ; i< this.seqList.size();i++)
		{
			System.out.print(seqList.get(i));
		}
		System.out.println();
		setChanged();
		notifyObservers();
	}
	public void initSeq()
	{

		combientiemeCoup = 0 ;
		this.seqList.add(  (int) (Math.random()*4) );
		for(int i = 0 ; i< this.seqList.size();i++)
		{
			System.out.print(seqList.get(i));
		}
		System.out.println();
		setChanged();
		notifyObservers();
	}
	
	
	
	public void clearSeq()
	{
		this.seqList.clear();
	}
	
	public void setBoutonClique(int boutonClique)
	{
		combientiemeCoup++;
		bouton = boutonClique;
		this.verif(combientiemeCoup,bouton);
		
		
	}
	
	public void verif(int combientieme,int bouton)
	{
	//	return ( this.seqList.get(combientieme -1) == bouton );
		
		if (! (this.seqList.get(combientiemeCoup -1) == bouton))
		{
			JFrame f = new JFrame();
			f.setBounds(300,300,100,100);
			f.add(new JLabel("Perdu"));
			f.setVisible(true);
			System.out.println("perdu");
		}

		if ( combientiemeCoup == this.seqList.size() && (this.seqList.get(combientiemeCoup -1) == bouton))
		{
			/*JFrame f = new JFrame();
			f.setBounds(300,300,100,100);
			f.add(new JLabel("Gagné"));
			f.setVisible(true);*/
			System.out.println("gagne");
			this.gagne = true;
			/*this.clearSeq();
			this.initSeq(5);*/

		}

	}
	
	
	
	public static void main(String[] args) {

	/*	JFrame f = new JFrame();
    	f.setBounds(300,300,400,300);
  
		SimonVue v = new SimonVue();

    	f.add(v);
    	f.setVisible(true);
		v.mod.initSeq(v.mod.niveau);
		
		f.setDefaultLookAndFeelDecorated(true);
		do
		{
			while ( v.mod.gagne == false)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			v.mod.gagne = false;
			//v.mod.clearSeq();
			v.mod.niveau++;
			v.mod.initSeq();
		}while (1==1);*/
		
		
	/*	for ( int i = 0 ; i < v.mod.seqList.size(); i++)
		{
			System.out.print(v.mod.seqList.get(i));
		}*/


	}

}