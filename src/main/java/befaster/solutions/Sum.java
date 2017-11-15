package befaster.solutions;

public class Sum {

    public static int sum(int x, int y) {
        if((x < 0 || x > 100) || (y < 0 || y > 100)) {
            throw new RuntimeException();
        }
        
        return x + y;
    }

}