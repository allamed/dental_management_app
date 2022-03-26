package application;

public class CouvertureMedicale {
private int idCouverture;
private String typeCouverture;
/**
 * @param idCouverture
 * @param typeCouverture
 */
public CouvertureMedicale(int idCouverture, String typeCouverture) {
	super();
	this.idCouverture = idCouverture;
	this.typeCouverture = typeCouverture;
}
public int getIdCouverture() {
	return idCouverture;
}
public void setIdCouverture(int idCouverture) {
	this.idCouverture = idCouverture;
}
public String getTypeCouverture() {
	return typeCouverture;
}
public void setTypeCouverture(String typeCouverture) {
	this.typeCouverture = typeCouverture;
}

}
