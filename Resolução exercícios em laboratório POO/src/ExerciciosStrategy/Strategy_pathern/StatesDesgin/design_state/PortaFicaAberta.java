package design_state;
class PortaFicaAberta extends PortaEstado {
    public PortaFicaAberta(Porta porta) { super(porta); }
    public void click() { _porta.setState(new PortaFechando(_porta)); }
  }