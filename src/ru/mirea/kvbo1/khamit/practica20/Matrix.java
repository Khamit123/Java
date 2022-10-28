package ru.mirea.kvbo1.khamit.practica20;

public abstract class Matrix<N extends Number> {
    protected N[][] arr;

    protected abstract N add(N o1, N o2);

    protected abstract N multiply(N o1, N o2);

    protected abstract N zero();

    public void  Print() {
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[k][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public N[][] addMatrix(Matrix<N> r) {
        N[][] result = (N[][]) new Number[arr.length][arr[0].length];
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(arr[i][j],r.arr[i][j]);
            }

        return result;
    }


    public N[][] multiplyMatrix(Matrix<N> r) {

        N[][] result = (N[][]) new Number[arr.length][r.arr[0].length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();

                for (int k = 0; k < arr[0].length; k++) {
                    result[i][j] = add(result[i][j], multiply(arr[i][k], r.arr[k][j]));
                }
            }
        }

        return result;
    }

    public void printResult() {

    }

}