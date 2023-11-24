
public class Matrix<T> {
    private T[][] data;
    private int rows, cols;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrices not have the same size");
        }

        T[][] resultData = (T[][]) new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = (T) add(data[i][j], other.get(i, j));
            }
        }
        return new Matrix<>(resultData);
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrices not have the same size");
        }

        T[][] resultData = (T[][]) new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultData[i][j] = (T) subtract(data[i][j], other.get(i, j));
            }
        }
        return new Matrix<>(resultData);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (cols != other.getRows()) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
        }

        T[][] resultData = (T[][]) new Object[rows][other.getCols()];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                T sum = (T) zero();
                for (int k = 0; k < cols; k++) {
                    sum = (T) add(sum, multiply(data[i][k], other.get(k, j)));
                }
                resultData[i][j] = sum;
            }
        }
        return new Matrix<>(resultData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private T add(T a, T b) {
        if (a.getClass() == Integer.class) return (T) (Object) ((Integer) a + (Integer) b);
        else return (T) (Object) ((Double) a + (Double) b);
    }

    private T subtract(T a, T b) {
        if (a.getClass() == Integer.class) return (T) (Object) ((Integer) a - (Integer) b);
        else return (T) (Object) ((Double) a - (Double) b);
    }

    private T multiply(T a, T b) {
        if (a.getClass() == Integer.class) return (T) (Object) ((Integer) a * (Integer) b);
        else return (T) (Object) ((Double) a * (Double) b);
    }

    private T zero() {
        if (data[0][0] instanceof Integer) return (T) (Object) 0;
        else return (T) (Object) 0.0;
    }
}