package design_state;
abstract class PortaEstado {
    protected Porta _porta;
 
    public PortaEstado(Porta porta) { _porta = porta; }
 
    public abstract void click();
 
    public void timeout()  { }
    public void complete() { }
 
    public String status() { return getClass().getName(); }
  }