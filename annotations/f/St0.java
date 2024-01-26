package f;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public final class St0 {
  public static final DecimalFormat qD0;
  
  public static long com9;
  
  public long[] cd0 = new long[500];
  
  public int YR;
  
  public float g50;
  
  public float YJ0;
  
  public float fd0;
  
  public float NA;
  
  public int wi0;
  
  public int ou0;
  
  public float j50;
  
  public int ot;
  
  public int DJ;
  
  public int Cj0;
  
  public float xG;
  
  public int mE0;
  
  static {
    this();
    DecimalFormatSymbols decimalFormatSymbols;
    (new DecimalFormatSymbols()).setDecimalSeparator('.');
    (qD0 = new DecimalFormat("000.00")).setDecimalFormatSymbols(decimalFormatSymbols);
  }
  
  public final String toString() {
    DecimalFormat decimalFormat;
    return (decimalFormat = qD0).format(this.g50) + " / " + decimalFormat.format(this.YJ0) + " / " + decimalFormat.format(this.fd0) + " / " + decimalFormat.format(this.NA);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/St0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */