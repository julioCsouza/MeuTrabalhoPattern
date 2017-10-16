package playerdemusica.tamplate;

public abstract class GravarMusica {
    public void gravarMusicas(){
        buscarMusica();
        baixarMusica();
        gravarMusica();
    }
    private void buscarMusica(){
        System.out.println("Buscando musicas no sevidor.");
    }
    private void baixarMusica(){
        System.out.println("Baixando musicas do servidor.");
    }
    abstract void gravarMusica();
}
