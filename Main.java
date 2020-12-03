class Main {
  public static void main(String[] args) {
    Filme filme1 = new Filme("Piratas do Caribe", 100, 2003);

    filme1.exibirDetalhes();
    filme1.executar();
    filme1.pausar();
    filme1.executar();
    filme1.mudarAudio();
    filme1.mudarAudio();
    filme1.mudarLegenda();
    filme1.mudarLegenda();
    filme1.exibirDetalhes();
    System.out.println("\n");

    Filme filme2 = new Filme("As Aventuras De Pi", 120, 2012);

    filme2.exibirDetalhes();
    filme2.executar();
    filme2.pausar();
    filme2.executar();
    filme2.mudarAudio();
    filme2.mudarAudio();
    filme2.mudarLegenda();
    filme2.mudarLegenda();
    filme2.exibirDetalhes();
    System.out.println("\n");

    Serie serie1 = new Serie ("Arrow", 8, 23);

    serie1.exibirDetalhes();
    serie1.executar();
    serie1.pausar();
    serie1.executar();
    serie1.mudarAudio();
    serie1.mudarAudio();
    serie1.mudarLegenda();
    serie1.mudarLegenda();
    serie1.exibirDetalhes();
    System.out.println("\n");

    Serie serie2 = new Serie ("LaCasaDePapel", 4, 16);

    serie2.exibirDetalhes();
    serie2.executar();
    serie2.pausar();
    serie2.executar();
    serie2.mudarAudio();
    serie2.mudarAudio();
    serie2.mudarLegenda();
    serie2.mudarLegenda();
    serie2.exibirDetalhes();
    System.out.println("\n");
  }
}