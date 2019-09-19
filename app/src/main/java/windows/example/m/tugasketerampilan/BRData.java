package windows.example.m.tugasketerampilan;

import java.util.ArrayList;

public class BRData {
    public static String[][] data = new String[][]{
            {"Pop Ice Mangga", "Pop Ice mangga adalah variasi rasa dari pop ice yang terinspirasi dari rasa buah mangga", "https://cf.shopee.co.id/file/9609f651e419153fd1737db672eb0745"},
            {"Pop Ice Permen Karet", "Pop Ice permen karet adalah variasi rasa dari pop ice yang terinspirasi dari rasa permen karet", "https://1.bp.blogspot.com/-XNLVuwSvcyo/WHcFBI4K91I/AAAAAAAADFM/AiJl-t2bhw0mDAwEDMssAitLL4Z5sbCRQCLcB/s1600/permen-karet.jpg"},
            {"Pop Ice Anggur", "Pop Ice anggur adalah variasi rasa dari pop ice yang terinspirasi dari rasa buah anggur", "https://s1.bukalapak.com/img/196853794/w-1000/Pop_Ice_Anggur_Per_Renceng___10pcs__.jpg"},
            {"Pop Ice Vanilla Blue", "Pop Ice vanilla blue adalah variasi rasa dari pop ice yang terinspirasi dari rasa vanilla blue", "https://ecs7.tokopedia.net/img/cache/700/product-1/2016/8/21/71288/71288_b9f17628-146c-477b-9df4-2ff12c5df6b8.jpg"},
            {"Pop Ice Moccacino", "Pop Ice moccacino adalah variasi rasa dari pop ice yang terinspirasi dari rasa moccacino", "https://2.bp.blogspot.com/-vI0tFna9I5w/WLQ1LJZlNOI/AAAAAAAAE2o/jl9eHAAi-SkzW1Joi7w1-nlYqOpdW0uhQCLcB/s1600/Pop%2BIce%2BCappucino%2BMilkshake%2BFavorit.jpg"},
            {"Pop Ice Durian", "Pop Ice durian adalah variasi rasa dari pop ice yang terinspirasi dari rasa buah durian", "https://ecs7.tokopedia.net/img/cache/700/product-1/2016/8/21/71288/71288_a741fbe7-3489-4385-b879-0c2b2ca28358.jpg"},
            {"Pop Ice Taro", "Pop Ice taro adalah variasi rasa dari pop ice yang terinspirasi dari rasa taro", "https://ecs7.tokopedia.net/img/cache/700/product-1/2016/8/21/71288/71288_354516aa-3d5a-45dc-89f4-1c60c295a1f2.jpg"}
    };
    public static ArrayList<BR> getListData(){
        ArrayList<BR> list = new ArrayList<>();
        for (String[] aData : data) {
            BR asus = new BR();
            asus.setName(aData[0]);
            asus.setFrom(aData[1]);
            asus.setPhoto(aData[2]);
            list.add(asus);
        }
        return list;
    }
}

