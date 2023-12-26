import static java.lang.Long.sum;

public class Strings{
    String[]  Arr;
    public Strings(){
        this.Arr = new String[]{};
    }
    public void showArray(){
        System.out.println("Добавленный массив:");
        for (int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
    }
    public void showSortedArray(){
        String [] Arr3;
        Arr3 = sortArray2();
        System.out.println("Отсортированный массив:");
        for (int i=0;i<Arr.length;i++){
            System.out.println(Arr3[i]);
        }
    }
    public void sortArray(){  //сортировка пузырьком
        for (int i=0;i<(Arr.length-1);i++){
            for (int j=0;j< (Arr.length-i-1);j++){
                if (Arr[i+j+1].length()<Arr[i].length()){
                    String max =Arr[i];
                    Arr[i] = Arr[i+j+1];
                    Arr[i+j+1] = max;
                }
            }
        }
    }
    public String[] sortArray3(){
        String [] Arr3;
        Arr3 = sortArray2();
        for (int i=0;i<Arr3.length-1;i++){
            String str =Arr3[i];
            String str2 =Arr3[i+1];
            if (str.length()==str2.length()) {
                for (int j=0;j<str.length();j++){
                    char let = str.charAt(j);
                    char let2 = str2.charAt(j);
                    for (int p=0;p<str.length()-j-1;p++){
                        if (let > let2) {
                            String max = Arr3[i];
                            Arr3[i] = Arr3[i+j+1];
                            Arr3[i+j+1]=max;
                           // Arr3[i] = str;
                           // Arr3[i+1]=str2;
                        }
                        /*if (let > let2) {
                            Arr3[i] = str2;
                            Arr3[i+1]=str;
                        }
                        if (let==let2){
                            Arr3[i] = str;
                            Arr3[i+1]=str2;
                        }*/
                    }

                }



            }
                /*for (int j=0;j< Letters.length;j++){
                    String strAlp=Letters[j];
                    char alp =strAlp.charAt(j);
                    if (let == alp){
                        for (int p=0;p< Letters.length;p++){
                            String strAlp2=Letters[p];
                            char alp2 =strAlp2.charAt(p);
                            if (let2==alp2){
                                if ()
                            }
                        }
                    }

            }*/
        }
        return Arr3;
    }
    public String[] sortArray2(){  //сортировка пузырьком
        for (int i=0;i<(Arr.length-1);i++){
            for (int j=0;j< (Arr.length-i-1);j++){
                if (Arr[i+j+1].length()<Arr[i].length()){
                    String max =Arr[i];
                    Arr[i] = Arr[i+j+1];
                    Arr[i+j+1] = max;
                }
            }
        }
        return Arr;
    }
    public void addElement(String El){   //метод добавления элемента
        String[] newArr = new String[Arr.length+1];
        for (int i=0;i< Arr.length;i++){
            newArr[i] = Arr[i];
        }
        newArr[newArr.length-1] = El;
        Arr=newArr;
    }
    public String maxElement(){
        String[] Arr2;
       Arr2 = sortArray2();
       String maxElement = Arr2[Arr2.length-1];
        System.out.println("Максимальный элемент в массиве:");
        return maxElement;
    }
    public double averageLength(){
        double sum = 0;
        double avLen =0;
        System.out.println("Средняя длина элеметов в массиве:");
        for (int i=0;i<Arr.length;i++){
            String str =Arr[i];
            int len = str.length();
            sum+=len;
        }
        if (Arr.length!=0){
            avLen = sum/(Arr.length);
        }
        return avLen;
    }
}
