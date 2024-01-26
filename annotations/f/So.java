/* 1 */
package f;

public final class So extends sh {
    public static final Pc hc;
    public final ArrayList PO;
    public So DA0;
    public So Mv;
    public int BV;
    public boolean PC0;

    public static So k60() {
        ((So) hc.al()).BV = 1;
        /* 2 */
        return ((So) hc.al()).DA0 = (So) hc.al();
    }

    public static So fD() {
        ((So) hc.al()).BV = 2;
        return ((So) hc.al()).DA0 = (So) hc.al();
    }

    public So() {
        ArrayList arrayList;
        this(10);
        this.PO = this;
        TL0();
    }

    static {
        this();
        COM9 cOM9;
        hc = new Pc(cOM9);
    }

    public final void TL0() {
        super.TL0();
        this.PO.clear();
        this.Mv = null;
        this.DA0 = null;
        this.PC0 = false;
    }

    public final So PL(Wz0 paramWz0) {
        if (!this.PC0) {
            this.DA0.PO.add(paramWz0);
            return this;
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final So Zo0(So paramSo) {
        if (!this.PC0) {
            if (paramSo.DA0 == paramSo) {
                paramSo.Mv = this = this.DA0;
                this.PO.add(paramSo);
                return this;
            }
            throw new RuntimeException("You forgot to call a few 'end()' statements in your pushed timeline");
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final So Wz0(float paramFloat) {
        if (!this.PC0) {
            ((Wz0) Wz0.xX.al()).sn0(null, -1, 0.0F);
            this.DA0.PO.add(((Wz0) Wz0.xX.al()).Vq(paramFloat));
            return this;
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final So eC() {
        if (!this.PC0) {
            So so;
            (so = (So) hc.al()).Mv = this = this.DA0;
            ((So) hc.al()).BV = 1;
            this.PO.add(so);
            this.DA0 = (So) hc.al();
            return this;
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final So L5() {
        if (!this.PC0) {
            So so;
            (so = (So) hc.al()).Mv = this = this.DA0;
            ((So) hc.al()).BV = 2;
            this.PO.add(so);
            this.DA0 = (So) hc.al();
            return this;
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final So Kr() {
        if (!this.PC0) {
            So so;
            if ((so = this.DA0) != this) {
                this.DA0 = so.Mv;
                return this;
            }
            throw new RuntimeException("Nothing to end...");
        }
        throw new RuntimeException("You can't push anything to a timeline once it is started");
    }

    public final void Cy0() {
        for (int i = this.PO.size() - 1; i >= 0; ) {
            ((sh) this.PO.remove(i)).Cy0();
            i--;
        }
        Pc pc;
        if (!(pc = hc).QT.contains(this)) {
            Rz0 rz0;
            if ((rz0 = pc.Hi0) != null) rz0.xn(this);
            pc.QT.add(this);
        }
    }

    public final void Dy() {
        for (int i = this.PO.size() - 1; i >= 0; ) {
            (this.PO.get(i)).yz0 = -(this.PO.get(i)).aJ0;
            (this.PO.get(i)).g4 = -1;
            (this.PO.get(i)).uQ = false;
            ((sh) this.PO.get(i)).Dy();
            i--;
        }
    }

    public final void sa(boolean paramBoolean, int paramInt1, int paramInt2, float paramFloat) {
        float f;
        if (!paramBoolean && paramInt1 > paramInt2) {
            if (dR || paramFloat >= 0.0F) {
                f = paramFloat + 1.0F;
                paramInt1 = 0;
                paramInt2 = this.PO.size();
                while (paramInt1 < paramInt2) {
                    ((sh) this.PO.get(paramInt1)).nO(f);
                    paramInt1++;
                }
                return;
            }
            throw new AssertionError();
        }
        if (f == 0.0F && paramInt1 < paramInt2) {
            if (dR || paramFloat <= 0.0F) {
                f = paramFloat + 1.0F;
                for (paramInt1 = this.PO.size() - 1; paramInt1 >= 0; paramInt1--) ((sh) this.PO.get(paramInt1)).nO(f);
                return;
            }
            throw new AssertionError();
        }
        if (dR || f != 0.0F) {
            if (paramInt1 > paramInt2) {
                Dy();
                byte b = 0;
                paramInt1 = this.PO.size();
                while (b < paramInt1) {
                    ((sh) this.PO.get(b)).nO(paramFloat);
                    b++;
                }
            } else if (paramInt1 < paramInt2) { else();
                for (int i = this.PO.size() - 1; i >= 0; i--) ((sh) this.PO.get(i)).nO(paramFloat);
            } else if (paramFloat >= 0.0F) {
                byte b = 0;
                paramInt1 = this.PO.size();
                while (b < paramInt1) {
                    ((sh) this.PO.get(b)).nO(paramFloat);
                    b++;
                }
            } else {
                for (int i = this.PO.size() - 1; i >= 0; i--) ((sh) this.PO.get(i)).nO(paramFloat);
            } return;
        } throw new AssertionError();
    }

    public final void else()

    {
        byte b = 0;
        int i = this.PO.size();
        while (b < i) {
            ((sh) this.PO.get(b)).s0(this.aq0);
            b++;
        }
    }

    public final void Ob0() {
        super.Ob0();
        for (byte b = 0; b < this.PO.size(); ) {
            ((sh) this.PO.get(b)).Ob0();
            b++;
        }
    }

    public final Object VS() {
        if (!this.PC0) {
            byte b;
            for (this.aq0 = 0.0F, b = 0; b < this.PO.size(); ) {
                sh sh1;
                if ((sh1 = this.PO.get(b)).Zz >= 0) {
                    sh1
/* 3 */.VS();
                    int i;
                    if ((i = Zk0.yE(this.BV)) != 0) {
                        if (i == 1) this.aq0 = Math.max(this.aq0, sh1.sV());
                    } else {
                        float f = this.aq0;
                        this.aq0 = sh1.sV() + f;
                        sh1.aJ0 += f;
                    }
                    b++;
                    continue;
                }
                throw new RuntimeException("You can't push an object with infinite repetitions in a timeline");
            }
            this.PC0 = true;
        }
        return this;
    }
    /*   */
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/So.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */