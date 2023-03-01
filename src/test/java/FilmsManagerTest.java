import org.junit.jupiter.api.Test;


public class FilmsManagerTest {
    @Test

    public void testGetAll() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");
        manager.addFilm("FilmIV");
        manager.addFilm("FilmV");
        manager.addFilm("FilmVI");
        manager.addFilm("FilmVII");
        manager.addFilm("FilmVIII");
        manager.addFilm("FilmIX");
        manager.addFilm("FilmX");


        String[] expected = {"FilmI", "FilmII", "FilmIII", "FilmIV", "FilmV", "FilmVI", "FilmVII", "FilmVIII", "FilmIX", "FilmX"};
        String[] actual = manager.findAll();


    }

    @Test

    public void testGetNotAdd() {
        FilmsManager manager = new FilmsManager();


        String[] expected = {};
        String[] actual = manager.findAll();
    }

    @Test
    public void testAddOne() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("FilmI");


        String[] expected = {"FilmI"};
        String[] actual = manager.findAll();
    }

    @Test
    public void testAddFiveFilms() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");
        manager.addFilm("FilmIV");
        manager.addFilm("FilmV");


        String[] expected = {"FilmI", "FilmII", "FilmIII", "FilmIV", "FilmV"};
        String[] actual = manager.findAll();


    }

    @Test
    public void testGetLastUnderLimited() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");
        manager.addFilm("FilmIV");
        manager.addFilm("FilmV");


        String[] expected = {"FilmV", "FilmIV", "FilmIII", "FilmII", "FilmI"};

        String[] actual = manager.findLast();


    }

    @Test
    public void testGetLimit() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");
        manager.addFilm("FilmIV");
        manager.addFilm("FilmV");
        manager.addFilm("FilmVI");
        manager.addFilm("FilmVII");
        manager.addFilm("FilmVIII");
        manager.addFilm("FilmIX");
        manager.addFilm("FilmX");


        String[] expected = {"FilmX", "FilmIX", "FilmVIII", "FilmVII", "FilmVI", "FilmV", "FilmIV", "FilmIII", "FilmII", "FilmI"};

        String[] actual = manager.findLast();
    }

    @Test
    public void testGetOneFilm() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");


        String[] expected = {"FilmI"};

        String[] actual = manager.findLast();
    }

    @Test
    public void testGetLimitLast() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("FilmI");
        manager.addFilm("FilmII");
        manager.addFilm("FilmIII");
        manager.addFilm("FilmIV");
        manager.addFilm("FilmV");
        manager.addFilm("FilmVI");
        manager.addFilm("FilmVII");
        manager.addFilm("FilmVIII");
        manager.addFilm("FilmIX");
        manager.addFilm("FilmX");
        manager.addFilm("FilmXI");

        String[] expected = {"FilmXI", "FilmIX", "FilmVIII", "FilmVII", "FilmVI", "FilmV", "FilmIV", "FilmIII", "FilmII", "FilmI"};

        String[] actual = manager.findLast();
    }

    @Test
    public void testGetEmpty() {

        FilmsManager manager = new FilmsManager();


        String[] expected = {};
        String[] actual = manager.findLast();
    }
}

