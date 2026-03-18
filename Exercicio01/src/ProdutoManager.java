import java.util.ArrayList;
import java.util.List;

public class ProdutoManager {
	// uma interface
		private List<Produto> produtoList;
		
		public ProdutoManager() {
			produtoList = new ArrayList<>();
		}
		
		public int tamanhoList(int id) {
			int tamanho;
			tamanho = produtoList.size();
			id = tamanho;
			return id;
		}
		
		public List<Produto> getProductList(){
			return produtoList;
		}
		
		// adicionar um produto a lista 
		public boolean save(Produto produto) {
			if(produto!= null) {
				produtoList.add(produto);
				return true;
			}
			return false;
		}
		
		public Produto search(int id) {
			for(Produto produto : produtoList) {
				if(produto.getId().equals(id)) {
					return produto;
				}
			}
			return null;
		}
		
		public boolean update(int id, String nameProduct) {
			Produto produto = search(id);
			if(produto != null) {
				int i = produtoList.indexOf(produto);
				if(i != -1) {
					produto.setProduct(nameProduct);
					produtoList.set(i, produto);
					return true;
				}
			}
			return false;
		}
		
		public boolean remove(int id) {
			Produto produto = search(id);
			if(produto != null) {
				produtoList.remove(produto);
				return true;
			}
			return false;
}
