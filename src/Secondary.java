import java.util.Random;

public class Secondary {

    public static void main(String[] args) throws InterruptedException {
        Povo geziel = new Povo();
            geziel.nome = "Geziel"; geziel.numero = 0; geziel.temGrupo = false;

        Povo iran = new Povo();
            iran.nome = "Iran"; geziel.numero = 1; iran.temGrupo = false;

        Povo felipe = new Povo();
            felipe.nome = "Felipe"; felipe.numero = 2; felipe.temGrupo = false;

        Povo tiquin = new Povo();
            tiquin.nome = "Tiquin"; tiquin.numero = 3; tiquin.temGrupo = false;

        Povo vitor = new Povo();
            vitor.nome = "Vitor"; vitor.numero = 4; vitor.temGrupo = false;
            
        Povo henrique = new Povo();
            henrique.nome = "Henrique"; henrique.numero = 5; henrique.temGrupo = false;

        String[] grupoA = {"", "", "", "E so"};
        String[] grupoB = {"", "", "", "E so"};
        int restantes = 0;
        
        while (restantes != 3) {
            int aleatorio = new Random().nextInt(6);
            if (aleatorio == geziel.getNumero()) {
                if (geziel.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = geziel.getNome();
                    geziel.setTemGrupo(true);
                    restantes++;
                }
            } else if (aleatorio == iran.getNumero()) {
                if (iran.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = iran.getNome();
                    iran.setTemGrupo(true);
                    restantes++;
                }
            } else if (aleatorio == felipe.getNumero()) {
                if (felipe.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = felipe.getNome();
                    felipe.setTemGrupo(true);
                    restantes++;
                }
            } else if (aleatorio == tiquin.getNumero()) {
                if (tiquin.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = tiquin.getNome();
                    tiquin.setTemGrupo(true);
                    restantes++;
                }
            } else if (aleatorio == vitor.getNumero()) {
                if (vitor.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = vitor.getNome();
                    vitor.setTemGrupo(true);
                    restantes++;
                }
            } else if (aleatorio == henrique.getNumero()) {
                if (henrique.getTemGrupo() == true) {
                } else {
                    grupoA[restantes] = henrique.getNome();
                    henrique.setTemGrupo(true);
                    restantes++;
                }
            }
            
        }
        System.out.print("Randomizando");
        Thread.sleep(700);
        System.out.print(".");
        Thread.sleep(700);
        System.out.print(".");
        Thread.sleep(700);
        System.out.print(".");
        Thread.sleep(700);
        System.out.println("Pronto!");
        Thread.sleep(600);
        System.out.println("Grupo A: ");
        System.out.println(grupoA[0]);
        System.out.println(grupoA[1]);
        System.out.println(grupoA[2]);

        restantes = 0;
        while (restantes != 3) {
            if (geziel.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = geziel.getNome();
                geziel.setTemGrupo(true);
                restantes++;
            }
            if (iran.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = iran.getNome();
                iran.setTemGrupo(true);
                restantes++;
            }
            if (felipe.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = felipe.getNome();
                felipe.setTemGrupo(true);
                restantes++;
            }
            if (tiquin.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = tiquin.getNome();
                tiquin.setTemGrupo(true);
                restantes++;
            }
            if (vitor.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = vitor.getNome();
                vitor.setTemGrupo(true);
                restantes++;
            }
            if (henrique.getTemGrupo() == true) {
            } else {
                grupoB[restantes] = henrique.getNome();
                henrique.setTemGrupo(true);
                restantes++;
            }
        } 
        
        System.out.println("\n");
        System.out.println("Grupo B: ");
        System.out.println(grupoB[0]);
        System.out.println(grupoB[1]);
        System.out.println(grupoB[2]);
    }

}
