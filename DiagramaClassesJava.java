public class PessoaJuridica {
    private String cnpj;
    private String nome;
    private String porte;
 
    public PessoaJuridica(String cnpj, String nome, String porte) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.porte = porte;
    }
 
    public String getCnpj() {
        return cnpj;
    }
 
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public String getPorte() {
        return porte;
    }
 
    public void setPorte(String porte) {
        this.porte = porte;
    }
}
 
public class Historico {
    private Date entrada;
    private Date saida;
    private Associado associado;
    
    public Historico(Date entrada, Date saida, Associado associado) {
        this.entrada = entrada;
        this.saida = saida;
        this.associado = associado;
    }
 

    public Date getEntrada() {
        return entrada;
    }
 
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }
 
    public Date getSaida() {
        return saida;
    }
 
    public void setSaida(Date saida) {
        this.saida = saida;
    }
 
    public Associado getAssociado() {
        return associado;
    }
 
    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
}
 
public class NotaFiscal {
    private String chaveDeAcesso;
    private float valorTotal;
    private Date dataVencimento;
    private PessoaJuridica pessoaJuridica; 
 
    public NotaFiscal(String chaveDeAcesso, float valorTotal, Date dataVencimento, PessoaJuridica pessoaJuridica) {
        this.chaveDeAcesso = chaveDeAcesso;
        this.valorTotal = valorTotal;
        this.dataVencimento = dataVencimento;
        this.pessoaJuridica = pessoaJuridica;
    }
 

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }
 
    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }
 
    public float getValorTotal() {
        return valorTotal;
    }
 
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
 
    public Date getDataVencimento() {
        return dataVencimento;
    }
 
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
 
    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }
 
    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
}
 
public class Mercadoria {
    private String nome;
    private float categoria;
    private Date dataVencimento;
    private int quantidade;
 
    public Mercadoria(String nome, float categoria, Date dataVencimento, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.dataVencimento = dataVencimento;
        this.quantidade = quantidade;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public float getCategoria() {
        return categoria;
    }
 
    public void setCategoria(float categoria) {
        this.categoria = categoria;
    }
 
    public Date getDataVencimento() {
        return dataVencimento;
    }
 
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
 
    public int getQuantidade() {
        return quantidade;
    }
 
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
 
public class Cargo {
    private float salario;
    private String nome;
 
    public Cargo(float salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }
 
    public float getSalario() {
        return salario;
    }
 
    public void setSalario(float salario) {
        this.salario = salario;
    }
 
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
}
 
public class Associado {
    private String nome;
    private float valor;
    private Date dataVencimento;
    private String senha;
    private int limiteGasto;
    private Cargo cargo;
 

    public Associado(String nome, float valor, Date dataVencimento, String senha, int limiteGasto, Cargo cargo) {
        this.nome = nome;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.senha = senha;
        this.limiteGasto = limiteGasto;
        this.cargo = cargo;
    }
 

    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public float getValor() {
        return valor;
    }
 
    public void setValor(float valor) {
        this.valor = valor;
    }
 
    public Date getDataVencimento() {
        return dataVencimento;
    }
 
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
 
    public String getSenha() {
        return senha;
    }
 
    public void setSenha(String senha) {
        this.senha = senha;
    }
 
    public int getLimiteGasto() {
        return limiteGasto;
    }
 
    public void setLimiteGasto(int limiteGasto) {
        this.limiteGasto = limiteGasto;
    }
 
    public Cargo getCargo() {
        return cargo;
    }
 
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
 
public class ContaFinanceira {
    private int numeroConta;
    private float saldo;
 

    public ContaFinanceira(int numeroConta, float saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
 
    public int getNumeroConta() {
        return numeroConta;
    }
 
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
 
    public float getSaldo() {
        return saldo;
    }
 
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
 
public class Compra {
    private float valor;
    private ContaFinanceira contaFinanceira; 
 

    public Compra(float valor, ContaFinanceira contaFinanceira) {
        this.valor = valor;
        this.contaFinanceira = contaFinanceira;
    }
 
    public float getValor() {
        return valor;
    }
 
    public void setValor(float valor) {
        this.valor = valor;
    }
 
    public ContaFinanceira getContaFinanceira() {
        return contaFinanceira;
    }
 
    public void setContaFinanceira(ContaFinanceira contaFinanceira) {
        this.contaFinanceira = contaFinanceira;
    }
}
 
public class Mensalidade {
    private Associado associado; 
    private float valor;
    private Date data;
    private String status;
 

    public Mensalidade(Associado associado, float valor, Date data, String status) {
        this.associado = associado;
        this.valor = valor;
        this.data = data;
        this.status = status;
    }
 

    public Associado getAssociado() {
        return associado;
    }
 
    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
 
    public float getValor() {
        return valor;
    }
 
    public void setValor(float valor) {
        this.valor = valor;
    }
 
    public Date getData() {
        return data;
    }
 
    public void setData(Date data) {
        this.data = data;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
}
