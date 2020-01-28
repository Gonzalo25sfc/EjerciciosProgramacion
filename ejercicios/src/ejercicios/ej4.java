package ejercicios;

class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dias[] = {"Lunes","Martes","Miercoles"};
		String asg1[] = {"Sistemas", "Entornos", "Sistemas", "recreo","bbdd","bbdd", "bbdd"};
		String asg2[] = {"Sistemas", "Entornos", "Sistemas", "recreo","bbdd","bbdd", "bbdd"};
		String asg3[] = {"Sistemas", "Entornos", "Sistemas","recreo", "bbdd","bbdd", "bbdd"};
		int horas[]= {8,9,10,11,12,13,14};

				for(int i=0; i<=2; i++) {
				      
				      System.out.print("               "+dias[i]);
				      
				      
				    }
				    
				    System.out.print("\n");
				    System.out.println();
	
	for(int a=0; a<=6; a++) 
	{
		System.out.print(horas[a]+ "->");
		System.out.print("\t     " + asg1[a]);
	      System.out.print("        \t" + asg2[a]);
	      System.out.println("              \t" + asg3[a]);
	}
}
}