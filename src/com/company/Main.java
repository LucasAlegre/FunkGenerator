package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *   Funk Generator and Earley Parser
 *   By Lucas Alegre, Guilherme Haetinger and Catarina Nogueira
 *   GitHub repository : https://github.com/LucasAlegre/FunkGenerator
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        EarleyParser e = new EarleyParser();
        Grammar g = new Grammar("funkteste.txt");
        e.setGrammar(g);

        System.out.print(e.generateRandom(10));
    }

}
