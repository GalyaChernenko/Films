import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test

    public void test() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");

        String[] expected = {"FilmI", "FilmII", "FilmIII"};
        String[] actual = manager.findAll();


    }
}
