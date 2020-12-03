public class Serie implements Video {
	
  private String nome;
  private int duracao;
  private String idiomaAudio;
  private String idiomaLegenda;
  private boolean estaPausado;
  private int qtdTemporadas;
  private int episodiosPorTemporada;

  public Serie(String nome, int qtdTemporadas, int episodiosPorTemporada){
    this.nome = nome;
    this.qtdTemporadas = qtdTemporadas;
    this.episodiosPorTemporada = episodiosPorTemporada;
    estaPausado = false;
    idiomaAudio = "Português (Brasil)";
    idiomaLegenda = "Português (Brasil)";
  }

  public void executar() {
    if(estaPausado == false){
    System.out.println("Iniciando a série: "+ nome);
    }else{
            System.out.println("A série está sendo executada");
    }
  }
    
  public void pausar() {
    estaPausado = true;
    System.out.println("A série está pausada!");
  }

  public void mudarAudio() {
    if(idiomaAudio == "Inglês (Original)"){
      idiomaAudio = "Português (Brasil)";
    }else{
      idiomaAudio = "Inglês (Original)";
    }
    System.out.println("O idioma foi alterado para: "+idiomaAudio);
  }

  public void mudarLegenda() {
    if(idiomaLegenda == "Sem legenda!"){
      idiomaLegenda = "Português (Brasil)";
    }else{
      idiomaLegenda = "Sem legenda";
    }
    System.out.println("A legenda foi alterada para: "+ idiomaLegenda);
  }

  public String exibirDetalhes() {
    System.out.println(nome+"("+qtdTemporadas+" temporadas). "+episodiosPorTemporada+ " episódios por temporada.");
        return null;
  }   
}