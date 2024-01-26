/*  1 */ package f;public final class hK extends Kl0 { public int y30; public byte x9 = -1; public byte He0; public short tJ; public short f10; public short ma0 = -1; public FV vJ0; public hK(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { this
/*  2 */       .y30 = this.Ws.getInt();
/*    */     
/*  4 */     this.tJ = this.Ws.getShort(); byte b;
/*  5 */     if (((b = this.Ws.get()) & 0x1) != 0) this
/*    */         
/*  7 */         .x9 = this.Ws.get();  if ((b & 0x2) != 0) this
/*    */         
/*  9 */         .f10 = this.Ws.getShort();  if ((b & 0x4) != 0) this.vJ0 = k60();  if ((b & 0x8) != 0) { this
/*    */         
/* 11 */         .ma0 = this.Ws.getShort();
/*    */       
/* 13 */       this.He0 = this.Ws.get(); }  } public final void Cx() { vh0 vh0 = km.a3; int i = this.y30; byte b1 = this.x9; short s1 = this.tJ, s2 = this.f10; FV fV = this.vJ0; short s3 = this.ma0; byte b2 = this.He0; tc tc; if (tc = (tc)this.KO.get(Integer.valueOf(i)) instanceof Kr0) { tc = this; if (b1 == -1) b1 = ((Kr0)this).hG0;  ((Kr0)this).hG0 = b1; ((Kr0)this).zH0 = s1; ((Kr0)this).C5 = G00.Av0.Cx0(b1, s1, false); hX.IV().getClass(); if (hX.aR(s1, b1)) ((Kr0)this).jF = true;  ((Or)this.Y1).Mv(); Do(); WC(s2, false, (byte)0); ((Kr0)this).Wy0 = fV;
/* 14 */       ((Kr0)this).Ks0 = s3; ((Kr0)this).mn = b2; }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hK.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */