package mesh;

import java.util.HashSet;
import java.util.Set;


public class Written {

    public boolean constantMes;

    public void addWritText (String out) {
        writtenArray.add(out);

    }

    public void constantWritten (String text){
        constantMes = writtenArray.contains(text);
    }

    Set<String> writtenArray = new HashSet<String>();
}
