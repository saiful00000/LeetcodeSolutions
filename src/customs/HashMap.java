package customs;

public class HashMap {

    public HashMap() {

    }

    int[] array = new int[10000];

    public void put(int key, int value) {
        if (value == 0) {
            value = -1;
        }
        array[key] = value;
    }

    public int get(int key) {
        if (array[key] == 0) {
            return -1;
        }
        if (array[key] == -1) {
            return 0;
        }
        return array[key];
    }

    public void remove(int key) {
        array[key] = 0;
    }
}
