import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int ege = 17;
        if (ege >= 18) {
            System.out.println("Если возраст человека равен " + ege + "лет тоЧеловеку 18 или больше лет.");
        } else {
            System.out.println("Если возраст человека равен " + ege + "лет возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }

        int temperatura = 4;
        if (temperatura < 5) {
            System.out.println("На улице " + temperatura + "градусов холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperatura + "градусов холодно, можно идти без шапки.");
        }

        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость больше " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость больше " + speed + ", можно ездить спокойно.");
        }
        int egePeple = 70;
        if (egePeple < 2) {
            System.out.println("Если возраст человека " + egePeple + ", то ему пора спать.");
        }
        if (egePeple >= 2 && egePeple < 6) {
            System.out.println("Если возраст человека " + egePeple + ", то ему нужно ходить в детский сад.");
        }
        if (egePeple >= 7 && egePeple < 18) {
            System.out.println("Если возраст человека " + egePeple + ", то ему нужно ходить в школу.");
        }
        if (egePeple >= 18 && egePeple <= 24) {
            System.out.println("Если возраст человека " + egePeple + ", то его место в университете.");
        }
        if (egePeple > 24) {
            System.out.println("Если возраст человека " + egePeple + ", то ему пора ходить на работу.");
        }
        if (egePeple > 60) {
            System.out.println("Если возраст человека " + egePeple + ", то ему можно отдохнуть.");
        }

        int egeBaby = 7;
        if (egeBaby < 5) {
            System.out.println("Если ребенку " + egeBaby + "лет, то он не может кататься на атракционе");
        }
        if (egeBaby >= 5 && egeBaby < 14) {
            System.out.println("Если ребенку " + egeBaby + "лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (egeBaby > 14) {
            System.out.println("Если ребенок старше " + egeBaby + "лет, то он может кататься без сопровождения взрослого.");
        }

    }
}