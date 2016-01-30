

public class Komnata {
		static int f;
	public static void main(String[] args){
		Gazeta g = new Gazeta();
		Muha m = new Muha();
		Komar kom = new Komar();
		 kom.boom();
		 m.boom();
		 g.boom();
		 
		 if(m.k == kom.t){ 
			 m.Bjj();
			 f = m.k;
		 }
		 else {
			 kom.Bjj();
			 f = kom.t;
		 }
		 
		 //System.out.println(m.k);
		 //System.out.println(g.i);
		 if (f == g.i) System.out.println("попал!!!!");
		 else System.out.println("Не попал, попробуй еще"); 
	}

}
