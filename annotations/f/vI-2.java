/*  1 */ package f;public final class vI extends d40 { public final void W10(BufferedReader paramBufferedReader) { if (!this.fs0) { this
/*    */         
/*  3 */         .Pb = Boolean.parseBoolean(iB0.dL(paramBufferedReader, "active")); } else { this.Pb = true; }
/*  4 */      if (!this.Pb) return;  byte b; float[] arrayOfFloat; for (this
/*    */       
/*  6 */       .fp = new float[Integer.parseInt(iB0.dL(paramBufferedReader, "colorsCount"))], b = 0; b < (arrayOfFloat = this.fp).length; ) { arrayOfFloat[b] = 
/*  7 */         Float.parseFloat(iB0.dL(paramBufferedReader, "colors" + b));
/*  8 */       b++; }  for (this
/*    */       
/* 10 */       .yx = new float[Integer.parseInt(iB0.dL(paramBufferedReader, "timelineCount"))], b = 0; b < (arrayOfFloat = this.yx).length; ) { arrayOfFloat[b] = 
/* 11 */         Float.parseFloat(iB0.dL(paramBufferedReader, "timeline" + b));
/* 12 */       b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public float[] fp;
/*    */   public float[] yx;
/*    */   
/*    */   public vI() {
/*    */     float[] arrayOfFloat;
/*    */     (arrayOfFloat = new float[3])[0] = 1.0F;
/*    */     (new float[3])[1] = 1.0F;
/*    */     (new float[3])[2] = 1.0F;
/*    */     this.fp = this;
/*    */     (arrayOfFloat = new float[1])[0] = 0.0F;
/*    */     this.yx = this;
/*    */     this.fs0 = true;
/*    */   }
/*    */   
/*    */   public final void HP(vI paramvI) {
/*    */     this.Pb = paramvI.Pb;
/*    */     this.fs0 = paramvI.fs0;
/*    */     float[] arrayOfFloat = new float[paramvI.fp.length];
/*    */     int i = this.length;
/*    */     System.arraycopy(paramvI.fp, 0, this, 0, i);
/*    */     this.yx = arrayOfFloat = new float[paramvI.yx.length];
/*    */     i = this.length;
/*    */     System.arraycopy(paramvI.yx, 0, this, 0, i);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */