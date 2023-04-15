import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void testThreeFilms() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
       String[] actual = manager.findAll();
       String[] expected = { "Movie I", "Movie II", "Movie III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testOneFilm() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");

        String[] actual = manager.findAll();
        String[] expected = { "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testZeroFilms() {
        FilmsManager manager = new FilmsManager();

        String[] actual = manager.findAll();
        String[] expected = { };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilmLessLimit() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        String[] actual = manager.findLast();
        String[] expected = { "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilmEqualsLimit() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        String[] actual = manager.findLast();
        String[] expected = { "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastFilmMoreLimit() {
        FilmsManager manager = new FilmsManager();
        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");
        String[] actual = manager.findLast();
        String[] expected = { "Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
