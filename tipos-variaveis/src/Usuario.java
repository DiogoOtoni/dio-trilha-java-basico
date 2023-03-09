public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(44);
        smartTv.desligar();
    }

    
}
