/* 1 */
package f;

public final class W70 extends Kl0 {
    public final void sM() {
        byte b;
        short[] arrayOfShort;
        for (this
                     /* 2 */.PF = this.Ws.get(), this.fO = ee0(R00()), this.DC0 = ee0(R00()), this.oi = new short[R00()], b = 0; b < (arrayOfShort = this.oi).length; ) {
            arrayOfShort[b] = this
/* 3 */.Ws.getShort();
            /* 4 */
            b++;
        }
        /*   */
    }

    /*   */
    /*   */
    /*   */   public byte PF;
    /*   */   public byte[] fO;
    /*   */   public byte[] DC0;
    /*   */   public short[] oi;

    /*   */
    /*   */
    public W70(c4 paramc4, ByteBuffer paramByteBuffer) {
        /*   */
        super(paramc4, paramByteBuffer);
        /*   */
    }

    /*   */
    /*   */
    public final void Cx() {
        /*   */
        Gp0 gp0;
        /*   */
        if ((gp0 = km.MR) != null) {
            /*   */
            AM aM;
            /*   */
            byte b = this.PF, arrayOfByte1[] = this.fO, arrayOfByte2[] = this.DC0;
            /*   */
            short[] arrayOfShort = this.oi;
            /*   */
            this(b, arrayOfByte1, arrayOfByte2, arrayOfShort);
            /*   */
            gp0.W.add(aM);
            /*   */
        }
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */