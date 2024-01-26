package f;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public final class Ez implements PropertyChangeListener {
  public Ez(xJ0 paramxJ0) {}
  
  public final void propertyChange(PropertyChangeEvent paramPropertyChangeEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield so : Lf/xJ0;
    //   4: getfield SU : Z
    //   7: ifne -> 11
    //   10: return
    //   11: aload_1
    //   12: invokevirtual getPropertyName : ()Ljava/lang/String;
    //   15: ldc 'x'
    //   17: swap
    //   18: invokevirtual equals : (Ljava/lang/Object;)Z
    //   21: ifeq -> 50
    //   24: getstatic f/h1.mG : I
    //   27: aload_0
    //   28: getfield so : Lf/xJ0;
    //   31: getfield Kd : I
    //   34: dup
    //   35: istore_0
    //   36: if_icmpeq -> 86
    //   39: iload_0
    //   40: putstatic f/h1.mG : I
    //   43: iconst_1
    //   44: putstatic f/h1.Gh0 : Z
    //   47: goto -> 86
    //   50: aload_1
    //   51: invokevirtual getPropertyName : ()Ljava/lang/String;
    //   54: ldc 'y'
    //   56: swap
    //   57: invokevirtual equals : (Ljava/lang/Object;)Z
    //   60: ifeq -> 86
    //   63: aload_0
    //   64: getfield so : Lf/xJ0;
    //   67: getfield er0 : I
    //   70: istore_0
    //   71: getstatic f/h1.yc : I
    //   74: iload_0
    //   75: if_icmpeq -> 86
    //   78: iload_0
    //   79: putstatic f/h1.yc : I
    //   82: iconst_1
    //   83: putstatic f/h1.Gh0 : Z
    //   86: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 31
    //   #2	-> 40
    //   #3	-> 67
    //   #4	-> 71
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ez.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */