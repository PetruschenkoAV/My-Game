
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
		 
		 JFrame o = new JFrame("���� ����");
		 o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 o.setSize(761,431);
		 o.setLocationRelativeTo(null);
		 o.add(new Okno()); 
		 o.setVisible(true);
		 //o.setResizable(false);
		 
		 
	}

}
