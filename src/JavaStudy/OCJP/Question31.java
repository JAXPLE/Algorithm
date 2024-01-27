package JavaStudy.OCJP;

public class Question31 implements Comparable<Question31> {
    private int wins, losses;

    public Question31(int w, int l) {
        wins = w; losses = l;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String toString() {
        return "<" + wins + "," + losses + ">";
    }

    @Override
    public int compareTo(Question31 o) {
        return 0;
    }

    public static void main(String[] args) {

    }
}
