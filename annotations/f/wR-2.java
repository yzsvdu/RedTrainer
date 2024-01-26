/* 1 */
package f;

public final class wR extends Writer {
    public final void q00() {
        if (!this.iK)
            /* 2 */ {
            Lv0 lv0;
            byte b;
            Writer writer = ((Lv0) this.b7.pop()).Gy0.CoM9;
            if (((Lv0) this.b7.pop()).xX) {
                b = 93;
            } else {
                b = 125;
            }
            writer.write(b);
            fQ fQ1;
            /* 3 */
            if ((fQ1 = this.b7).Z8 == 0) {
                fQ1 = null;
            } else {
                lv0 = (Lv0) fQ1.peek();
            }
            this.x30 = lv0;
            return;
        }
        throw new IllegalStateException("Expected an object, array, or value since a name was set.");
    }

    /*   */
    /*   */
    /*   */   public final Writer CoM9;
    /*   */   public final fQ b7 = new fQ();
    /*   */   public Lv0 x30;
    /*   */   public boolean iK;
    /*   */   public BB ay0 = BB.nc;
    /*   */   public boolean wR = false;

    /*   */
    /*   */
    public wR(Writer paramWriter) {
        /*   */
        this.CoM9 = paramWriter;
        /*   */
    }

    /*   */
    /*   */
    public final wR Lj0(String paramString) {
        /*   */
        Lv0 lv0;
        /*   */
        if ((lv0 = this.x30) != null && !lv0.xX) {
            /*   */
            if (!lv0.br0) {
                /*   */
                lv0.br0 = true;
                /*   */
            } else {
                /*   */
                this.CoM9.write(44);
                /*   */
            }
            /*   */
            this.CoM9.write(this.ay0.ve(paramString));
            /*   */
            this.CoM9.write(58);
            /*   */
            this.iK = true;
            /*   */
            return this;
            /*   */
        }
        /*   */
        throw new IllegalStateException("Current item must be an object.");
        /*   */
    }

    /*   */
    /*   */
    public final wR AQ(Object paramObject) {
        /*   */
        if (this.wR && (paramObject instanceof Long || paramObject instanceof Double || paramObject instanceof java.math.BigDecimal || paramObject instanceof java.math.BigInteger)) {
            /*   */
            paramObject = paramObject.toString();
            /*   */
        } else {
            /*   */
            long l = ((Number) paramObject).longValue();
            /*   */
            if (paramObject instanceof Number && ((Number) paramObject).doubleValue() == l)
                /*   */ paramObject = Long.valueOf(l);
            /*   */
        }
        /*   */
        wq0();
        /*   */
        this.CoM9.write(this.ay0.kW(paramObject));
        /*   */
        return this;
        /*   */
    }

    /*   */
    /*   */
    public final void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
        /*   */
        this.CoM9.write(paramArrayOfchar, paramInt1, paramInt2);
        /*   */
    }

    /*   */
    /*   */
    public final void flush() {
        /*   */
        this.CoM9.flush();
        /*   */
    }

    /*   */
    /*   */
    public final void close() {
        /*   */
        while (this.b7.Z8 > 0)
            /*   */ q00();
        /*   */
        this.CoM9.close();
        /*   */
    }

    /*   */
    /*   */
    public final void wq0() {
        /*   */
        Lv0 lv0;
        /*   */
        if ((lv0 = this.x30) == null)
            /*   */ return;
        /*   */
        if (lv0.xX) {
            /*   */
            if (!lv0.br0) {
                /*   */
                lv0.br0 = true;
                /*   */
            } else {
                /*   */
                this.CoM9.write(44);
                /*   */
            }
            /*   */
        } else {
            /*   */
            if (this.iK) {
                /*   */
                this.iK = false;
                /*   */
                return;
                /*   */
            }
            /*   */
            throw new IllegalStateException("Name must be set.");
            /*   */
        }
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wR.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */