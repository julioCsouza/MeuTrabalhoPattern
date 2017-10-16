package playerdemusica.composity;

public class PlaylistDeMusica implements MusicaComposity{
    private MusicaComposity musica1;
    private MusicaComposity musica2;
    
    public PlaylistDeMusica (MusicaComposity musica1, MusicaComposity musica2){
        this.musica1 = musica1;
        this.musica2 = musica2;
    }

    @Override
    public String getNome() {
        return musica1.getNome() + " / " + musica2.getNome();
    }
}
