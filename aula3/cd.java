package aula3;

public class cd extends media {

    String artista, descripcion;
    int pistas;

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    public String getArtista() {
        return artista;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getPistas() {
        return pistas;
    }
    
}
