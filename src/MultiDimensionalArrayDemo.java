public class MultiDimensionalArrayDemo {
    public static void main(String[] args) {
        String [][] cities=new String[3][3];
        cities[0][0]="Istanbul";
        cities[0][1]="Ankara";
        cities[0][2]="Kocaeli";
        cities[1][0]="Edirne";
        cities[1][1]="Ordu";
        cities[1][2]="Trabzon";
        cities[2][0]="Van";
        cities[2][1]="Antalya";
        cities[2][2]="Kars";
for(int i=0;i< cities.length;i++){
    System.out.println("-----------");
    for(int j=0;j< cities.length;j++){
        System.out.println(cities[i][j]);
    }
}

    }
}
