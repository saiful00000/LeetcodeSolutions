package customs;

public class Main {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2,1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }

}
