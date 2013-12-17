package filetst;

public class Propiedades {

	public static void get(){
		/*java.version Java Runtime Environment version
		java.vendor Java Runtime Environment vendor
		java.vendor.url Java vendor URL
		java.home Java installation directory
		java.vm.specification.version Java Virtual Machine specification version
		java.vm.specification.vendor Java Virtual Machine specification vendor
		java.vm.specification.name Java Virtual Machine specification name
		java.vm.version Java Virtual Machine implementation version
		java.vm.vendor Java Virtual Machine implementation vendor
		java.vm.name Java Virtual Machine implementation name
		java.specification.version Java Runtime Environment specification version
		java.specification.vendor Java Runtime Environment specification vendor
		java.specification.name Java Runtime Environment specification name
		java.class.version Java class format version number
		java.class.path Java class path
		java.library.path List of paths to search when loading libraries
		java.io.tmpdir Default temp file path Util para crear ficheros temporales en /tmp o c:\tmp
		java.compiler Name of JIT compiler to use
		java.ext.dirs Path of extension directory or directories
		os.name Operating system name Nombre del sistema operativo
		os.arch Operating system architecture
		os.version Operating system version
		file.separator File separator ("/" on UNIX) Separador de los directorios (unix es /, windows es \). De todas formas java entiende cualquiera de ellos
		path.separator Path separator (":" on UNIX) Cuando en una variable, por ejemplo PATH, ponemos varios valores, el separador en unix de estos path es : mientras que en windows es ;
		line.separator Line separator ("\n" on UNIX) Fin de linea. \n en unix, \r\n en windows.
		user.name User's account name Nombre del usuario.
		user.home User's home directory Directorio por defecto del usuario.
		user.dir*/ 
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.dir"));
	}
	public static String getPath(){
		return System.getProperty("user.home")+System.getProperty("file.separator")+
				"serverfiles"+System.getProperty("file.separator")+"users.txt";
	}
}
