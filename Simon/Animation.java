import javax.swing.JFrame;
import javax.swing.JPanel;


public class Animation extends Thread{
	
	
	public void run()
	{
		
	/*	JFrame f = new JFrame();
    	f.setBounds(300,300,400,300);
  
		SimonVue v = new SimonVue();

    	f.add(v);
    	f.setVisible(true);
		v.mod.initSeq(v.mod.niveau);*/
		
		SimonVue v = new SimonVue();
		v.mod.initSeq(v.mod.niveau);
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
		}while (1==1);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
