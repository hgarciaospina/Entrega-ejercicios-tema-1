package interfaz;

public class CocheCRUDImpl implements  CocheCRUD{
    @Override
    public String save() {
        return "Color grabado!!";
    }

    @Override
    public String findAll() {
        return "\n" +
                "    \"arrayColores\":[{\n" +
                "            \"nombreColor\":\"rojo\",\n" +
                "            \"valorHexadec\":\"#f00\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"nombreColor\":\"verde\",\n" +
                "            \"valorHexadec\":\"#0f0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"nombreColor\":\"azul\",\n" +
                "            \"valorHexadec\":\"#00f\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"nombreColor\":\"amarillo\",\n" +
                "            \"valorHexadec\":\"#ff0\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"nombreColor\":\"negro\",\n" +
                "            \"valorHexadec\":\"#000\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }

    @Override
    public String delete() {
        return "Se elimino el color";
    }
}
