public class Filme implements Video {
   
  private String nome;
  private int duracao; 
  private String idiomaAudio; 
  private String idiomaLegenda; 
  private boolean estaPausado;
  private int anoLancamento;

  public Filme(String nome, int duracao, int anoLancamento){
    this.nome = nome;
    this.duracao = duracao;
    this.anoLancamento = anoLancamento;
    estaPausado = false;
    idiomaAudio = "Português (Brasil)";
    idiomaLegenda = "Português (Brasil)";
  }
  
  public void executar() {
    if(estaPausado == false){
    System.out.println("Iniciando o filme: "+ nome);
        }else{
    System.out.println("O filme está sendo executado");
    }
  }

  public void pausar() {
    estaPausado = true;
    System.out.println("O filme está pausado");
  }

  public void mudarAudio() {
    if(idiomaAudio == "Espanhol (Original)"){
      idiomaAudio = "Português (Brasil)";
      }else{
      idiomaAudio = "Espanhol (Original)";
    }
    System.out.println("O idioma foi alterado para: "+idiomaAudio);
  }

  public void mudarLegenda() {
    if(idiomaLegenda == "Sem legenda"){
      idiomaLegenda = "Português (Brasil)";
      }else{
      idiomaLegenda = "Sem legenda";
    }
      System.out.println("A legenda foi alterada para: "+ idiomaLegenda);
  }

  public String exibirDetalhes() {
    System.out.println(nome+"("+anoLancamento+"). "+"Duração: "+duracao+" min.");
    return null;
  }   
}