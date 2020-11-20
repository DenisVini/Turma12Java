package Ecommerce;
		public class Produto {
			private String nome;
			private double precoUni;
			private int estoque;
			private int codProd;
			public Produto(int codProd, String nome, double precoUni, int estoque) {
				super();
				this.codProd = codProd;
				this.nome = nome;
				this.precoUni = precoUni;
				this.estoque = estoque;
			}
			protected Produto() {
				super();
			}
			public int getCodProd() {
				return codProd;
			}
			public void setCodProd(int codProd) {
				this.codProd = codProd;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public double getPrecoUni() {
				return precoUni;
			}
			public void setPrecoUni(double precoUni) {
				this.precoUni = precoUni;
			}
			public double getEstoque() {
				return estoque;
			}
			public void setEstoque(int estoque) {
				this.estoque = estoque;
			}
			public int diminuirEstoque(int qntd) {
				return this.estoque = this.estoque - qntd;
			}
		}