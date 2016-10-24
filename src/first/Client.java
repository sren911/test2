package first;

/**
 * Created by admin on 2016/10/19.
 */
public class Client {
    public static void main(String[] args) {
        InstallSoftware installSoftware = new InstallSoftware();
        Wizard wizard = new Wizard();
        installSoftware.installWizard(wizard);
    }
}
