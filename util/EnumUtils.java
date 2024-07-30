package util;

public class EnumUtils {
	public static boolean isValidEnum(Enum<?> enumValue) {
	
    return enumValue != null && enumValue.getClass().isEnum();
}
	

}
