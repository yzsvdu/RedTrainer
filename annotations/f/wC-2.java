/*  1 */ package f;public final class wC extends t4 { public final void run() { Wo wo; if ((wo = km.mI0.AN) != null) { T7 t7; this.aB0 = new s20(km.mI0.AN);
/*    */       
/*  3 */       Ve0.ST = new Ve0();
/*    */       
/*  5 */       Ve0.xj = new ig(this.TI.B8("/a/1/2/2"));
/*    */       
/*  7 */       Ve0.xI0 = new ig(this.TI.B8("/a/1/1/0"));
/*    */       
/*  9 */       Ve0.Ez = new ig(this.TI.B8("/a/1/3/5"));
/*    */       
/* 11 */       Ve0.tz0 = new ig(this.TI.B8("/a/1/0/7"));
/*    */       
/* 13 */       Ve0.bx0 = new ig(this.TI.B8("/a/1/3/8"));
/*    */       
/* 15 */       Ve0.Wu0 = new ig(this.TI.B8("/a/1/2/1"));
/*    */       
/* 17 */       Ve0.ry0 = new ig(this.TI.B8("/a/1/5/3"));
/*    */       
/* 19 */       Ve0.yy = new ig(this.TI.B8("/a/1/6/2"));
/*    */       
/* 21 */       Ve0.iH = new ig(this.TI.B8("/a/1/5/7"));
/*    */ 
/*    */       
/* 24 */       E80.Mx0();
/*    */       int i;
/*    */       ByteBuffer byteBuffer;
/*    */       int j;
/* 28 */       if ((i = Fq.cL0(byteBuffer = ((wo = km.mI0.AN).TI.B8("/a/1/5/0")).bP.GA0(), this.XL)) == (j = 1129464142)) { byteBuffer
/* 29 */           .position(); byteBuffer.getInt(); byteBuffer.getInt(); i = byteBuffer.position(); byteBuffer.position(byteBuffer.getInt() * 8 + i);
/* 30 */         byteBuffer.getInt(); byteBuffer.getInt(); byteBuffer.position(); }
/* 31 */       else { throw new RuntimeException(
/* 32 */             RH0.KK("Header magic mismatch = ", i, " vs expected ", j)); }
/*    */        }
/* 34 */      gD gD; if ((gD = km.mI0.MT) != null) this
/* 35 */         .aB0 = new s20(km.mI0.MT);  BE bE;
/* 36 */     if ((bE = km.mI0.yE) != null) this
/* 37 */         .aB0 = new s20(km.mI0.yE);  }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */