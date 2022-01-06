package dominio;

public class personagem {
		private String nome;
		private int soco, chute, especial, defesa, forca, vida;
		public personagem(String nome, int soco, int chute, int especial, int defesa, int forca, int vida) {
			this.nome = nome;
			this.soco = soco;
			this.chute = chute;
			this.especial = especial;
			this.defesa = defesa;
			this.forca = forca;
			this.vida = vida;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getSoco() {
			return soco;
		}
		public void setSoco(int soco) {
			this.soco = soco;
		}
		public int getChute() {
			return chute;
		}
		public void setChute(int chute) {
			this.chute = chute;
		}
		public int getEspecial() {
			return especial;
		}
		public void setEspecial(int especial) {
			this.especial = especial;
		}
		public int getDefesa() {
			return defesa;
		}
		public void setDefesa(int defesa) {
			this.defesa = defesa;
		}
		public int getForca() {
			return forca;
		}
		public void setForca(int forca) {
			this.forca = forca;
		}
		public int getVida() {
			return vida;
		}
		public void setVida(int vida) {
			this.vida = vida;
		}
		
	
}
