import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static ProdutoManager manager = new ProdutoManager();
	

	public static int menu() {
		System.out.println("----------------------------------");
		System.out.println("-----------PRODUTO----------------");
		System.out.println("----------------------------------");
		System.out.println("-------- MENU DE OPÇÕES ----------");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Buscar pelo ID");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Remover");
		System.out.println("5 - Sair");
		System.out.println("----------------------------------");
		System.out.print("Escolha uma opcao: ");
		return scanner.nextInt();
	}

	public static void register() {
		System.out.print("Digite o nome do produto: ");
		String nameProduct = scanner.nextLine();
		System.out.print("Digite o preço do produto: ");
		double priceProduct = scanner.nextDouble();
		Produto produto = new Produto(nameProduct, priceProduct);
		if(manager.save(produto)) {
			System.out.println("Pessoa cadastrada com sucesso!");
			System.out.println(manager.getProductList());
		}else {
			System.out.println("Erro ao cadastrar a pessoa.");
		}
	}
	
	private static void search() {
		System.out.print("Digite o ID: ");
		int id = scanner.nextInt();
		Produto produto = manager.search(id);
		if(produto != null) {
			System.out.println("Pessoa encontrada. Dados: ");
			System.out.println(produto);
		} else {
			System.out.println("Pessoa não foi encontrada. Tente novamente.");
		}
	}
	
	private static void update() {
		System.out.print("Digite o ID: ");
		int id = scanner.nextInt();
		System.out.print("Digite o nome do produto: ");
		String nameProduct = scanner.nextLine();
		if(manager.update(id, nameProduct)) {
			System.out.println("Dados atualizados.");
		} else {
			System.out.println("Erro ao atualizar os dados.");
		}
	}
	
	private static void remove() {
		System.out.print("Digite o ID: ");
		int id = scanner.nextInt();
		if(manager.remove(id)) {
			System.out.println("Usuário removido.");
		} else {
			System.out.println("Erro ao remover usuário.");
		}
	}
	
	public static void main(String[] args) {
		
		int opcao;
		do {
			opcao = menu();
			scanner.nextLine();
			switch(opcao) {
			case 1:{
				register();
				break;
			}
			case 2: {
				search();
				break;
			}
			case 3: {
				update();
				break;
			}
			case 4: {
				remove();
				break;
			}
			case 5: {
				System.out.println("Você saiu do programa");
				break;
			}
			default:
				System.out.println("Opção invalida. Tente novamente.");
			}
			if (opcao != 5) {
				System.out.println("Pressione ENTER para continuar: ");
				scanner.nextLine();
			}
		}while(opcao != 5);
	
	}

}
