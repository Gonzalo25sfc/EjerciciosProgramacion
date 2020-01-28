import javax.swing.JOptionPane;

class joptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1="Bienvenido al sistema de login de DAM";
		String texto2="A continuacion introduce tu nombre de usuario y contraseña:";
		
		JOptionPane.showMessageDialog(null, texto1);
		JOptionPane.showMessageDialog(null, texto2);
		
		
		String teclado=JOptionPane.showInputDialog("Escribe tu nombre de usuario:");
		System.out.println(teclado);
		String teclado1=JOptionPane.showInputDialog("Escriba la contraseña:");
		System.out.println(teclado1);
		
		if (teclado.equals("Gonzalo") && teclado1.equals("salami")) {
			String texto3="¡USUARIO VALIDADO!";
			JOptionPane.showMessageDialog(null, texto3);
		}
		else {
			String texto4="¡USUARIO Y/O CONTRASEÑA INCORRECTOS!";
			JOptionPane.showMessageDialog(null, texto4);
		}
		
		
	}
}
