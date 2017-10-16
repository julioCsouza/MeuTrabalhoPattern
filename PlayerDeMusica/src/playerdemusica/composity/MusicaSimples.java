package playerdemusica.composity;

public class MusicaSimples implements MusicaComposity{
    private String nome;
    
    public MusicaSimples(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    
}
