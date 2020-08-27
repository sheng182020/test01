package day10.Test03;

import java.util.ArrayList;

public class Receptionist {
    Filter filter;

    public Receptionist() {
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    public void setSort(ArrayList list){
        for (int i = 0; i <list.size() ; i++) {
            User uer=(User)list.get(i);
            new Filter(){

                @Override
                public void filterUser(User u) {
                    if(u.getId()>9&u.getId()<20){
                        u.setSort("v1");
                        System.out.print(u.getId()+"-"+u.getSort()+"  ");
                    }else if(u.getId()>19&u.getId()<30){
                        u.setSort("v2");
                        System.out.print(u.getId()+"-"+u.getSort()+"  ");
                    }else{
                        u.setSort("A");
                        System.out.print(u.getId()+"-"+u.getSort()+"  ");
                    }

                }
            }.filterUser(uer);
        }
    }


}
