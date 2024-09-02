public class Main {

    public static void main(String[] args) {

        // instatiating IDandPasswords class
        IDandPasswords idandPasswords = new IDandPasswords();

        // instatiating LoginPage class with parameters from login informations of previous instance
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }
}