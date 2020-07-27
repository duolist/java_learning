package Collections;

import java.util.List;

public class MyList {
    private List<Integer> arList;

    public MyList(List<Integer> array) {
        this.arList = array;
    }


    public void printMyList () {
        System.out.println(arList.toString());;
    }

    public void deleteFromMyList (Deleter d) {
        int arrSize = arList.size();
        for (int i = 0; i < arList.size(); i++) {
            if (d.deleteIF(arList.get(i))) {
                arList.remove(i);
                i--;
//                arrSize--;
            }

        }
    }


    public List<Integer> getArList() {
        return arList;
    }

    public void setArList(List<Integer> arList) {
        this.arList = arList;
    }
}
