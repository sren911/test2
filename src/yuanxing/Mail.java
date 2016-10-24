package yuanxing;

/**
 * Created by admin on 2016/10/21.
 */
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSubject() {
        return subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public String getContxt() {
        return contxt;
    }

    public String getTail() {
        return tail;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
