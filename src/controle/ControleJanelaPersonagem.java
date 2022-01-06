package controle;

import dominio.daoPersonagem;
import dominio.personagem;

public class ControleJanelaPersonagem {
	private personagem pers = new personagem(null, 0, 0, 0, 0, 0, 0);
	private daoPersonagem persDao = new daoPersonagem();
	public ControleJanelaPersonagem() {
	}
	
	public void cadastrarPersonagem(String nome, int soco, int chute,
			int especial, int defesa, int forca, int vida) {
			pers.setNome(nome);
			pers.setSoco(soco);
			pers.setChute(chute);
			pers.setEspecial(especial);
			pers.setDefesa(defesa);
			pers.setForca(forca);
			pers.setVida(vida);
			persDao.inserirpersonagem(nome, soco, chute, especial,
					defesa, forca, vida);
			}
		}