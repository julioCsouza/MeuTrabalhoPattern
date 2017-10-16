package playerdemusica.proxy;

import playerdemusica.state.MusicaEmReproducao;

public class Premio implements Acao{

    @Override
    public void executar() {
        System.out.println("TOCA MUSICA SEM PROPAGANDA");
        MusicaEmReproducao musicaEmReproducao = new MusicaEmReproducao();
        musicaEmReproducao.EstadoDaMusica();
    }
    
}
