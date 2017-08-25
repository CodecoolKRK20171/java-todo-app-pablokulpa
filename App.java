
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{

    private static Scanner in = new Scanner(System.in);
    private static final List<String> options = Arrays.asList("list", "add", "mark", "archive", "exit");


    public static void main(String[] args)
  {
      TodoList todolist = new TodoList();
      String option;

      while(true)
      {
          option = getOption();
          while(!options.contains(option)) option = getOption();

          if(option.equals("exit")) System.exit(0);
          if(option.equals("list")) todolist.listItem();
          if(option.equals("add"))
          {
              System.out.println("Write task name: ");
              String name = in.nextLine();
              TodoItem item = new TodoItem(name);
              todolist.addTodoItems(item);
          }
          if(option.equals("mark"))
          {
              System.out.println("Write task name: ");
              String name = in.nextLine();
              todolist.markTask(name);
          }

          if(option.equals("archive")) todolist.archiveItem();
      }


  }


  private static String getOption() {

    System.out.print("Please specify a command [list, add, mark, archive, exit]: ");

    return in.nextLine();
}
}
