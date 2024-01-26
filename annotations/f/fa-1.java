/* 1 */
package f;

public final class fa extends kU {
    public static fa E70(fa paramfa) {
        this();
        fa1.RA0(paramfa);
        fa1.WE = paramfa.WE;
        fa1.ng0 = paramfa.ng0;
        fa1.Fl = paramfa.Fl;
        fa1.vH0 = paramfa.vH0;
        fa1.o8 = paramfa.o8;
        fa1.yh = paramfa.yh;
        fa1.Wy = paramfa.Wy;
        fa1.Xc = paramfa.Xc;
        fa1.Y20 = paramfa.Y20;
        fa1.yo = paramfa.yo;
        fa1.tp = paramfa.tp;
        fa1.Bw0 = paramfa.Bw0;
        fa1.dv = paramfa.dv;
        fa1.Xx0 = paramfa.Xx0;
        fa1.qj = paramfa.qj;
        fa1.K10 = paramfa.K10;
        fa1.cC = paramfa.cC;
        fa1.rv0 = paramfa.rv0;
        fa1.wp = paramfa.wp;
        fa fa1;
        (fa1 = new fa()).e1 = paramfa.e1;
        return new fa();
    }

    /*   */
    /*   */
    /*   */   public static PrintStream Qe0 = System.err;
    /*   */   public boolean WE = false;
    /*   */   public int bl = Integer.MAX_VALUE;
    /*   */   public int ng0 = 16;
    /*   */   public int Fl = 512;
    /*   */   public int vH0 = 9;
    /*   */   public fN o8 = fN.RP;
    /*   */   public int yh = 3;
    /*   */   public int Wy = 2;
    /*   */   public int Xc = 8;
    /*   */   public int Y20 = 8;
    /*   */   public int yo = 8;
    /*   */   public int tp = 8;
    /*   */   public int Bw0 = 16;
    /*   */   public int dv = 0;
    /*   */   public int Xx0 = 0;
    /*   */   public boolean qj;
    /*   */   public int K10 = 60;
    /*   */   public int cC = 0;
    /*   */   public nQ rv0 = nQ.xf0;
    /*   */   public boolean wp = false;
    /*   */   public PrintStream e1 = System.err;

    /*   */
    /*   */
    public static KZ je0(jn paramjn) {
        /*   */
        Q50.vp();
        /*   */
        GLFWVidMode gLFWVidMode = GLFW.glfwGetVideoMode(((ba) (paramjn = paramjn)).Jr);
        /*   */
        long l = ((ba) paramjn).Jr;
        /*   */
        int i = gLFWVidMode.width();
        /*   */
        int k = gLFWVidMode.height();
        /*   */
        int m = gLFWVidMode.refreshRate();
        /*   */
        int n = gLFWVidMode.redBits();
        /*   */
        int j = gLFWVidMode.greenBits() + n;
        /*   */
        j = gLFWVidMode.blueBits() + j;
        /*   */
        return new KZ(l, i, k, m, j);
        /*   */
    }

    /*   */
    /*   */
    public static Zv[] dq0() {
        /*   */
        Q50.vp();
        /*   */
        GLFWVidMode.Buffer buffer;
        /*   */
        int i;
        /*   */
        Zv[] arrayOfZv = new Zv[i = (buffer = GLFW.glfwGetVideoModes(GLFW.glfwGetPrimaryMonitor())).limit()];
        /*   */
        for (byte b = 0; b < i; b++) {
            /*   */
            KZ kZ;
            /*   */
            GLFWVidMode gLFWVidMode = (GLFWVidMode) buffer.get(b);
            /*   */
            long l = GLFW.glfwGetPrimaryMonitor();
            /*   */
            int k = gLFWVidMode.width();
            /*   */
            int m = gLFWVidMode.height();
            /*   */
            int n = gLFWVidMode.refreshRate();
            /*   */
            int i1 = gLFWVidMode.redBits();
            /*   */
            int j = gLFWVidMode.greenBits() + i1;
            /*   */
            j = gLFWVidMode.blueBits() + j;
            /*   */
            this(l, k, m, n, j);
            /*   */
            arrayOfZv[b] = kZ;
            /*   */
        }
        /*   */
        return arrayOfZv;
        /*   */
    }

