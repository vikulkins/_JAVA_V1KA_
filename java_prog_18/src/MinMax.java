public class MinMax<N extends Number> {
    private N[] array;
    public MinMax(N[] array) {
        this.array = array;
    }
    public N min() {
        N min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].getClass() == Integer.class) {
                if (array[i].intValue() < min.intValue()) min = array[i];
            }
            if (array[i].getClass() == Double.class) {
                if (array[i].doubleValue() < min.doubleValue()) min = array[i];
            }
        }
        return min;
    }

    public N max() {
        N max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].getClass() == Integer.class) {
                if (array[i].intValue() > max.intValue()) max = array[i];
            }
            if (array[i].getClass() == Double.class) {
                if (array[i].doubleValue() > max.doubleValue()) max = array[i];
            }
        }
        return max;
    }
}