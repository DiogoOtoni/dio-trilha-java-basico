public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("TELEVISÃO LIGADA!");
    }
    public void desligar(){
        System.out.println("DESLIGANDO TELEVISÃO!");
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("VOLUME AUMENTADO PARA: "+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("VOLUME DIMINUIDO PARA "+volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("CANAL: "+canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("CANAL: "+canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("CANAL: "+canal);
    }

}
