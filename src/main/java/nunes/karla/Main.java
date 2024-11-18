package nunes.karla;

import nunes.karla.questao1.Questao1;
import nunes.karla.questao2.Questao2;
import nunes.karla.questao3.Questao3;
import nunes.karla.questao4.Questao4;
import nunes.karla.questao5.Questao5;

public class Main {
    public static void main(String[] args) {
        Questao1 questao1 = new Questao1();
        questao1.executar();

        Questao2 questao2 = new Questao2();
        questao2.executar();

        Questao3 questao3 = new Questao3();
        questao3.executar();

        Questao4 questao4 = new Questao4();
        questao4.executar();

        Questao5 questao5 = new Questao5();
        questao5.executar();
    }
}