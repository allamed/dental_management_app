package application;

import java.util.ArrayList;
import java.util.Date;

public class ActeMedical {
	static int nombreActes;
	private int idSoin;
	private Date debutSoin;
	private float prixComptabilise;
	private boolean etatActe;
	private Date finSoin;
	private ArrayList <Intervention> intervention= new ArrayList<> ();
	public ArrayList<Radio>  radio= new ArrayList<> () ;
	/**
	 * @param idSoin
	 * @param debutSoin
	 * @param prixComptabilise
	 * @param etatActe
	 * @param finSoin
	 * @param intervention
	 */
	public ActeMedical(Date debutSoin) {
		super();
		this.idSoin = nombreActes+1;
		this.debutSoin = debutSoin;
		this.prixComptabilise = 0;
		this.etatActe = true;
		nombreActes++;
	}
	public void ajouterIntervention(Intervention intervention) {
		this.intervention.add(intervention);
		this.prixComptabilise+=intervention.getCategorie().getPrixBase();
		intervention.setActeMedical(this);
	}
	public void majPrixComptabilise(float p) {
		prixComptabilise+=p;
	}
	
	public void terminerActe(Date finSoin) {
		this.finSoin=finSoin;
		this.etatActe=false;
	}
	public void ajouterRadio(Date dateRadio) {
		this.radio.add(new Radio(dateRadio));
	}
	
	public int getIdSoin() {
		return idSoin;
	}
	public void setIdSoin(int idSoin) {
		this.idSoin = idSoin;
	}
	public Date getDebutSoin() {
		return debutSoin;
	}
	public void setDebutSoin(Date debutSoin) {
		this.debutSoin = debutSoin;
	}
	public float getPrixComptabilise() {
		return prixComptabilise;
	}
	public void setPrixComptabilise(float prixComptabilise) {
		this.prixComptabilise = prixComptabilise;
	}
	public boolean isEtatActe() {
		return etatActe;
	}
	public void setEtatActe(boolean etatActe) {
		this.etatActe = etatActe;
	}
	public Date getFinSoin() {
		return finSoin;
	}
	public void setFinSoin(Date finSoin) {
		this.finSoin = finSoin;
	}
	public ArrayList<Intervention>  getIntervention() {
		return intervention;
	}
	

}
