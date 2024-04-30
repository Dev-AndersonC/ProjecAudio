import br.com.anderson.audioplay.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        podcast.setTitle("Aprendendo a programar em java...");
        podcast.setDescription("Podcast feito para alunos da alura");
        podcast.setHost("Paula");
        podcast.Likes();
        podcast.Reproducing();
        System.out.println(podcast.getDescription());
    }
}