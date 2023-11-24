public class Calculator {
    public static <N extends Number> N sum(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() + b.doubleValue());
        }

        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() + b.intValue());
        }

        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() + b.intValue());
        }

        else result = (N)(Double)(a.doubleValue() + b.doubleValue());


        return result;
    }

    public static <N extends Number> N sub(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() - b.doubleValue());
        }

        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() - b.intValue());
        }

        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() - b.intValue());
        }

        else result = (N)(Double)(a.doubleValue() - b.doubleValue());

        return result;
    }

    public static <N extends Number> N mult(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() * b.doubleValue());
        }

        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() * b.intValue());
        }

        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() * b.intValue());
        }

        else result = (N)(Double)(a.doubleValue() * b.doubleValue());

        return result;
    }

    public static <N extends Number> N div(N a, N b) {
        N result;
        if ((a.getClass() == Integer.class) && (b.getClass() == Double.class)) {
            result = (N)(Double)(a.intValue() / b.doubleValue());
        }

        else if ((a.getClass() == Double.class) && (b.getClass() == Integer.class)) {
            result = (N)(Double)(a.doubleValue() / b.intValue());
        }

        else if ((a.getClass() == Integer.class) && (b.getClass() == Integer.class)) {
            result = (N)(Integer)(a.intValue() / b.intValue());
        }

        else result = (N)(Double)(a.doubleValue() / b.doubleValue());

        return result;
    }
}