
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<ArrayList> listClass = ArrayList.class;
        ArrayList list = listClass.newInstance();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        Class[] params = {Collection.class};
        ArrayList list2 = listClass.getConstructor(params).newInstance(list);
        System.out.println(list2);
        System.out.println(list2 == list);
        System.out.println(list.equals(list2));

        List list3 = new ArrayList(list);
    }
}