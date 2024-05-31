package Configuracion;

public class Trans
{
    //Version Database
    public static final int Version = 1;
    //Nombre de la base de datos
    public static final String DBname = "PM012P";

    //Tabla Persona
    public  static final String TablePersonas = "personas";

    //Propiedades
    public static final String id = "id";
    public static final String nombre = "nombre";
    public static final String apellido = "apellido";
    public static final String edad = "edad";
    public static final String correo = "correo";
    public static final String foto ="foto";

    //DDL Crear objetos de Base de Datos
    public static final String CreateTablePersonas = "CREATE TABLE " + TablePersonas + " ( " +
            "id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, apellido TEXT, edad INTEGER, correo TEXT, foto TEXT )";

public static final String SelectAllPersonas = "SELECT * FROM " + TablePersonas;

public static final String DropTablePersonas = "DROP TABLE IF EXISTS " + TablePersonas;



}
