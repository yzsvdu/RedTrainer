/*  1 */
package f;

public final class Ni0 implements Runnable {
    public final void run() {
        hj0 hj01;
        this. return.Fh0 = false;
        this. return.NL0.dw0();
        MJ0 mJ0;
        if (!(mJ0 = this. return.NL0.AW).vi0)
        /*  2 */
        return;
        w70 w703 = mJ0.Ai;
        /*  3 */
        hj0 hj02 = mJ0.Ai.j60;
        if (mJ0.Ai.j60 != null)
            /*  4 */ {
            hj01 = hj02;
        }
        /*  5 */
        else {
            hj01 = ((w70) hj01).zW;
        }
        /*  6 */
        UB0.re0 = hj01;
        if (hj02 == null) hj02 = hj01;
        UB0.go = hj02;
        UB0.PU = mJ0.wR;
        GLFW.glfwMakeContextCurrent(mJ0.ne0);
        /*  7 */
        int i = w702.fG0(), j = this. return.NL0.dL();
        w70 w702;
        (w702 = this. return.NL0).zW.glViewport(0, 0, i, j);
        w70 w701;
        (w701 = this. return.NL0).AW
/*  8 */.QH0
/*  9 */.c0(w701.fG0(), this. return.NL0.dL());
        this. return.NL0.AW
/* 10 */.QH0
/* 11 */.z3();
        GLFW.glfwSwapBuffers(this.uU);
    }

    /*    */
    /*    */
    /*    */
    public Ni0(pG0 parampG0, long paramLong) {
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ni0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */