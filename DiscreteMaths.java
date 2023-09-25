public class DiscreteMaths {

    public DiscreteMaths() {
    } 

//numero de datos
    public int num_N(double y[]){
      int N = 0;
      N = y.length;
      return N;
    }


//sumatoria x
    public float sumX(double x[]) {
      double procx = 0;
      
      for (int i=0;  i < x.length; i++)
        procx = procx + x[i];

      float totalX = (float) procx;
      return totalX;
    }


//tomar promedio de x
    public int determinar(double y[]){
      int y_a = 0;
      y_a = y.length;
      return (y_a);
    }

//sumatoria y
    public float sumY(double y[]) {
      double procy = 0;
      
      for (int i=0;  i < y.length; i++)
        procy = procy + y[i];

      float totalY = (float) procy;
      return totalY;
    }

//sumatoria potencia x
    public float potX(double X[]){
      double proc_total_pot_X = 0;

      for (int i = 0; i<X.length; i++)
        proc_total_pot_X += X[i] * X[i];

      float total_pot_X = (float) proc_total_pot_X;
      return total_pot_X;

    }

//sumatoria potencia y
    public float potY(double Y[]){
      double proc_total_pot_Y = 0;

      for (int i = 0; i<Y.length; i++)
        proc_total_pot_Y += Y[i] * Y[i];
      
      float total_pot_Y = (float) proc_total_pot_Y;
      return total_pot_Y;

    }

//sumatoria x*y
    public float multip_x_y(double X[], double Y[]){
      double proc_product = 0;

      for (int i = 0; i < X.length; i++)
        proc_product += (X[i] * Y[i]);

      float product = (float) proc_product;
      return product;
    }

//promedio de x
    public float promedioX(double X[], double sumX){
      double proc_promedioX = 0;
      proc_promedioX = sumX / X.length;

      float promedioX = (float) proc_promedioX;
      return promedioX;
    }


//promedio de y
    public float promedioY(double Y[], double sumY){
      double proc_promedioY = 0;
      proc_promedioY = sumY / Y.length;

      float promedioY = (float) proc_promedioY;
      return promedioY;
    }
}


