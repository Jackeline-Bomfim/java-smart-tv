public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.mudarCanal(11);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.desligar();
       

    }
}
