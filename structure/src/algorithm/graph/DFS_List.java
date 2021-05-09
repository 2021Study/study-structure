package algorithm.graph;

import java.util.ArrayList;
import java.util.Scanner;

class DfsGraph {
	private int nV;    // ������ ����
    private ArrayList<ArrayList<Integer>> dfsGraph;    // �׷���
    private boolean[] visitArr;    // ���� �湮 ���� Ȯ�� �迭
 
    // �׷��� �ʱ�ȭ ������
    public DfsGraph(int nV) {
        this.nV = nV;    // ���� ���� �ʱ�ȭ
        this.dfsGraph = new ArrayList<ArrayList<Integer>>(); // �׷��� ���� 

        for(int i=0; i<this.nV+1; i++) {
            this.dfsGraph.add(new ArrayList<Integer>());
        }
        
        // ���� �湮 ���� Ȯ�� �迭 �ʱ�ȭ
        this.visitArr = new boolean[this.nV+1];
    }
 
    // �׷��� return
    public ArrayList<ArrayList<Integer>> getGraph() {
        return this.dfsGraph;
    }
 
    // �׷����� Ư�� ��� return
    public ArrayList<Integer> getNode(int i) {
        return this.dfsGraph.get(i);
    }
 
    // �׷��� �߰� (�����)
    public void put(int x, int y) {
        this.dfsGraph.get(x).add(y);
        this.dfsGraph.get(y).add(x);
    }
 
    // �׷��� �߰� (�ܹ���)
    public void putSingle(int x, int y) {
        this.dfsGraph.get(x).add(y);
    }
    
    // �׷��� ��� (��������Ʈ)
    public void printGraphToAdjList() {
        for(int i=1; i<this.dfsGraph.size(); i++) {
            System.out.print("���� " + i + "�� ��������Ʈ");
            
            for(int j=0; j<this.dfsGraph.get(i).size(); j++) {
                System.out.print(" -> " + this.dfsGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
    
    // ���� �湮 ���� Ȯ�� �迭 �ʱ�ȭ
    public void clearVisitArr() {
        for(int i=0; i<this.visitArr.length; i++) {
            this.visitArr[i] = false;
        }
    }
    
    // �׷��� Ž�� (���ȣ��)
    public void dfs(int vIdx) {
        this.visitArr[vIdx] = true;
        System.out.print(vIdx + " "); 

        for(int i : this.dfsGraph.get(vIdx)) {

            if(this.visitArr[i] == false) {
                dfs(i);    // dfs() ���ȣ��
            }
        }
    }
 
}
    
public class DFS_List {
    public static void main(String[] args) {
        // int v = 0;    // ���� (�����Է¿� ���Ǵ� ����)
        // int e = 0;    // ���� (�����Է¿� ���Ǵ� ����)
        int nV = 0;    // ������ ����
        int nE = 0;    // ������ ����
        
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();    // ����
        nE = sc.nextInt();    // ����
        
        // �Է¹��� ������ ������ �׷��� �ʱ�ȭ
        DfsGraph dfsGraph = new DfsGraph(nV);
        
        // �׷����� ������ ���� �Է�
        // �Է¹��� ������ ������ŭ �ݺ�
        // ex) ���� 8, ���� 10
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
        
        // ������ ���� ���� �Է�
        /*for(int i=0; i<nE; i++) {
            v = sc.nextInt();
            e = sc.nextInt();
            dfsGraph.put(v, e);
        }*/
        
        sc.close();
        
        // �Է��� ������ �������� ������ ��������Ʈ ���
        dfsGraph.printGraphToAdjList();
        
        // ���� ������� �׷��� Ž��
        System.out.println();
        System.out.print("���� 1���� Ž�� : ");
        dfsGraph.dfs(1);
        
        System.out.println();
        System.out.print("���� 7���� Ž�� : ");
        dfsGraph.clearVisitArr();
        dfsGraph.dfs(7);
    }
	
}
