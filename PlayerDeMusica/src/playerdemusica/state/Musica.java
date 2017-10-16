
package playerdemusica.state;

public class Musica {
    private EstadoDaMusica estadoDaMusica;
    
    public void trocaEstado (EstadoDaMusica novoEstadoDaMusica){
        this.estadoDaMusica = novoEstadoDaMusica;
    }
    
    public void estadoDaMusica(){
        estadoDaMusica.EstadoDaMusica();
    }
}
