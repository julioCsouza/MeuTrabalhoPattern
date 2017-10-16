package playerdemusica.proxy;

import playerdemusica.state.MusicaEmReproducao;

public class NaoPremio implements Acao{

    @Override
    public void executar() {
        System.out.println("TOCA PROPAGANDA !!");
        
        if(true){
            MusicaEmReproducao musicaEmReproducao = new MusicaEmReproducao();
            musicaEmReproducao.EstadoDaMusica();
        }
    }
    
}
