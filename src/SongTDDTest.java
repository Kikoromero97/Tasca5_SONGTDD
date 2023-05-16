import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SongTDDTest {

    @org.junit.jupiter.api.Test
    void crearCancionPopular1() {
        List<String> TodosAnimales = new ArrayList<>();
        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals("", resultadoReal);
    }
    @org.junit.jupiter.api.Test
    void crearCancionPopular2() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("spider");
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" ;
        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancionPopular3() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        String resultadoEsperado = "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n";
        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancionPopular4() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("spider");
        TodosAnimales.add("fly");
        String resultadoEsperado = "There was an old lady who swallowed a spider.\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the spider;\n" +
                "I don't know why she swallowed a spider - perhaps she'll die!\n";

        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancionPopular5() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        TodosAnimales.add("bird");
        String resultadoEsperado =  "There was an old lady who swallowed a fly.\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the spider,\n" +
                "She swallowed the spider to catch the fly;\n" +
                "I don't know why she swallowed a fly - perhaps she'll die!\n" +
                "\n";

        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void crearCancionPopular6() {
        List<String> TodosAnimales = new ArrayList<>();
        TodosAnimales.add("bird");
        TodosAnimales.add("fly");
        TodosAnimales.add("spider");
        String resultadoEsperado =  "There was an old lady who swallowed a bird.\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a fly;\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a spider;\n" +
                "How absurd to swallow a spider.\n" +
                "She swallowed the spider to catch the fly,\n" +
                "She swallowed the fly to catch the bird;\n" +
                "I don't know why she swallowed a bird - perhaps she'll die!\n" +
                "\n";

        String resultadoReal = SongTDD.crearCancionPopular(TodosAnimales);
        assertEquals(resultadoEsperado, resultadoReal);
    }
}