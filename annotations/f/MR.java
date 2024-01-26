/*  1 */
package f;

public final class MR extends Bi {
    public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) {
        byte b;
        if (paramc4.cOm8
                /*  2 */.KK > 0) {
            paramByteBuffer
/*  3 */.put((byte) 1);
            /*    */
            /*    */
            /*  6 */
            paramByteBuffer.putInt(paramc4.cOm8.KK);
            /*    */
            /*    */
            /*    */
            /* 10 */
            paramByteBuffer.put((byte) paramc4.cOm8.Ge0.length);
            /*    */
            /*    */
            /* 13 */
            paramByteBuffer.put(paramc4.cOm8.Ge0);
        } else {
            paramByteBuffer
/* 14 */.put((byte) 0);
            /*    */
            /*    */
            /* 17 */
            paramByteBuffer.putInt(paramc4.cOm8.Cf0);
            /*    */
            /*    */
            /*    */
            /* 21 */
            paramByteBuffer.put((byte) paramc4.cOm8.nJ.length);
            /*    */
            /*    */
            /* 24 */
            paramByteBuffer.put(paramc4.cOm8.nJ);
        }
        /*    */
        Socket socket;
        /* 26 */
        if ((socket = paramc4.Vn0.socket()) == null || isClosed())
            /*    */
            /* 28 */ {
            arrayOfByte2 = LF.Jv(null);
        } else {
            arrayOfByte2 = LF.Jv(paramc4.Vn0.socket().getLocalAddress());
        }
        paramByteBuffer
/* 29 */.put(this);
        /*    */
        /* 31 */
        paramByteBuffer.putInt(25385);
        /*    */
        /* 33 */
        paramByteBuffer.putInt(Pa0.vH0);
        /*    */
        /*    */
        /* 36 */
        paramByteBuffer.put((Xv0.nS(h1.qc)).Dd);
        /*    */
        /*    */
        /* 39 */
        paramByteBuffer.putShort(paramc4.cOm8.bn);
        /*    */
        /* 41 */
        paramByteBuffer.putShort(h1. while);
        /*    */
        byte[] arrayOfByte2;
        /* 43 */
        if ((arrayOfByte2 = km.mI0.q20) == null || this.length <
                /* 44 */       1) {
            b = 0;
        } else {
            int m;
            byte b3;
            for (b = 0, m = this.length, b3 = 0; b3 < m; ) {
                b = (byte) (b | 1 << this[b3]);
                b3++;
            }
        }
        paramByteBuffer
/* 45 */.put(b);
        byte b2 = 0;
        P1 p1;
        /* 46 */
        if ((p1 = km.mI0).UG0 != null) b2 = 1;
        if (p1.UI0 != null) b2++;
        if (p1.yE != null) b2++;
        if (p1.AN != null) b2++;
        paramByteBuffer
/* 47 */.put((byte) b2);
        s40 s40;
        /* 48 */
        if ((s40 = km.mI0.UG0) != null) {
            /*    */
            /* 50 */
            e6.Ti(this.coM7.toUpperCase(Locale.ENGLISH), paramByteBuffer);
            /*    */
            /* 52 */
            paramByteBuffer.put(km.mI0.UG0.H5);
            /* 53 */
            paramByteBuffer.put((byte) 0);
            /* 54 */
        }
        if ((s40 = km.mI0.UI0) != null) {
            /*    */
            /* 56 */
            e6.Ti(this.coM7.toUpperCase(Locale.ENGLISH), paramByteBuffer);
            /*    */
            /* 58 */
            paramByteBuffer.put(km.mI0.UI0.H5);
            /* 59 */
            paramByteBuffer.put((byte) 0);
            /* 60 */
        }
        BE bE;
        if ((bE = km.mI0.yE) != null) {
            /*    */
            /* 62 */
            e6.Ti(this.qa0.e60.toUpperCase(Locale.ENGLISH), paramByteBuffer);
            /*    */
            /*    */
            /* 65 */
            paramByteBuffer.put(km.mI0.yE.qa0.H50);
            /* 66 */
            paramByteBuffer.put((byte) 1);
            /* 67 */
        }
        Wo wo;
        if ((wo = km.mI0.AN) != null)
            /*    */
            /* 69 */ {
            e6.Ti(this.qa0.e60.toUpperCase(Locale.ENGLISH), paramByteBuffer);
            /*    */
            /*    */
            /* 72 */
            paramByteBuffer.put(km.mI0.AN.qa0.H50);
            /* 73 */
            paramByteBuffer.put((byte) 1);
        }
        paramByteBuffer
/*    */
/*    */
/* 76 */.put((byte) km.n20.XI0.ir0);
        byte[] arrayOfByte1;
        ak ak;
        int i;
        /*    */
        byte[] arrayOfByte3, arrayOfByte4;
        /*    */
        int j, k;
        /* 79 */
        for (arrayOfByte3 = new byte[i = (ak = km.n20.XI0).ir0], arrayOfByte1 = this.JO, j = (arrayOfByte4 = km.n20.XI0.Sx0).length, k = 0; j-- > 0; ) {
            if (this[j] == 1) {
                int m = k + 1;
                arrayOfByte3[k] = arrayOfByte4[j];
                k = m;
            }
        }
        for (byte b1 = 0; b1 < i; ) {
            byte b3;
            paramByteBuffer
/*    */
/* 81 */.put(b3 = arrayOfByte3[b1]);
            /* 82 */
            e6.Ti((String) km.n20.XI0.Ha0(b3), paramByteBuffer);
            b1++;
        }
        paramByteBuffer
/*    */
/*    */
/* 85 */.put(yG.x3.kZ);
        /*    */
        /* 87 */
        paramByteBuffer.put(G8.eA0);
        /*    */
        /* 89 */
        paramByteBuffer.put(G8.KE0);
    }

    /*    */
    /*    */
    /*    */
    public MR() {
        /*    */
        super(1);
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */