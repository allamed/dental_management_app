package application;

import java.util.Date;

public class Radio {
	private static int compteur;
	private int idRadio;
	private String remarquesPositives;
	private String remarquesNegatives;
	private String remarquesGenerales;
	private Date dateRadio;
	private String cheminImage;
	private TypeRadio type;
	/**
	 * @param idRadio
	 * @param remarquesPositives
	 * @param remarquesNegatives
	 * @param remarquesGenerales
	 * @param dateRadio
	 * @param cheminImage
	 */
	public Radio(Date dateRadio) {
		super();
		this.idRadio = compteur+1;
		this.dateRadio = dateRadio;
		compteur++;
	}
	
	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		Radio.compteur = compteur;
	}

	public TypeRadio getType() {
		return type;
	}

	public void setType(TypeRadio type) {
		this.type = type;
	}

	public int getIdRadio() {
		return idRadio;
	}
	public void setIdRadio(int idRadio) {
		this.idRadio = idRadio;
	}
	public String getRemarquesPositives() {
		return remarquesPositives;
	}
	public void setRemarquesPositives(String remarquesPositives) {
		this.remarquesPositives = remarquesPositives;
	}
	public String getRemarquesNegatives() {
		return remarquesNegatives;
	}
	public void setRemarquesNegatives(String remarquesNegatives) {
		this.remarquesNegatives = remarquesNegatives;
	}
	public String getRemarquesGenerales() {
		return remarquesGenerales;
	}
	public void setRemarquesGenerales(String remarquesGenerales) {
		this.remarquesGenerales = remarquesGenerales;
	}
	public Date getDateRadio() {
		return dateRadio;
	}
	public void setDateRadio(Date dateRadio) {
		this.dateRadio = dateRadio;
	}
	public String getCheminImage() {
		return cheminImage;
	}
	public void setCheminImage(String cheminImage) {
		this.cheminImage = cheminImage;
	}
	
	
}
