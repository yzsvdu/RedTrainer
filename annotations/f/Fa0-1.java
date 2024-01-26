/* 1 */
package f;

public final class Fa0 extends a10 {
    public final void Cx() {
        ro ro = r8();
        qN qN;
        (qN = (ro = this).sE)
/* 2 */.ul
/* 3 */.clear();
        T60[] arrayOfT60;
        int i;
        byte b;
        for (i = (arrayOfT60 = this.GY).length, b = 0; b < i; ) {
            T60 t60 = arrayOfT60[b];
            qN
/* 4 */.ul
/*   */
/*   */
/* 7 */.put(Integer.valueOf(t60.lpT3.OU), t60);
            b++;
        }
        ((R8) this)
/* 8 */.YG0.So0(false);
        js js;
        (js = ((R8) this).YG0).getClass();
        /* 9 */
        UB0.Kg0.fN(new AU(js, (R8) this));
    }

    /*   */
    /*   */
    /*   */   public T60[] GY;

    /*   */
    /*   */
    public Fa0(c4 paramc4, ByteBuffer paramByteBuffer) {
        /*   */
        super(paramByteBuffer, paramc4);
        /*   */
    }

    /*   */
    /*   */
    public final void sM() {
        /*   */
        this.GY = new T60[R00()];
        /*   */
        T60[] arrayOfT60;
        /*   */
        for (byte b = 0; b < (arrayOfT60 = this.GY).length; b++)
            /*   */
            arrayOfT60[b] = Nz();
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Fa0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */