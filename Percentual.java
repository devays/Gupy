public class Percentual {

	public static void main(String[] args) {
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outros = 19849.53;
		
		double total = sp + rj + mg + es + outros;
		
		double percentualSp = (sp / total) * 100;
		double percentualRj = (rj / total) * 100;
		double percentualMg = (mg / total) * 100;
		double percentualEs = (es / total) * 100;
		double percentualOutros = (outros / total) * 100;
		
		
		
		System.out.printf("Percentual SP: %.2f\n", percentualSp);
		System.out.printf("Percentual RJ: %.2f\n", percentualRj);
		System.out.printf("Percentual MG: %.2f\n", percentualMg);
		System.out.printf("Percentual ES: %.2f\n", percentualEs);
		System.out.printf("Percentual Outros: %.2f\n", percentualOutros);

	}

}
