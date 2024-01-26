/* 1 */
package f;

public final class cp implements Runnable, lu {
    public final void dispose() {
        synchronized (HC.m7) {
            fQ fQ1;
            if (HC.uB == this) HC.uB = null;
            this.P20.clear();
            null.notifyAll(); /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
            try {
                return;
            }
            /* 2 */ finally {
                this = null;
                /*   */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
            }
            /*   */
        }
        /*   */
    }

    /*   */
    /*   */
    /*   */   public final lpt2 K0 = UB0.vj0;
    /*   */   public final x Sq0;
    /*   */   public final fQ P20 = new fQ(1);
    /*   */   public HC vz0;
    /*   */   public long BF0;

    /*   */
    /*   */
    public cp() {
        /*   */
        this.Sq0 = q50;
        /*   */
        Q50 q50;
        /*   */
        (q50 = UB0.Kg0).QS(this);
        /*   */
        Sm0();
        /*   */
        (new Thread(this, "Timer")).setDaemon(true);
        /*   */
        (new Thread(this, "Timer")).start();
        /*   */
    }

    /*   */
    /*   */
    public final void run() {
        /*   */     /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ObjectTypeReferenceExpression{ObjectType{f/HC}}, name=m7, descriptor=Ljava/lang/Object;}} */
        /*   */
        while (true) {
            /*   */
            Object object;
            /*   */
            try {
                /*   */
                if (HC.uB == this && this.K0 == UB0.vj0) {
                    /*   */
                    Exception exception;
                    /*   */
                    long l = 5000L;
                    /*   */
                    if (this.BF0 == 0L) {
                        /*   */
                        long l1 = System.nanoTime() / 1000000L;
                        /*   */
                        byte b = 0;
                        /*   */
                        int i = this.P20.Z8;
                        /*   */
                        while (b < i) {
                            /*   */
                            try {
                                /*   */
                                l = ((HC) this.P20.get(b)).zT(l1, l);
                                /*   */
                            } finally {
                                /*   */
                                exception = null;
                                /*   */
                            }
                            /*   */
                        }
                        /*   */
                    }
                    /*   */
                    if (HC.uB == this && this.K0 == UB0.vj0) {
                        /*   */
                        if (exception > 0L)
                            /*   */ try {
                            /*   */
                            HC.m7.wait(exception);
                            /*   */
                        } catch (InterruptedException interruptedException) {
                        }
                        /*   */             /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                        /*   */
                        continue;
                        /*   */
                    }
                    /*   */
                }
                /*   */
                return;
                /*   */
            } finally {
                /*   */
                this = null;
                /*   */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
                /*   */
            }
            /*   */
        }
        /*   */
    }

    /*   */
    /*   */
    public final void Sm0() {
        /*   */
        synchronized (HC.m7) {
            /*   */
            long l = System.nanoTime() / 1000000L - this.BF0;
            /*   */
            byte b = 0;
            /*   */
            int i = this.P20.Z8;
            /*   */
            while (b < i) {
                /*   */
                ((HC) this.P20.get(b)).th(l);
                /*   */
                b++;
                /*   */
            }
            /*   */
            this.BF0 = 0L;
            /*   */
            HC.m7.notifyAll();
            /*   */
            return;
            /*   */
        }
        /*   */
    }

    /*   */
    /*   */
    public final void oC0() {
        /*   */     // Byte code:
        /*   */     //   0: getstatic f/HC.m7 : Ljava/lang/Object;
        /*   */     //   3: dup
        /*   */     //   4: dup
        /*   */     //   5: astore_1
        /*   */     //   6: aload_0
        /*   */     //   7: aload_1
        /*   */     //   8: monitorenter
        /*   */     //   9: invokestatic nanoTime : ()J
        /*   */     //   12: ldc2_w 1000000
        /*   */     //   15: ldiv
        /*   */     //   16: putfield BF0 : J
        /*   */     //   19: invokevirtual notifyAll : ()V
        /*   */     //   22: monitorexit
        /*   */     //   23: return
        /*   */     //   24: aload_1
        /*   */     //   25: monitorexit
        /*   */     //   26: athrow
        /*   */     // Exception table:
        /*   */     //   from	to	target	type
        /*   */     //   9	23	24	finally
        /*   */     //   24	26	24	finally
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */