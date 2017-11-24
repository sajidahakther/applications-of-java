package christmasgift;

import java.util.*;

public class ChristmasGift {

    public static void main(String[] args) {
        List<String> buy = new ArrayList();
        buy.add("xy");

        Collections.shuffle(buy);
        String[] buyingXY = new String[]{"x1", "x2", "x3", "x4", "x5", "y1", "y2", "y3", "y4", "y5"};
        String[] toXY = new String[]{"x6", "x7", "x8", "x9", "x10", "y6", "y7", "y8", "y9", "y10"};

        Collections.shuffle(Arrays.asList(buyingXY));

        for (int i = 0; i < buyingXY.length; i++) {
            System.out.println("Buyer: " + buyingXY[i]);
        }

        for (int j = 0; j < toXY.length; j++) {
            System.out.println("Reciever: " + toXY[j]);
        }
    }
}
