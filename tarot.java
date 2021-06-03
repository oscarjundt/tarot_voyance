import java.util.concurrent.Flow.Publisher;

import jdk.nashorn.internal.runtime.regexp.joni.ast.ConsAltNode;

class Main{
    public static void main(String[] args){
        String[] vois = {"I. Le Bateleur","II. La Papesse","III. L’Impératrice","IIII. L’Empereur","V. Le Pape","VI. L’Amoureux","VII. Le Chariot","VIII. La Justice","VIIII. L’Hermite","X. La Roue de Fortune","XI. La Force","XII. Le Pendu","XIII. L’Arcane sans nom","XIIII. Tempérance","XV. Le Diable","XVI. La Maison Dieu","XVII. L’Étoile","XVIII. La Lune","XVIIII. Le Soleil","XX. Le Jugement","XXI. Le Monde","Le Mat"};
        double[] nom = new double[22];
        ini(nom);
        affichage(vois,nom);
    }
    public static void ini(double[] x){
        for(int i=0;i<x.length;i++){
            x[i]=0 + (int)(Math.random() * ((x.length - 0) + 1));
        }
    }
    public static void affichage(String[] xx, double[] xx2){
        for(int i2=0;i2<3;i2++){
            System.out.println(xx[(int)xx2[i2]]);
        }
    }
}