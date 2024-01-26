/*  1 */
package f;

public final class CK {
    public SocketAddress[] de0;
    public int c80 = 0;
    public PN nK0 = null;
    public long coN = 0L;
    public hb0 b80;
    public ro zN;
    public boolean lt;
    public boolean uC0 = false;

    public CK(SocketAddress[] paramArrayOfSocketAddress, hb0 paramhb0, ro paramro, boolean paramBoolean) {
        this.de0 = paramArrayOfSocketAddress;
        this.b80 = paramhb0;
        this.zN = paramro;
        this.lt = paramBoolean;
    }

    public static void vr() {
        km.iE0.getClass();
        this();
        HG hG;
        long l;
        if ((new HG()).Lh0())
            /*  2 */ {
            long l1 = hG.fn;
            /*    */
            /*  4 */
            l = TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS) + l1 - hG.C70;
        } else {
            l = 0L;
        }
        if (l != 0L &&
                /*  5 */       Math.abs(System.currentTimeMillis() - l) >= 86000000L) UB0.Kg0.fN(CK::Jv0);
    }

    public final boolean nH0() {
        int i;
        SocketAddress[] arrayOfSocketAddress;
        if ((i = this.c80 / 2) / (arrayOfSocketAddress = this.de0).length > 1) {
            this.nK0 = null;
            return true;
        }
        PN pN2;
        if ((pN2 = this.nK0) == null) {
            if (i / arrayOfSocketAddress.length > 1) {
                this.nK0 = null;
            } else {
                SocketAddress socketAddress = arrayOfSocketAddress[i % arrayOfSocketAddress.length];
                try {
                    char c;
                    SocketChannel socketChannel;
                    Socket socket = (socketChannel = SocketChannel.open()).socket();
                    if (!((i / arrayOfSocketAddress.length > 0) ? 1 : 0)) {
                        c = '✐';
                    } else {
                        c = "田";
                    }
                    socket.connect(socketAddress, c);
                    socketChannel.configureBlocking(false);
                    this.c80++;
                    if (this.b80 != null) {
                        x6 x6;
                        Con con = km.E.lS();
                        this.coN = System.currentTimeMillis();
                        this(socketChannel, con, this.b80, this);
                        this.nK0 = new x6();
                        this.b80.rQ = x6;
                    } else if (this.lt) {
                        Ku ku;
                        Con con = km.E.lS();
                        this.coN = System.currentTimeMillis();
                        this(socketChannel, con, this.zN, this);
                        this.nK0 = new Ku();
                        this.zN.aM0 = ku;
                    } else if (this.zN != null) {
                        Con con = km.E.lS();
                        this.coN = System.currentTimeMillis();
                        this(socketChannel, con, this.zN, this);
                        this.nK0 = new c4();
                        this.zN
                                /*  6 */.e20 = (c4) pN2;
                    }
                } catch (Exception exception) {
                    this
                            /*  7 */.c80++;
                    nH0();
                }
            }
            return false;
        }
        if (pN2 instanceof x6)
            /*    */ {
            /*    */
            /* 10 */
            switch (Zk0.yE(((x6) pN2).Ig)) {
                case 1:
                case 2:
                case 3:
                    return true;
                case 0:
                    if (System.currentTimeMillis() - this.coN > 10000L) this.nK0.Sa();
                    return false;
            }
        }
        PN pN1;
        if (pN1 = this.nK0 instanceof c4)
            /*    */ {
            int j;
            /* 12 */
            if ((j = Zk0.yE(((c4) pN1).VL0)) != 0) {
                if (j == 1 || j == 2 || j == 4) return true;
            } else {
                if (System.currentTimeMillis() - this.coN > 10000L) this.nK0.Sa();
                return false;
            }
        }
        if (pN1 = this.nK0 instanceof Ku)
            /*    */ {
            int j;
            /* 14 */
            if ((j = Zk0.yE(((Ku) pN1).hO)) != 0) {
                if (j == 1 || j == 2) return true;
            } else {
                if (System.currentTimeMillis() - this.coN > 10000L) this.nK0.Sa();
                return false;
            }
        }
        return false;
    }

    /*    */
    /*    */
    /*    */
    public static void Jv0() {
        /*    */
        km.f70.iJ0(Ml0.OH0(927), Ml0.OH0(928), LP.Od0, null, false);
        /*    */
    }

    /*    */
    /*    */
    public final void P3(LPt3 paramLPt3) {
        /*    */
        if (this.nK0 == paramLPt3)
            /*    */ this.nK0 = null;
        /*    */
        if (!this.uC0) {
            /*    */
            this.uC0 = true;
            /*    */
            Runnable runnable = CK::vr;
            /*    */
            A1.L7.nc.execute(this);
            /*    */
        }
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CK.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */