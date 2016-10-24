package first6_1;

/**
 * Created by admin on 2016/10/19.
 */
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        //原价
        int selPrice = super.getPrice();
        int offPrice = 0;
        if(selPrice>4000) {
            offPrice = selPrice * 90 /100;
        }else {
            offPrice = selPrice * 80 /100;
        }
        return offPrice;
    }
}
