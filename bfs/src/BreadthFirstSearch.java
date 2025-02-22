import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BreadthFirstSearch {
    HashMap<String, String[]> table = new HashMap<>();

    public BreadthFirstSearch(){
        table.put("A", new String[]{"B", "C"});
        table.put("B", new String[]{"D", "E", "F"});
        table.put("C", new String[]{"G"});
        table.put("D", new String[]{});
        table.put("E", new String[]{});
        table.put("F", new String[]{"H"});
        table.put("G", new String[]{"I"});
        table.put("H", new String[]{});
        table.put("I", new String[]{});
    }

    public void bfs(String start){
        Queue queue = new Queue(10);
        List<String> visited = new ArrayList<>();
        queue.Enqueue(start);
        visited.add(start);

        while(!queue.checkIfEmpty()){
            String node = queue.Dequeue();
            System.out.print(node + " ");

            for (String neighbor : table.getOrDefault(node, new String[]{})) {
                if (!visited.contains(neighbor)) {
                    queue.Enqueue(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
