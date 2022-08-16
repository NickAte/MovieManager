import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {

    @Test
    public void findAll() {
        MoviesManager manager = new MoviesManager();

        manager.add("Matrix");
        manager.add("Terminator");
        manager.add("Bloodshot");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Gentlemen");
        manager.add("Invisible");
        manager.add("Trolls");
        manager.add("NumberOne");
        manager.add("StarWars");

        String[] expected = {"Matrix", "Terminator", "Bloodshot", "Hotel", "Forward", "Gentlemen", "Invisible", "Trolls", "NumberOne", "StarWars"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MoviesManager manager = new MoviesManager();

        manager.add("Matrix");
        manager.add("Terminator");
        manager.add("Bloodshot");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Gentlemen");
        manager.add("Invisible");
        manager.add("Trolls");
        manager.add("NumberOne");
        manager.add("StarWars");

        String[] expected = {"StarWars", "NumberOne", "Trolls", "Invisible", "Gentlemen", "Forward", "Hotel", "Bloodshot", "Terminator", "Matrix"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUnderTenLimitFilms() {
        MoviesManager manager = new MoviesManager(3);

        manager.add("Matrix");
        manager.add("Terminator");
        manager.add("Bloodshot");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Gentlemen");
        manager.add("Invisible");
        manager.add("Trolls");
        manager.add("NumberOne");
        manager.add("StarWars");

        String[] expected = {"StarWars", "NumberOne", "Trolls"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOverTenLimitFilms() {
        MoviesManager manager = new MoviesManager(15);

        manager.add("Matrix");
        manager.add("Terminator");
        manager.add("Bloodshot");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Gentlemen");
        manager.add("Invisible");
        manager.add("Trolls");
        manager.add("NumberOne");
        manager.add("StarWars");
        manager.add("Click");
        manager.add("AmericanPie");
        manager.add("Scream");
        manager.add("Halloween");
        manager.add("Astral");

        String[] expected = {"Astral", "Halloween", "Scream", "AmericanPie", "Click", "StarWars", "NumberOne", "Trolls", "Invisible", "Gentlemen", "Forward", "Hotel", "Bloodshot", "Terminator", "Matrix"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastWithoutLimitFilms() {
        MoviesManager manager = new MoviesManager();

        manager.add("Matrix");
        manager.add("Terminator");
        manager.add("Bloodshot");
        manager.add("Hotel");
        manager.add("Forward");
        manager.add("Gentlemen");
        manager.add("Invisible");
        manager.add("Trolls");
        manager.add("NumberOne");
        manager.add("StarWars");
        manager.add("Click");
        manager.add("AmericanPie");
        manager.add("Scream");
        manager.add("Halloween");
        manager.add("Astral");

        String[] expected = {"Astral", "Halloween", "Scream", "AmericanPie", "Click", "StarWars", "NumberOne", "Trolls", "Invisible", "Gentlemen"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
