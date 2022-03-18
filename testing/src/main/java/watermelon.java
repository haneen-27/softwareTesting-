public class watermelon {

    public boolean weight( int w) {
        if (w < 1 || w > 100) {
            return false;
        }

        if (w % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
