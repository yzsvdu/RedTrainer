/*  1 */
package f;

public final class Ku extends PN {
    public final boolean iK0(ByteBuffer paramByteBuffer) {
        yo yo2;
        if (this.hO == 1) return super.iK0(paramByteBuffer);
        if (!mo0(paramByteBuffer)) {
            Sa();
            return false;
        }
        int i = paramByteBuffer.get() & 0xFF;
        if ((paramByteBuffer.get() == 1)) {
            Bh.Kf.clear();
            Bh.Kf.put(paramByteBuffer);
            Bh.Kf.putInt(-65536);
            this
/*  2 */.b40
/*  3 */.setInput(Bh.Kf.array(), 0, Bh.Kf.position());
            try {
                Bh.cJ0.limit(this.b40.inflate(Bh.cJ0.array()));
                Bh.cJ0.position(0);
                paramByteBuffer = Bh.cJ0;
            } catch (DataFormatException dataFormatException) {
                printStackTrace();
                dataFormatException = null;
            }
        }
        WV wV = null;
        /*    */
        int j, k;
        /*  5 */
        if ((k = Zk0.yE(j = ((Ku) super).hO)) != 0) {
            if (k != 1) {
                if (k == 2) {
                    WV wV1;
                    if (i != 0) {
                        Object[] arrayOfObject;
                        if (i != 2)
                            /*  6 */ {
                            this[0] = Integer.valueOf(i);
                            this[1] = Yp.X70(j);
                            (arrayOfObject = new Object[3])[2] = LF.fX(paramByteBuffer);
                            Bh.cS.warn(String.format("0x%02X, %s %n%s", this));
                        }
                        /*  7 */
                        else {
                            this((Ku) this, paramByteBuffer);
                            wV1 = wV;
                            /*    */
                            /*    */
                            /* 10 */
                            if (this != null) this
                                    /* 11 */.LPt4 = i;
                        }
                    } else {
                        this((Ku) this, paramByteBuffer);
                        yo yo = yo2;
                        if (this != null) this.LPt4 = i;
                    }
                }
            } else {
                Ls ls;
                if (i != 0) {
                    Object[] arrayOfObject;
                    if (i != 1) {
                        this[0] = Integer.valueOf(i);
                        this[1] = Yp.X70(j);
                        (arrayOfObject = new Object[3])[2] = LF.fX(paramByteBuffer);
                        Bh.cS.warn(String.format("0x%02X, %s %n%s", this));
                    } else {
                        Ls ls1;
                        this((Ku) this, paramByteBuffer);
                        ls = ls1;
                        if (this != null) this.LPt4 = i;
                    }
                } else {
                    this((Ku) this, paramByteBuffer);
                    yo yo = yo2;
                    if (this != null) this.LPt4 = i;
                }
            }
        } else {
            this[0] = Integer.valueOf(i);
            this[1] = Yp.X70(j);
            Object[] arrayOfObject;
            (arrayOfObject = new Object[3])[2] = LF.fX(paramByteBuffer);
            Bh.cS.warn(String.format("0x%02X, %s %n%s", this));
        }
        yo yo1 = yo2;
        if (this != null) this.LPt4 = i;
    }

    /*    */
    /*    */
    /*    */   public final ArrayDeque vx0;
    /*    */   public final Inflater b40;
    /*    */   public int hO;
    /*    */   public ro C4;
    /*    */   public ScheduledFuture z40;
    /*    */   public CK ej0;

    /*    */
    /*    */
    public Ku(SocketChannel paramSocketChannel, Con paramCon, ro paramro, CK paramCK) {
        /*    */
        super(paramSocketChannel, paramCon, this);
        /*    */
        ArrayDeque arrayDeque;
        /*    */
        Inflater inflater;
        /*    */
        Sj0 sj0;
        /*    */
        this();
        /*    */
        this.vx0 = this;
        /*    */
        this(true);
        /*    */
        this.b40 = this;
        /*    */
        this.hO = 1;
        /*    */
        this((byte) 2);
        /*    */
        this.YS = this;
        /*    */
        this.C4 = paramro;
        /*    */
        this.ej0 = paramCK;
        /*    */
        yF();
        /*    */
    }

