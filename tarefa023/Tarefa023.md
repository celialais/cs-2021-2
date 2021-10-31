# Tarefa 023

1. Considere a classe **CadastroEndereco** e a Interface **EnderecoService**, transcritas abaixo:

~~~java
public class CadastroEndereco {
    private String tipoEndereco; //comercial, residencial, etc.
    private String tipoLogradouro; //rua, avenida, alameda, marginal, via, viela, travessa, etc.
    private String nomeLogradouro;
    private int numero;
    private String complementoNumero; //exemplo 13-A, o complemento é -A.
    private String complementoEndereço; //quadra, lote, apartamento, etc.
    private String bairro;
    private Integer CEP;
    private String cidade;
    private String estado;
    private String pais;
}


public interface EnderecoService {
    List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro);
    List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
    List<Endereco> consultaPorCep(int cep);
    List<Endereco> consultaPorLogradouro(Logradouro logradouro);
    List<Endereco> consultaPorBairro(Bairro bairro);
    List<Endereco> consultaPorCidade(Cidade cidade);
    List<Cidade> listaCidadesPorEstado(Estado estado);
    List<Estado> consultaPorPais();
}


public class EnderecoServiceImpl implements EnderecoService {
	public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
			
	}

    List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco);
    List<Endereco> consultaPorCep(int cep);
    List<Endereco> consultaPorLogradouro(Logradouro logradouro);
    List<Endereco> consultaPorBairro(Bairro bairro);
    List<Endereco> consultaPorCidade(Cidade cidade);
    List<Cidade> listaCidadesPorEstado(Estado estado);
    List<Estado> consultaPorPais();
}

~~~

2. Refatorar a classe **CadastroEndereco** no seguinte conjunto de classes a seguir, e implementar os métodos necessários para que um cliente de endereço possa obter os dados que precisa a partir de uma consulta à Interface **EnderecoService**.


~~~Java
public class Bairro {

	private String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

public class Cidade {
	
	private String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

public class Endereco {
	
	private TipoEndereco tipoEndereco;
	
	private TipoLogradouro tipoLogradouro;

	private Logradouro nomeLogradouro;	

	private String complementoNumero;

	private String complementoEndereco;

	private Bairro bairro;
	
	private Cidade cidade;

	private Estado estado;

	private Pais pais;
}

public enum TipoEndereco {
	
	private String tipo;

	public String getTipo() {
		return this.tipo;
	}

	public void setNome(String tipo) {
		this.tipo = tipo;
	}
}

public class Estado {
	
	private String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

public class Logradouro {
	
	private String nome;

	private int numero;

	private Integer CEP;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Integer getCEP() {
		return this.CEP;
	}

	public void setCEP(Integer CEP) {
		this.CEP = CEP;
	}
}

public enum TipoLogradouro {

	private String logradouro;

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setNome(String logradouro) {
		this.logradouro = logradouro;
	}
}

public class Pais {
	
	private String nome;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
~~~~
