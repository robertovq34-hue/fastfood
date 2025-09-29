public class ComboFactory {
    public static String crearComboBase(ComboType type) {
        switch (type) {
            case HAMBURGUESA: return "Hamburguesa";
            case POLLO: return "Pollo";
            case VEGETARIANO: return "Vegetariano";
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}
