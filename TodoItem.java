/**
 * Class representing a single todo item.
 *
 */
public class TodoItem
{
    public String name;
    public boolean done;

    public TodoItem(String name)
    {
        this.name = name;
        this.done = false;
    }

    public void markDone()
    {
        this.done = true;
    }

    public String getString()
    {
        if(this.done) return "[x] " + this.name;
        else return "[ ] " + this.name;
    }

}
