package f;

import java.nio.ByteBuffer;

public abstract class IK0 {
  public static final ik Xh0 = C00.gd(IK0.class);
  
  public static IK0 qB0(ByteBuffer paramByteBuffer) {
    int i;
    switch (i = paramByteBuffer.getInt(paramByteBuffer.position())) {
      default:
        Xh0.info("unexpected magic: " + i);
        return null;
      case 810570818:
        return eB.ki0(paramByteBuffer);
      case 809588290:
        return qx0.P8(paramByteBuffer);
      case 809587778:
        return uv.vb0(paramByteBuffer);
      case 809585986:
        return tq0.NM(paramByteBuffer);
      case 809583426:
        break;
    } 
    return PK.yn(paramByteBuffer);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */