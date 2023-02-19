# JCommander
JCommander is a very small Java framework that makes it trivial to parse command line parameters. You annotate fields with descriptions of your options:

```
import com.beust.jcommander.Parameter;

public class Args {
  @Parameter
  private List<String> parameters = new ArrayList<>();

  @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
  private Integer verbose = 1;

  @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
  private String groups;

  @Parameter(names = "-debug", description = "Debug mode")
  private boolean debug = false;
}

```



```
class Main {
    @Parameter(names={"--length", "-l"})
    int length;
    @Parameter(names={"--pattern", "-p"})
    int pattern;

    public static void main(String ... argv) {
        Main main = new Main();
        JCommander.newBuilder()
            .addObject(main)
            .build()
            .parse(argv);
        main.run();
    }

    public void run() {
        System.out.printf("%d %d", length, pattern);
    }
}

```



## Links
[Jcommander](https://jcommander.org/)
