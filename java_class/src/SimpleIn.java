
// Socket 클래스
import java.net.*;

// 입출력 클래스
import java.io.*;

// 그래픽 관련 클래스
import java.awt.*; // GUI
import javax.swing.*; // JFrame, JTextField, JTextArea, JScrollPane

// Event 처리
import java.awt.event.*; // ActionListener

public class ChatGUIClient extends JFrame implements ActionListener, Runnable {

    // ======== GUI =========
    JTextField tf; // 전송할 텍스트 입력창
    JTextArea ta; // 전송받은 텍스트 출력

    JScrollPane js; // 스크롤바 생성

    // ======== Socket =======
    Socket s; // 서버와의 통신을 위함

    // ======== Stream =======
    BufferedReader br; // 클라이언트에서의 문자열 입력 스트림
    PrintWriter pw; // 문자열 출력 스트림

    // 서버로 전송할 문자열과 서버에서 받아올 문자열 변수
    String str, str1;

    // ======== 생성자 ========
    public ChatGUIClient() {

        tf = new JTextField();
        ta = new JTextArea();
        js = new JScrollPane(ta);


        add(js, "Center");

        add(tf, BorderLayout.SOUTH);

        tf.addActionListener(this);

        setBounds(200, 200, 500, 350);

        setVisible(true);

        tf.requestFocus();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {

            s = new Socket("192.168.0.145", 5432);
            System.out.println("s>>>" + s);

            // ========== Server와 Stream 연결 ===========
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));


            pw = new PrintWriter(s.getOutputStream(), true);

        } catch (Exception e) {
            System.out.println("접속 오류>>>" + e);
        }

        Thread ct = new Thread(this);

        ct.start();
    }
    public void run() {
        try {
            while ((str1 = br.readLine()) != null) {
                ta.append(str1 + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ;
        }
    }

    public void actionPerformed(ActionEvent e) {
        str = tf.getText();
        tf.setText("");

        pw.println(str);
        pw.flush();
    }

    public static void main(String[] args) {
        new ChatGUIClient();

    }
}