package first6_1;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/10/19.
 */
public class BookStore {
    private final static List<IBook> booklist = new ArrayList<IBook>();
    static {
        booklist.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        booklist.add(new OffNovelBook("巴黎圣母院",5600,"雨果"));
        booklist.add(new OffNovelBook("悲惨世界",3500,"雨果"));
        booklist.add(new OffNovelBook("金瓶梅",4300,"兰陵笑笑生"));
    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("-----------书店卖出去的书籍记录如下：-----------");
        for (IBook book: booklist) {
            System.out.println("书籍名称：" + book.getName()+"\t书籍作者：" +book.getAuthor()+"\t书籍价格："+ format.format(book.getPrice()/100.0)+"元");
        }
    }
}
