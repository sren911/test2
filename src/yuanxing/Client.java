package yuanxing;

import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by admin on 2016/10/21.
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XXX银行版权所有");
        int i = 0;
        while(i<6) {
            Mail cloneMail = (Mail) mail.clone();
            cloneMail.setAppellation(getRandString(5)+"先生");
            cloneMail.setReceiver(getRandString(5)+"@"+getRandString(8));
            send(cloneMail);
            i++;
        }
    }


    private static void send(Mail mail) {

        System.out.println("标题："+mail.getSubject() + "\t收件人： "+mail.getReceiver()+"\t...发送成功！");
    }
    //获得指定长度的随机字符串
    public static String getRandString(int maxLength){
        String source ="abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for(int i=0;i<maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
