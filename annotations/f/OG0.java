/* 1 */ package f;public final class OG0 implements Comparable { public final int compareTo(Object paramObject) { return ((OG0)paramObject).L8 - this.L8; }
/*   */ 
/*   */   
/*   */   public short Qy;
/*   */   
/*   */   public short ip0;
/*   */   public boolean wA;
/*   */   public boolean Jf0;
/*   */   public byte Si0;
/*   */   public byte oR;
/*   */   public boolean o30;
/*   */   public boolean o6;
/*   */   public byte yl;
/*   */   public int eH;
/*   */   public byte GM;
/*   */   public byte L8;
/*   */   public int li0;
/*   */   public int n10;
/*   */   
/*   */   public OG0(ByteBuffer paramByteBuffer) {
/*   */     this.oR = (byte)(paramByteBuffer.get() & 0xFF);
/*   */     byte b;
/*   */     if (((b = paramByteBuffer.get()) & 0x1) != 0) {
/*   */       i = 1;
/*   */     } else {
/*   */       i = 0;
/*   */     } 
/*   */     this.Jf0 = i;
/*   */     if (i) {
/*   */       if ((b & 0x2) != 0) {
/*   */         i = 1;
/*   */       } else {
/*   */         i = 0;
/*   */       } 
/*   */       this.wA = i;
/*   */     } 
/*   */     this.Si0 = (byte)(b >> 6 & 0x3);
/*   */     this.eH = i;
/*   */     short s2;
/*   */     int i;
/*   */     if ((i = (s2 = paramByteBuffer.getShort()) & 0x1FF) >= 256)
/*   */       this.eH = i - 512; 
/*   */     if (!this.Jf0) {
/*   */       if ((s2 >> 12 & 0x1) != 0) {
/*   */         i = 1;
/*   */       } else {
/*   */         i = 0;
/*   */       } 
/*   */       this.o30 = i;
/*   */       if ((s2 >> 13 & 0x1) != 0) {
/*   */         i = 1;
/*   */       } else {
/*   */         i = 0;
/*   */       } 
/*   */       this.o6 = i;
/*   */     } 
/*   */     this.yl = (byte)(s2 >> 14 & 0x3);
/*   */     this.li0 = s1 & 0x3FF;
/*   */     this.L8 = (byte)(s1 >> 10 & 0x3);
/*   */     short s1;
/*   */     this.GM = (byte)((s1 = paramByteBuffer.getShort()) >> 12 & 0xF);
/*   */     if ((s1 = this.Si0) != 0) {
/*   */       if (s1 != 1) {
/*   */         if (s1 != 2);
/*   */         switch (this.yl) {
/*   */           default:
/*   */             return;
/*   */           case 3:
/*   */             this.Qy = 32;
/*   */             this.ip0 = 64;
/*   */           case 2:
/*   */             this.Qy = 16;
/*   */             this.ip0 = 32;
/*   */           case 1:
/*   */             this.Qy = 8;
/*   */             this.ip0 = 32;
/*   */           case 0:
/*   */             break;
/*   */         } 
/*   */         this.Qy = 8;
/*   */         this.ip0 = 16;
/*   */       } 
/*   */       switch (this.yl) {
/*   */         default:
/*   */         
/*   */         case 3:
/*   */           this.Qy = 64;
/*   */           this.ip0 = 32;
/*   */         case 2:
/*   */           this.Qy = 32;
/*   */           this.ip0 = 16;
/*   */         case 1:
/*   */           this.Qy = 32;
/*   */           this.ip0 = 8;
/*   */         case 0:
/*   */           break;
/*   */       } 
/*   */       this.Qy = 16;
/*   */       this.ip0 = 8;
/*   */     } 
/*   */     switch (this.yl) {
/*   */       default:
/*   */       
/*   */       case 3:
/*   */         this.Qy = 64;
/*   */         this.ip0 = 64;
/*   */       case 2:
/*   */         this.Qy = 32;
/*   */         this.ip0 = 32;
/*   */       case 1:
/*   */         this.Qy = 16;
/*   */         this.ip0 = 16;
/*   */       case 0:
/*   */         break;
/*   */     } 
/*   */     this.Qy = 8;
/*   */     this.ip0 = 8;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OG0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */