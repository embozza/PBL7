abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;

    public ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract String descricao();
}

interface Baixavel {
    void baixar();
}

interface Visualizavel {
    void visualizar();
}

class Ebook extends ItemBibliotecaDigital implements Baixavel {
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Ebook: " + titulo + " - Autor: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando ebook: " + titulo);
    }
}

class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + titulo + " - Autor: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando vídeo: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando vídeo: " + titulo);
    }
}
