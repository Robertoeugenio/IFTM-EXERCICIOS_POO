package design_state;
class PortaAberta extends PortaEstado {
    public PortaAberta(Porta porta) { super(porta); }
    public void click()   { _porta.setState(new PortaFicaAberta(_porta)); }
    public void timeout() { _porta.setState(new PortaFechando(_porta)); }
  }