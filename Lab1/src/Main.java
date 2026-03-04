void main(){
    IO.println("Developer: Dmytrenko Y.M");

    IO.println("__________Matrix A__________");
    var matrix_A = CreateAndShowMatrixA();

    var y_string = IO.readln("Please enter Y: ");
    var y_int = Integer.parseInt(y_string);

    IO.println("__________Matrix B__________");
    var array_B = CreateAndShowArrayB(y_int, matrix_A);

    if (array_B.length == 0){
        IO.println("No elements found less than " + y_int);
        return;
    }

    var product_B = ProductArray(array_B);
    IO.print("\nProduct B: " + product_B);
}

int [][] CreateAndShowMatrixA(){
    int [][] matrix_A = new int [4] [2];

    Random rand = new Random();

    for (int i = 0; i < matrix_A.length; i++){
        for (int j = 0; j < matrix_A[i].length; j++){
            matrix_A[i][j] = rand.nextInt(1, 200);
            IO.print(matrix_A[i][j] + " ");
        }
        IO.println();
    }

    return matrix_A;
}

int [] CreateAndShowArrayB(int y, int [][] matrix_A){
    ArrayList<Integer> elements = new ArrayList<Integer>();

    for (int i = 0; i < matrix_A.length; i++){
        for (int j = 0; j < matrix_A[i].length; j++){
            if (matrix_A[i][j] < y){
                elements.add(matrix_A[i][j]);
            }
        }
    }

    int [] array_B = new int [elements.size()];
    int index = 0;

    for (int element : elements){
        array_B[index] = element;
        IO.print(element + " ");
        index++;
    }

    return array_B;
}

int ProductArray(int [] array){
    int product = 1;

    for (int element : array){
        product *= element;
    }
    return product;
}
