/*  1 */
package f;

public final class GE {
    public final Me pg;
    public boolean Ns;
    public final fQ yl0 = new fQ();
    public final fQ Z70 = new fQ();
    public int Ez0;
    public float bX;
    public float Ij;
    public final Color Yb = new Color(1.0F, 1.0F, 1.0F, 1.0F);
    public float[][] Xs;
    public int[] UQ;
    public o0[] S80;
    public int[] d8;

    public final void GY(int paramInt1, int paramInt2) {
        o0 o01, arrayOfO0[];
        int[] arrayOfInt;
        if ((arrayOfO0 = this.S80) != null && paramInt2 > (arrayOfInt = (o01 = arrayOfO0[paramInt1]).Ky).length) {
            int j;
            int k;
            if ((k = paramInt2 - (j = o01.mG0)) >= 0) {
                if ((j += k) > arrayOfInt.length) o01.YK0(Math.max(Math.max(8, j), (int) (o01.mG0 * 1.75F)));
            } else {
                throw new IllegalArgumentException(
                        /*  2 */             XD0.SD0("additionalCapacity must be >= 0: ", k));
            }
            /*    */
        }
        /*  4 */
        paramInt2 = this.UQ[paramInt1];
        int i = paramInt2 * 20 + paramInt2;
        float arrayOfFloat[][], arrayOfFloat1[];
        if ((arrayOfFloat1 = (arrayOfFloat = this.Xs)[paramInt1]) == null) {
            arrayOfFloat[paramInt1] = new float[i];
        } else if (arrayOfFloat1.length < i) {
            float[] arrayOfFloat2 = new float[i];
            System.arraycopy(arrayOfFloat1, 0, this, 0, paramInt2);
            this.Xs[paramInt1] = this;
        }
    }

    public final void RV() {
        this.bX = 0.0F;
        this.Ij = 0.0F;
        fQ fQ1;
        if ((fQ1 = this.Z70) != null) {
            Lc lc;
            byte b2;
            int j;
            for (lc = null, b2 = 0, j = fQ1.Z8; b2 < j; ) {
                Object object;
                if ((object = fQ1.get(b2)) != null && (lc != null || (lc = (Lc) Lp0.bs0.pd0(object.getClass())) != null))
                    lc.free(object);
                b2++;
            }
            this.Z70.clear();
            this.yl0.clear();
            byte b1;
            int i;
            for (b1 = 0, i = this.UQ.length; b1 < i; ) {
                o0[] arrayOfO0;
                if ((arrayOfO0 = this.S80) != null) (arrayOfO0[b1]).mG0 = 0;
                this.UQ[b1] = 0;
                b1++;
            }
            return;
        }
        /*  5 */
        throw new IllegalArgumentException("objects cannot be null.");
    }

    public final R3 QL(CharSequence paramCharSequence, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3, int paramInt3, int paramBoolean, String paramString) {
        this.Z70.Com3(r3);
        Me me2 = this.pg;
        Color color = this.Yb;
        R3 r3;
        (r3 = (R3) Lp0.vu0(R3.class).obtain()).bq0(me2, paramCharSequence, paramInt1, paramInt2, color, paramFloat3, paramInt3, paramBoolean, paramString);
        Me me1;
        float f = paramFloat2 + (me1 = this.pg).XO.nO;
        if ((paramInt2 = r3.m0.Z8) != 0) {
            int i;
            float[][] arrayOfFloat;
            if ((arrayOfFloat = this.Xs).length < (i = me1.Eh0.Z8)) {
                arrayOfFloat = new float[i][];
                paramInt3 = arrayOfFloat.length;
                System.arraycopy(arrayOfFloat, 0, arrayOfFloat, 0, paramInt3);
                this.Xs = arrayOfFloat;
                int[] arrayOfInt = new int[i];
                paramInt3 = this.UQ.length;
                System.arraycopy(this.UQ, 0, arrayOfInt, 0, paramInt3);
                this.UQ = arrayOfInt;
                o0[] arrayOfO01 = new o0[i];
                paramInt3 = 0;
                o0[] arrayOfO02;
                if ((arrayOfO02 = this.S80) != null) {
                    paramInt3 = arrayOfO02.length;
                    int k = arrayOfO02.length;
                    System.arraycopy(arrayOfO02, 0, arrayOfO01, 0, k);
                }
                while (paramInt3 < i) {
                    o0 o02;
                    this();
                    arrayOfO01[paramInt3] = o02;
                    paramInt3++;
                }
                this.S80 = arrayOfO01;
                this.d8 = new int[i];
            }
            this
/*  6 */.yl0.Com3(r3);
            /*  7 */
            if (this.Xs.length == 1) {
                GY(0, r3.w6);
            } else {
                int[] arrayOfInt;
                Arrays.fill(arrayOfInt = this.d8, 0);
                byte b1;
                for (b1 = 0, paramInt3 = r3.m0.Z8; b1 < paramInt3; ) {
                    Object[] arrayOfObject;
                    byte b2;
                    int k;
                    for (arrayOfObject = ((zj) r3.m0.get(b1)).Pb.Uq0, b2 = 0, k = ((zj) r3.m0.get(b1)).Pb.Z8; b2 < k; ) {
                        int m;
                        arrayOfInt[m] = arrayOfInt[m = ((Jk0) arrayOfObject[b2]).R80] + 1;
                        b2++;
                    }
                    b1++;
                }
                for (b1 = 0, paramInt3 = arrayOfInt.length; b1 < paramInt3; ) {
                    GY(b1, arrayOfInt[b1]);
                    b1++;
                }
            }
            /*  8 */
            o0 o01;
            int j;
            float f1;
            byte b;
            for (o01 = r3.eN, j = 0, paramInt3 = 0, paramBoolean = 0, f1 = 0.0F, b = 0; b < paramInt2; ) {
                zj zj;
                Object[] arrayOfObject;
                float[] arrayOfFloat1;
                fQ fQ1;
                float f2;
                float f3;
                byte b1;
                int k;
                for (arrayOfObject = fQ1.Uq0, arrayOfFloat1 = zj.Qd0.By0, f2 = paramFloat1 + zj.x0, f3 = f + zj.FI, b1 = 0, k = (fQ1 = (zj = (zj) r3.m0.get(b)).Pb).Z8; b1 < k; ) {
                    int m = paramBoolean + 1;
                    if (paramBoolean == paramInt3) {
                        f1 = i8.uU(o01.Vl(++j));
                        if (++j < o01.mG0) {
                            int i4 = o01.Vl(j);
                        } else {
                            byte b2 = -1;
                        }
                    }
                    f2 += arrayOfFloat1[b1];
                    /*  9 */
                    float f5 = this.pg.XO.gu0, f6 = this.pg.XO.jw;
                    Jk0 jk0;
                    float f7 = (jk0 = (Jk0) arrayOfObject[b1]).eJ * f5 + f2, f8 = ((Jk0) arrayOfObject[b1]).Sx0 * f6 + f3;
                    f5 = ((Jk0) arrayOfObject[b1]).zq * f5;
                    f6 = ((Jk0) arrayOfObject[b1]).h50 * f6;
                    float f9 = ((Jk0) arrayOfObject[b1]).Yz0, f10 = ((Jk0) arrayOfObject[b1]).J2, f11 = ((Jk0) arrayOfObject[b1]).ph0, f12 = ((Jk0) arrayOfObject[b1]).I20;
                    if (this.Ns) {
                        f7 = Math.round(f7);
                        f8 = Math.round(f8);
                        f5 = Math.round(f5);
                        f6 = Math.round(f6);
                    }
                    float f4 = f7 + f5;
                    f5 = f8 + f6;
                    int i2 = jk0.R80;
                    int i3;
                    this.UQ[i2] = (i3 = this.UQ[i2]) + 20;
                    o0[] arrayOfO0;
                    if ((arrayOfO0 = this.S80) != null) {
                        int i4;
                        this.Ez0 = (i4 = this.Ez0) + 1;
                        arrayOfO0[i2].oU(i4);
                    }
                    i2 = i3 + 1;
                    this.Xs[i2][i3] = f7;
                    this.Xs[i2][i2++] = f8;
                    this.Xs[i2][i2++] = f1;
                    this.Xs[i2][i2++] = f9;
                    this.Xs[i2][i2++] = f11;
                    this.Xs[i2][i2++] = f7;
                    this.Xs[i2][i2++] = f5;
                    this.Xs[i2][i2++] = f1;
                    this.Xs[i2][i2++] = f9;
                    this.Xs[i2][i2++] = f12;
                    this.Xs[i2][i2++] = f4;
                    this.Xs[i2][i2++] = f5;
                    int i1 = i2 + 1;
                    this.Xs[i2][i2] = f1;
                    this.Xs[i2][i1++] = f10;
                    this.Xs[i2][i1++] = f12;
                    this.Xs[i2][i1++] = f4;
                    int n = i1 + 1;
                    this.Xs[i2][i1] = f8;
                    this.Xs[i2][n++] = f1;
                    this.Xs[i2][n++] = f10;
                    this.Xs[i2][n] = f11;
                    b1++;
                }
                b++;
            }
        }
        /* 10 */
        return r3;
    }

    /*    */
    /*    */
    /*    */
    public final void d9(JX paramJX) {
        /*    */
        fQ fQ1 = this.pg.Eh0;
        /*    */
        byte b = 0;
        /*    */
        for (int i = this.Xs.length; b < i; ) {
            /*    */
            if (this.UQ[b] > 0) {
                /*    */
                float[] arrayOfFloat = this.Xs[b];
                /*    */
                paramJX.xu(((pe0) fQ1.get(b)).G3, arrayOfFloat, this.UQ[b]);
                /*    */
            }
            /*    */
            b++;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public GE(Me paramMe) {
        /*    */
        this(paramMe, paramMe.Ah());
        /*    */
    }

    /*    */
    /*    */
    public GE(Me paramMe, boolean paramBoolean) {
        /*    */
        this.pg = paramMe;
        /*    */
        this.Ns = paramBoolean;
        /*    */
        int i;
        /*    */
        if ((i = paramMe.Eh0.Z8) != 0) {
            /*    */
            this.Xs = new float[i][];
            /*    */
            this.UQ = new int[i];
            /*    */
            if (i > 1) {
                /*    */
                paramBoolean = false;
                /*    */
                int j = (this.S80 = new o0[i]).length;
                /*    */
                while (paramBoolean < j) {
                    /*    */
                    o0 o01;
                    /*    */
                    this();
                    /*    */
                    this.S80[paramBoolean] = o01;
                    /*    */
                    paramBoolean++;
                    /*    */
                }
                /*    */
            }
            /*    */
            this.d8 = new int[i];
            /*    */
            return;
            /*    */
        }
        /*    */
        throw new IllegalArgumentException("The specified font must contain at least one texture page.");
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GE.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */