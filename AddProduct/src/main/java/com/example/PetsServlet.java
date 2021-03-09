package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Product;


/**
 * Servlet implementation class PetsServlet
 */
public class PetsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PetsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
        try {
               SessionFactory factory = HibernateUtil.getSessionFactory();
               
               Session session = factory.openSession();
               //begin transaction
               session.getTransaction().begin();
               
               //instantiate products
               Product products = new Product();
               
               //get field values
               String petName = request.getParameter("name");
               BigDecimal price = new BigDecimal(request.getParameter("price"));
               String color = request.getParameter("color");
               
          
               
               //insert new pet
               products.setName(petName);
               products.setPrice(price);
               products.setColor(color);
               
               //save the session
               session.save(products);
               
               //commit transction
               session.getTransaction().commit();
               
               //let user know pet was added
               PrintWriter out = response.getWriter();
               
               out.println("<html><body>");
               
               out.println("Pet was added");
               //return user to addpet menu
               out.println("<a href = 'addpet.jsp'>Add Pet</a<br>");
               //close the session
               session.close();
               
               out.println("</body></html>");
               // using HQL
//               List<Product> list = session.createQuery("from Product", Product.class).list();
//               
//               session.close();
//               
//                PrintWriter out = response.getWriter();
//                out.println("<html><body>");
//                out.println("<b>Product Listing</b><br>");
//                for(Product p: list) {
//                        out.println("ID: " + String.valueOf(p.getID()) + ", Name: " + p.getName() +
//                                        ", Price: " + String.valueOf(p.getPrice()) + ", Color: " + p.getColor().toString() + "<br>");
               // }
                
            //out.println("</body></html>");
            
            
        } catch (NumberFormatException nfe) {
        		
                throw nfe;
        }catch(Exception ex) {
        	throw ex;
        }

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}