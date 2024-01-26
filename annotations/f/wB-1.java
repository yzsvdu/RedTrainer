/* 1 */
package f;

public final class wB implements e0 {
    public final void Cw0(int paramInt) {
        String str;
        this = null;
        try {
            StackTraceElement[] arrayOfStackTraceElement;
            int i;
            for (arrayOfStackTraceElement = Thread.currentThread().getStackTrace(), i = 0; i < arrayOfStackTraceElement.length; ) {
                if ("check".equals(arrayOfStackTraceElement[i].getMethodName())) {
                    if (++i < arrayOfStackTraceElement.length) str = arrayOfStackTraceElement[i].getMethodName();
                    break;
                }
                i++;
            }
        } catch (Exception exception) {
        }
        if (this != null) {
            UB0.Kg0
/* 2 */.O70("GLProfiler", B40.df("Error ").append(tu0.cC0(paramInt)).append(" from ").append(this).toString());
        }
        /*   */
        else
            /* 4 */ {
            Exception exception;
            String str1 = B40.df("Error ").append(tu0.cC0(paramInt)).append(" at: ").toString();
            this();
            String str2 = "GLProfiler";
            Q50 q50;
            /* 5 */
            if ((q50 = UB0.Kg0).Bs >= 1) {
                this
/* 6 */.Aa0
/* 7 */.getClass();
                /* 8 */
                System.err.println("[" + str2 + "] " + str1);
                exception.printStackTrace(System.err);
            }
            /*   */
        }
        /*   */
    }
    /*   */
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */