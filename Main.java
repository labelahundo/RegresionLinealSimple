public class Main {

    public static void main(String[] nousan) {
        double su_x = 0;
        double su_y = 0;
        double cant = 0;
        double x_2 = 0;
        double y_2 = 0;
        double x_y = 0;
        double prox = 0;
        double proy = 0;

        float[] dat_pred;
        float[] dat_pred_x;

        double b1 = 0;
        double b0 = 0;
        DataSet ds = new DataSet();
        DiscreteMaths dm = new DiscreteMaths();

 
        su_x = dm.sumX(ds.getX());
        su_y = dm.sumY(ds.getY());
        cant = dm.num_N(ds.getY());
        x_2 = dm.potX(ds.getX());
        y_2 = dm.potY(ds.getY());
        x_y = dm.multip_x_y(ds.getX(), ds.getY());
        prox = dm.promedioX(ds.getX(), su_x);
        proy = dm.promedioY(ds.getY(), su_y);


        System.out.println("cantoidad de numeros");
        System.out.println(cant);
        System.out.println("suma de x");
        System.out.println(su_x);
        System.out.println("suma de y");
        System.out.println(su_y);
        System.out.println("suma de potencias de x");
        System.out.println(x_2);
        System.out.println("suma de potencias de y");
        System.out.println(y_2);
        System.out.println("suma de multiplicacion de x y y");
        System.out.println(x_y);
        System.out.println("promedio de x");
        System.out.println(prox);
        System.out.println("promedio de y");
        System.out.println(proy);
        //System.out.println(dm.determinar(ds.getX()));

        System.out.println("*********************************");
        System.out.println("*********************************");

        b1 = ((x_y - ((su_x * su_y) / cant)) / (x_2 - ((su_x * su_x) / cant)));
        System.out.println("B1 = " + b1);

        b0 = (proy - b1 * prox);
        System.out.println("B0 = " + b0);


        System.out.println("*********************************");
        System.out.println("*********************************");

        System.err.println("predicción:");

        dat_pred_x = new float[] {220, 20, 300, 250};
        dat_pred = new float[dat_pred_x.length];

        for (int i = 0; i<dat_pred_x.length; i++)
            dat_pred[i] = (float) ((b0 + b1)*dat_pred_x[i]);

        for (int i = 0; i<dat_pred.length; i++){
            System.out.println("********************");
            System.out.println("prediccion numero: " + dat_pred_x[i]);
            System.out.println(dat_pred[i]);
        }
    }
}

