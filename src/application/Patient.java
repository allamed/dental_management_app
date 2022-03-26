package application;

import java.util.ArrayList;
import java.util.Date;

public class Patient {
	private static int nombrePatients;
	private int idPatient;
	private Date dateNaissance;
	private String cin;
	private String nom;
	private String prenom;
	private String sexe;
	public ArrayList<ActeMedical>  acteMedical= new ArrayList<> () ;
	private CouvertureMedicale couvertureMedicale;
	
	

	/**
	 * @param idPatient
	 * @param dateNaissance
	 * @param cin
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param acteMedical
	 * @param couvertureMedicale
	 */
	public Patient(Date dateNaissance, String cin, String nom, String prenom, String sexe) {
		super();
		this.idPatient = nombrePatients +1;
		this.dateNaissance = dateNaissance;
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		nombrePatients ++;
		
	}
	public void ajouterActeMedicale (ActeMedical acte) {
		acteMedical.add(acte);
	}
	public static int getNombrePatients() {
		return nombrePatients;
	}
	public static void setNombrePatients(int nombrePatients) {
		Patient.nombrePatients = nombrePatients;
	}
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public ArrayList<ActeMedical> getActeMedical() {
		return acteMedical;
	}
	public void setActeMedical(ArrayList<ActeMedical> acteMedical) {
		this.acteMedical = acteMedical;
	}
	public CouvertureMedicale getCouvertureMedicale() {
		return couvertureMedicale;
	}
	public void setCouvertureMedicale(CouvertureMedicale couvertureMedicale) {
		this.couvertureMedicale = couvertureMedicale;
	}
	
}