public class App extends java.lang.Object {
    public static void main(String[] args) {
        Student.n = 12;
        Student s = new Student("1", "Alvin");
        s.n = 32;
        System.out.println(s.n);
        Student.sayHello();
        System.out.println(s.getId() + " " + s.getName());

        String str = "Hello World, this is my world";
        System.out.println(str.indexOf("world"));

        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