    /*   */
    /*   */
    public static Zv[] SE0(jn paramjn) {
        /*   */
        Q50.vp();
        /*   */
        GLFWVidMode.Buffer buffer;
        /*   */
        int i;
        /*   */
        Zv[] arrayOfZv = new Zv[i = (buffer = GLFW.glfwGetVideoModes(((ba) (paramjn = paramjn)).Jr)).limit()];
        /*   */
        for (byte b = 0; b < i; b++) {
            /*   */
            KZ kZ;
            /*   */
            GLFWVidMode gLFWVidMode = (GLFWVidMode) buffer.get(b);
            /*   */
            long l = ((ba) paramjn).Jr;
            /*   */
            int k = gLFWVidMode.width();
            /*   */
            int m = gLFWVidMode.height();
            /*   */
            int n = gLFWVidMode.refreshRate();
            /*   */
            int i1 = gLFWVidMode.redBits();
            /*   */
            int j = gLFWVidMode.greenBits() + i1;
            /*   */
            j = gLFWVidMode.blueBits() + j;
            /*   */
            this(l, k, m, n, j);
            /*   */
            arrayOfZv[b] = kZ;
            /*   */
        }

        return arrayOfZv;
        /*   */
    }

    /*   */
    /*   */
    public static jn[] Dp() {
        /*   */     // Byte code:
        /*   */     //   0: invokestatic vp : ()V
        /*   */     //   3: invokestatic glfwGetMonitors : ()Lorg/lwjgl/PointerBuffer;
        /*   */     //   6: dup
        /*   */     //   7: astore_0
        /*   */     //   8: invokevirtual limit : ()I
        /*   */     //   11: anewarray f/jn
        /*   */     //   14: astore_1
        /*   */     //   15: iconst_0
        /*   */     //   16: istore_2
        /*   */     //   17: iload_2
        /*   */     //   18: aload_0
        /*   */     //   19: invokevirtual limit : ()I
        /*   */     //   22: if_icmpge -> 99
        /*   */     //   25: aload_1
        /*   */     //   26: aload_0
        /*   */     //   27: iload_2
        /*   */     //   28: invokevirtual get : (I)J
        /*   */     //   31: dup2
        /*   */     //   32: lstore_3
        /*   */     //   33: iconst_1
        /*   */     //   34: invokestatic createIntBuffer : (I)Ljava/nio/IntBuffer;
        /*   */     //   37: astore #5
        /*   */     //   39: iconst_1
        /*   */     //   40: invokestatic createIntBuffer : (I)Ljava/nio/IntBuffer;
        /*   */     //   43: dup
        /*   */     //   44: astore #6
        /*   */     //   46: aload #5
        /*   */     //   48: lload_3
        /*   */     //   49: aload #5
        /*   */     //   51: aload #6
        /*   */     //   53: invokestatic glfwGetMonitorPos : (JLjava/nio/IntBuffer;Ljava/nio/IntBuffer;)V
        /*   */     //   56: iconst_0
        /*   */     //   57: invokevirtual get : (I)I
        /*   */     //   60: istore #5
        /*   */     //   62: iconst_0
        /*   */     //   63: invokevirtual get : (I)I
        /*   */     //   66: istore #6
        /*   */     //   68: invokestatic glfwGetMonitorName : (J)Ljava/lang/String;
        /*   */     //   71: astore #7
        /*   */     //   73: new f/ba
        /*   */     //   76: dup
        /*   */     //   77: astore #8
        /*   */     //   79: lload_3
        /*   */     //   80: iload #5
        /*   */     //   82: iload #6
        /*   */     //   84: aload #7
        /*   */     //   86: invokespecial <init> : (JIILjava/lang/String;)V
        /*   */     //   89: iload_2
        /*   */     //   90: aload #8
        /*   */     //   92: aastore
        /*   */     //   93: iinc #2, 1
        /*   */     //   96: goto -> 17
        /*   */     //   99: aload_1
        /*   */     //   100: areturn
        /*   */     // Line number table:
        /*   */     //   Java source line number -> byte code offset
        /*   */     //   #1	-> 34
        /*   */     //   #2	-> 92
        /*   */
    }

    /*   */
    /*   */
    public final void F0(int paramInt) {
        /*   */
        this.ng0 = 16;
        /*   */
        this.Fl = paramInt;
        /*   */
        this.vH0 = 6;
        /*   */
    }

    /*   */
    /*   */
    public final void Lp0(fN paramfN) {
        /*   */
        this.o8 = paramfN;
        /*   */
        this.yh = 3;
        /*   */
        this.Wy = 2;
        /*   */
    }

    /*   */
    /*   */
    public final void jg0(int paramInt) {
        /*   */
        this.Xc = 8;
        /*   */
        this.Y20 = 8;
        /*   */
        this.yo = 8;
        /*   */
        this.tp = 8;
        /*   */
        this.Bw0 = 16;
        /*   */
        this.dv = 0;
        /*   */
        this.Xx0 = paramInt;
        /*   */
    }

    /*   */
    /*   */
    public final void T1(int paramInt) {
        /*   */
        this.K10 = paramInt;
        /*   */
    }

    /*   */
    /*   */
    public final void Sd(int paramInt) {
        /*   */
        this.cC = paramInt;
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */