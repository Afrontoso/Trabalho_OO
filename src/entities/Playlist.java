package entities;
public class Playlist {	
	private String nomePlaylist;
	private String proprietario;
	private String musicas;
	private String duracaoPlaylist;
	
	public Playlist(String nomePlaylist, String proprietario,
			        String duracaoPlaylist,
			        String musicas) {
		this.nomePlaylist = nomePlaylist;
		this.proprietario = proprietario;
		this.duracaoPlaylist = duracaoPlaylist;
		this.musicas = musicas;
	}
	
	public Playlist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getDuraçãoPlaylist() {
		return duracaoPlaylist;
	}
	
<<<<<<< HEAD
	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}

	public void adicionarMusica(String tituloMusica) {
	}
=======
	public void adicionarMusica(String tituloAlbum, String tituloMusica, String genero) {
        Musica novaMusica = new Musica(tituloMusica, genero);
        // Lógica para adicionar a nova música ao array de músicas
        // (Você precisa implementar essa lógica)
    }
>>>>>>> d188400addcf8a29ba308e75ea51efcf38b2aedb
	
	public void editarPlaylist(String nomePlaylist, String tituloMusica) {
	}
}
