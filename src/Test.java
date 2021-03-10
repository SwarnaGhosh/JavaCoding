import java.util.*;

public class Test {

    public static void main(String args[]){

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2,3,5,7,2,5,8,9,4,3,3));
        HashMap<Integer,Integer> result = new HashMap<>();
        int count =1;

        try{
            for(int i =0;i<input.size();i++) {
                if(result.containsKey(input.get(i))){
                    result.put(input.get(i),result.get(input.get(i))+1);
                }
                else {
                    result.put(input.get(i),1);
                }

            }

            for (Map.Entry<Integer,Integer> entry:result.entrySet()){
                System.out.println(entry.getKey()+"--"+entry.getValue());
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("---------------------------------------------------");
        countString();

    }

    public static void countString(){
        String string =  "aaabbffehttrddf";
        String array[] = string.split("");

        HashMap<String,Integer> map = new HashMap<>();

        for(int i =0;i<array.length;i++){

            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }

        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }

    }
}
