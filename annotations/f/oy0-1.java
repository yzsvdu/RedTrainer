/*  1 */ package f;public final class oy0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.C70); paramByteBuffer
/*    */       
/*  3 */       .putShort((short)this.DG0.size());
/*  4 */     if (this.DG0.isEmpty()) return;  long l; paramByteBuffer
/*    */       
/*  6 */       .putLong(l = ((Vp)this.DG0.get(0)).iL0);
/*  7 */     for (Iterator<Vp> iterator = this.DG0.iterator(); iterator.hasNext(); ) { Vp vp; paramByteBuffer
/*    */         
/*  9 */         .put((vp = iterator.next()).Yo);
/* 10 */       if ((l = vp.iL0 - l) > 32767L) { paramByteBuffer
/* 11 */           .putShort((short)-1);
/*    */         
/* 13 */         paramByteBuffer.putLong(vp.iL0); } else { paramByteBuffer
/* 14 */           .putShort((short)(int)l); }
/* 15 */        byte b; if ((b = vp.Yo) != 14) { switch (b) { case 5: case 6: case 7: case 8:
/* 16 */             b = vp.X20;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 25 */             paramByteBuffer
/* 26 */               .put(b); break;
/*    */           case 2: case 3:
/* 28 */             paramByteBuffer.put(vp.QH0); paramByteBuffer.put(vp.E8); paramByteBuffer.putShort(vp.hp); paramByteBuffer
/*    */               
/* 30 */               .putShort(vp.CON); break;case 0: case 1: paramByteBuffer.put(vp.QH0); b = vp.X20; paramByteBuffer.put(b); break;case 4: case 9: paramByteBuffer.putShort(vp.hp); paramByteBuffer.putShort(vp.CON); break; }
/* 31 */          long l1 = vp.iL0; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public List DG0;
/*    */   public boolean C70;
/*    */   
/*    */   public oy0(boolean paramBoolean, List paramList) {
/*    */     super(168);
/*    */     this.DG0 = paramList;
/*    */     this.C70 = paramBoolean;
/*    */     paramList.sort(Comparator.comparing(Vp::jr0));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */