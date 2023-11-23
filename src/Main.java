import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Povo geziel = new Povo();
        geziel.nome = "Geziel"; geziel.numero = 0;
        Povo iran = new Povo();
        iran.nome = "Iran"; geziel.numero = 1;
        Povo felipe = new Povo();
        felipe.nome = "Felipe"; felipe.numero = 2;
        Povo tiquin = new Povo();
        tiquin.nome = "Tiquin"; tiquin.numero = 3;
        Povo vitor = new Povo();
        vitor.nome = "Vitor"; vitor.numero = 4;
        Povo henrique = new Povo();
        henrique.nome = "Henrique"; henrique.numero = 5;

        String[] grupoA = {"", "", "", "E so"};
        String[] grupoB = {"", "", "", "E so"};
        int restantes = 0;
        
        while (restantes != 3) {
            int aleatorio = new Random().nextInt(6);
            if (aleatorio == geziel.getNumero()) {
                if (grupoA[0].equals(geziel.getNome())) {
                } else if (grupoA[1].equals(geziel.getNome())) {
                } else if (grupoA[2].equals(geziel.getNome())) {
                } else {
                    grupoA[restantes] = geziel.getNome();
                    restantes++;
                }
            } else if (aleatorio == iran.getNumero()) {
                if (grupoA[0].equals(iran.getNome())) {
                } else if (grupoA[1].equals(iran.getNome())) {
                } else if (grupoA[2].equals(iran.getNome())) {
                } else {
                    grupoA[restantes] = iran.getNome();
                    restantes++;
                }
            } else if (aleatorio == felipe.getNumero()) {
                if (grupoA[0].equals(felipe.getNome())) {
                } else if (grupoA[1].equals(felipe.getNome())) {
                } else if (grupoA[2].equals(felipe.getNome())) {
                } else {
                    grupoA[restantes] = felipe.getNome();
                    restantes++;
                }
            } else if (aleatorio == tiquin.getNumero()) {
                if (grupoA[0].equals(tiquin.getNome())) {
                } else if (grupoA[1].equals(tiquin.getNome())) {
                } else if (grupoA[2].equals(tiquin.getNome())) {
                } else {
                    grupoA[restantes] = tiquin.getNome();
                    restantes++;
                }
            } else if (aleatorio == vitor.getNumero()) {
                if (grupoA[0].equals(vitor.getNome())) {
                } else if (grupoA[1].equals(vitor.getNome())) {
                } else if (grupoA[2].equals(vitor.getNome())) {
                } else {
                    grupoA[restantes] = vitor.getNome();
                    restantes++;
                }
            } else if (aleatorio == henrique.getNumero()) {
                if (grupoA[0].equals(henrique.getNome())) {
                } else if (grupoA[1].equals(henrique.getNome())) {
                } else if (grupoA[2].equals(henrique.getNome())) {
                } else {
                    grupoA[restantes] = henrique.getNome();
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
            if (grupoA[0].equals("Geziel")) {
            }   else if (grupoA[1].equals("Geziel")) {
            }   else if (grupoA[2].equals("Geziel")) {
            }   else {grupoB[restantes] = "Geziel";
                restantes++;}
            if (grupoA[0].equals("Iran")) {
            }   else if (grupoA[1].equals("Iran")) {
            }   else if (grupoA[2].equals("Iran")) {
            }   else {grupoB[restantes] = "Iran";
                restantes++;}
            if (grupoA[0].equals("Felipe")) {
            }   else if (grupoA[1].equals("Felipe")) {
            }   else if (grupoA[2].equals("Felipe")) {
            }   else {grupoB[restantes] = "Felipe";
                restantes++;}
            if (grupoA[0].equals("Tiquin")) {
            }   else if (grupoA[1].equals("Tiquin")) {
            }   else if (grupoA[2].equals("Tiquin")) {
            }   else {grupoB[restantes] = "Tiquin";
                restantes++;}
            if (grupoA[0].equals("Vitor")) {
            }   else if (grupoA[1].equals("Vitor")) {
            }   else if (grupoA[2].equals("Vitor")) {
            }   else {grupoB[restantes] = "Vitor";
                restantes++;}
            if (grupoA[0].equals("Henrique")) {
            }   else if (grupoA[1].equals("Henrique")) {
            }   else if (grupoA[2].equals("Henrique")) {
            }   else {grupoB[restantes] = "Henrique";
                restantes++;}
        } 
        
        System.out.println("\n");
        System.out.println("Grupo B: ");
        System.out.println(grupoB[0]);
        System.out.println(grupoB[1]);
        System.out.println(grupoB[2]);
    }

}
