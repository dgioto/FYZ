package com.example.fyz;

public class Chemistry {
    private String name;
    private String description;
    private int imageResourceId;

    // drinks is an array of Drinks
    public static final Chemistry[] chemistry = {
            new Chemistry("Моющее средство для посуды Nada 750 мл с запахом лимона",
                    "Гипоаллергенное средство для мытья всех видов посуды" +
                            "\n- Легко удаляет жир и присохшие частички пищи" +
                            "\n- Эффективно при любой температуре и жесткости воды" +
                            "\n- Полностью смывается водой" +
                            "\n- Без агрессивных составляющих" +
                            "\n- Экономичный расход" +
                            "\n- БИОРАЗЛАГАЕМО И ЭКОЛОГИЧЕСКИ БЕЗОПАСНО!!!!!",
                    R.drawable.nada_750),
            new Chemistry("Моющее средство для посуды Nada 450г в виде пасты",
                    "Гипоаллергенное средство для мытья всех видов посуды" +
                    "\n- Легко удаляет жир и присохшие частички пищи" +
                    "\n- Эффективно при любой температуре и жесткости воды" +
                    "\n- Полностью смывается водой" +
                    "\n- Без агрессивных составляющих" +
                    "\n- Экономичный расход" +
                    "\n- БИОРАЗЛАГАЕМО И ЭКОЛОГИЧЕСКИ БЕЗОПАСНО!!!!!",
                    R.drawable.nada_450),
            new Chemistry("Антибактериальный SUPER GEL Nada 750 г с ароматом хвои",
                    "Турецкий антибактериальный гель Nada прекрасно подходит:" +
                            "\n- для уборки на кухне/в туалете/в ванной комнате" +
                            "\n- для мытья пола" +
                            "\n- для чистки ковров" +
                            "\n- для уборки салона автомобиля",
                    R.drawable.nada_gel_750),
    };

    //Each Drink has a name, description, and an image resource
    private Chemistry(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return  name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
