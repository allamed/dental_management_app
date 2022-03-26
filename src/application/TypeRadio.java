package application;

public class TypeRadio {
	private int idTypeRadio;
	private String description;
	/**
	 * @param idTypeRadio
	 * @param description
	 */
	public TypeRadio(int idTypeRadio, String description) {
		super();
		this.idTypeRadio = idTypeRadio;
		this.description = description;
	}
	public int getIdTypeRadio() {
		return idTypeRadio;
	}
	public void setIdTypeRadio(int idTypeRadio) {
		this.idTypeRadio = idTypeRadio;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
