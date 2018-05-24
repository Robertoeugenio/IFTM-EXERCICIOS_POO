package design_state;

public class Estado {
    public static void main(String[] args) {
      Porta porta = new Porta();   
      porta.click();
      porta.complete();
      porta.timeout();
      porta.click();
      porta.status();
    }
  }
