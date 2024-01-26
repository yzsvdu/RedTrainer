/* 1 */
package f;

public final class Nd extends Kl0 {
    public final void sM() {
        byte b;
        if (((b = this.Ws.get()) & 0x1) != 0) {
            byte b1;
            byte[] arrayOfByte;
            for (this
                         /* 2 */.H60 = new byte[this.Ws.get()], b1 = 0; b1 < (arrayOfByte = this.H60).length; ) {
                arrayOfByte[b1] = this
/* 3 */.Ws.get();
                /* 4 */
                b1++;
            }
        }
        if ((b & 0x2) != 0) {
            /* 5 */
            byte b1;
            for (b = this.Ws.get(), b1 = 0; b1 < b; ) {
                /*   */
                /* 7 */
                byte b2 = this.Ws.get();
                /* 8 */
                this.UB0.VF(b2, au());
                b1++;
                /*   */
            }
            /*   */
        }
    }

    /*   */
    /*   */
    /*   */   public final ak UB0 = new ak();
    /*   */   public byte[] H60 = new byte[0];

    /*   */
    /*   */
    public Nd(c4 paramc4, ByteBuffer paramByteBuffer) {
        /*   */
        super(paramc4, paramByteBuffer);
        /*   */
    }

    /*   */
    /*   */
    public final void Cx() {
        /*   */
        ro ro;
        /*   */
        if ((ro = r8()) != null) {
            /*   */
            Iq0 iq0 = ro.y80;
            /*   */
            byte[] arrayOfByte = this.H60;
            /*   */
            ak ak1;
            /*   */
            if ((ak1 = this.UB0) == null) {
                /*   */
                iq0.getClass();
                /*   */
                this();
                /*   */
            }
            /*   */
            if (this == null)
                /*   */ arrayOfByte = Iq0.j;
            /*   */
            iq0.MG0 = ak1;
            /*   */
            iq0.K4 = this;
            /*   */
            LPT1.qG = iq0::Kg;
            /*   */
        }
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */