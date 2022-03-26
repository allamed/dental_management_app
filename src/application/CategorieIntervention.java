package application;

public class CategorieIntervention {
	static int compteur;
	private int idCategorie;
	private String type;
	private float prixBase;
	/**
	 * @param idCategorie
	 * @param type
	 * @param prixBase
	 */
	public CategorieIntervention(String type, float prixBase) {
		super();
		this.idCategorie = compteur+1;
		this.type = type;
		this.prixBase = prixBase;
		compteur ++;
	}
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrixBase() {
		return prixBase;
	}
	public void setPrixBase(float prixBase) {
		this.prixBase = prixBase;
	}
	
}
