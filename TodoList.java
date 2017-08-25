import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList
{
    private ArrayList<TodoItem> todoItems = new ArrayList<TodoItem>();

    public void addTodoItems(TodoItem item)
    {
        todoItems.add(item);
    }

    public void listItem()
    {
        Integer index = 0;
        for(TodoItem item : this.todoItems)
        {
            System.out.println(index +". " + item.getString());
            index++;
        }
    }

    public void archiveItem()
    {
        for (Iterator<TodoItem> iterator = this.todoItems.iterator(); iterator.hasNext(); )
        {
            TodoItem item = iterator.next();
            if(item.done) iterator.remove();

        }
    }

    public void markTask(String name)
    {
        for(TodoItem item : this.todoItems)
        {
            if(item.name.equals(name))  item.markDone();
        }
    }
}
