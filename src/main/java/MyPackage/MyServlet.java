package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
		    "Why did the programmer quit his job? Because he didn't get arrays!",
		    "What's a programmer's favorite game? Find the bug!",
		    "Why did the computer go to therapy? It had too many bytes of emotional baggage.",
		    "Why was the JavaScript developer sad? Because he didn't know how to \"null\" his feelings.",
		    "Why do programmers prefer dark mode? Because light attracts bugs.",
		    "Why don't programmers like to go outside? The WiFi is terrible.",
		    "Why don't programmers like to play hide and seek? Because good programmers are always visible.",
		    "Why did the programmer go broke? Because he used up all his cache.",
		    "Why did the SQL query go to therapy? Because it had too many joins and couldn't find a match.",
		    "Why was the C# developer always calm? Because they handled exceptions gracefully.",
		    "Why did the programmer always mix up Christmas and Halloween? Because Oct 31 equals Dec 25.",
		    "Why don't programmers like to get lost? Because they fear they'll never return 0.",
		    "Why did the programmer get stuck in the shower? He couldn't find the SOAP.",
		    "Why was the Python programmer so cool? Because they were always chillin' with their pythons.",
		    "Why did the developer go broke? Because he used up all his cache.",
		    "Why was the computer cold? Because it left its Windows open.",
		    "Why did the programmer break up with his keyboard? Because it had too many commitment issues (CTRL problems).",
		    "Why did the JavaScript developer go broke? Because he lost his jQuery.",
		    "Why do programmers prefer dark mode? Because light attracts bugs.",
		    "Why did the computer keep turning on and off? It had a terminal illness.",
		    "Why did the programmer quit his job? He didn't get arrays.",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why did the computer keep sneezing? It had a virus!",
		    "Why don't programmers like nature? It has too many bugs.",
		    "Why do programmers always mix up Christmas and Halloween? Because Oct 31 equals Dec 25.",
		    "Why was the C# developer always calm? Because they handled exceptions gracefully.",
		    "Why did the programmer quit his job? Because he didn't get arrays.",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why do programmers always mix up Christmas and Halloween? Because Oct 31 equals Dec 25.",
		    "Why did the programmer quit his job? Because he didn't get arrays.",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why do programmers always mix up Christmas and Halloween? Because Oct 31 equals Dec 25.",
		    "Why did the programmer quit his job? Because he didn't get arrays.",
		    "Why was the JavaScript developer sad? Because he didn't know how to 'null' his feelings.",
		    "Why did the programmer break up with his keyboard? They had too many commitment issues (CTRL problems).",
		    "Why did the programmer go broke? Because he used up all his cache.",
		    "Why was the computer cold? Because it left its Windows open.",
		    "Why did the computer go to therapy? It had too many bytes of emotional baggage.",
		    "Why did the programmer get stuck in the shower? He couldn't find the SOAP.",
		    "Why was the C# developer always calm? Because they handled exceptions gracefully.",
		    "Why did the SQL query go to therapy? Because it had too many joins and couldn't find a match.",
		    "Why was the Python programmer so cool? Because they were always chillin' with their pythons.",
		    "Why did the developer go broke? Because he used up all his cache.",
		    "Why was the computer cold? Because it left its Windows open.",
		    "Why did the programmer break up with his keyboard? They had too many commitment issues (CTRL problems).",
		    "Why did the programmer go broke? Because he used up all his cache.",
		    "Why was the computer cold? Because it left its Windows open.",
		    "Why did the programmer break up with his keyboard? They had too many commitment issues (CTRL problems).",
		    "Why did the programmer go broke? Because he used up all his cache."
		    //write more jokes
		};

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int ans;
		
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;
		
		 int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
	     
		response.sendRedirect("index.jsp?ans="+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}