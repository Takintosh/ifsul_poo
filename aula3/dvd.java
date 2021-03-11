package aula3;

public class dvd extends media {
    
    String director, clasificacion, estudio;

    public void setDirector(String director) {
        this.director = director;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDirector() {
        return director;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public String getEstudio() {
        return estudio;
    }

}
