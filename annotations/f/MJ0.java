/* 1 */
package f;


// Manages GLFWwindow* window
public final class MJ0 implements iq0 {
    public final void dispose() {
        this.QH0.oC0();
        this.QH0.dispose();
        for (int i = cOm1.RO.Z8 - 1; i >= 0; ) {
            fQ fQ1;
            if (((cOm1) (fQ1 = cOm1.RO).get(i)).qR.equals(this)) ((cOm1) fQ1.Hc(i)).dispose();
            i--;
        }
        /* 2 */
        this.Ai
/* 3 */.L90
/* 4 */.free();
        /* 5 */
        this.wR.dispose();
        GLFW.glfwSetWindowFocusCallback(this.ne0, null);
        GLFW.glfwSetWindowIconifyCallback(this.ne0, null);
        GLFW.glfwSetWindowCloseCallback(this.ne0, null);
        GLFW.glfwSetDropCallback(this.ne0, null);
        GLFW.glfwDestroyWindow(this.ne0);
        this.PQ.free();
        this.xI.free();
        this.Z3.free();
        this.Vs.free();
        this.Uj.free();
        this.Jw.free();
    }

    /*   */
    /*   */
    /*   */   public long ne0; // GLFWwindow* window
    /*   */   public final tG0 QH0;
    /*   */   public final IM cd0;
    /*   */   public boolean vi0 = false;
    /*   */   public oY Og; // has Pw object which handles the bulk of initialization before the window shows up
    /*   */   public w70 Ai; // window library
    /*   */   public aY wR; // input handler
    /*   */   public final fa oA0; // this will set up window parameters
    /*   */   public final fQ ve = new fQ(); // object array
    /*   */   public final fQ BB = new fQ(); // object array
    /*   */   public final IntBuffer T10;
    /*   */   public final IntBuffer D40;
    /*   */   public boolean Vk0 = false;
    /*   */   public boolean Rf0 = false;
    /*   */   public final Ic0 PQ = new Ic0(this); //window focus callback
    /*   */   public final L30 xI = new L30(this); // window iconify callback
    /*   */   public final a5 Z3 = new a5(this); // window maximize
    /*   */   public final z70 Vs = new z70(this); // window close callback
    /*   */   public final i30 Uj = new i30(this); // window drop callback
    /*   */   public final SU Jw = new SU(this); // window refresh callback

    /*   */
    /*   */
    public MJ0(tG0 paramtG0, fa paramfa, IM paramIM) {
        /*   */
        this.QH0 = paramtG0;
        /*   */
        this.Og = paramfa.Q90;
        /*   */
        this.oA0 = paramfa;
        /*   */
        this.cd0 = paramIM;
        /*   */
        this.T10 = BufferUtils.createIntBuffer(1);
        /*   */
        this.D40 = BufferUtils.createIntBuffer(1);
        /*   */
    }

    /*   */
    /*   */
    public final void AF(Runnable paramRunnable) {
        /*   */
        fQ fQ1;
        /*   */     /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
        /*   */
        try {
            /*   */
            return;
            /*   */
        } finally {
            /*   */
            this = null;
            /*   */       /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
            /*   */
        }
        /*   */
    }

    /*   */
    /*   */
    public final int kl() {
        /*   */
        IntBuffer intBuffer = this.T10;
        /*   */
        GLFW.glfwGetWindowPos(this.ne0, this, this.D40);
        /*   */
        return this.T10.get(0);
        /*   */
    }

    /*   */
    /*   */
    public final int Ye() {
        /*   */
        IntBuffer intBuffer = this.T10;
        /*   */
        GLFW.glfwGetWindowPos(this.ne0, this, this.D40);
        /*   */
        return this.D40.get(0);
        /*   */
    }

    /*   */
    /*   */
    public final long hy0() {
        /*   */
        return this.ne0;
        /*   */
    }

