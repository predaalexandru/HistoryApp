package com.example.historyapp;

/**
 * Created by Alex on 03.03.2018.
 */

public class Questions {

    public String mQuestions[] = {
            "Cum se numește operațiunea prin care Germania nazistă a atacat Uniunea Sovietică?",
            "Cine a fost conducătorul Germaniei în perioada 1933-1945?",
            "În 23 august 1944 România a întors armele împotriva...?",
            "În ce perioadă a avut loc 'Blocada Leningradului'?",
            "La ce dată au intrat SUA oficial în Cel De-al Doilea Război Mondial?",
            "În ce an a avut loc Unirea Principatelor Române?",
            "În ce an a fost numit Nicolae Ceauşescu în funcţia de preşedinte al României?",
            "În ce an a avut loc Revoluţia lui Tudor Vladimirescu?",
            "În ce an a intrat România în Primul Război Mondial?",
            "Când s-a proclamat Independența de stat a României?",
            "La ce dată a fost semnat pactul Ribbentrop-Molotov?",
            "La ce dată s-a sinucis Adolf Hitler în buncărul din Berlin?",
            "Când au fost uciși soții Ceaușescu?"


    };

    public String mChoiches[][ ] = {
            {"Leul de Mare", "Blocada", "Barbarossa", "Market Garden"},
            {"Adolf Hitler", "Ion Antonescu", "Alfred Adler", "Wilhelm Keitel"},
            {"Ungariei", "Italiei", "Angliei", "Germaniei"},
            {"1939-1941", "1941-1944", "1941-1942", "1940-1942"},
            {"7 martie 1940", "28 iulie 1939", "20 ianuarie 1940", "7 decembrie 1941"},
            {"1864", "1859", "1870", "1865"},
            {"1965", "1974", "1970", "1955"},
            {"1848", "1818", "1825", "1821"},
            {"1914", "1916", "1919", "1917"},
            {"9 mai 1877", "1 decembrie 1918", "7 mai 1886", "15 octombrie 1913"},
            {"1 septembrie 1939", "23 august 1939", "10 iulie 1938", "1 ianuarie 1933"},
            {"30 aprilie 1945", "7 mai 1945", "14 februarie 1945", "24 aprilie 1945"},
            {"16 decembrie 1989", "21 decembrie 1989", "24 decembrie 1988", "25 decembrie 1989"}

    };

    private String mCorrectAnswers[] = {"Barbarossa", "Adolf Hitler", "Germaniei", "1941-1944", "7 decembrie 1941",
                                        "1859", "1965", "1821", "1916", "9 mai 1877",
                                        "23 august 1939", "30 aprilie 1945", "25 decembrie 1989"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoiche1(int a) {
        String choice = mChoiches[a][0];
        return choice;
    }

    public String getChoiche2(int a) {
        String choice = mChoiches[a][1];
        return choice;
    }

    public String getChoiche3(int a) {
        String choice = mChoiches[a][2];
        return choice;
    }

    public String getChoiche4(int a) {
        String choice = mChoiches[a][3];
        return choice;
    }



    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
