package day04;

public class HttpServletTest {
    public static void main(String[] args) {
        LoginServlet login = new LoginServlet();
        FileDownloadServlet file = new FileDownloadServlet();

        login.service();
        file.service();

        method(login);
        method(file);

        method(new LoginServlet());
        method(new FileDownloadServlet());
    }

    public static void method(HttpServlet servlet){
        servlet.service();
    }
}
