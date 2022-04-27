
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    // incremente a soma e a quantidade
    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
    }

    // mostre a quantidade
    public int getCount() {
        return this.count;
    }

    // mostra a soma
    public int sum() {
        return this.sum;
    }

    // calcule a média
    public double average() {
        // cheque para não dividr por zero
        if (this.count == 0) {
            return 0.0;
        }
        return (double) this.sum / (double) this.count;
    }

}
