/* 1 */ package f;public abstract class LPt3 { public LPt3(SocketChannel paramSocketChannel, Con paramCon) { Socket socket; this.kj0 = new Object(); this.Zi = false; this.yw0 = System.currentTimeMillis(); System.currentTimeMillis(); this.Vn0 = paramSocketChannel; this.zl0 = paramCon; (this.Qw = ByteBuffer.allocate(24576)).flip(); ByteOrder byteOrder; ByteBuffer.allocate(24576).order(byteOrder = ByteOrder.LITTLE_ENDIAN); this.UM = byteBuffer; ByteBuffer byteBuffer; (byteBuffer = ByteBuffer.allocate(24576)).order(byteOrder); this.ZD = byteBuffer; (byteBuffer = ByteBuffer.allocate(24576).duplicate()).order(byteOrder); if (paramSocketChannel.socket() != null && paramSocketChannel.socket().getInetAddress() != null) { this.he0 = z5.qC0((socket = paramSocketChannel.socket()).getInetAddress()); z5.qC0(getLocalAddress()); } else { ((LPt3)super).he0 = iU; }  } public static final ik C6 = C00.gd(LPt3.class); public final void Tq0() { this.oy0.interestOps(i | 0x4); this.zl0.getClass(); int i; if (this.oy0.isValid() && ((i = this.oy0.interestOps()) & 0x4) == 0 && this.zl0 instanceof Vz) this
/* 2 */         .oy0.selector().wakeup();  } public final boolean kj() { return this.sO; } public abstract boolean iK0(ByteBuffer paramByteBuffer); public abstract boolean na0(ByteBuffer paramByteBuffer); public abstract boolean xo0(); public abstract void xt(); public abstract void Wg(); public final String toString() { return getClass().getSimpleName() + "[" + this.he0 + ",age=" + ((System.currentTimeMillis() - this.yw0) / 1000L) + ",closed=" + this.sO + "]"; } public final void Sa() { Object object; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/LPt3}}, name=kj0, descriptor=Ljava/lang/Object;}} */ try { if (kj()) return;  return; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */ }  } public static final o80 iU = Rf0.c9.coM3.PRN;
/*   */   public final SocketChannel Vn0;
/*   */   public final Con zl0;
/*   */   public SelectionKey oy0;
/*   */   public boolean sO;
/*   */   public final Object kj0;
/*   */   public final ByteBuffer Qw;
/*   */   public final ByteBuffer UM;
/*   */   public final ByteBuffer ZD;
/*   */   public z5 he0;
/*   */   public boolean Zi;
/*   */   public long yw0;
/*   */   
/*   */   public abstract void dC0(); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LPt3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */