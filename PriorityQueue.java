import java.util.*;

public class PQ {
	public static class PriorityQueue {
		Queue<Integer> queue;
		int max = Integer.MIN_VALUE;

		public PriorityQueue() {
			this.queue = new LinkedList<>();
		}

		public void add(int i) {
			this.queue.add(i);

			if (i > max) {
				max = i;
			}
		}

		public int removeMax() {
			queue.remove((Integer) max);
			int oldMax = max;
			int newMax = Integer.MIN_VALUE;

			for (int i : queue) {
				if (newMax < i) {
					newMax = i;
				}
			}

			max = newMax;

			return oldMax;
		}
	}
	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6};
		int[] B = {5,11,17,18,7,100};
		PriorityQueue pq = new PriorityQueue();
		
		for (int i : A) {
			for (int i1 = B.length-1; i1 >= 0; i1--) {
				int s = i + B[i1];

				pq.add(s);
			}
		}

		System.out.println(pq.removeMax());

	}
}
