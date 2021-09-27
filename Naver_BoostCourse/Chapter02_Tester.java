public class Tester {
    public static void main(String[] args) {
        
        static ListI<Integer> List = new LinkedList<Integer>();
        int i = 10;

        for (int i=0; i<n; i++)  {
            List.addFirst(i);
        }

        for (int i=n-1; i>=0; i--) {
            int x = List.removeFirst()
            if (x != i) {
                //...
            }
        }

        for (int i=0; i<n; i++) {
            int x = List.removeLast();
            if (x != i) {
                //...
            }
        }

    }
}