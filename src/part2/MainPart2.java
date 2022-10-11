package part2;

public class MainPart2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ProcessPart2 processPart2 = new ProcessPart2("" + (i+1));
            processPart2.run();
        }
    }
}
