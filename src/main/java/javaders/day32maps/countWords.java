package javaders.day32maps;

import javaders.day19arraylists.ArrayList01;

import java.util.ArrayList;
import java.util.List;

public class countWords {


    public static void main(String[] args) {
        String[] a = {"Ahmet","Ahmet","Hasan","Hasan","Hasan","Ahmet","Kazim","Bekir","Mete","Mete"};
        ArrayList<String> wl = new ArrayList<>();
        ArrayList<Integer> wc = new ArrayList<>();
        ArrayList<Object> all = new ArrayList<>();



        for (String word:a) {
            if (!wl.contains(word)) {
                wl.add(word);
                wc.add(1);
            }else{
                wc.set(wl.indexOf(word),wc.get(wl.indexOf(word))+1);
            }

        }

        for (int i=0; i<= wl.size()-1;i++){
            all.add(wl.get(i)+":"+wc.get(i));

        }

        System.out.println(all.toString());

    }

}

