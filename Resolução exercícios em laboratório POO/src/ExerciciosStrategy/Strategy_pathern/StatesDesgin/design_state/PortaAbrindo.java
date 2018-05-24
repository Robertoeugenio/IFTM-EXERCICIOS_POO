package design_state;
class PortaAbrindo extends PortaEstado {
    public PortaAbrindo(Porta porta) { super(porta); }
    public void click()    { _porta.setState(new PortaFechando(_porta)); }
    public void complete() { _porta.setState(new PortaAberta(_porta)); }
  }