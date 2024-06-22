package vaibhav.dsa.heap;


public class MinHeap {
    int size;
    int capacity;
    int arr[];

    MinHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    void insert(int x) {
        if (size == capacity) return;
        arr[size] = x;
        size++;
        int i = size - 1;
        while (i > 0 && arr[i] < arr[parent(i)]) {
            arr[i] = arr[i] + arr[parent(i)] - (arr[parent(i)] = arr[i]);
            i = parent(i);
        }
    }

    // only one possible violation present at root node
    void minHeapify(int i) {
        int left = left(i);
        int right = right(i);
        int smallest = i;

        if (left < size && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if (right < size && arr[right] < arr[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            arr[i] = arr[i] + arr[smallest] - (arr[smallest] = arr[i]);
            minHeapify(smallest);
        }
    }

    int extractMin() {
        if (size == 0) return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }
        arr[0] = arr[0] + arr[size - 1] - (arr[size - 1] = arr[0]);
        size--;
        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            arr[i] = arr[i] + arr[parent(i)] - (arr[i] = arr[parent(i)]);
            i = parent(i);
        }
    }

    void deleteKey(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();

    }

    void buildHeap() {
        // parent of last node is the bottommost last internal node
        for (int i = (size - 1 - 1) / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int parent(int i) {
        return (i - 1) / 2;
    }
}
