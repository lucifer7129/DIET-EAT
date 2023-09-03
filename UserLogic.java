package diet.eat;

public class UserLogic {

    private static ListUser listUsuario = new ListUser();

    public static boolean autentificar(String Nombre, String password) {

        if (obtener(Nombre) != null) {
            User userC = obtener(Nombre);
            return userC.getNombre().equals(Nombre) && userC.getPassword().equals(password);
        } else {
            return false;
        }
    }
     public static boolean encontrar(String Nombre) {

        if (obtener(Nombre) != null) {
            User userC = obtener(Nombre);
            return userC.getNombre().equals(Nombre);
        } else {
            return false;
        }
    }
    

    public static boolean insert(User nombre) {
        return listUsuario.insert(nombre);
    }

    public static boolean update(User nombre) {
        return listUsuario.Update(nombre);
    }

    public static boolean delete(String nombre) {
        return listUsuario.Delete(nombre);
    }

    public static User obtener(String nombre) {
        return listUsuario.obtener(nombre);
    }

}
