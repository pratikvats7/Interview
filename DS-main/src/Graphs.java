import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Graphs {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    static class Pair{
        int v;
        String psf;
        Pair(int v, String psf){
            this.v=v;
            this.psf=psf;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        // write your code here
        boolean[] visited = new boolean[vtces];
        // System.out.println(haspaths(graph,visited,src,dest));
        //findAllPaths(graph, visited, src, dest,src+"");
        //findAllPathsbyWeight(graph, visited, src, dest,src+"",0);

        //getConnectedComponents(graph, visited, src,"");

        //getConnectedComponents2(graph, visited, src,"");
        ArrayDeque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(src,src+""));
       // BFS(graph,src,queue,visited);
        isGraphCyclic(graph,src,queue,visited);

    }

    private static boolean isGraphCyclic(ArrayList<Edge>[] graph, int src, ArrayDeque<Pair> queue, boolean[] visited) {

        while (queue.size() > 0)
        {
            Pair rem = queue.removeFirst();
            if (visited[rem.v] == true) {
                continue;
            }
            visited[rem.v] = true;
            System.out.println(rem.v+"@"+rem.psf);

            for(Edge e:graph[rem.v]){
                if(visited[e.nbr]==false){
                    queue.add(new Pair(e.nbr,rem.psf+e.nbr));
                }
            }
        }
        return true;
    }

    private static void BFS(ArrayList<Edge>[] graph, int src, ArrayDeque<Pair> queue, boolean[] visited) {
        //r m* w a
        while (queue.size() > 0)
        {
            Pair rem = queue.removeFirst();
            if (visited[rem.v] == true) {
                continue;
            }
            visited[rem.v] = true;
            System.out.println(rem.v+"@"+rem.psf);

            for(Edge e:graph[rem.v]){
                if(visited[e.nbr]==false){
                    queue.add(new Pair(e.nbr,rem.psf+e.nbr));
                }
            }
    }
    }

    private static void getConnectedComponents2(ArrayList<Edge>[] graph, boolean[] visited, int src, String asf) {

        ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
        for(int i =0;i<graph.length;i++) {
            ArrayList<Integer> comp = new ArrayList<>();
                if (visited[i] == false) {
                    visited[i]=true;
                    drawgraph(graph,visited,comp,i);
                    comps.add(comp);
                }
        }
        System.out.println(comps);
    }

    private static void drawgraph(ArrayList<Edge>[] graph, boolean[] visited, ArrayList<Integer> comp, int src) {

        visited[src]=true;
        comp.add(src);
        for(Edge e :graph[src]){
            if(visited[e.nbr]==false){
                drawgraph(graph,visited,comp,e.nbr);
            }
        }

    }

    private static void getConnectedComponents(ArrayList<Edge>[] graph, boolean[] visited, int src, String asf) {
        for(int i =0;i<graph.length;i++) {
             asf = i+"";
            visited[i]=true;
            for (Edge edge : graph[i]) {
                if (visited[edge.nbr] == false) {
                    asf = asf + edge.nbr;
                    visited[edge.nbr] = true;
                }
            }
            if(asf.length()>1)
                System.out.println(asf);
        }
    }


    private static void findAllPathsbyWeight(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest,String asf,int ssf) {

        if (src == dest) {
            System.out.println(asf);
            System.out.println(ssf);
            return ;
        }
        visited[src] = true;
        for (Edge edge : graph[src]) {
            if (visited[edge.nbr] == false) {
                findAllPathsbyWeight(graph, visited, edge.nbr, dest,asf+edge.nbr,ssf+edge.wt);
            }
        }
        visited[src] = false;
        return ;
    }

    private static void findAllPaths(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest,String asf) {

        if (src == dest) {
            System.out.println(asf);
            return ;
        }
        visited[src] = true;
        for (Edge edge : graph[src]) {
            if (visited[edge.nbr] == false) {
                findAllPaths(graph, visited, edge.nbr, dest,asf+edge.nbr);
            }
        }
        visited[src] = false;
        return ;
    }

    private static boolean haspaths(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        boolean haspath = false;
        for (Edge edge : graph[src]) {
            if (visited[edge.nbr] == false) {
                haspath = haspaths(graph, visited, edge.nbr, dest);
                if (haspath == true) {
                    return haspath;
                }
            }
        }
        return  haspath;
    }
}