    /*   */
    /*   */
    public final boolean a00() {

        boolean bl = iq03.vi0;
        if (!bl && !bl) {
            MJ0 mJ0 = iq03;
            mJ0.QH0.Gn0();
            mJ0.QH0.c0(iq03.Ai.fG0(), iq03.Ai.dL());
            mJ0.vi0 = true;
        }
        MJ0 mJ0 = iq03;
        Iterable iterable = mJ0.ve;
        MJ0 mJ02 = iq03;
        synchronized (iterable) {
            mJ02.BB.OG0(iq03.ve);
            mJ02.ve.clear();
            // MONITOREXIT @DISABLED, blocks:[0, 5] lbl14 : MonitorExitStatement: MONITOREXIT : var1_3
            iterable = mJ0.BB.r30();
            {
                catch (Throwable throwable) {}
                {
                    throw throwable;
                }
            }
        }
        while (((Hc0)iterable).hasNext()) {
            ((Runnable)((Hc0)iterable).next()).run();
        }
        boolean bl2 = iq03.BB.Z8 > 0 || iq03.Ai.zg0;
        MJ0 mJ03 = iq03;
        mJ03.BB.clear();
        if (!mJ03.Vk0) {
            aY aY2 = iq03.wR;
            aY2.hl0.iC0(aY2.uJ0);
        }
        MJ0 mJ04 = iq03;
        synchronized (mJ04) {
            block19: {
                w70 w702;
                boolean bl3 = mJ04.Rf0 && !iq03.Vk0;
                {
                    catch (Throwable throwable) {}
                    {
                        // ** MonitorExit[this /* !! */ ] (shouldn't be in output)
                        throw throwable;
                    }
                }
                {
                    iq03.Rf0 = false;
                    // ** MonitorExit[this /* !! */ ] (shouldn't be in output)
                    if (!(bl2 |= bl3)) break block19;
                    w702 = iq03.Ai;
                    w702.getClass();
                }
                long l = System.nanoTime();
                if (w702.PO == -1L) {
                    w702.PO = l;
                }
                w702.Qy = (float)(l - w702.PO) / 1.0E9f;
                w702.PO = l;
                if (l - w702.au0 >= 1000000000L) {
                    w702.YE = w702.U70;
                    w702.U70 = 0;
                    w702.au0 = l;
                }
                iq0 iq02 = iq03;
                ++w702.U70;
                iq02.QH0.z3();
                GLFW.glfwSwapBuffers(iq02.ne0);
            }
            if (!iq03.Vk0) {
                iq0 iq03 = iq03.wR;
                if (((aY)iq03).in) {
                    ((aY)iq03).in = false;
                    int n = 0;
                    while (true) {
                        boolean[] blArray = ((aY)iq03).Rw;
                        if (n >= ((aY)iq03).Rw.length) break;
                        blArray[n] = false;
                        ++n;
                    }
                }
                if (((SF)((Object)iq03)).DI0) {
                    ((SF)((Object)iq03)).DI0 = false;
                    int n = 0;
                    while (true) {
                        boolean[] blArray = ((SF)((Object)iq03)).t3;
                        if (n >= ((SF)((Object)iq03)).t3.length) break;
                        blArray[n] = false;
                        ++n;
                    }
                }
            }
            return bl2;
        }
    }

    /*   */
    /*   */
    public final void df0() {
        MJ0 mJ0 = this;
        synchronized (mJ0) {
            mJ0.Rf0 = true;
            return;
        }
    }

    /*   */
    /*   */
    public final fa hB0() {
        /*   */
        return this.oA0;
        /*   */
    }

    /*   */
    /*   */
    public final int hashCode() {
        /*   */
        return 31 + (int) (this.ne0 ^ this.ne0 >>> 32L);
        /*   */
    }

    /*   */
    /*   */
    public final boolean equals(Object paramObject) {
        /*   */
        if (this == paramObject)
            /*   */ return true;
        /*   */
        if (paramObject == null)
            /*   */ return false;
        /*   */
        if (MJ0.class != paramObject.getClass())
            /*   */ return false;
        /*   */
        this = (MJ0) paramObject;
        /*   */
        return !(this.ne0 != this.ne0);
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */