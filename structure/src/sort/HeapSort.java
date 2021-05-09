package sort;

public class HeapSort {
	 
	public static void sort(int[] a) {
		sort(a, a.length);
	}
	
	private static void sort(int[] a, int size) {
		
		/*
		 * left child node = index * 2 + 1
		 * right child node = index * 2 + 2
		 * parent node = (index - 1) / 2
		 */
		
		// ���� ������ ����� �θ� �ε��� 
		int parentIdx = getParent(size - 1);
		
		// max heap
		for(int i = parentIdx; i >= 0; i--) {
			heapify(a, i, size - 1);
		}
 
		
		for(int i = size - 1; i > 0; i--) {
			
			/*
			 *  root�� 0��° �ε����� i��° �ε����� ���� ��ȯ���� ��
			 *  0 ~ (i-1) ������ �κ�Ʈ���� ���� max heap�� �����ϵ���
			 *  �籸���Ѵ�.
			 */
			swap(a, 0, i);
			heapify(a, 0, i - 1);
		}
		
	}
	
	
	// �θ� �ε����� ��� �Լ�
	private static int getParent(int child) {
	    return (child - 1) / 2;
	}
 
	// �� �ε����� ���Ҹ� ��ȯ�ϴ� �Լ�
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// ���� �籸�� �ϴ� �Լ�
	private static void heapify(int[] a, int parentIdx, int lastIdx) {
		
		/*
		 * ���� Ʈ������ �θ� ����� �ڽĳ�� �ε����� ���� �����ش�.
		 * ���� �θ� �ε����� ���� ū ���� �����ִٰ� �����Ѵ�.
		 */
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		int largestIdx = parentIdx;
		
		/*
		 *  left child node�� ��
		 *  
		 *  �ڽĳ�� �ε����� Ʈ���� ũ�⸦ �Ѿ�� �����鼭
		 *  ���� ���� ū �ε������� ���� �ڽĳ���� ���� �� Ŭ���
		 *  ���� ū �ε����� ����Ű�� largestIdx�� ���� �ڽĳ���ε����� �ٲ��ش�.
		 *  
		 */
		if(leftChildIdx <= lastIdx && a[largestIdx] < a[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		/*
		 *  left right node�� ��
		 *  
		 *  �ڽĳ�� �ε����� Ʈ���� ũ�⸦ �Ѿ�� �����鼭
		 *  ���� ���� ū �ε������� �������� �ڽĳ���� ���� �� Ŭ���
		 *  ���� ū �ε����� ����Ű�� largestIdx�� ������ �ڽĳ���ε����� �ٲ��ش�.
		 *  
		 */
		if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		/*
		 * largestIdx �� �θ��尡 ���� �ʴٴ� ����
		 * �� �ڽĳ�� �� �������� ���� �θ��庸�� ū ��尡 �����Ѵٴ� ���̴�.
		 * �׷� ��� �ش� �ڽ� ���� �θ��带 ��ȯ���ְ�,
		 * ��ȯ �� �ڽĳ�带 �θ���� ���� ����Ʈ���� �˻��ϵ��� ��� ȣ�� �Ѵ�.
		 */
		if(parentIdx != largestIdx) {
			swap(a, largestIdx, parentIdx);
			heapify(a, largestIdx, lastIdx);
		}
	}
}