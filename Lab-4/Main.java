class Matrix3D {

    static int X = 3;
    static int Y = 3;
    static int Z = 3;

    static void set(int value, int indX, int indY, int indZ, int[] oneDArray) {
        int index = indX * (Y * Z)
                + indY * Z
                + indZ;

        oneDArray[index] = value;
    }

    static int get(int indX, int indY, int indZ, int[] oneDArray) {
        int index = indX * (Y * Z)
                + indY * Z
                + indZ;

        return oneDArray[index];
    }

    public static void main(String[] args) {

        int[] oneDArray = new int[X * Y * Z];

        set(5, 0, 0, 0, oneDArray);
        set(15, 1, 2, 1, oneDArray);
        set(25, 2, 1, 2, oneDArray);

        System.out.println(get(0, 0, 0, oneDArray));
        System.out.println(get(1, 2, 1, oneDArray));
        System.out.println(get(2, 1, 2, oneDArray));
    }
}
