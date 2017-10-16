package playerdemusica;

import playerdemusica.composity.MusicaComposity;
import playerdemusica.composity.MusicaSimples;
import playerdemusica.composity.PlaylistDeMusica;
import playerdemusica.proxy.Acao;
import playerdemusica.proxy.NaoPremio;
import playerdemusica.proxy.Premio;
import playerdemusica.state.Musica;
import playerdemusica.state.MusicaEmReproducao;
import playerdemusica.state.MusicaPausada;
import playerdemusica.tamplate.Cd;
import playerdemusica.tamplate.GravarMusica;
import playerdemusica.tamplate.Pendrive;

public class PlayerDeMusica {

    public static void main(String[] args) {
        
        Acao acao = new NaoPremio();
        acao.executar();
        
        Musica musica = new Musica();
        musica.trocaEstado(new MusicaPausada());
        musica.estadoDaMusica();
        
        GravarMusica a = new Cd();
        a.gravarMusicas();
                
        MusicaComposity musica1 = new MusicaSimples("ASKING ALEXANDRIA - The Black");
        MusicaComposity musica2 = new MusicaSimples("ASKING ALEXANDRIA - A Prophecy");
        MusicaComposity musica3 = new MusicaSimples("FOR TODAY - Bitter Roots");
        MusicaComposity musica4 = new MusicaSimples("FOR TODAY - Broken Lens");
        
        MusicaComposity FORTODAY = new PlaylistDeMusica(musica3, musica4);
        MusicaComposity ASKINGALEXANDRIA = new PlaylistDeMusica(musica1, musica2);
        System.out.println(FORTODAY.getNome());
    }
    
}
