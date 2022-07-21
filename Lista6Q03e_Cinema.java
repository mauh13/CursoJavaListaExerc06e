package lista06_EstruturasDeRepeticao_Extra;

import java.util.Scanner;

public class Lista6Q03e_Cinema {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int capacidademax = 15;
		int idade = 0;
		int opiniao = 0;
		int qtdOtimo = 0;
		int qtdBom = 0;
		int qtdRegular = 0;
		int qtdRuim = 0;
		int qtdPessimo = 0;
		float percBomRegular = 0;
		float mediaIdadeRuim = 0;
		float percResPessimo = 0;
		int maiorIdadePessimo = 0;
		int maiorIdadeRuim = 0;
		int maiorIdadeOtimo = 0;
		int difIdadeMaiorOtimoRuim = 0;
		String maioria = "'bom'";
		
		
		for (int i = 1; i <= capacidademax; i++) {
						
		System.out.println("Por gentileza informe sua idade:");
		idade = leia.nextInt();
		
		while (idade <= 0 || idade > 120) {
			System.out.println("Informe uma idade válida (maior que zero e menor que 120):");
			idade = leia.nextInt();
		}
		
		System.out.println("Qual sua opinião sobre o filme?");
		System.out.println("5 para ótimo (*****)");
		System.out.println("4 para bom   (****)");
		System.out.println("3 para regular (***)");
		System.out.println("2 para ruim (**)");
		System.out.println("1 para péssimo (*)");
		opiniao = leia.nextInt();
		
		while (opiniao != 5 && opiniao != 4 && opiniao != 3 && opiniao != 2 && opiniao != 1) {
			System.out.println("Escolha uma opção válida:");
			System.out.println("5 para ótimo (*****)");
			System.out.println("4 para bom   (****)");
			System.out.println("3 para regular (***)");
			System.out.println("2 para ruim (**)");
			System.out.println("1 para péssimo (*)");
			opiniao = leia.nextInt();
		}
			
		
		switch (opiniao) {
		case 5:
			qtdOtimo++;
			//System.out.println(qtdOtimo);
			if (idade > maiorIdadeOtimo) {
				maiorIdadeOtimo = idade;
			}
			break;
		case 4:
			qtdBom++;
			//System.out.println(qtdBom);
			break;
		case 3:
			qtdRegular++;
			//System.out.println(qtdRegular);
			break;
		case 2:
			qtdRuim++;
			//System.out.println(qtdRuim);
			mediaIdadeRuim = mediaIdadeRuim + idade;
			if (idade > maiorIdadeRuim) {
				maiorIdadeRuim = idade;
			}
			break;
		case 1:
			qtdPessimo++;
			//System.out.println(qtdPessimo);
			if (idade > maiorIdadePessimo) {
				maiorIdadePessimo = idade;
			}
			break;
		} 
		}

		if (qtdBom > 0 && qtdRegular > 0) {
		percBomRegular = ((qtdBom * 100) / (qtdBom + qtdRegular)) - ((qtdRegular * 100) / (qtdBom + qtdRegular));
			if (percBomRegular < 0) {
				percBomRegular = percBomRegular * -1;
				maioria = "'regular'";
			} 
		}
		
		if (mediaIdadeRuim > 0 && qtdRuim > 0) {
			mediaIdadeRuim /= qtdRuim;
		}
	
		if (qtdPessimo > 0) {
			percResPessimo = (qtdPessimo*100/capacidademax);
		}
		
		if (maiorIdadeOtimo > 0 && maiorIdadeRuim > 0) {
		difIdadeMaiorOtimoRuim = maiorIdadeOtimo - maiorIdadeRuim;
			if (difIdadeMaiorOtimoRuim < 0) {
				difIdadeMaiorOtimoRuim = difIdadeMaiorOtimoRuim * -1;
			}
		}
		
		System.out.println("Na enquete " + qtdOtimo + " das pessoas responderam 'ótimo'.");
		System.out.println("A diferença percentual entre as pessoas que responderam 'bom' e 'regular' foi de " + percBomRegular + "%, sendo que " + maioria + " foi a maioria.");
		System.out.println("A média de idade das pessoas que responderam 'ruim' foi de " + mediaIdadeRuim + " anos." );
		System.out.println(percResPessimo + "% das pessoas responderam 'péssimo', e dentre elas a maior idade foi de " + maiorIdadePessimo + " anos.");
		System.out.println("Dos que responderam 'ótimo' a maior idade foi " + maiorIdadeOtimo + " anos e " + maiorIdadeRuim + " anos foi a maior idade entre as pessoas que responderam 'ruim'. Uma difereça de " + difIdadeMaiorOtimoRuim + " anos.");
		
		
		leia.close();

	}

}
