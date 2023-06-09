import java.util.List;

public class SongTDD {
    private final static String FRASE_PRIMERA =
            "There was an old lady who swallowed a BUG_1.\n" +
             "I don't know why she swallowed a BUG_1 - perhaps she'll die!\n";
    private final static String FRASE_SEGUNDA = "\n" +
             "There was an old lady who swallowed a BUG_2;\n" +
             "That wriggled and wiggled and tickled inside her.\n" +
             "She swallowed the BUG_2 to catch the BUG_1;\n" +
             "I don't know why she swallowed a BUG_1 - perhaps she'll die!\n";
    private final static String FRASE_TERCERA = "\n" +
             "There was an old lady who swallowed a BUG_3;\n" +
             "How absurd to swallow a BUG_3.\n" +
             "She swallowed the BUG_3 to catch the BUG_2,\n" +
             "She swallowed the BUG_2 to catch the BUG_1;\n" +
             "I don't know why she swallowed a BUG_1 - perhaps she'll die!\n" +
             "\n";
    private static String fraseEntera = "";

    private final static String PRIMER_ANIMAL = "BUG_1";
    private final static String SEGUNDO_ANIMAL = "BUG_2";
    private final static String TERCER_ANIMAL = "BUG_3";


    public static String crearCancionPopular(List<String> TodosLosAnimales) {

        if (TodosLosAnimales.size() >= 1) {
            fraseEntera = FRASE_PRIMERA;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
        }
        if (TodosLosAnimales.size() >= 2) {
            fraseEntera += FRASE_SEGUNDA;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
            fraseEntera = fraseEntera.replaceAll(SEGUNDO_ANIMAL, TodosLosAnimales.get(1));
        }
        if (TodosLosAnimales.size() >= 3) {
            fraseEntera += FRASE_TERCERA;
            fraseEntera = fraseEntera.replaceAll(PRIMER_ANIMAL, TodosLosAnimales.get(0));
            fraseEntera = fraseEntera.replaceAll(SEGUNDO_ANIMAL, TodosLosAnimales.get(1));
            fraseEntera = fraseEntera.replaceAll(TERCER_ANIMAL, TodosLosAnimales.get(2));
        }

        return fraseEntera;
    }
}
