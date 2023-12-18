public enum Status {

  // How enum being initialized:
  // Step 1: normal class
  // Step 2: Someone "new" this class object and place it into memory

  ORDERED('O'), //
  SHIPPED('S'), //
  COMPLETED('C'), //
  ;

  private char val;

  private Status(char val) { // Status('0') -> Status.ORDERED('O')
    this.val = val;
  }

  public char getVal() {
    return this.val;
  }

}
