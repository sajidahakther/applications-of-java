public class Q2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            String[] strings = {
                    "abc",
                    "123",
                    null,
                    "xyz"
            };
            for (int i = 0; i < strings.length; i++) {
                int s = strings[i].length();
                System.out.println(strings[i + 1]);
                s = Integer.parseInt(strings[i]);
            }
        } catch (Exception e) {
            System.out.println("Number is not a String and it is not allowed to be null.");
        }
    }
}