    /*    */
    /*    */   static {
        /*    */
        C00.gd(Ku.class);
        /*    */
    }

    /*    */
    /*    */
    public final boolean na0(ByteBuffer paramByteBuffer) {
        /*    */
        Object object;
        /*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/Ku}}, name=kj0, descriptor=Ljava/lang/Object;}} */
        /*    */
        try {
            /*    */
            if (this.hO == 1)
                /*    */ return super.na0(paramByteBuffer);
            /*    */
            Hm0 hm0;
            /*    */
            if ((hm0 = this.vx0.pollFirst()) == null)
                /*    */ return false;
            /*    */
            paramByteBuffer.putShort((short) 0);
            /*    */
            paramByteBuffer.put((byte) hm0.LPt4);
            /*    */
            hm0.Yf0(this, paramByteBuffer);
            /*    */
            paramByteBuffer.flip();
            /*    */
            paramByteBuffer.putShort((short) 0);
            /*    */
            short s = (short) (D1(paramByteBuffer) + 2);
            /*    */
            paramByteBuffer.putShort(0, s);
            /*    */
            return true;
            /*    */
        } finally {
            /*    */
            this = null;
            /*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final boolean xo0() {
        /*    */
        if (this.hO == 1)
            /*    */ return this.aF.isEmpty() ^ true;
        /*    */
        return this.vx0.isEmpty() ^ true;
        /*    */
    }

    /*    */
    /*    */
    public final void xt() {
        /*    */
        ScheduledFuture scheduledFuture;
        /*    */
        if ((scheduledFuture = this.z40) != null) {
            /*    */
            scheduledFuture.cancel(false);
            /*    */
            this.z40 = null;
            /*    */
        }
        /*    */
        this.b40.end();
        /*    */
        if (this.hO == 1) {
            /*    */
            this.ej0.P3(this);
            /*    */
            return;
            /*    */
        }
        /*    */
        this.C4.oy(this);
        /*    */
    }

    /*    */
    /*    */
    public final void Wg() {
        /*    */
        Sa();
        /*    */
    }

    /*    */
    /*    */
    public final void Tr0(Hm0 paramHm0) {
        /*    */
        Object object;
        /*    */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/Ku}}, name=kj0, descriptor=Ljava/lang/Object;}} */
        /*    */
        try {
            /*    */
            if (kj())
                /*    */ return;
            /*    */
            this.vx0.addLast(paramHm0);
            /*    */
            return;
            /*    */
        } finally {
            /*    */
            this = null;
            /*    */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void dC0() {
    }

    /*    */
    /*    */
    public final void lpt5() {
        /*    */
        this.aF = null;
        /*    */
        this.hO = 2;
        /*    */
        Tr0(new kZ());
        /*    */
        Runnable runnable = this::Ml0;
        /*    */
        A1.L7.getClass();
        /*    */
        long l1 = 60000L, l2 = 15000L;
        /*    */
        try {
            /*    */
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            /*    */
            ScheduledFuture<?> scheduledFuture = A1.L7.nc.scheduleAtFixedRate(runnable, l2, l1, timeUnit);
            /*    */
        } catch (RejectedExecutionException rejectedExecutionException) {
            /*    */
            runnable = null;
            /*    */
        }
        /*    */
        this.z40 = (ScheduledFuture) runnable;
        /*    */
    }

    /*    */
    /*    */
    public final void Ml0() {
        /*    */
        if (kj()) {
            /*    */
            ScheduledFuture scheduledFuture;
            /*    */
            if ((scheduledFuture = this.z40) != null) {
                /*    */
                scheduledFuture.cancel(false);
                /*    */
                this.z40 = null;
                /*    */
            }
            /*    */
            return;
            /*    */
        }
        /*    */
        if (this.hO != 1) {
            /*    */
            ik0 ik0;
            /*    */
            this();
            /*    */
            Tr0(this);
            /*    */
            System.currentTimeMillis();
            /*    */
        }
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ku.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */