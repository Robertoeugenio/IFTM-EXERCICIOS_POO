package design_state;
class PortaFechada extends PortaEstado {
    public PortaFechada(Porta porta) { super(porta); }
    public void click() { _porta.setState(new PortaAbrindo(_porta)); }
  }