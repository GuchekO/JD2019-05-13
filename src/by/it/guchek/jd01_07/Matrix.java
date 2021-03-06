package by.it.guchek.jd01_07;

import java.util.Arrays;

public class Matrix extends Var {

    private double [][] value;

    public Matrix(double[][] value) {

        this.value= Arrays.copyOf(value, value.length);
    }

    public Matrix(Matrix matrix){
        this.value=matrix.value;
    }


    public Matrix(String strMatrix){

        String [] sMatr=strMatrix.split("},\\{|},\\n\\{");
        double [][] matr1 = new double[sMatr.length][ sMatr[0].replaceAll("[{}\\s]","").trim().split(",").length];

        for (int i = 0; i <sMatr.length ; i++) {
            String[] sMatrFull = sMatr[i].replaceAll("[{}]","").split(",");

            for (int j = 0; j <sMatrFull.length ; j++) {
                matr1[i][j]=Double.parseDouble(sMatrFull[j]);

            }
        }
        //value = matr1;
        this.value=matr1;

    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimetr1 = "{", delimetr2 = "}";
        for (int i=0; i<value.length; i++) {
            sb.append(delimetr1); //.append(element);
            for (int j = 0; j <value[0].length ; j++) {
                sb.append(value[i][j]);
                if (j==value[0].length-1){
                    sb.append(delimetr2);
                    break;
                }
                sb.append(",").append(" ");
            }
            if (i==value.length-1){
                sb.append(delimetr2);
                break;
            }
            sb.append(", ");
        }
        return sb.toString();
    }

}
