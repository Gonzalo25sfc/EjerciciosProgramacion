package con_for;

public class Coche {



		//Atributos
		private int puertas;
		private String color;
		private String marca;
		private int kms;
		
		public int getPuertas() {
			return puertas;
		}
		public void setPuertas(int puertas) {
			this.puertas = puertas;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getKms() {
			return kms;
		}
		public void setKms(int kms) {
			this.kms = kms;
		}
		@Override
		public String toString() {
			return "coche [puertas=" + puertas + ", color=" + color + ", marca=" + marca + ", kms=" + kms + "]";
		}
		
		
	}