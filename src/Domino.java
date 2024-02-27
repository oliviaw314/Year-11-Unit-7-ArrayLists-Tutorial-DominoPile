public class Domino {
    private int top;
    private int bottom;

    public Domino() {
        this(0, 0);
    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public void replace(int a, int b) {
        top = a;
        bottom = b;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }
    public String toString() {
        return top+"/"+bottom;
    }
    public void flip() {
        int tope = top;
        top = bottom;
        bottom = tope;
    }

    public void settle() {
        if (top>bottom) {
            flip();
        }
    }

    public int compareTo(Domino other) {
        settle();
        int otherSmallestValue = Math.min(other.top, other.bottom);
        if (this.top<otherSmallestValue) {
            return -1;
        }
        else if (this.top>otherSmallestValue) {
            return 1;
        }
        else {
            int otherLargerValue = Math.max(other.top, other.bottom);
            if (this.bottom<otherLargerValue) {
                return -1;
            }
            else if (this.bottom>otherLargerValue) {
                return 1;
            }
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        int thisTotal = top+bottom;
        int otherTotal = other.top+other.bottom;
        if (thisTotal<otherTotal) {
            return -1;
        }
        else if (thisTotal>otherTotal) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        return (this.top==other.top || this.top == other.bottom || this.bottom == other.bottom || this.bottom == other.top);
    }
}
