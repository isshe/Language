import java.util.ArrayList;

/**
 * Created by isshe on 2017/3/25.
 */
public class NoteBook {
    private ArrayList<String> notes = new ArrayList<>();

    public boolean add(String str)
    {
        return notes.add(str);
    }

    public int getSize()
    {
        return notes.size();
    }

    public String[] list()
    {
        String[] a = new String[notes.size()];
        notes.toArray(a);
        return a;
    }

    public void remove(int index)
    {
        notes.remove(index);
    }

    public static void main(String[] args)
    {
        NoteBook nb = new NoteBook();
        nb.add("hello");
        System.out.println(nb.getSize());

        nb.add("world");
        System.out.println(nb.getSize());

        String[] li = nb.list();
        for (String str: li) {
            System.out.println(str);
        }

        nb.remove(0);

        li = nb.list();
        for (String str : li){
            System.out.println(str);
        }
    }

}
