package part1;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ProcessPart1 {
    private final ProcessBuilder processCreator;

    public ProcessPart1(String url){
        this.processCreator = new ProcessBuilder(
                "cmd.exe",
                "/c",
                "start www.google.com"
        );
    }

    public ProcessBuilder getProcessCreator(){
        return processCreator;
    }

    public  void  run(int times){
      ArrayList<ProcessHandle> childrenProcess = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            try {
                stopMainProcessUntilChildIsDead(
                        this.processCreator.start(),
                        childrenProcess
                        );
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        childrenProcess.stream().forEach(child->{
            boolean flag = true;
            while (flag){
                if (!child.isAlive()){
                    System.exit(1);
                }
                System.out.println("estoy vivo");
            }
        });
    }

    private void stopMainProcessUntilChildIsDead(Process current, List<ProcessHandle> list){
        try {
            current.waitFor();
            current.descendants().forEach(child->{
                child.children().forEach(child2->{
                    if (child2.isAlive()){
                        list.add(child2);
                    }
                });
            });

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
