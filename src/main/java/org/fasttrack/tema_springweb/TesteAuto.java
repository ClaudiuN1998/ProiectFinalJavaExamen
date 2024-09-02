package org.fasttrack.tema_springweb;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;



@Service

public class TesteAuto {
    private ArrayList<Intrebare> intrebari;


    public TesteAuto() {
        this.intrebari = new ArrayList<>();

        //TESTUL  1

        intrebari.add(new Intrebare(1, "Este permisă oprirea voluntară a autovehiculului în tuneluri?",
                new String[]{"A. Da", "B. Nu", "C. Doar dacă lungimea tunelului depășește 500 de metri"}, 0));
        intrebari.add(new Intrebare(2, "Ce înseamnă un semafor cu lumina roșie?",
                new String[]{"A. Oprire obligatorie", "B. Atenție", "C. Trecere permisă"}, 0));
        intrebari.add(new Intrebare(3, "Cum trebuie să semnalizezi intenția de a schimba direcția de mers?",
                new String[]{"A. Prin claxon", "B. Prin semnalizarea corespunzătoare", "C. Prin faruri"}, 1));
        intrebari.add(new Intrebare(4, "Cine are prioritate în sensul giratoriu?",
                new String[]{"A. Cel care vine din partea stângă", "B. Cel care vine cu viteză mai mare", "C. Cel care vine din partea dreaptă"}, 0));
        //4

        intrebari.add(new Intrebare(5, "Ce tendință prezintă un autoturism cu tracțiune pe spate, dacă accelerați prea puternic în curbă?",
                new String[]{"A. Autoturismul urmează, fără deviere, cursa volanului", "B. Autoturismul tinde să derapeze cu spatele spre exteriorul curbei", "C. Roțile din față se învârtesc în gol"}, 1));
        intrebari.add(new Intrebare(6, "Ce obligaţii are conducătorul de autovehicule când circulă pe un drum public?",
                new String[]{"A. Să circule numai dacă verificarea medicală lunară este efectuată", "B. Să circule numai pe sectoarele de drum pe care îi este permis accesul şi să respecte normele referitoare la masele totale maxime autorizate admise de autoritatea competentă", "C. Să se informeze din timp, la administratorii de drum, în legătură cu eventualele limite maxime şi minime de viteză"}, 1));
        intrebari.add(new Intrebare(7, "Ce se înţelege prin conducere ecologică a unui autovehicul?",
                new String[]{"A. Obligaţia de a folosi în permanenţă carburant biodegradabil", "B. Deplasări urbane cu bicicleta, pe jos sau cu alte mijloace care nu poluează atmosfera", "C. Un ansamblu de măsuri comportamentale, de control sau de verificare a vehiculului, prin care se realizează o importantă economie de energie şi protecţia mediului"}, 2));
        intrebari.add(new Intrebare(8, "În rănile cu hemoragie se va avea în vedere, în faza iniţială:",
                new String[]{"A. Pansarea rănii", "B. Curăţarea şi pansarea rănii", "C. Oprirea hemoragiei"}, 2));
        //8

        intrebari.add(new Intrebare(9, "La semnalul poliţistului situat într-o intersecţie, cu braţul ridicat vertical, aveţi obligaţia:",
                new String[]{"A. Să circulaţi cu prudenţă maximă", "B. Să opriţi, indiferent din ce direcţie circulaţi", "C. Să reduceţi viteza"}, 1));
        intrebari.add(new Intrebare(10, "Care este deosebirea dintre oprire şi staţionare?",
                new String[]{"A. Deosebirea constă în durata de imobilizare a vehiculului", "B. Deosebirea constă în modul de aşezare şi asigurare a autovehiculului pe drum", "C. Niciuna"}, 0));
        intrebari.add(new Intrebare(11, "La apropierea de staţiile prevăzute cu alveolă, când circulaţi pe banda de lângă acostament, iar conducătorul autovehiculului de transport public de persoane semnalizează pornirea din staţie:",
                new String[]{"A. Reduceţi viteza şi, la nevoie, opriţi", "B. Opriţi obligatoriu", "C. Măriți viteza"}, 0));
        intrebari.add(new Intrebare(12, "Pe o autostradă cu trei benzi, s-a blocat circulaţia. Pe unde vor circula vehiculele de intervenţie?",
                new String[]{"A. Pe banda de urgență", "B. Între banda din dreapta şi banda din mijloc", "C. Între banda din stânga şi banda din mijloc"}, 0));
        //12

        intrebari.add(new Intrebare(13, "Utilizarea sistemului de climatizare are ca efect:",
                new String[]{"A. Creșterea consumului de combustibil", "B. Scăderea puternică a gradului de confort", "C. Reducerea consumului de combustibil"}, 0));
        intrebari.add(new Intrebare(14, "Când sunteţi obligat să păstraţi o distanţă corespunzătoare faţă de cel care rulează în faţa dumneavoastră?",
                new String[]{"A. În orice situație", "B. Numai atunci când nu aveţi experienţă în conducere", "C. Numai dacă autovehiculul pe care îl conduceţi nu are frânele eficiente"}, 0));
        intrebari.add(new Intrebare(15, "Semnalul poliţistului rutier aflat într-un autovehicul al poliţiei, efectuat cu braţul, cu sau fără baston reflectorizant, scos pe partea laterală dreaptă a vehiculului, semnifică:",
                new String[]{"A. Semnalul se adresează celor care circulă din sens opus", "B. Reducerea vitezei de către cei care circulă în spatele autovehiculului poliţiei", "C. Oprire pentru conducătorii vehiculelor care circulă în spatele autovehiculului poliţiei"}, 2));
        intrebari.add(new Intrebare(16, "Copiii cu vârste de până la 12 ani pot fi transportaţi:",
                new String[]{"A. Pe bancheta din spate a autovehiculului, având fixată centura de siguranţă, adaptată greutăţii şi dimensiunilor lor", "B. Pe scaunul din faţă al autovehiculului, având fixată centura de siguranţă", "C. Pe scaunul din faţă al autovehiculului, dacă sunt ţinuţi în braţe de persoane majore"}, 0));
        //16

        intrebari.add(new Intrebare(17, "Dezinfecţia plăgilor ce necesită a fi pansate se face cu:",
                new String[]{"A. Apă oxigenată sau iod", "B. Apă potabilă", "C. Ser fiziologic"}, 0));
        intrebari.add(new Intrebare(18, "Cum procedează conducătorul de autovehicul atunci când, apropiindu-se de o trecere la nivel cu calea ferată, prevăzută cu bariere ori semibariere, cele două lumini roşii funcţionează intermitent-alternativ?",
                new String[]{"A. Continuă deplasarea, dacă barierele nu sunt coborâte", "B. Opreşte, deoarece barierele sunt închise sau urmează să coboare", "C. Continuă deplasarea fără interdicţie, deoarece luminile semnalizează doar prezenţa unei treceri la nivel cu calea ferată"}, 1));
        intrebari.add(new Intrebare(19, "Care este regula priorităţii de trecere la intersecţia a două drumuri de aceeaşi categorie, cu circulaţie nedirijată?",
                new String[]{"A. Prioritatea de dreapta", "B. Prioritatea de drum principal", "C. Prioritatea primului sosit"}, 0));
        intrebari.add(new Intrebare(20, "În faţa dvs. s-a produs un accident rutier care este cercetat de poliţie, iar circulaţia se desfăşoară anevoios, pe un singur sens. Cum veţi proceda?",
                new String[]{"A. Vă continuaţi drumul cu atenţie, respectând indicaţiile poliţistului rutier", "B. Reduceţi viteza şi opriţi în locul accidentului, pentru a vedea ce s-a întâmplat", "C. Vă continuaţi drumul cu viteză sporită, pentru a nu bloca traficul rutier"}, 0));
        //20

        intrebari.add(new Intrebare(21, "Ce obligaţii aveţi la întâlnirea indicatorului „Biciclişti”?",
                new String[]{"A. Să reduceţi viteza la maximum 30 km/h", "B. Să circulaţi cu atenţie şi, dacă este cazul, acordaţi prioritate de trecere bicicliştilor care circulă pe pista special destinată", "C. Nu aveţi nicio obligaţie, bicicliştii vă vor acorda prioritate"}, 1));
        intrebari.add(new Intrebare(22, "Care este limita maximă de viteză în localități",
                new String[]{"A. 50 km/h", "B. 60 km/h", "C. 70 km/h"}, 0));
        intrebari.add(new Intrebare(23, "În ce locuri circulaţia cu viteză duce adeseori la accidente?",
                new String[]{"A. În poligon", "B. În parcări", "C. În intersecții"}, 2));
        intrebari.add(new Intrebare(24, "Ce trebuie să facă un conducător de vehicul pentru ca depăşirea să fie considerată regulamentară?",
                new String[]{"A. Să semnalizeze din timp intenţia de schimbare a direcţiei de mers", "B. Să mărească viteza de deplasare, astfel încât să scurteze timpul de realizare a depăşirii", "C. Să se asigure că manevra poate fi executată în condiţii de siguranţă, după care să semnalizeze intenţia de schimbare a poziţiei de mers şi să efectueze depăşirea"}, 2));
        //24

        intrebari.add(new Intrebare(25, "Vă apropiaţi de o trecere la nivel cu calea ferată curentă fără bariere, în traversarea căreia s-a angajat o căruţă aflată în faţa dvs. În această situaţie puteţi efectua depăşirea?",
                new String[]{"A. Da, dacă aceasta nu a ajuns încă la linia de tren", "B. Da, întrucât căruţa este un vehicul lent", "C. Nu"}, 2));
        intrebari.add(new Intrebare(26, "Care autovehicule pot fi echipate cu lumini speciale de avertizare de culoare albastră?",
                new String[]{"A. Vehiculele aparţinând poliţiei, jandarmeriei şi poliţiei de frontieră", "B. Legea nu prevede", "C. Orice autovehicul pentru care se obţine aprobarea poliţiei rutiere"}, 0));
        //26


        Scanner scanner = new Scanner(System.in);
        int scor = 0;


        for (int i = 0; i < intrebari.size(); i++) {
            Intrebare intrebare = intrebari.get(i);
            System.out.println((i + 1) + ". " + intrebare.getEnunt());
            for (int j = 0; j < intrebare.getOptiuni().length; j++) {
                System.out.println(intrebare.getOptiuni()[j]);
            }

            System.out.print("Introdu litera răspunsului tău: ");
            char raspunsUtilizator = scanner.next().toUpperCase().charAt(0);


            int raspunsIndex = raspunsUtilizator - 'A';
            if (raspunsIndex == intrebare.getRaspunsCorect()) {
                scor++;
            }
        }



        System.out.println("Examen finalizat! Scorul tău este: " + scor + " din " + intrebari.size());
        if (scor > 22) {
            System.out.println("Felicitări! Ai trecut testul!");
        } else {
            System.out.println(" Ai picat testul! ");
        }


        //  TESTUL  2

        intrebari.add(new Intrebare(27, "Dezinfecţia plăgilor ce necesită a fi pansate se face cu:",
                new String[]{"A. Apă oxigenată sau iod", "B. Apă potabilă", "C. Ser fiziologic"}, 0));
        intrebari.add(new Intrebare(28, "Cum procedează conducătorul de autovehicul atunci când, apropiindu-se de o trecere la nivel cu calea ferată, prevăzută cu bariere ori semibariere, cele două lumini roşii funcţionează intermitent-alternativ?",
                new String[]{"A. Continuă deplasarea, dacă barierele nu sunt coborâte", "B. Opreşte, deoarece barierele sunt închise sau urmează să coboare", "C. Continuă deplasarea fără interdicţie, deoarece luminile semnalizează doar prezenţa unei treceri la nivel cu calea ferată"}, 1));
        intrebari.add(new Intrebare(29, "Care este regula priorităţii de trecere la intersecţia a două drumuri de aceeaşi categorie, cu circulaţie nedirijată?",
                new String[]{"A. Prioritatea de dreapta", "B. Prioritatea de drum principal", "C. Prioritatea primului sosit"}, 0));
        intrebari.add(new Intrebare(30, "În faţa dvs. s-a produs un accident rutier care este cercetat de poliţie, iar circulaţia se desfăşoară anevoios, pe un singur sens. Cum veţi proceda?",
                new String[]{"A. Vă continuaţi drumul cu atenţie, respectând indicaţiile poliţistului rutier", "B. Reduceţi viteza şi opriţi în locul accidentului, pentru a vedea ce s-a întâmplat", "C. Vă continuaţi drumul cu viteză sporită, pentru a nu bloca traficul rutier"}, 0));
        //30

        intrebari.add(new Intrebare(31, "Este permisă oprirea voluntară a autovehiculului în tuneluri?",
                new String[]{"A. Da", "B. Nu", "C. Doar dacă lungimea tunelului depășește 500 de metri"}, 0));
        intrebari.add(new Intrebare(32, "Ce înseamnă un semafor cu lumina roșie?",
                new String[]{"A. Oprire obligatorie", "B. Atenție", "C. Trecere permisă"}, 0));
        intrebari.add(new Intrebare(33, "Cum trebuie să semnalizezi intenția de a schimba direcția de mers?",
                new String[]{"A. Prin claxon", "B. Prin semnalizarea corespunzătoare", "C. Prin faruri"}, 1));
        intrebari.add(new Intrebare(34, "Cine are prioritate în sensul giratoriu?",
                new String[]{"A. Cel care vine din partea stângă", "B. Cel care vine cu viteză mai mare", "C. Cel care vine din partea dreaptă"}, 0));
        //34

        intrebari.add(new Intrebare(35, "Ce obligaţii aveţi la întâlnirea indicatorului „Biciclişti”?",
                new String[]{"A. Să reduceţi viteza la maximum 30 km/h", "B. Să circulaţi cu atenţie şi, dacă este cazul, acordaţi prioritate de trecere bicicliştilor care circulă pe pista special destinată", "C. Nu aveţi nicio obligaţie, bicicliştii vă vor acorda prioritate"}, 1));
        intrebari.add(new Intrebare(36, "Care este limita maximă de viteză în localități",
                new String[]{"A. 50 km/h", "B. 60 km/h", "C. 70 km/h"}, 0));
        intrebari.add(new Intrebare(37, "În ce locuri circulaţia cu viteză duce adeseori la accidente?",
                new String[]{"A. În poligon", "B. În parcări", "C. În intersecții"}, 2));
        intrebari.add(new Intrebare(38, "Ce trebuie să facă un conducător de vehicul pentru ca depăşirea să fie considerată regulamentară?",
                new String[]{"A. Să semnalizeze din timp intenţia de schimbare a direcţiei de mers", "B. Să mărească viteza de deplasare, astfel încât să scurteze timpul de realizare a depăşirii", "C. Să se asigure că manevra poate fi executată în condiţii de siguranţă, după care să semnalizeze intenţia de schimbare a poziţiei de mers şi să efectueze depăşirea"}, 2));
        //38

        intrebari.add(new Intrebare(39, "Vă apropiaţi de o trecere la nivel cu calea ferată curentă fără bariere, în traversarea căreia s-a angajat o căruţă aflată în faţa dvs. În această situaţie puteţi efectua depăşirea?",
                new String[]{"A. Da, dacă aceasta nu a ajuns încă la linia de tren", "B. Da, întrucât căruţa este un vehicul lent", "C. Nu"}, 2));
        intrebari.add(new Intrebare(40, "Care autovehicule pot fi echipate cu lumini speciale de avertizare de culoare albastră?",
                new String[]{"A. Vehiculele aparţinând poliţiei, jandarmeriei şi poliţiei de frontieră", "B. Legea nu prevede", "C. Orice autovehicul pentru care se obţine aprobarea poliţiei rutiere"}, 0));
        //40

        intrebari.add(new Intrebare(41, "Utilizarea sistemului de climatizare are ca efect:",
                new String[]{"A. Creșterea consumului de combustibil", "B. Scăderea puternică a gradului de confort", "C. Reducerea consumului de combustibil"}, 0));
        intrebari.add(new Intrebare(42, "Când sunteţi obligat să păstraţi o distanţă corespunzătoare faţă de cel care rulează în faţa dumneavoastră?",
                new String[]{"A. În orice situație", "B. Numai atunci când nu aveţi experienţă în conducere", "C. Numai dacă autovehiculul pe care îl conduceţi nu are frânele eficiente"}, 0));
        intrebari.add(new Intrebare(43, "Semnalul poliţistului rutier aflat într-un autovehicul al poliţiei, efectuat cu braţul, cu sau fără baston reflectorizant, scos pe partea laterală dreaptă a vehiculului, semnifică:",
                new String[]{"A. Semnalul se adresează celor care circulă din sens opus", "B. Reducerea vitezei de către cei care circulă în spatele autovehiculului poliţiei", "C. Oprire pentru conducătorii vehiculelor care circulă în spatele autovehiculului poliţiei"}, 2));
        intrebari.add(new Intrebare(44, "Copiii cu vârste de până la 12 ani pot fi transportaţi:",
                new String[]{"A. Pe bancheta din spate a autovehiculului, având fixată centura de siguranţă, adaptată greutăţii şi dimensiunilor lor", "B. Pe scaunul din faţă al autovehiculului, având fixată centura de siguranţă", "C. Pe scaunul din faţă al autovehiculului, dacă sunt ţinuţi în braţe de persoane majore"}, 0));
        //44

        intrebari.add(new Intrebare(45, "La semnalul poliţistului situat într-o intersecţie, cu braţul ridicat vertical, aveţi obligaţia:",
                new String[]{"A. Să circulaţi cu prudenţă maximă", "B. Să opriţi, indiferent din ce direcţie circulaţi", "C. Să reduceţi viteza"}, 1));
        intrebari.add(new Intrebare(46, "Care este deosebirea dintre oprire şi staţionare?",
                new String[]{"A. Deosebirea constă în durata de imobilizare a vehiculului", "B. Deosebirea constă în modul de aşezare şi asigurare a autovehiculului pe drum", "C. Niciuna"}, 0));
        intrebari.add(new Intrebare(47, "La apropierea de staţiile prevăzute cu alveolă, când circulaţi pe banda de lângă acostament, iar conducătorul autovehiculului de transport public de persoane semnalizează pornirea din staţie:",
                new String[]{"A. Reduceţi viteza şi, la nevoie, opriţi", "B. Opriţi obligatoriu", "C. Măriți viteza"}, 0));
        intrebari.add(new Intrebare(48, "Pe o autostradă cu trei benzi, s-a blocat circulaţia. Pe unde vor circula vehiculele de intervenţie?",
                new String[]{"A. Pe banda de urgență", "B. Între banda din dreapta şi banda din mijloc", "C. Între banda din stânga şi banda din mijloc"}, 0));
        //48

        intrebari.add(new Intrebare(49, "Ce tendință prezintă un autoturism cu tracțiune pe spate, dacă accelerați prea puternic în curbă?",
                new String[]{"A. Autoturismul urmează, fără deviere, cursa volanului", "B. Autoturismul tinde să derapeze cu spatele spre exteriorul curbei", "C. Roțile din față se învârtesc în gol"}, 1));
        intrebari.add(new Intrebare(50, "Ce obligaţii are conducătorul de autovehicule când circulă pe un drum public?",
                new String[]{"A. Să circule numai dacă verificarea medicală lunară este efectuată", "B. Să circule numai pe sectoarele de drum pe care îi este permis accesul şi să respecte normele referitoare la masele totale maxime autorizate admise de autoritatea competentă", "C. Să se informeze din timp, la administratorii de drum, în legătură cu eventualele limite maxime şi minime de viteză"}, 1));
        intrebari.add(new Intrebare(51, "Ce se înţelege prin conducere ecologică a unui autovehicul?",
                new String[]{"A. Obligaţia de a folosi în permanenţă carburant biodegradabil", "B. Deplasări urbane cu bicicleta, pe jos sau cu alte mijloace care nu poluează atmosfera", "C. Un ansamblu de măsuri comportamentale, de control sau de verificare a vehiculului, prin care se realizează o importantă economie de energie şi protecţia mediului"}, 2));
        intrebari.add(new Intrebare(52, "În rănile cu hemoragie se va avea în vedere, în faza iniţială:",
                new String[]{"A. Pansarea rănii", "B. Curăţarea şi pansarea rănii", "C. Oprirea hemoragiei"}, 2));
        //52

        Scanner scanner2 = new Scanner(System.in);
        int scor2 = 0;


        for (int i2 = 26; i2 < intrebari.size(); i2++) {
            Intrebare intrebare = intrebari.get(i2);
            System.out.println((i2 + 1) + ". " + intrebare.getEnunt());
            for (int j2 = 0; j2 < intrebare.getOptiuni().length; j2++) {
                System.out.println(intrebare.getOptiuni()[j2]);
            }

            System.out.print("Introdu litera răspunsului tău: ");
            char raspunsUtilizator2 = scanner2.next().toUpperCase().charAt(0);


            int raspunsIndex2 = raspunsUtilizator2 - 'A';
            if (raspunsIndex2 == intrebare.getRaspunsCorect()) {
                scor2++;
            }
        }



        System.out.println("Examen finalizat! Scorul tău este: " + scor2 + " din 26");
        if (scor2 > 22) {
            System.out.println("Felicitări! Ai trecut testul!");
        } else {
            System.out.println(" Ai picat testul! ");
        }

    }

    public ArrayList<Intrebare> getAll() {
        return intrebari;
    }



    public Optional<Intrebare> getById(long id){
        return intrebari.stream()
                .filter(intrebari -> intrebari.getId() == id)
                .findFirst();

        }

    public Intrebare delete(long id) {
        Optional<Intrebare> intrebareToBeDeleted = getById(id);
        if (intrebareToBeDeleted.isEmpty()) {
            throw new RuntimeException();
        }
        intrebari.remove(intrebareToBeDeleted.get());
        return null;
    }

    public boolean verificaRaspuns(int idIntrebare, int raspuns) {
        Optional<Intrebare> intrebareOptional = intrebari.stream()
                .filter(intrebare -> intrebare.getId() == idIntrebare)
                .findFirst();

        if (intrebareOptional.isPresent()) {
            Intrebare intrebare = intrebareOptional.get();
            return intrebare.getRaspunsCorect() == raspuns;
        }

        return false;
}
}



