import javax.swing.JFrame;

public class Komnata {

	public static void main(String[] args){
		Muha m = new Muha();
		Gazeta g = new Gazeta();
		 m.boom();
		 g.boom();
		 //System.out.println(m.k);
		 //System.out.println(g.i);
		 //if (m.k == g.i) System.out.println("�����!!!!");
		 //else System.out.println("�� �����, �������� ���");
		 
		 Okno o = new Okno();
		 o.setVisible(true);
		 o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 o.setSize(600,600);
		 //o.setResizable(false);
		 o.setLocationRelativeTo(null);
	}

}
