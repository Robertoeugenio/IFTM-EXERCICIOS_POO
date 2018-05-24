package design_state;
class PortaFechando extends PortaEstado {
    public PortaFechando(Porta porta) { super(porta); }
    public void click()    { _porta.setState(new PortaAbrindo(_porta)); }
    public void complete() { _porta.setState(new PortaFechada(_porta)); }
  }