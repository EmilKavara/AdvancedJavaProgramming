import java.sql.*;
import java.util.ArrayList;

public class PersonDAO {

    public static void baza() {

        String username="root";
        String password="123";
        String url="jdbc:mysql://localhost:3306/person?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        ArrayList personList=new ArrayList();
        try(Connection connection= DriverManager.getConnection(url,username,password)){
            Statement statement=connection.createStatement();
            String sqlUpit="SELECT * FROM person";
            ResultSet resultSet=statement.executeQuery(sqlUpit);
            while(resultSet.next()){
                int id=resultSet.getInt(1);
                String name=resultSet.getString(2);
                String surname=resultSet.getString(3);
                String gender=resultSet.getString(4);
                Date date=resultSet.getDate(5);
                Person person=new Person(id,name,surname,gender,date);
                personList.add(person);
            }
            printList(personList);
        }
        catch(SQLException e){
            System.err.println(e.getMessage());
        }
    }
    static void printList(ArrayList<Person> listaPersona){
        for (Person person:listaPersona
             ) {
            System.out.println(person);
        }
    }
    }

