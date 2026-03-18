public class Produto {
	private int id;
	private String nameProduct;
	private double priceProduct;
	private ProdutoManager manager =  ProdutoManager();
	
	public Produto(String nameProduct, double priceProduct) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.id = createId();
	}
	
	public int createId() {
		int id;
		manager.tamanhoList(id);
		return id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public String getProduct() {
		return nameProduct;
	}
	
	public void setPrice(double priceProduct) {
		this.priceProduct = priceProduct;
	}
	
	public double getPrice() {
		return priceProduct;
	}
	
	//Isso retira o padrão de exibir os atribustos com um codigo hexadecimal junto, podendo fazer da minha forma.
	@Override
	public String toString() {
		return "Dados da pessoa [ID: " + id + " - Nome: " + nameProduct + "Preço: " + priceProduct + "]";
	}
}
