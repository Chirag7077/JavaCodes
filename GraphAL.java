import java.util.*;
import java.io.*;

class GraphAL{
	protected Map<Integer,List<Integer>> adjacencyList;

	public GraphAL(int no_of_vertices){
		adjacencyList = new HashMap<Integer,List<Integer>>();
		for(int i=1;i<=no_of_vertices;i++){
			adjacencyList.put(i,new LinkedList<Integer>());
		}
	}

	public void setEdge(int source, int destination){
		if(source > adjacencyList.size() || destination > adjacencyList.size()){
			System.out.println("The entered vertex does not exist.");
			return;
		}
		List<Integer> source_list = adjacencyList.get(source);
		source_list.add(destination);
		List<Integer> dest_list = adjacencyList.get(destination);
		dest_list.add(source);
	}

	public List<Integer> getEdge(int source){
		if(source > adjacencyList.size()){
			System.out.println("The entered vertex does not exist.");
			return null;
		}
		return adjacencyList.get(source);
	}

	public static void main(String[] args){
		int source,destination;
		int no_of_vertices,no_of_edges;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Enter the number of vertices: ");
			no_of_vertices = sc.nextInt();
			System.out.print("Enter the number of edges: ");
			no_of_edges = sc.nextInt();

			GraphAL adjacencyListObject = new GraphAL(no_of_vertices);

			System.out.println("Enter the edges in graph format: <Source Index> <Destination Index>: ");
			while(count <= no_of_edges){
				source = sc.nextInt();
				destination = sc.nextInt();
				adjacencyListObject.setEdge(source,destination);
				count++;
			}

			System.out.println("The Adjacency List is as shown : ");
			for(int i=1;i<=no_of_vertices;i++){
            	System.out.print(i+"->");
            	List<Integer> edgeList = adjacencyListObject.getEdge(i);
            	for(int j = 1; ;j++){
            		if(j != edgeList.size()){
            			System.out.print(edgeList.get(j-1)+"->");
            		}else{
            			System.out.print(edgeList.get(j-1));
            			break;
            		}
            	}
            	System.out.println();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}