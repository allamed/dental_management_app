package application;

import java.util.Date;

public class Intervention {
	static int nombreInterventions;
	private int idIntervention;
	private Date datePrevue;
	private Date dateReelle;
	private String etatRV;
	private CategorieIntervention categorie;
	private ActeMedical acteMedical;
	
	
	/**
	 * @param idIntervention
	 * @param datePrevue
	 * @param dateReelle
	 * @param etatRV
	 */
	public Intervention(Date datePrevue, CategorieIntervention categorieIntervention) {
		super();
		this.idIntervention = nombreInterventions+1;
		this.categorie=categorieIntervention;
		this.datePrevue = datePrevue;
		this.etatRV = "prévue";
		nombreInterventions ++;
	}
	public int majIntervention(Date dateReelle) {
		this.dateReelle=dateReelle;
		this.etatRV= "passée";
		if (acteMedical!=null) {acteMedical.majPrixComptabilise(this.getCategorie().getPrixBase());
				return 1;
			}
		else return 0;
		}
	
	public int getIdIntervention() {
		return idIntervention;
	}
	public void setIdIntervention(int idIntervention) {
		this.idIntervention = idIntervention;
	}
	public Date getDatePrevue() {
		return datePrevue;
	}
	public void setDatePrevue(Date datePrevue) {
		this.datePrevue = datePrevue;
	}
	public Date getDateReelle() {
		return dateReelle;
	}
	public void setDateReelle(Date dateReelle) {
		this.dateReelle = dateReelle;
	}
	public String getEtatRV() {
		return etatRV;
	}
	public void setEtatRV(String etatRV) {
		this.etatRV = etatRV;
	}
	
	public CategorieIntervention getCategorie() {
		return categorie;
	}
	public void setCategorie(CategorieIntervention categorie) {
		this.categorie = categorie;
	}
	public static int getNombreInterventions() {
		return nombreInterventions;
	}
	public static void setNombreInterventions(int nombreInterventions) {
		Intervention.nombreInterventions = nombreInterventions;
	}
	public ActeMedical getActeMedical() {
		return acteMedical;
	}
	public void setActeMedical(ActeMedical acteMedical) {
		this.acteMedical = acteMedical;
	}
	
}
