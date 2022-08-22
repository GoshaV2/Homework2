import java.io.Console;

public class Main {
    public static void main(String[] args) {
        //#1
        short varShort=10;
        int varInt=121;
        float varFloat=12.1f;
        double varDouble=213.3232232f;
        long Long=139429482L;
        //#2
        float weightFirst=78.2f;
        float weightSecond=82.7f;
        float allWeight=weightFirst+weightSecond;
        System.out.println("Общий вес: "+allWeight);
        float diff=weightSecond-weightFirst;
        System.out.println("Разница в массе: "+diff);
        //#3
        int countBanana=5;
        int countMilk=200;
        int countIcecream=2;
        int countEggs=4;
        int weightBanana=5;
        int weightMilk=200;
        int weightIcecream=2;
        int weightEggs=4;
        int allWeightGr=countBanana*weightBanana+countMilk*weightMilk+countIcecream*weightIcecream+countEggs*weightEggs;
        float allWeightKg=(float)allWeightGr/1000;
        System.out.println("Общий вес в граммах: "+allWeightGr);
        System.out.println("Общий вес в килограммах: "+allWeightKg);
        //4
        int lossWeight1=250;
        int lossWeight2=500;
        int weight=7;
        System.out.println("Дней для потери веса в 1 случае: "+(float)weight*1000/lossWeight1);
        System.out.println("Дней для потери веса в 2 случае: "+(float)weight*1000/lossWeight2);
        System.out.println("Среднее количество дней: "+(float)weight*1000/((lossWeight2+lossWeight1)/2));
        //#5
        int MashaSalary=67_760;
        int DenisSalary=83_690;
        int KristinaSalary=76_230;
        double newMashaSalary=(double) MashaSalary+(double) MashaSalary*0.1;
        double newDenisSalary=(double) DenisSalary+(double) DenisSalary*0.1;
        double newKristinaSalary=(double) KristinaSalary+(double) KristinaSalary*0.1;
        System.out.println("Маша теперь получает "+newMashaSalary+" рублей. Годовой доход вырос на "+(newMashaSalary-(double)MashaSalary)*12+" рублей.");
        System.out.println("Денис теперь получает "+newDenisSalary+" рублей. Годовой доход вырос на "+(newDenisSalary-(double)DenisSalary)*12+" рублей.");
        System.out.println("Кристина теперь получает "+newKristinaSalary+" рублей. Годовой доход вырос на "+(newKristinaSalary-(double)KristinaSalary)*12+" рублей.");
    }
}