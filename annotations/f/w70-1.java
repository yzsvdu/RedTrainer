/*  1 */
package f;

public final class w70 extends bt0 implements iq0 {
    public final MJ0 AW;
    public hj0 zW;
    public ib j60;
    public volatile int sL;
    public volatile int kL;
    public volatile int m;
    public volatile int uD;
    public volatile boolean zg0 = true;
    public long PO = -1L;
    public float Qy;
    public long au0 = 0L;
    public int U70;

    public final void vV() {
        String str1 = this.zW.glGetString(7938), str2 = this.zW.glGetString(7936), str3 = this.zW.glGetString(7937);
        this(Dp0.Ro0, str1, str2, str3);
        Lh lh;
        byte b1 = 3, b2 = 2;
        int i;
        if ((i = (new Lh()).qV) > b1 || (i == b1 && lh.GS >= b2)) {
            b1 = 1;
        } else {
            b1 = 0;
        }
        if (b1 != 0 ||
                /*  2 */       GLFW.glfwExtensionSupported("GL_ARB_seamless_cube_map")) {
        } else {
        }
        if (false) this
/*  3 */.zW.glEnable(34895);
    }

    /*  4 */   public int YE;
    public int Al0;
    public int F00;
    public int nK0;
    public int rj;
    public KZ y1 = null;
    public IntBuffer yk0 = BufferUtils.createIntBuffer(1);
    public IntBuffer E00 = BufferUtils.createIntBuffer(1);
    public IntBuffer cx = BufferUtils.createIntBuffer(1);
    public IntBuffer uq = BufferUtils.createIntBuffer(1);
    public pG0 L90 = new pG0(this);

    public w70(MJ0 paramMJ0) {
        this.AW = paramMJ0;
        if ((paramMJ0.hB0()).o8 == fN.ye) {
            fE fE;
            this();
            this.j60 = fE;
            this.zW = fE;
        } else {
            try {
                hj0 hj01;
                if ((paramMJ0.hB0()).o8 == fN.RP) {
                    this();
                } else {
                    hj01 = (hj0) Lwjgl3GLES20.class.newInstance();
                }
                this.zW = hj01;
                this.j60 = null;
                dw0();
                vV();
                return;
            } finally {
                paramMJ0 = null;
            }
        }
        dw0();
        vV();
        GLFW.glfwSetFramebufferSizeCallback(paramMJ0.hy0(), (GLFWFramebufferSizeCallbackI) this.L90);
    }

    public final MJ0 rz() {
        return this.AW;
    }

    public final void dw0() {
        IntBuffer intBuffer2 = this.yk0;
        GLFW.glfwGetFramebufferSize(this.AW.ne0, intBuffer2, this.E00);
        this.sL = this.yk0.get(0);
        this.kL = this.E00.get(0);
        IntBuffer intBuffer1 = this.yk0;
        GLFW.glfwGetWindowSize(this.AW.ne0, this, this.E00);
        this.m = this.yk0.get(0);
        this.uD = this.E00.get(0);
        /*    */
        /*  6 */
        int i = this.AW.oA0.Xc, j = this.AW.oA0.Y20, k = this.AW.oA0.yo, m = this.AW.oA0.tp, n = this.AW.oA0.Bw0, i1 = this.AW.oA0.dv, i2 = this.AW.oA0.Xx0;
    }

    public final hj0 qf0() {
        return this.zW;
    }

    public final ib b20() {
        return this.j60;
    }

    public final int fG0() {
        return (this.AW.oA0.rv0 == nQ.gh) ? this.sL : this.m;
    }

    public final int dL() {
        return (this.AW.oA0.rv0 == nQ.gh) ? this.kL : this.uD;
    }

    public final float Sh0() {
        return this.Qy;
    }

    public final jn wf() { // Byte code:
        /*    */     //   0: invokestatic glfwGetMonitors : ()Lorg/lwjgl/PointerBuffer;
        /*    */     //   3: dup
        /*    */     //   4: astore_1
        /*    */     //   5: invokevirtual limit : ()I
        /*    */     //   8: dup
        /*    */     //   9: istore_2
        /*    */     //   10: anewarray f/jn
        /*    */     //   13: astore_3
        /*    */     //   14: iconst_0
        /*    */     //   15: istore #4
        /*    */     //   17: iload #4
        /*    */     //   19: aload_1
        /*    */     //   20: invokevirtual limit : ()I
        /*    */     //   23: if_icmpge -> 109
        /*    */     //   26: aload_3
        /*    */     //   27: aload_1
        /*    */     //   28: iload #4
        /*    */     //   30: invokevirtual get : (I)J
        /*    */     //   33: dup2
        /*    */     //   34: lstore #5
        /*    */     //   36: getstatic f/fa.Qe0 : Ljava/io/PrintStream;
        /*    */     //   39: pop
        /*    */     //   40: iconst_1
        /*    */     //   41: invokestatic createIntBuffer : (I)Ljava/nio/IntBuffer;
        /*    */     //   44: astore #7
        /*    */     //   46: iconst_1
        /*    */     //   47: invokestatic createIntBuffer : (I)Ljava/nio/IntBuffer;
        /*    */     //   50: dup
        /*    */     //   51: astore #8
        /*    */     //   53: aload #7
        /*    */     //   55: lload #5
        /*    */     //   57: aload #7
        /*    */     //   59: aload #8
        /*    */     //   61: invokestatic glfwGetMonitorPos : (JLjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
        /*    */     //   64: iconst_0
        /*    */     //   65: invokevirtual get : (I)I
        /*    */     //   68: istore #7
        /*    */     //   70: iconst_0
        /*    */     //   71: invokevirtual get : (I)I
        /*    */     //   74: istore #8
        /*    */     //   76: invokestatic glfwGetMonitorName : (J)Ljava/lang/String;
        /*    */     //   79: astore #9
        /*    */     //   81: new f/ba
        /*    */     //   84: dup
        /*    */     //   85: astore #10
        /*    */     //   87: lload #5
        /*    */     //   89: iload #7
        /*    */     //   91: iload #8
        /*    */     //   93: aload #9
        /*    */     //   95: invokespecial <init> : (JIILjava/lang/String;)V
        /*    */     //   98: iload #4
        /*    */     //   100: aload #10
        /*    */     //   102: aastore
        /*    */     //   103: iinc #4, 1
        /*    */     //   106: goto -> 17
        /*    */     //   109: aload_0
        /*    */     //   110: dup
        /*    */     //   111: dup2
        /*    */     //   112: dup2
        /*    */     //   113: aload_3
        /*    */     //   114: iconst_0
        /*    */     //   115: aaload
        /*    */     //   116: astore_1
        /*    */     //   117: getfield AW : Lf/MJ0;
        /*    */     //   120: getfield ne0 : J
        /*    */     //   123: aload_0
        /*    */     //   124: dup
        /*    */     //   125: getfield yk0 : Ljava/nio/IntBuffer;
        /*    */     //   128: astore #4
        /*    */     //   130: getfield E00 : Ljava/nio/IntBuffer;
        /*    */     //   133: aload #4
        /*    */     //   135: swap
        /*    */     //   136: invokestatic glfwGetWindowPos : (JLjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
        /*    */     //   139: getfield yk0 : Ljava/nio/IntBuffer;
        /*    */     //   142: iconst_0
        /*    */     //   143: invokevirtual get : (I)I
        /*    */     //   146: istore #4
        /*    */     //   148: getfield E00 : Ljava/nio/IntBuffer;
        /*    */     //   151: iconst_0
        /*    */     //   152: invokevirtual get : (I)I
        /*    */     //   155: istore #5
        /*    */     //   157: getfield AW : Lf/MJ0;
        /*    */     //   160: getfield ne0 : J
        /*    */     //   163: aload_0
        /*    */     //   164: dup
        /*    */     //   165: getfield yk0 : Ljava/nio/IntBuffer;
        /*    */     //   168: astore_0
        /*    */     //   169: getfield E00 : Ljava/nio/IntBuffer;
        /*    */     //   172: aload_0
        /*    */     //   173: swap
        /*    */     //   174: invokestatic glfwGetWindowSize : (JLjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
        /*    */     //   177: getfield yk0 : Ljava/nio/IntBuffer;
        /*    */     //   180: iconst_0
        /*    */     //   181: invokevirtual get : (I)I
        /*    */     //   184: istore_0
        /*    */     //   185: getfield E00 : Ljava/nio/IntBuffer;
        /*    */     //   188: iconst_0
        /*    */     //   189: invokevirtual get : (I)I
        /*    */     //   192: istore #6
        /*    */     //   194: iconst_0
        /*    */     //   195: istore #7
        /*    */     //   197: iconst_0
        /*    */     //   198: istore #8
        /*    */     //   200: iload #8
        /*    */     //   202: iload_2
        /*    */     //   203: if_icmpge -> 313
        /*    */     //   206: iload #7
        /*    */     //   208: iload #5
        /*    */     //   210: iload #6
        /*    */     //   212: iload #4
        /*    */     //   214: iload_0
        /*    */     //   215: aload_3
        /*    */     //   216: iload #8
        /*    */     //   218: aaload
        /*    */     //   219: dup
        /*    */     //   220: astore #9
        /*    */     //   222: invokestatic je0 : (Lf/jn;)Lf/KZ;
        /*    */     //   225: astore #10
        /*    */     //   227: iadd
        /*    */     //   228: aload #9
        /*    */     //   230: getfield TT : I
        /*    */     //   233: aload #10
        /*    */     //   235: getfield wp : I
        /*    */     //   238: iadd
        /*    */     //   239: invokestatic min : (II)I
        /*    */     //   242: iload #4
        /*    */     //   244: aload #9
        /*    */     //   246: getfield TT : I
        /*    */     //   249: invokestatic max : (II)I
        /*    */     //   252: isub
        /*    */     //   253: iconst_0
        /*    */     //   254: swap
        /*    */     //   255: invokestatic max : (II)I
        /*    */     //   258: istore #11
        /*    */     //   260: iadd
        /*    */     //   261: aload #9
        /*    */     //   263: getfield YH : I
        /*    */     //   266: aload #10
        /*    */     //   268: getfield FP : I
        /*    */     //   271: iadd
        /*    */     //   272: invokestatic min : (II)I
        /*    */     //   275: iload #5
        /*    */     //   277: aload #9
        /*    */     //   279: getfield YH : I
        /*    */     //   282: invokestatic max : (II)I
        /*    */     //   285: isub
        /*    */     //   286: iconst_0
        /*    */     //   287: swap
        /*    */     //   288: invokestatic max : (II)I
        /*    */     //   291: iload #11
        /*    */     //   293: imul
        /*    */     //   294: dup
        /*    */     //   295: istore #10
        /*    */     //   297: if_icmpge -> 307
        /*    */     //   300: aload #9
        /*    */     //   302: iload #10
        /*    */     //   304: istore #7
        /*    */     //   306: astore_1
        /*    */     //   307: iinc #8, 1
        /*    */     //   310: goto -> 200
        /*    */     //   313: aload_1
        /*    */     //   314: areturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 0
        /*    */     //   #2	-> 41
        /*    */     //   #3	-> 102
        /*    */     //   #4	-> 115
        /*    */     //   #5	-> 120
        /*    */     //   #6	-> 125
        /*    */     //   #7	-> 160
        /*    */     //   #8	-> 165
        /*    */     //   #9	-> 222
        /*  6 */     //   #10	-> 230 } public final Zv[] LpT5() { return fa.SE0(wf()); } public final void dispose() { this.L90.free(); } public final void zn(Zv paramZv) { int i; boolean bool; this.AW.wR.ko(); paramZv = paramZv; if (GLFW.glfwGetWindowMonitor(this.AW.ne0) != 0L) { bool = true; } else { bool = false; }  if (bool) { KZ kZ; long l; if ((kZ = fa.je0(wf()))
        /*  7 */         .WH0 == (
                /*  8 */         l = ((KZ) paramZv).WH0) && kZ
                /*  9 */.BB == paramZv.BB)
        /*    */
        /* 11 */
        {
            i = paramZv.wp;
            GLFW.glfwSetWindowSize(this.AW.ne0, i, paramZv.FP);
        }
        /*    */       else
        /* 13 */
        {
            i = i.wp;
            int j = i.FP, k = i.BB;
            GLFW.glfwSetWindowMonitor(this.AW.ne0, l, 0, 0, i, j, k);
        }
    } else

    {
        this
                /* 14 */.Al0 = this.AW.kl();
        this.F00 = this.AW.Ye();
        this.nK0 = this.m;
        this.rj = this.uD;
        /*    */
        /* 16 */
        this.y1 = fa.je0(wf());
        /*    */
        /*    */
        /* 19 */
        long l = i.WH0;
        /* 20 */
        i = i.wp;
        int j = i.FP, k = i.BB;
        GLFW.glfwSetWindowMonitor(this.AW.ne0, l, 0, 0, i, j, k);
    }

    dw0();

    /*    */
    /*    */ fa fa;
    /* 23 */     GLFW.glfwSwapInterval(this.fn0 =(fa =this.AW.oA0).fn0);}

    /*    */
    /*    */
    /*    */
    public final void O10(int paramInt1, int paramInt2) {
        /*    */
        int i;
        /*    */
        this.AW.wR.ko();
        /*    */
        if (GLFW.glfwGetWindowMonitor(this.AW.ne0) != 0L) {
            /*    */
            i = 1;
            /*    */
        } else {
            /*    */
            i = 0;
            /*    */
        }
        /*    */
        if (!i) {
            /*    */
            int j;
            /*    */
            i = 0;
            /*    */
            int k = 0;
            /*    */
            boolean bool = false;
            /*    */
            if (paramInt1 != this.m || paramInt2 != this.uD) {
                /*    */
                bool = true;
                /*    */
                IntBuffer intBuffer1 = this.yk0, intBuffer2 = this.E00, intBuffer3 = this.cx, intBuffer4 = this.uq;
                /*    */
                GLFW.glfwGetMonitorWorkarea(((ba) wf()).Jr, intBuffer1, intBuffer2, intBuffer3, intBuffer4);
                /*    */
                j = this.yk0.get(0);
                /*    */
                j = Math.max(0, (this.cx.get(0) - paramInt1) / 2 + j);
                /*    */
                k = this.E00.get(0);
                /*    */
                k = Math.max(0, (this.uq.get(0) - paramInt2) / 2 + k);
                /*    */
            }
            /*    */
            GLFW.glfwSetWindowSize(this.AW.ne0, paramInt1, paramInt2);
            /*    */
            if (bool)
                /*    */ GLFW.glfwSetWindowPos(this.AW.ne0, j, k);
            /*    */
        } else {
            /*    */
            if (this.y1 == null) {
                /*    */
                this.Al0 = this.AW.kl();
                /*    */
                this.F00 = this.AW.Ye();
                /*    */
                this.nK0 = this.m;
                /*    */
                this.rj = this.uD;
                /*    */
                this.y1 = fa.je0(wf());
                /*    */
            }
            /*    */
            if (paramInt1 != this.nK0 || paramInt2 != this.rj) {
                /*    */
                IntBuffer intBuffer1 = this.yk0, intBuffer2 = this.E00, intBuffer3 = this.cx, intBuffer4 = this.uq;
                /*    */
                GLFW.glfwGetMonitorWorkarea(((ba) wf()).Jr, intBuffer1, intBuffer2, intBuffer3, intBuffer4);
                /*    */
                int j = this.yk0.get(0);
                /*    */
                j = Math.max(0, (this.cx.get(0) - paramInt1) / 2 + j);
                /*    */
                int k = this.E00.get(0);
                /*    */
                k = Math.max(0, (this.uq.get(0) - paramInt2) / 2 + k);
                /*    */
                int m = this.y1.BB;
                /*    */
                GLFW.glfwSetWindowMonitor(this.AW.ne0, 0L, j, k, paramInt1, paramInt2, m);
                /*    */
            } else {
                /*    */
                i = this.Al0;
                /*    */
                int j = this.F00, k = this.y1.BB;
                /*    */
                GLFW.glfwSetWindowMonitor(this.AW.ne0, 0L, i, j, paramInt1, paramInt2, k);
                /*    */
            }
            /*    */
        }
        /*    */
        dw0();
        /*    */
    }

    /*    */
    /*    */
    public final cOm1 pe0(ZH paramZH, int paramInt1, int paramInt2) {
        /*    */
        return new cOm1(this.AW, paramZH, paramInt1, paramInt2);
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w70.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */