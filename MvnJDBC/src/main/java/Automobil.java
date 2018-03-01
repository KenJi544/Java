
public class Automobil {
	private int id;
	private String marca, model;
	double putere, pret;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setPutere(double putere) {
		this.putere = putere;
	}
	public double getPutere() {
		return putere;
	}
	public void setPret(double pret) {
		this.pret = pret;
	}
	public double getPret() {
		return pret;
	}
	
	Automobil(Automobil o){
		this.setId(o.getId());
		this.setMarca(o.getMarca());
		this.setModel(o.getModel());
		this.setPutere(o.getPutere());
		this.setPret(o.getPret());
	}

	Automobil(){}

	public void copy(Automobil o) {
		this.setId(o.getId());
		this.setMarca(o.getMarca());
		this.setModel(o.getModel());
		this.setPutere(o.getPutere());
		this.setPret(o.getPret());
	}
}
