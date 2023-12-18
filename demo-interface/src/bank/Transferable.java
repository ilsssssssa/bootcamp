package bank;

public interface Transferable {

  boolean transfer(Transferable to, int value);

  public static void batchTransfer(Transferable[] from, Transferable[] to, int value) {
    // from[0].transfer(null, value)
  }

}