package algorithm.graph;

import java.util.ArrayList;
import java.util.Scanner;

class DfsGraph {
	private int nV;    // 정점의 개수
    private ArrayList<ArrayList<Integer>> dfsGraph;    // 그래프
    private boolean[] visitArr;    // 정점 방문 여부 확인 배열
 
    // 그래프 초기화 생성자
    public DfsGraph(int nV) {
        this.nV = nV;    // 정점 개수 초기화
        this.dfsGraph = new ArrayList<ArrayList<Integer>>(); // 그래프 생성 

        for(int i=0; i<this.nV+1; i++) {
            this.dfsGraph.add(new ArrayList<Integer>());
        }
        
        // 정점 방문 여부 확인 배열 초기화
        this.visitArr = new boolean[this.nV+1];
    }
 
    // 그래프 return
    public ArrayList<ArrayList<Integer>> getGraph() {
        return this.dfsGraph;
    }
 
    // 그래프의 특정 노드 return
    public ArrayList<Integer> getNode(int i) {
        return this.dfsGraph.get(i);
    }
 
    // 그래프 추가 (양방향)
    public void put(int x, int y) {
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);
    }
 
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y) {
        this.dfsGraph.get(x).add(y);
    }
    
    // 그래프 출력 (인접리스트)
    public void printGraphToAdjList() {
        for(int i=1; i<this.dfsGraph.size(); i++) {
            System.out.print("정점 " + i + "의 인접리스트");
            
            for(int j=0; j<this.dfsGraph.get(i).size(); j++) {
                System.out.print(" -> " + this.dfsGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    // 정점 방문 여부 확인 배열 초기화
    public void clearVisitArr() {
        for(int i=0; i<this.visitArr.length; i++) {
            this.visitArr[i] = false;
        }
    }
    
    // 그래프 탐색 (재귀호출)
    public void dfs(int vIdx) {
        this.visitArr[vIdx] = true;
        System.out.print(vIdx + " "); 

        for(int i : this.dfsGraph.get(vIdx)) {

            if(this.visitArr[i] == false) {
                dfs(i);    // dfs() 재귀호출
            }
        }
    }
 
}
    
public class DFS_List {
    public static void main(String[] args) {
        // int v = 0;    // 정점 (수동입력에 사용되는 변수)
        // int e = 0;    // 간선 (수동입력에 사용되는 변수)
        int nV = 0;    // 정점의 개수
        int nE = 0;    // 간선의 개수
        
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();    // 정점
        nE = sc.nextInt();    // 간선
        
        // 입력받은 정점의 개수로 그래프 초기화
        DfsGraph dfsGraph = new DfsGraph(nV);
        
        // 그래프에 정점과 간선 입력
        // 입력받은 간선의 개수만큼 반복
        // ex) 정점 8, 간선 10
        dfsGraph.put(1, 2);
        dfsGraph.put(1, 3);
        dfsGraph.put(2, 4);
        dfsGraph.put(2, 5);
        dfsGraph.put(3, 6);
        dfsGraph.put(3, 7);
        dfsGraph.put(4, 8);
        dfsGraph.put(5, 8);
        dfsGraph.put(6, 8);
        dfsGraph.put(7, 8);
        
        // 정점과 간선 수동 입력
        /*for(int i=0; i<nE; i++) {
            v = sc.nextInt();
            e = sc.nextInt();
            dfsGraph.put(v, e);
        }*/
        
        sc.close();
        
        // 입력한 정점과 간선으로 구성된 인접리스트 출력
        dfsGraph.printGraphToAdjList();
        
        // 정점 순서대로 그래프 탐색
        System.out.println();
        System.out.print("정점 1부터 탐색 : ");
        dfsGraph.dfs(1);
        
        System.out.println();
        System.out.print("정점 7부터 탐색 : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(7);
    }
	
}
